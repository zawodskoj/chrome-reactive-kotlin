package pl.wendigo.chrome.domain.tethering

/**
 * The Tethering domain defines methods and events for browser port binding.
 */
@pl.wendigo.chrome.ProtocolExperimental class TetheringDomain internal constructor(private val connectionRemote : pl.wendigo.chrome.RemoteDebuggerConnection) {

	/**
	 * Request browser port binding.
	 */
	  fun bind(input : BindRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Tethering.bind", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Request browser port unbinding.
	 */
	  fun unbind(input : UnbindRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Tethering.unbind", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

  
    /**
     * Informs that port was successfully bound and got a specified connection id.
     */
    fun accepted() : io.reactivex.Flowable<AcceptedEvent> {
        return connectionRemote.captureEvents("Tethering.accepted", AcceptedEvent::class.java)
    }

    /**
     * Returns flowable capturing all Tethering domains events.
     */
    fun events() : io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return connectionRemote.captureAllEvents().filter {
            it.protocolDomain() == "Tethering"
        }
    }
}
/**
 * Represents requestFrame parameters that can be used with Tethering.bind method call.
 *
 * Request browser port binding.
 */
data class BindRequest (
    /**
     * Port number to bind.
     */
    val port : Int

)


/**
 * Represents requestFrame parameters that can be used with Tethering.unbind method call.
 *
 * Request browser port unbinding.
 */
data class UnbindRequest (
    /**
     * Port number to unbind.
     */
    val port : Int

)


/**
 * Represents responseFrame from Tethering. method call.
 *
 * Informs that port was successfully bound and got a specified connection id.
 */
data class AcceptedEvent(
  /**
   * Port number that was successfully bound.
   */
  val port : Int,

  /**
   * Connection id to be used.
   */
  val connectionId : String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Tethering", name = "accepted")

