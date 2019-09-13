package pl.wendigo.chrome.api.emulation

/**
 * This domain emulates different environments for the page.
 *
 * @link Protocol [Emulation](https://chromedevtools.github.io/devtools-protocol/tot/Emulation) domain documentation.
 */
class EmulationOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     * Tells whether emulation is supported.
     *
     * @link Protocol [Emulation#canEmulate](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-canEmulate) method documentation.
     */
    fun canEmulate(): io.reactivex.Single<CanEmulateResponse> {
        return connection.runAndCaptureResponse("Emulation.canEmulate", null, CanEmulateResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Clears the overriden device metrics.
     *
     * @link Protocol [Emulation#clearDeviceMetricsOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-clearDeviceMetricsOverride) method documentation.
     */
    fun clearDeviceMetricsOverride(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.clearDeviceMetricsOverride", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Clears the overriden Geolocation Position and Error.
     *
     * @link Protocol [Emulation#clearGeolocationOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-clearGeolocationOverride) method documentation.
     */
    fun clearGeolocationOverride(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.clearGeolocationOverride", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Requests that page scale factor is reset to initial values.
     *
     * @link Protocol [Emulation#resetPageScaleFactor](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-resetPageScaleFactor) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun resetPageScaleFactor(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.resetPageScaleFactor", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables or disables simulating a focused and active page.
     *
     * @link Protocol [Emulation#setFocusEmulationEnabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setFocusEmulationEnabled) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setFocusEmulationEnabled(input: SetFocusEmulationEnabledRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setFocusEmulationEnabled", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables CPU throttling to emulate slow CPUs.
     *
     * @link Protocol [Emulation#setCPUThrottlingRate](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setCPUThrottlingRate) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setCPUThrottlingRate(input: SetCPUThrottlingRateRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setCPUThrottlingRate", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Sets or clears an override of the default background color of the frame. This override is used
if the content does not specify one.
     *
     * @link Protocol [Emulation#setDefaultBackgroundColorOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDefaultBackgroundColorOverride) method documentation.
     */
    fun setDefaultBackgroundColorOverride(input: SetDefaultBackgroundColorOverrideRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setDefaultBackgroundColorOverride", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
query results).
     *
     * @link Protocol [Emulation#setDeviceMetricsOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDeviceMetricsOverride) method documentation.
     */
    fun setDeviceMetricsOverride(input: SetDeviceMetricsOverrideRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setDeviceMetricsOverride", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *
     *
     * @link Protocol [Emulation#setScrollbarsHidden](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setScrollbarsHidden) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setScrollbarsHidden(input: SetScrollbarsHiddenRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setScrollbarsHidden", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *
     *
     * @link Protocol [Emulation#setDocumentCookieDisabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDocumentCookieDisabled) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setDocumentCookieDisabled(input: SetDocumentCookieDisabledRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setDocumentCookieDisabled", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *
     *
     * @link Protocol [Emulation#setEmitTouchEventsForMouse](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setEmitTouchEventsForMouse) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setEmitTouchEventsForMouse(input: SetEmitTouchEventsForMouseRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setEmitTouchEventsForMouse", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Emulates the given media for CSS media queries.
     *
     * @link Protocol [Emulation#setEmulatedMedia](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setEmulatedMedia) method documentation.
     */
    fun setEmulatedMedia(input: SetEmulatedMediaRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setEmulatedMedia", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
unavailable.
     *
     * @link Protocol [Emulation#setGeolocationOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setGeolocationOverride) method documentation.
     */
    fun setGeolocationOverride(input: SetGeolocationOverrideRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setGeolocationOverride", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides value returned by the javascript navigator object.
     *
     * @link Protocol [Emulation#setNavigatorOverrides](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setNavigatorOverrides) method documentation.
     */
    @Deprecated(level = DeprecationLevel.WARNING, message = "setNavigatorOverrides is deprecated.")
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setNavigatorOverrides(input: SetNavigatorOverridesRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setNavigatorOverrides", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Sets a specified page scale factor.
     *
     * @link Protocol [Emulation#setPageScaleFactor](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setPageScaleFactor) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setPageScaleFactor(input: SetPageScaleFactorRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setPageScaleFactor", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Switches script execution in the page.
     *
     * @link Protocol [Emulation#setScriptExecutionDisabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setScriptExecutionDisabled) method documentation.
     */
    fun setScriptExecutionDisabled(input: SetScriptExecutionDisabledRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setScriptExecutionDisabled", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables touch on platforms which do not support them.
     *
     * @link Protocol [Emulation#setTouchEmulationEnabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setTouchEmulationEnabled) method documentation.
     */
    fun setTouchEmulationEnabled(input: SetTouchEmulationEnabledRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setTouchEmulationEnabled", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets
the current virtual time policy.  Note this supersedes any previous time budget.
     *
     * @link Protocol [Emulation#setVirtualTimePolicy](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setVirtualTimePolicy) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setVirtualTimePolicy(input: SetVirtualTimePolicyRequest): io.reactivex.Single<SetVirtualTimePolicyResponse> {
        return connection.runAndCaptureResponse("Emulation.setVirtualTimePolicy", input, SetVirtualTimePolicyResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides default host system timezone with the specified one.
     *
     * @link Protocol [Emulation#setTimezoneOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setTimezoneOverride) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setTimezoneOverride(input: SetTimezoneOverrideRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setTimezoneOverride", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Resizes the frame/viewport of the page. Note that this does not affect the frame's container
(e.g. browser window). Can be used to produce screenshots of the specified size. Not supported
on Android.
     *
     * @link Protocol [Emulation#setVisibleSize](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setVisibleSize) method documentation.
     */
    @Deprecated(level = DeprecationLevel.WARNING, message = "setVisibleSize is deprecated.")
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setVisibleSize(input: SetVisibleSizeRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setVisibleSize", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Allows overriding user agent with the given string.
     *
     * @link Protocol [Emulation#setUserAgentOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setUserAgentOverride) method documentation.
     */
    fun setUserAgentOverride(input: SetUserAgentOverrideRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Emulation.setUserAgentOverride", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *  Notification sent after the virtual time budget for the current VirtualTimePolicy has run out.
     */
    fun virtualTimeBudgetExpired(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return virtualTimeBudgetExpiredTimed().map {
            it.value()
        }
    }

    /**
     * Notification sent after the virtual time budget for the current VirtualTimePolicy has run out.
     */
    fun virtualTimeBudgetExpiredTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<pl.wendigo.chrome.protocol.Event>> {
        return connection.captureEvents("Emulation.virtualTimeBudgetExpired", pl.wendigo.chrome.protocol.Event::class.java)
    }

    /**
     * Returns flowable capturing all Emulation domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "Emulation"
        }
    }
}

/**
 * Represents response frame that is returned from [Emulation#canEmulate](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-canEmulate) operation call.
 * Tells whether emulation is supported.
 *
  
 * @link [Emulation#canEmulate](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-canEmulate) method documentation.
 * @see [EmulationOperations.canEmulate]
 */
data class CanEmulateResponse(
    /**  
     * True if emulation is supported.  
     */  
    val result: Boolean

)

/**
 * Represents request frame that can be used with [Emulation#setFocusEmulationEnabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setFocusEmulationEnabled) operation call.
 *
 * Enables or disables simulating a focused and active page.
 * @link [Emulation#setFocusEmulationEnabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setFocusEmulationEnabled) method documentation.
 * @see [EmulationOperations.setFocusEmulationEnabled]
 */
data class SetFocusEmulationEnabledRequest(
    /**
     * Whether to enable to disable focus emulation.
     */
    val enabled: Boolean

)

/**
 * Represents request frame that can be used with [Emulation#setCPUThrottlingRate](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setCPUThrottlingRate) operation call.
 *
 * Enables CPU throttling to emulate slow CPUs.
 * @link [Emulation#setCPUThrottlingRate](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setCPUThrottlingRate) method documentation.
 * @see [EmulationOperations.setCPUThrottlingRate]
 */
data class SetCPUThrottlingRateRequest(
    /**
     * Throttling rate as a slowdown factor (1 is no throttle, 2 is 2x slowdown, etc).
     */
    val rate: Double

)

/**
 * Represents request frame that can be used with [Emulation#setDefaultBackgroundColorOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDefaultBackgroundColorOverride) operation call.
 *
 * Sets or clears an override of the default background color of the frame. This override is used
if the content does not specify one.
 * @link [Emulation#setDefaultBackgroundColorOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDefaultBackgroundColorOverride) method documentation.
 * @see [EmulationOperations.setDefaultBackgroundColorOverride]
 */
data class SetDefaultBackgroundColorOverrideRequest(
    /**
     * RGBA of the default background color. If not specified, any existing override will be
cleared.
     */
    val color: pl.wendigo.chrome.api.dom.RGBA? = null

)

/**
 * Represents request frame that can be used with [Emulation#setDeviceMetricsOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDeviceMetricsOverride) operation call.
 *
 * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
query results).
 * @link [Emulation#setDeviceMetricsOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDeviceMetricsOverride) method documentation.
 * @see [EmulationOperations.setDeviceMetricsOverride]
 */
data class SetDeviceMetricsOverrideRequest(
    /**
     * Overriding width value in pixels (minimum 0, maximum 10000000). 0 disables the override.
     */
    val width: Int,

    /**
     * Overriding height value in pixels (minimum 0, maximum 10000000). 0 disables the override.
     */
    val height: Int,

    /**
     * Overriding device scale factor value. 0 disables the override.
     */
    val deviceScaleFactor: Double,

    /**
     * Whether to emulate mobile device. This includes viewport meta tag, overlay scrollbars, text
autosizing and more.
     */
    val mobile: Boolean,

    /**
     * Scale to apply to resulting view image.
     */
    @pl.wendigo.chrome.protocol.Experimental val scale: Double? = null,

    /**
     * Overriding screen width value in pixels (minimum 0, maximum 10000000).
     */
    @pl.wendigo.chrome.protocol.Experimental val screenWidth: Int? = null,

    /**
     * Overriding screen height value in pixels (minimum 0, maximum 10000000).
     */
    @pl.wendigo.chrome.protocol.Experimental val screenHeight: Int? = null,

    /**
     * Overriding view X position on screen in pixels (minimum 0, maximum 10000000).
     */
    @pl.wendigo.chrome.protocol.Experimental val positionX: Int? = null,

    /**
     * Overriding view Y position on screen in pixels (minimum 0, maximum 10000000).
     */
    @pl.wendigo.chrome.protocol.Experimental val positionY: Int? = null,

    /**
     * Do not set visible view size, rely upon explicit setVisibleSize call.
     */
    @pl.wendigo.chrome.protocol.Experimental val dontSetVisibleSize: Boolean? = null,

    /**
     * Screen orientation override.
     */
    val screenOrientation: ScreenOrientation? = null,

    /**
     * If set, the visible area of the page will be overridden to this viewport. This viewport
change is not observed by the page, e.g. viewport-relative elements do not change positions.
     */
    @pl.wendigo.chrome.protocol.Experimental val viewport: pl.wendigo.chrome.api.page.Viewport? = null

)

/**
 * Represents request frame that can be used with [Emulation#setScrollbarsHidden](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setScrollbarsHidden) operation call.
 *
 *
 * @link [Emulation#setScrollbarsHidden](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setScrollbarsHidden) method documentation.
 * @see [EmulationOperations.setScrollbarsHidden]
 */
data class SetScrollbarsHiddenRequest(
    /**
     * Whether scrollbars should be always hidden.
     */
    val hidden: Boolean

)

/**
 * Represents request frame that can be used with [Emulation#setDocumentCookieDisabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDocumentCookieDisabled) operation call.
 *
 *
 * @link [Emulation#setDocumentCookieDisabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setDocumentCookieDisabled) method documentation.
 * @see [EmulationOperations.setDocumentCookieDisabled]
 */
data class SetDocumentCookieDisabledRequest(
    /**
     * Whether document.coookie API should be disabled.
     */
    val disabled: Boolean

)

/**
 * Represents request frame that can be used with [Emulation#setEmitTouchEventsForMouse](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setEmitTouchEventsForMouse) operation call.
 *
 *
 * @link [Emulation#setEmitTouchEventsForMouse](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setEmitTouchEventsForMouse) method documentation.
 * @see [EmulationOperations.setEmitTouchEventsForMouse]
 */
data class SetEmitTouchEventsForMouseRequest(
    /**
     * Whether touch emulation based on mouse input should be enabled.
     */
    val enabled: Boolean,

    /**
     * Touch/gesture events configuration. Default: current platform.
     */
    val configuration: String? = null

)

/**
 * Represents request frame that can be used with [Emulation#setEmulatedMedia](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setEmulatedMedia) operation call.
 *
 * Emulates the given media for CSS media queries.
 * @link [Emulation#setEmulatedMedia](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setEmulatedMedia) method documentation.
 * @see [EmulationOperations.setEmulatedMedia]
 */
data class SetEmulatedMediaRequest(
    /**
     * Media type to emulate. Empty string disables the override.
     */
    val media: String

)

/**
 * Represents request frame that can be used with [Emulation#setGeolocationOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setGeolocationOverride) operation call.
 *
 * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
unavailable.
 * @link [Emulation#setGeolocationOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setGeolocationOverride) method documentation.
 * @see [EmulationOperations.setGeolocationOverride]
 */
data class SetGeolocationOverrideRequest(
    /**
     * Mock latitude
     */
    val latitude: Double? = null,

    /**
     * Mock longitude
     */
    val longitude: Double? = null,

    /**
     * Mock accuracy
     */
    val accuracy: Double? = null

)

/**
 * Represents request frame that can be used with [Emulation#setNavigatorOverrides](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setNavigatorOverrides) operation call.
 *
 * Overrides value returned by the javascript navigator object.
 * @link [Emulation#setNavigatorOverrides](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setNavigatorOverrides) method documentation.
 * @see [EmulationOperations.setNavigatorOverrides]
 */
data class SetNavigatorOverridesRequest(
    /**
     * The platform navigator.platform should return.
     */
    val platform: String

)

/**
 * Represents request frame that can be used with [Emulation#setPageScaleFactor](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setPageScaleFactor) operation call.
 *
 * Sets a specified page scale factor.
 * @link [Emulation#setPageScaleFactor](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setPageScaleFactor) method documentation.
 * @see [EmulationOperations.setPageScaleFactor]
 */
data class SetPageScaleFactorRequest(
    /**
     * Page scale factor.
     */
    val pageScaleFactor: Double

)

/**
 * Represents request frame that can be used with [Emulation#setScriptExecutionDisabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setScriptExecutionDisabled) operation call.
 *
 * Switches script execution in the page.
 * @link [Emulation#setScriptExecutionDisabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setScriptExecutionDisabled) method documentation.
 * @see [EmulationOperations.setScriptExecutionDisabled]
 */
data class SetScriptExecutionDisabledRequest(
    /**
     * Whether script execution should be disabled in the page.
     */
    val value: Boolean

)

/**
 * Represents request frame that can be used with [Emulation#setTouchEmulationEnabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setTouchEmulationEnabled) operation call.
 *
 * Enables touch on platforms which do not support them.
 * @link [Emulation#setTouchEmulationEnabled](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setTouchEmulationEnabled) method documentation.
 * @see [EmulationOperations.setTouchEmulationEnabled]
 */
data class SetTouchEmulationEnabledRequest(
    /**
     * Whether the touch event emulation should be enabled.
     */
    val enabled: Boolean,

    /**
     * Maximum touch points supported. Defaults to one.
     */
    val maxTouchPoints: Int? = null

)

/**
 * Represents request frame that can be used with [Emulation#setVirtualTimePolicy](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setVirtualTimePolicy) operation call.
 *
 * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets
the current virtual time policy.  Note this supersedes any previous time budget.
 * @link [Emulation#setVirtualTimePolicy](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setVirtualTimePolicy) method documentation.
 * @see [EmulationOperations.setVirtualTimePolicy]
 */
data class SetVirtualTimePolicyRequest(
    /**
     *
     */
    val policy: VirtualTimePolicy,

    /**
     * If set, after this many virtual milliseconds have elapsed virtual time will be paused and a
virtualTimeBudgetExpired event is sent.
     */
    val budget: Double? = null,

    /**
     * If set this specifies the maximum number of tasks that can be run before virtual is forced
forwards to prevent deadlock.
     */
    val maxVirtualTimeTaskStarvationCount: Int? = null,

    /**
     * If set the virtual time policy change should be deferred until any frame starts navigating.
Note any previous deferred policy change is superseded.
     */
    val waitForNavigation: Boolean? = null,

    /**
     * If set, base::Time::Now will be overriden to initially return this value.
     */
    val initialVirtualTime: pl.wendigo.chrome.api.network.TimeSinceEpoch? = null

)
/**
 * Represents response frame that is returned from [Emulation#setVirtualTimePolicy](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setVirtualTimePolicy) operation call.
 * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets
the current virtual time policy.  Note this supersedes any previous time budget.
 *
  
 * @link [Emulation#setVirtualTimePolicy](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setVirtualTimePolicy) method documentation.
 * @see [EmulationOperations.setVirtualTimePolicy]
 */
data class SetVirtualTimePolicyResponse(
    /**  
     * Absolute timestamp at which virtual time was first enabled (up time in milliseconds).  
     */  
    val virtualTimeTicksBase: Double

)

/**
 * Represents request frame that can be used with [Emulation#setTimezoneOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setTimezoneOverride) operation call.
 *
 * Overrides default host system timezone with the specified one.
 * @link [Emulation#setTimezoneOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setTimezoneOverride) method documentation.
 * @see [EmulationOperations.setTimezoneOverride]
 */
data class SetTimezoneOverrideRequest(
    /**
     * The timezone identifier. If empty, disables the override and
restores default host system timezone.
     */
    val timezoneId: String

)

/**
 * Represents request frame that can be used with [Emulation#setVisibleSize](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setVisibleSize) operation call.
 *
 * Resizes the frame/viewport of the page. Note that this does not affect the frame's container
(e.g. browser window). Can be used to produce screenshots of the specified size. Not supported
on Android.
 * @link [Emulation#setVisibleSize](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setVisibleSize) method documentation.
 * @see [EmulationOperations.setVisibleSize]
 */
data class SetVisibleSizeRequest(
    /**
     * Frame width (DIP).
     */
    val width: Int,

    /**
     * Frame height (DIP).
     */
    val height: Int

)

/**
 * Represents request frame that can be used with [Emulation#setUserAgentOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setUserAgentOverride) operation call.
 *
 * Allows overriding user agent with the given string.
 * @link [Emulation#setUserAgentOverride](https://chromedevtools.github.io/devtools-protocol/tot/Emulation#method-setUserAgentOverride) method documentation.
 * @see [EmulationOperations.setUserAgentOverride]
 */
data class SetUserAgentOverrideRequest(
    /**
     * User agent to use.
     */
    val userAgent: String,

    /**
     * Browser langugage to emulate.
     */
    val acceptLanguage: String? = null,

    /**
     * The platform navigator.platform should return.
     */
    val platform: String? = null

)