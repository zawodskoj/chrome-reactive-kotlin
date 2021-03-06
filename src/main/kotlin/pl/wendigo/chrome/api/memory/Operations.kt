package pl.wendigo.chrome.api.memory

/**
 * MemoryOperations represents Memory protocol domain request/response operations and events that can be captured.
 *
 * This API is marked as experimental in protocol definition and can change in the future.
 * @link Protocol [Memory](https://chromedevtools.github.io/devtools-protocol/tot/Memory) domain documentation.
 */
@pl.wendigo.chrome.protocol.Experimental
class MemoryOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     *
     *
     * @link Protocol [Memory#getDOMCounters](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getDOMCounters) method documentation.
     */
    fun getDOMCounters() = connection.request("Memory.getDOMCounters", null, GetDOMCountersResponse::class.java)

    /**
     *
     *
     * @link Protocol [Memory#prepareForLeakDetection](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-prepareForLeakDetection) method documentation.
     */
    fun prepareForLeakDetection() = connection.request("Memory.prepareForLeakDetection", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java)

    /**
     * Simulate OomIntervention by purging V8 memory.
     *
     * @link Protocol [Memory#forciblyPurgeJavaScriptMemory](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-forciblyPurgeJavaScriptMemory) method documentation.
     */
    fun forciblyPurgeJavaScriptMemory() = connection.request("Memory.forciblyPurgeJavaScriptMemory", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java)

    /**
     * Enable/disable suppressing memory pressure notifications in all processes.
     *
     * @link Protocol [Memory#setPressureNotificationsSuppressed](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-setPressureNotificationsSuppressed) method documentation.
     */
    fun setPressureNotificationsSuppressed(input: SetPressureNotificationsSuppressedRequest) = connection.request("Memory.setPressureNotificationsSuppressed", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java)

    /**
     * Simulate a memory pressure notification in all processes.
     *
     * @link Protocol [Memory#simulatePressureNotification](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-simulatePressureNotification) method documentation.
     */
    fun simulatePressureNotification(input: SimulatePressureNotificationRequest) = connection.request("Memory.simulatePressureNotification", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java)

    /**
     * Start collecting native memory profile.
     *
     * @link Protocol [Memory#startSampling](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-startSampling) method documentation.
     */
    fun startSampling(input: StartSamplingRequest) = connection.request("Memory.startSampling", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java)

    /**
     * Stop collecting native memory profile.
     *
     * @link Protocol [Memory#stopSampling](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-stopSampling) method documentation.
     */
    fun stopSampling() = connection.request("Memory.stopSampling", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java)

    /**
     * Retrieve native memory allocations profile
collected since renderer process startup.
     *
     * @link Protocol [Memory#getAllTimeSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getAllTimeSamplingProfile) method documentation.
     */
    fun getAllTimeSamplingProfile() = connection.request("Memory.getAllTimeSamplingProfile", null, GetAllTimeSamplingProfileResponse::class.java)

    /**
     * Retrieve native memory allocations profile
collected since browser process startup.
     *
     * @link Protocol [Memory#getBrowserSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getBrowserSamplingProfile) method documentation.
     */
    fun getBrowserSamplingProfile() = connection.request("Memory.getBrowserSamplingProfile", null, GetBrowserSamplingProfileResponse::class.java)

    /**
     * Retrieve native memory allocations profile collected since last
`startSampling` call.
     *
     * @link Protocol [Memory#getSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getSamplingProfile) method documentation.
     */
    fun getSamplingProfile() = connection.request("Memory.getSamplingProfile", null, GetSamplingProfileResponse::class.java)

    /**
     * Returns flowable capturing all Memory domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.allEvents().filter {
            it.protocolDomain() == "Memory"
        }
    }
}

/**
 * Represents response frame that is returned from [Memory#getDOMCounters](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getDOMCounters) operation call.
 *
 *
  
 * @link [Memory#getDOMCounters](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getDOMCounters) method documentation.
 * @see [MemoryOperations.getDOMCounters]
 */
data class GetDOMCountersResponse(
    /**  
     *  
     */  
    val documents: Int,

    /**  
     *  
     */  
    val nodes: Int,

    /**  
     *  
     */  
    val jsEventListeners: Int

)

/**
 * Represents request frame that can be used with [Memory#setPressureNotificationsSuppressed](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-setPressureNotificationsSuppressed) operation call.
 *
 * Enable/disable suppressing memory pressure notifications in all processes.
 * @link [Memory#setPressureNotificationsSuppressed](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-setPressureNotificationsSuppressed) method documentation.
 * @see [MemoryOperations.setPressureNotificationsSuppressed]
 */
data class SetPressureNotificationsSuppressedRequest(
    /**
     * If true, memory pressure notifications will be suppressed.
     */
    val suppressed: Boolean

)

/**
 * Represents request frame that can be used with [Memory#simulatePressureNotification](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-simulatePressureNotification) operation call.
 *
 * Simulate a memory pressure notification in all processes.
 * @link [Memory#simulatePressureNotification](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-simulatePressureNotification) method documentation.
 * @see [MemoryOperations.simulatePressureNotification]
 */
data class SimulatePressureNotificationRequest(
    /**
     * Memory pressure level of the notification.
     */
    val level: PressureLevel

)

/**
 * Represents request frame that can be used with [Memory#startSampling](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-startSampling) operation call.
 *
 * Start collecting native memory profile.
 * @link [Memory#startSampling](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-startSampling) method documentation.
 * @see [MemoryOperations.startSampling]
 */
data class StartSamplingRequest(
    /**
     * Average number of bytes between samples.
     */
    val samplingInterval: Int? = null,

    /**
     * Do not randomize intervals between samples.
     */
    val suppressRandomness: Boolean? = null

)

/**
 * Represents response frame that is returned from [Memory#getAllTimeSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getAllTimeSamplingProfile) operation call.
 * Retrieve native memory allocations profile
collected since renderer process startup.
 *
  
 * @link [Memory#getAllTimeSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getAllTimeSamplingProfile) method documentation.
 * @see [MemoryOperations.getAllTimeSamplingProfile]
 */
data class GetAllTimeSamplingProfileResponse(
    /**  
     *  
     */  
    val profile: SamplingProfile

)

/**
 * Represents response frame that is returned from [Memory#getBrowserSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getBrowserSamplingProfile) operation call.
 * Retrieve native memory allocations profile
collected since browser process startup.
 *
  
 * @link [Memory#getBrowserSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getBrowserSamplingProfile) method documentation.
 * @see [MemoryOperations.getBrowserSamplingProfile]
 */
data class GetBrowserSamplingProfileResponse(
    /**  
     *  
     */  
    val profile: SamplingProfile

)

/**
 * Represents response frame that is returned from [Memory#getSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getSamplingProfile) operation call.
 * Retrieve native memory allocations profile collected since last
`startSampling` call.
 *
  
 * @link [Memory#getSamplingProfile](https://chromedevtools.github.io/devtools-protocol/tot/Memory#method-getSamplingProfile) method documentation.
 * @see [MemoryOperations.getSamplingProfile]
 */
data class GetSamplingProfileResponse(
    /**  
     *  
     */  
    val profile: SamplingProfile

)
