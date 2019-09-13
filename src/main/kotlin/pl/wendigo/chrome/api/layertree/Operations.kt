package pl.wendigo.chrome.api.layertree

/**
 * LayerTreeOperations represents LayerTree protocol domain request/response operations and events that can be captured.
 *
 * This API is marked as experimental in protocol definition and can change in the future.
 * @link Protocol [LayerTree](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree) domain documentation.
 */
@pl.wendigo.chrome.protocol.Experimental
class LayerTreeOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     * Provides the reasons why the given layer was composited.
     *
     * @link Protocol [LayerTree#compositingReasons](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-compositingReasons) method documentation.
     */
    fun compositingReasons(input: CompositingReasonsRequest): io.reactivex.Single<CompositingReasonsResponse> {
        return connection.runAndCaptureResponse("LayerTree.compositingReasons", input, CompositingReasonsResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Disables compositing tree inspection.
     *
     * @link Protocol [LayerTree#disable](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-disable) method documentation.
     */
    fun disable(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("LayerTree.disable", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables compositing tree inspection.
     *
     * @link Protocol [LayerTree#enable](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-enable) method documentation.
     */
    fun enable(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("LayerTree.enable", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns the snapshot identifier.
     *
     * @link Protocol [LayerTree#loadSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-loadSnapshot) method documentation.
     */
    fun loadSnapshot(input: LoadSnapshotRequest): io.reactivex.Single<LoadSnapshotResponse> {
        return connection.runAndCaptureResponse("LayerTree.loadSnapshot", input, LoadSnapshotResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns the layer snapshot identifier.
     *
     * @link Protocol [LayerTree#makeSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-makeSnapshot) method documentation.
     */
    fun makeSnapshot(input: MakeSnapshotRequest): io.reactivex.Single<MakeSnapshotResponse> {
        return connection.runAndCaptureResponse("LayerTree.makeSnapshot", input, MakeSnapshotResponse::class.java).map {
            it.value()
        }
    }

    /**
     *
     *
     * @link Protocol [LayerTree#profileSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-profileSnapshot) method documentation.
     */
    fun profileSnapshot(input: ProfileSnapshotRequest): io.reactivex.Single<ProfileSnapshotResponse> {
        return connection.runAndCaptureResponse("LayerTree.profileSnapshot", input, ProfileSnapshotResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Releases layer snapshot captured by the back-end.
     *
     * @link Protocol [LayerTree#releaseSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-releaseSnapshot) method documentation.
     */
    fun releaseSnapshot(input: ReleaseSnapshotRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("LayerTree.releaseSnapshot", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Replays the layer snapshot and returns the resulting bitmap.
     *
     * @link Protocol [LayerTree#replaySnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-replaySnapshot) method documentation.
     */
    fun replaySnapshot(input: ReplaySnapshotRequest): io.reactivex.Single<ReplaySnapshotResponse> {
        return connection.runAndCaptureResponse("LayerTree.replaySnapshot", input, ReplaySnapshotResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Replays the layer snapshot and returns canvas log.
     *
     * @link Protocol [LayerTree#snapshotCommandLog](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-snapshotCommandLog) method documentation.
     */
    fun snapshotCommandLog(input: SnapshotCommandLogRequest): io.reactivex.Single<SnapshotCommandLogResponse> {
        return connection.runAndCaptureResponse("LayerTree.snapshotCommandLog", input, SnapshotCommandLogResponse::class.java).map {
            it.value()
        }
    }

    /**
     *  Returns observable capturing all LayerTree.layerPainted events.
     */
    fun layerPainted(): io.reactivex.Flowable<LayerPaintedEvent> {
        return layerPaintedTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all LayerTree.layerPainted events.
     */
    fun layerPaintedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<LayerPaintedEvent>> {
        return connection.captureEvents("LayerTree.layerPainted", LayerPaintedEvent::class.java)
    }

    /**
     *  Returns observable capturing all LayerTree.layerTreeDidChange events.
     */
    fun layerTreeDidChange(): io.reactivex.Flowable<LayerTreeDidChangeEvent> {
        return layerTreeDidChangeTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all LayerTree.layerTreeDidChange events.
     */
    fun layerTreeDidChangeTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<LayerTreeDidChangeEvent>> {
        return connection.captureEvents("LayerTree.layerTreeDidChange", LayerTreeDidChangeEvent::class.java)
    }

    /**
     * Returns flowable capturing all LayerTree domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "LayerTree"
        }
    }
}
/**
 * Represents request frame that can be used with [LayerTree#compositingReasons](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-compositingReasons) operation call.
 *
 * Provides the reasons why the given layer was composited.
 * @link [LayerTree#compositingReasons](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-compositingReasons) method documentation.
 * @see [LayerTreeOperations.compositingReasons]
 */
data class CompositingReasonsRequest(
    /**
     * The id of the layer for which we want to get the reasons it was composited.
     */
    val layerId: LayerId

)
/**
 * Represents response frame that is returned from [LayerTree#compositingReasons](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-compositingReasons) operation call.
 * Provides the reasons why the given layer was composited.
 *
  
 * @link [LayerTree#compositingReasons](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-compositingReasons) method documentation.
 * @see [LayerTreeOperations.compositingReasons]
 */
data class CompositingReasonsResponse(
    /**  
     * A list of strings specifying reasons for the given layer to become composited.  
     */  
    val compositingReasons: List<String>

)

/**
 * Represents request frame that can be used with [LayerTree#loadSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-loadSnapshot) operation call.
 *
 * Returns the snapshot identifier.
 * @link [LayerTree#loadSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-loadSnapshot) method documentation.
 * @see [LayerTreeOperations.loadSnapshot]
 */
data class LoadSnapshotRequest(
    /**
     * An array of tiles composing the snapshot.
     */
    val tiles: List<PictureTile>

)
/**
 * Represents response frame that is returned from [LayerTree#loadSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-loadSnapshot) operation call.
 * Returns the snapshot identifier.
 *
  
 * @link [LayerTree#loadSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-loadSnapshot) method documentation.
 * @see [LayerTreeOperations.loadSnapshot]
 */
data class LoadSnapshotResponse(
    /**  
     * The id of the snapshot.  
     */  
    val snapshotId: SnapshotId

)

/**
 * Represents request frame that can be used with [LayerTree#makeSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-makeSnapshot) operation call.
 *
 * Returns the layer snapshot identifier.
 * @link [LayerTree#makeSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-makeSnapshot) method documentation.
 * @see [LayerTreeOperations.makeSnapshot]
 */
data class MakeSnapshotRequest(
    /**
     * The id of the layer.
     */
    val layerId: LayerId

)
/**
 * Represents response frame that is returned from [LayerTree#makeSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-makeSnapshot) operation call.
 * Returns the layer snapshot identifier.
 *
  
 * @link [LayerTree#makeSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-makeSnapshot) method documentation.
 * @see [LayerTreeOperations.makeSnapshot]
 */
data class MakeSnapshotResponse(
    /**  
     * The id of the layer snapshot.  
     */  
    val snapshotId: SnapshotId

)

/**
 * Represents request frame that can be used with [LayerTree#profileSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-profileSnapshot) operation call.
 *
 *
 * @link [LayerTree#profileSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-profileSnapshot) method documentation.
 * @see [LayerTreeOperations.profileSnapshot]
 */
data class ProfileSnapshotRequest(
    /**
     * The id of the layer snapshot.
     */
    val snapshotId: SnapshotId,

    /**
     * The maximum number of times to replay the snapshot (1, if not specified).
     */
    val minRepeatCount: Int? = null,

    /**
     * The minimum duration (in seconds) to replay the snapshot.
     */
    val minDuration: Double? = null,

    /**
     * The clip rectangle to apply when replaying the snapshot.
     */
    val clipRect: pl.wendigo.chrome.api.dom.Rect? = null

)
/**
 * Represents response frame that is returned from [LayerTree#profileSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-profileSnapshot) operation call.
 *
 *
  
 * @link [LayerTree#profileSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-profileSnapshot) method documentation.
 * @see [LayerTreeOperations.profileSnapshot]
 */
data class ProfileSnapshotResponse(
    /**  
     * The array of paint profiles, one per run.  
     */  
    val timings: List<PaintProfile>

)

/**
 * Represents request frame that can be used with [LayerTree#releaseSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-releaseSnapshot) operation call.
 *
 * Releases layer snapshot captured by the back-end.
 * @link [LayerTree#releaseSnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-releaseSnapshot) method documentation.
 * @see [LayerTreeOperations.releaseSnapshot]
 */
data class ReleaseSnapshotRequest(
    /**
     * The id of the layer snapshot.
     */
    val snapshotId: SnapshotId

)

/**
 * Represents request frame that can be used with [LayerTree#replaySnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-replaySnapshot) operation call.
 *
 * Replays the layer snapshot and returns the resulting bitmap.
 * @link [LayerTree#replaySnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-replaySnapshot) method documentation.
 * @see [LayerTreeOperations.replaySnapshot]
 */
data class ReplaySnapshotRequest(
    /**
     * The id of the layer snapshot.
     */
    val snapshotId: SnapshotId,

    /**
     * The first step to replay from (replay from the very start if not specified).
     */
    val fromStep: Int? = null,

    /**
     * The last step to replay to (replay till the end if not specified).
     */
    val toStep: Int? = null,

    /**
     * The scale to apply while replaying (defaults to 1).
     */
    val scale: Double? = null

)
/**
 * Represents response frame that is returned from [LayerTree#replaySnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-replaySnapshot) operation call.
 * Replays the layer snapshot and returns the resulting bitmap.
 *
  
 * @link [LayerTree#replaySnapshot](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-replaySnapshot) method documentation.
 * @see [LayerTreeOperations.replaySnapshot]
 */
data class ReplaySnapshotResponse(
    /**  
     * A data: URL for resulting image.  
     */  
    val dataURL: String

)

/**
 * Represents request frame that can be used with [LayerTree#snapshotCommandLog](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-snapshotCommandLog) operation call.
 *
 * Replays the layer snapshot and returns canvas log.
 * @link [LayerTree#snapshotCommandLog](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-snapshotCommandLog) method documentation.
 * @see [LayerTreeOperations.snapshotCommandLog]
 */
data class SnapshotCommandLogRequest(
    /**
     * The id of the layer snapshot.
     */
    val snapshotId: SnapshotId

)
/**
 * Represents response frame that is returned from [LayerTree#snapshotCommandLog](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-snapshotCommandLog) operation call.
 * Replays the layer snapshot and returns canvas log.
 *
  
 * @link [LayerTree#snapshotCommandLog](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#method-snapshotCommandLog) method documentation.
 * @see [LayerTreeOperations.snapshotCommandLog]
 */
data class SnapshotCommandLogResponse(
    /**  
     * The array of canvas function calls.  
     */  
    val commandLog: List<Any>

)

/**
 *
 *
 * @link [LayerTree#layerPainted](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#event-layerPainted) event documentation.
 */
data class LayerPaintedEvent(
    /**  
     * The id of the painted layer.  
     */  
    val layerId: LayerId,

    /**  
     * Clip rectangle.  
     */  
    val clip: pl.wendigo.chrome.api.dom.Rect

) : pl.wendigo.chrome.protocol.Event(domain = "LayerTree", name = "layerPainted")

/**
 *
 *
 * @link [LayerTree#layerTreeDidChange](https://chromedevtools.github.io/devtools-protocol/tot/LayerTree#event-layerTreeDidChange) event documentation.
 */
data class LayerTreeDidChangeEvent(
    /**  
     * Layer tree, absent if not in the comspositing mode.  
     */  
    val layers: List<Layer>? = null

) : pl.wendigo.chrome.protocol.Event(domain = "LayerTree", name = "layerTreeDidChange")