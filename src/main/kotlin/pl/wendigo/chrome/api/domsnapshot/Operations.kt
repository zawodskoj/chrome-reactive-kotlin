package pl.wendigo.chrome.api.domsnapshot

/**
 * This domain facilitates obtaining document snapshots with DOM, layout, and style information.
 *
 * This API is marked as experimental in protocol definition and can change in the future.
 * @link Protocol [DOMSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot) domain documentation.
 */
@pl.wendigo.chrome.protocol.Experimental
class DOMSnapshotOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     * Disables DOM snapshot agent for the given page.
     *
     * @link Protocol [DOMSnapshot#disable](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-disable) method documentation.
     */
    fun disable(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("DOMSnapshot.disable", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables DOM snapshot agent for the given page.
     *
     * @link Protocol [DOMSnapshot#enable](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-enable) method documentation.
     */
    fun enable(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("DOMSnapshot.enable", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
template contents, and imported documents) in a flattened array, as well as layout and
white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
flattened.
     *
     * @link Protocol [DOMSnapshot#getSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-getSnapshot) method documentation.
     */
    @Deprecated(level = DeprecationLevel.WARNING, message = "getSnapshot is deprecated.")
    fun getSnapshot(input: GetSnapshotRequest): io.reactivex.Single<GetSnapshotResponse> {
        return connection.runAndCaptureResponse("DOMSnapshot.getSnapshot", input, GetSnapshotResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
template contents, and imported documents) in a flattened array, as well as layout and
white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
flattened.
     *
     * @link Protocol [DOMSnapshot#captureSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-captureSnapshot) method documentation.
     */
    fun captureSnapshot(input: CaptureSnapshotRequest): io.reactivex.Single<CaptureSnapshotResponse> {
        return connection.runAndCaptureResponse("DOMSnapshot.captureSnapshot", input, CaptureSnapshotResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns flowable capturing all DOMSnapshot domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "DOMSnapshot"
        }
    }
}

/**
 * Represents request frame that can be used with [DOMSnapshot#getSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-getSnapshot) operation call.
 *
 * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
template contents, and imported documents) in a flattened array, as well as layout and
white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
flattened.
 * @link [DOMSnapshot#getSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-getSnapshot) method documentation.
 * @see [DOMSnapshotOperations.getSnapshot]
 */
data class GetSnapshotRequest(
    /**
     * Whitelist of computed styles to return.
     */
    val computedStyleWhitelist: List<String>,

    /**
     * Whether or not to retrieve details of DOM listeners (default false).
     */
    val includeEventListeners: Boolean? = null,

    /**
     * Whether to determine and include the paint order index of LayoutTreeNodes (default false).
     */
    val includePaintOrder: Boolean? = null,

    /**
     * Whether to include UA shadow tree in the snapshot (default false).
     */
    val includeUserAgentShadowTree: Boolean? = null

)
/**
 * Represents response frame that is returned from [DOMSnapshot#getSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-getSnapshot) operation call.
 * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
template contents, and imported documents) in a flattened array, as well as layout and
white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
flattened.
 *
  
 * @link [DOMSnapshot#getSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-getSnapshot) method documentation.
 * @see [DOMSnapshotOperations.getSnapshot]
 */
data class GetSnapshotResponse(
    /**  
     * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.  
     */  
    val domNodes: List<DOMNode>,

    /**  
     * The nodes in the layout tree.  
     */  
    val layoutTreeNodes: List<LayoutTreeNode>,

    /**  
     * Whitelisted ComputedStyle properties for each node in the layout tree.  
     */  
    val computedStyles: List<ComputedStyle>

)

/**
 * Represents request frame that can be used with [DOMSnapshot#captureSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-captureSnapshot) operation call.
 *
 * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
template contents, and imported documents) in a flattened array, as well as layout and
white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
flattened.
 * @link [DOMSnapshot#captureSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-captureSnapshot) method documentation.
 * @see [DOMSnapshotOperations.captureSnapshot]
 */
data class CaptureSnapshotRequest(
    /**
     * Whitelist of computed styles to return.
     */
    val computedStyles: List<String>,

    /**
     * Whether to include layout object paint orders into the snapshot.
     */
    val includePaintOrder: Boolean? = null,

    /**
     * Whether to include DOM rectangles (offsetRects, clientRects, scrollRects) into the snapshot
     */
    val includeDOMRects: Boolean? = null

)
/**
 * Represents response frame that is returned from [DOMSnapshot#captureSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-captureSnapshot) operation call.
 * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
template contents, and imported documents) in a flattened array, as well as layout and
white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
flattened.
 *
  
 * @link [DOMSnapshot#captureSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/DOMSnapshot#method-captureSnapshot) method documentation.
 * @see [DOMSnapshotOperations.captureSnapshot]
 */
data class CaptureSnapshotResponse(
    /**  
     * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.  
     */  
    val documents: List<DocumentSnapshot>,

    /**  
     * Shared string table that all string properties refer to with indexes.  
     */  
    val strings: List<String>

)