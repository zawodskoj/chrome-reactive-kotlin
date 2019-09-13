package pl.wendigo.chrome.api.browser

/**
 * The Browser domain defines methods and events for browser managing.
 *
 * @link Protocol [Browser](https://chromedevtools.github.io/devtools-protocol/tot/Browser) domain documentation.
 */
class BrowserOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     * Set permission settings for given origin.
     *
     * @link Protocol [Browser#setPermission](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setPermission) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setPermission(input: SetPermissionRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Browser.setPermission", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Grant specific permissions to the given origin and reject all others.
     *
     * @link Protocol [Browser#grantPermissions](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-grantPermissions) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun grantPermissions(input: GrantPermissionsRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Browser.grantPermissions", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Reset all permission management for all origins.
     *
     * @link Protocol [Browser#resetPermissions](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-resetPermissions) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun resetPermissions(input: ResetPermissionsRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Browser.resetPermissions", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Close browser gracefully.
     *
     * @link Protocol [Browser#close](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-close) method documentation.
     */
    fun close(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Browser.close", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Crashes browser on the main thread.
     *
     * @link Protocol [Browser#crash](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-crash) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun crash(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Browser.crash", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Crashes GPU process.
     *
     * @link Protocol [Browser#crashGpuProcess](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-crashGpuProcess) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun crashGpuProcess(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Browser.crashGpuProcess", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns version information.
     *
     * @link Protocol [Browser#getVersion](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getVersion) method documentation.
     */
    fun getVersion(): io.reactivex.Single<GetVersionResponse> {
        return connection.runAndCaptureResponse("Browser.getVersion", null, GetVersionResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns the command line switches for the browser process if, and only if
--enable-automation is on the commandline.
     *
     * @link Protocol [Browser#getBrowserCommandLine](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getBrowserCommandLine) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun getBrowserCommandLine(): io.reactivex.Single<GetBrowserCommandLineResponse> {
        return connection.runAndCaptureResponse("Browser.getBrowserCommandLine", null, GetBrowserCommandLineResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Get Chrome histograms.
     *
     * @link Protocol [Browser#getHistograms](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistograms) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun getHistograms(input: GetHistogramsRequest): io.reactivex.Single<GetHistogramsResponse> {
        return connection.runAndCaptureResponse("Browser.getHistograms", input, GetHistogramsResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Get a Chrome histogram by name.
     *
     * @link Protocol [Browser#getHistogram](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistogram) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun getHistogram(input: GetHistogramRequest): io.reactivex.Single<GetHistogramResponse> {
        return connection.runAndCaptureResponse("Browser.getHistogram", input, GetHistogramResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Get position and size of the browser window.
     *
     * @link Protocol [Browser#getWindowBounds](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowBounds) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun getWindowBounds(input: GetWindowBoundsRequest): io.reactivex.Single<GetWindowBoundsResponse> {
        return connection.runAndCaptureResponse("Browser.getWindowBounds", input, GetWindowBoundsResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Get the browser window that contains the devtools target.
     *
     * @link Protocol [Browser#getWindowForTarget](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowForTarget) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun getWindowForTarget(input: GetWindowForTargetRequest): io.reactivex.Single<GetWindowForTargetResponse> {
        return connection.runAndCaptureResponse("Browser.getWindowForTarget", input, GetWindowForTargetResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Set position and/or size of the browser window.
     *
     * @link Protocol [Browser#setWindowBounds](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setWindowBounds) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setWindowBounds(input: SetWindowBoundsRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Browser.setWindowBounds", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Set dock tile details, platform-specific.
     *
     * @link Protocol [Browser#setDockTile](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setDockTile) method documentation.
     */
    
    @pl.wendigo.chrome.protocol.Experimental
    fun setDockTile(input: SetDockTileRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Browser.setDockTile", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns flowable capturing all Browser domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "Browser"
        }
    }
}
/**
 * Represents request frame that can be used with [Browser#setPermission](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setPermission) operation call.
 *
 * Set permission settings for given origin.
 * @link [Browser#setPermission](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setPermission) method documentation.
 * @see [BrowserOperations.setPermission]
 */
data class SetPermissionRequest(
    /**
     * Origin the permission applies to.
     */
    val origin: String,

    /**
     * Descriptor of permission to override.
     */
    val permission: PermissionDescriptor,

    /**
     * Setting of the permission.
     */
    val setting: PermissionSetting,

    /**
     * Context to override. When omitted, default browser context is used.
     */
    val browserContextId: pl.wendigo.chrome.api.target.TargetID? = null

)

/**
 * Represents request frame that can be used with [Browser#grantPermissions](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-grantPermissions) operation call.
 *
 * Grant specific permissions to the given origin and reject all others.
 * @link [Browser#grantPermissions](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-grantPermissions) method documentation.
 * @see [BrowserOperations.grantPermissions]
 */
data class GrantPermissionsRequest(
    /**
     *
     */
    val origin: String,

    /**
     *
     */
    val permissions: List<PermissionType>,

    /**
     * BrowserContext to override permissions. When omitted, default browser context is used.
     */
    val browserContextId: pl.wendigo.chrome.api.target.BrowserContextID? = null

)

/**
 * Represents request frame that can be used with [Browser#resetPermissions](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-resetPermissions) operation call.
 *
 * Reset all permission management for all origins.
 * @link [Browser#resetPermissions](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-resetPermissions) method documentation.
 * @see [BrowserOperations.resetPermissions]
 */
data class ResetPermissionsRequest(
    /**
     * BrowserContext to reset permissions. When omitted, default browser context is used.
     */
    val browserContextId: pl.wendigo.chrome.api.target.BrowserContextID? = null

)

/**
 * Represents response frame that is returned from [Browser#getVersion](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getVersion) operation call.
 * Returns version information.
 *
  
 * @link [Browser#getVersion](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getVersion) method documentation.
 * @see [BrowserOperations.getVersion]
 */
data class GetVersionResponse(
    /**  
     * Protocol version.  
     */  
    val protocolVersion: String,

    /**  
     * Product name.  
     */  
    val product: String,

    /**  
     * Product revision.  
     */  
    val revision: String,

    /**  
     * User-Agent.  
     */  
    val userAgent: String,

    /**  
     * V8 version.  
     */  
    val jsVersion: String

)

/**
 * Represents response frame that is returned from [Browser#getBrowserCommandLine](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getBrowserCommandLine) operation call.
 * Returns the command line switches for the browser process if, and only if
--enable-automation is on the commandline.
 *
  
 * @link [Browser#getBrowserCommandLine](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getBrowserCommandLine) method documentation.
 * @see [BrowserOperations.getBrowserCommandLine]
 */
data class GetBrowserCommandLineResponse(
    /**  
     * Commandline parameters  
     */  
    val arguments: List<String>

)

/**
 * Represents request frame that can be used with [Browser#getHistograms](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistograms) operation call.
 *
 * Get Chrome histograms.
 * @link [Browser#getHistograms](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistograms) method documentation.
 * @see [BrowserOperations.getHistograms]
 */
data class GetHistogramsRequest(
    /**
     * Requested substring in name. Only histograms which have query as a
substring in their name are extracted. An empty or absent query returns
all histograms.
     */
    val query: String? = null,

    /**
     * If true, retrieve delta since last call.
     */
    val delta: Boolean? = null

)
/**
 * Represents response frame that is returned from [Browser#getHistograms](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistograms) operation call.
 * Get Chrome histograms.
 *
  
 * @link [Browser#getHistograms](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistograms) method documentation.
 * @see [BrowserOperations.getHistograms]
 */
data class GetHistogramsResponse(
    /**  
     * Histograms.  
     */  
    val histograms: List<Histogram>

)

/**
 * Represents request frame that can be used with [Browser#getHistogram](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistogram) operation call.
 *
 * Get a Chrome histogram by name.
 * @link [Browser#getHistogram](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistogram) method documentation.
 * @see [BrowserOperations.getHistogram]
 */
data class GetHistogramRequest(
    /**
     * Requested histogram name.
     */
    val name: String,

    /**
     * If true, retrieve delta since last call.
     */
    val delta: Boolean? = null

)
/**
 * Represents response frame that is returned from [Browser#getHistogram](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistogram) operation call.
 * Get a Chrome histogram by name.
 *
  
 * @link [Browser#getHistogram](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getHistogram) method documentation.
 * @see [BrowserOperations.getHistogram]
 */
data class GetHistogramResponse(
    /**  
     * Histogram.  
     */  
    val histogram: Histogram

)

/**
 * Represents request frame that can be used with [Browser#getWindowBounds](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowBounds) operation call.
 *
 * Get position and size of the browser window.
 * @link [Browser#getWindowBounds](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowBounds) method documentation.
 * @see [BrowserOperations.getWindowBounds]
 */
data class GetWindowBoundsRequest(
    /**
     * Browser window id.
     */
    val windowId: WindowID

)
/**
 * Represents response frame that is returned from [Browser#getWindowBounds](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowBounds) operation call.
 * Get position and size of the browser window.
 *
  
 * @link [Browser#getWindowBounds](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowBounds) method documentation.
 * @see [BrowserOperations.getWindowBounds]
 */
data class GetWindowBoundsResponse(
    /**  
     * Bounds information of the window. When window state is 'minimized', the restored window  
     position and size are returned.  
     */  
    val bounds: Bounds

)

/**
 * Represents request frame that can be used with [Browser#getWindowForTarget](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowForTarget) operation call.
 *
 * Get the browser window that contains the devtools target.
 * @link [Browser#getWindowForTarget](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowForTarget) method documentation.
 * @see [BrowserOperations.getWindowForTarget]
 */
data class GetWindowForTargetRequest(
    /**
     * Devtools agent host id. If called as a part of the session, associated targetId is used.
     */
    val targetId: pl.wendigo.chrome.api.target.TargetID? = null

)
/**
 * Represents response frame that is returned from [Browser#getWindowForTarget](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowForTarget) operation call.
 * Get the browser window that contains the devtools target.
 *
  
 * @link [Browser#getWindowForTarget](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-getWindowForTarget) method documentation.
 * @see [BrowserOperations.getWindowForTarget]
 */
data class GetWindowForTargetResponse(
    /**  
     * Browser window id.  
     */  
    val windowId: WindowID,

    /**  
     * Bounds information of the window. When window state is 'minimized', the restored window  
     position and size are returned.  
     */  
    val bounds: Bounds

)

/**
 * Represents request frame that can be used with [Browser#setWindowBounds](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setWindowBounds) operation call.
 *
 * Set position and/or size of the browser window.
 * @link [Browser#setWindowBounds](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setWindowBounds) method documentation.
 * @see [BrowserOperations.setWindowBounds]
 */
data class SetWindowBoundsRequest(
    /**
     * Browser window id.
     */
    val windowId: WindowID,

    /**
     * New window bounds. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined
with 'left', 'top', 'width' or 'height'. Leaves unspecified fields unchanged.
     */
    val bounds: Bounds

)

/**
 * Represents request frame that can be used with [Browser#setDockTile](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setDockTile) operation call.
 *
 * Set dock tile details, platform-specific.
 * @link [Browser#setDockTile](https://chromedevtools.github.io/devtools-protocol/tot/Browser#method-setDockTile) method documentation.
 * @see [BrowserOperations.setDockTile]
 */
data class SetDockTileRequest(
    /**
     *
     */
    val badgeLabel: String? = null,

    /**
     * Png encoded image.
     */
    val image: String? = null

)