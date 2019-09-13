package pl.wendigo.chrome.api.log

/**
 * Provides access to log entries.
 *
 * @link Protocol [Log](https://chromedevtools.github.io/devtools-protocol/tot/Log) domain documentation.
 */
class LogOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     * Clears the log.
     *
     * @link Protocol [Log#clear](https://chromedevtools.github.io/devtools-protocol/tot/Log#method-clear) method documentation.
     */
    fun clear(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Log.clear", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Disables log domain, prevents further log entries from being reported to the client.
     *
     * @link Protocol [Log#disable](https://chromedevtools.github.io/devtools-protocol/tot/Log#method-disable) method documentation.
     */
    fun disable(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Log.disable", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables log domain, sends the entries collected so far to the client by means of the
`entryAdded` notification.
     *
     * @link Protocol [Log#enable](https://chromedevtools.github.io/devtools-protocol/tot/Log#method-enable) method documentation.
     */
    fun enable(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Log.enable", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * start violation reporting.
     *
     * @link Protocol [Log#startViolationsReport](https://chromedevtools.github.io/devtools-protocol/tot/Log#method-startViolationsReport) method documentation.
     */
    fun startViolationsReport(input: StartViolationsReportRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Log.startViolationsReport", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Stop violation reporting.
     *
     * @link Protocol [Log#stopViolationsReport](https://chromedevtools.github.io/devtools-protocol/tot/Log#method-stopViolationsReport) method documentation.
     */
    fun stopViolationsReport(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Log.stopViolationsReport", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *  Issued when new message was logged.
     */
    fun entryAdded(): io.reactivex.Flowable<EntryAddedEvent> {
        return entryAddedTimed().map {
            it.value()
        }
    }

    /**
     * Issued when new message was logged.
     */
    fun entryAddedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<EntryAddedEvent>> {
        return connection.captureEvents("Log.entryAdded", EntryAddedEvent::class.java)
    }

    /**
     * Returns flowable capturing all Log domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "Log"
        }
    }
}

/**
 * Represents request frame that can be used with [Log#startViolationsReport](https://chromedevtools.github.io/devtools-protocol/tot/Log#method-startViolationsReport) operation call.
 *
 * start violation reporting.
 * @link [Log#startViolationsReport](https://chromedevtools.github.io/devtools-protocol/tot/Log#method-startViolationsReport) method documentation.
 * @see [LogOperations.startViolationsReport]
 */
data class StartViolationsReportRequest(
    /**
     * Configuration for violations.
     */
    val config: List<ViolationSetting>

)

/**
 * Issued when new message was logged.
 *
 * @link [Log#entryAdded](https://chromedevtools.github.io/devtools-protocol/tot/Log#event-entryAdded) event documentation.
 */
data class EntryAddedEvent(
    /**  
     * The entry.  
     */  
    val entry: LogEntry

) : pl.wendigo.chrome.protocol.Event(domain = "Log", name = "entryAdded")