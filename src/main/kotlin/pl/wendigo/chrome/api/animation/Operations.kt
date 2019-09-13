package pl.wendigo.chrome.api.animation

/**
 * AnimationOperations represents Animation protocol domain request/response operations and events that can be captured.
 *
 * This API is marked as experimental in protocol definition and can change in the future.
 * @link Protocol [Animation](https://chromedevtools.github.io/devtools-protocol/tot/Animation) domain documentation.
 */
@pl.wendigo.chrome.protocol.Experimental
class AnimationOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     * Disables animation domain notifications.
     *
     * @link Protocol [Animation#disable](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-disable) method documentation.
     */
    fun disable(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Animation.disable", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables animation domain notifications.
     *
     * @link Protocol [Animation#enable](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-enable) method documentation.
     */
    fun enable(): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Animation.enable", null, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns the current time of the an animation.
     *
     * @link Protocol [Animation#getCurrentTime](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-getCurrentTime) method documentation.
     */
    fun getCurrentTime(input: GetCurrentTimeRequest): io.reactivex.Single<GetCurrentTimeResponse> {
        return connection.runAndCaptureResponse("Animation.getCurrentTime", input, GetCurrentTimeResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Gets the playback rate of the document timeline.
     *
     * @link Protocol [Animation#getPlaybackRate](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-getPlaybackRate) method documentation.
     */
    fun getPlaybackRate(): io.reactivex.Single<GetPlaybackRateResponse> {
        return connection.runAndCaptureResponse("Animation.getPlaybackRate", null, GetPlaybackRateResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Releases a set of animations to no longer be manipulated.
     *
     * @link Protocol [Animation#releaseAnimations](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-releaseAnimations) method documentation.
     */
    fun releaseAnimations(input: ReleaseAnimationsRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Animation.releaseAnimations", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Gets the remote object of the Animation.
     *
     * @link Protocol [Animation#resolveAnimation](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-resolveAnimation) method documentation.
     */
    fun resolveAnimation(input: ResolveAnimationRequest): io.reactivex.Single<ResolveAnimationResponse> {
        return connection.runAndCaptureResponse("Animation.resolveAnimation", input, ResolveAnimationResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Seek a set of animations to a particular time within each animation.
     *
     * @link Protocol [Animation#seekAnimations](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-seekAnimations) method documentation.
     */
    fun seekAnimations(input: SeekAnimationsRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Animation.seekAnimations", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Sets the paused state of a set of animations.
     *
     * @link Protocol [Animation#setPaused](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setPaused) method documentation.
     */
    fun setPaused(input: SetPausedRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Animation.setPaused", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Sets the playback rate of the document timeline.
     *
     * @link Protocol [Animation#setPlaybackRate](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setPlaybackRate) method documentation.
     */
    fun setPlaybackRate(input: SetPlaybackRateRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Animation.setPlaybackRate", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Sets the timing of an animation node.
     *
     * @link Protocol [Animation#setTiming](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setTiming) method documentation.
     */
    fun setTiming(input: SetTimingRequest): io.reactivex.Single<pl.wendigo.chrome.protocol.ResponseFrame> {
        return connection.runAndCaptureResponse("Animation.setTiming", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *  Event for when an animation has been cancelled.
     */
    fun animationCanceled(): io.reactivex.Flowable<AnimationCanceledEvent> {
        return animationCanceledTimed().map {
            it.value()
        }
    }

    /**
     * Event for when an animation has been cancelled.
     */
    fun animationCanceledTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<AnimationCanceledEvent>> {
        return connection.captureEvents("Animation.animationCanceled", AnimationCanceledEvent::class.java)
    }

    /**
     *  Event for each animation that has been created.
     */
    fun animationCreated(): io.reactivex.Flowable<AnimationCreatedEvent> {
        return animationCreatedTimed().map {
            it.value()
        }
    }

    /**
     * Event for each animation that has been created.
     */
    fun animationCreatedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<AnimationCreatedEvent>> {
        return connection.captureEvents("Animation.animationCreated", AnimationCreatedEvent::class.java)
    }

    /**
     *  Event for animation that has been started.
     */
    fun animationStarted(): io.reactivex.Flowable<AnimationStartedEvent> {
        return animationStartedTimed().map {
            it.value()
        }
    }

    /**
     * Event for animation that has been started.
     */
    fun animationStartedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<AnimationStartedEvent>> {
        return connection.captureEvents("Animation.animationStarted", AnimationStartedEvent::class.java)
    }

    /**
     * Returns flowable capturing all Animation domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "Animation"
        }
    }
}

/**
 * Represents request frame that can be used with [Animation#getCurrentTime](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-getCurrentTime) operation call.
 *
 * Returns the current time of the an animation.
 * @link [Animation#getCurrentTime](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-getCurrentTime) method documentation.
 * @see [AnimationOperations.getCurrentTime]
 */
data class GetCurrentTimeRequest(
    /**
     * Id of animation.
     */
    val id: String

)
/**
 * Represents response frame that is returned from [Animation#getCurrentTime](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-getCurrentTime) operation call.
 * Returns the current time of the an animation.
 *
  
 * @link [Animation#getCurrentTime](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-getCurrentTime) method documentation.
 * @see [AnimationOperations.getCurrentTime]
 */
data class GetCurrentTimeResponse(
    /**  
     * Current time of the page.  
     */  
    val currentTime: Double

)

/**
 * Represents response frame that is returned from [Animation#getPlaybackRate](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-getPlaybackRate) operation call.
 * Gets the playback rate of the document timeline.
 *
  
 * @link [Animation#getPlaybackRate](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-getPlaybackRate) method documentation.
 * @see [AnimationOperations.getPlaybackRate]
 */
data class GetPlaybackRateResponse(
    /**  
     * Playback rate for animations on page.  
     */  
    val playbackRate: Double

)

/**
 * Represents request frame that can be used with [Animation#releaseAnimations](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-releaseAnimations) operation call.
 *
 * Releases a set of animations to no longer be manipulated.
 * @link [Animation#releaseAnimations](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-releaseAnimations) method documentation.
 * @see [AnimationOperations.releaseAnimations]
 */
data class ReleaseAnimationsRequest(
    /**
     * List of animation ids to seek.
     */
    val animations: List<String>

)

/**
 * Represents request frame that can be used with [Animation#resolveAnimation](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-resolveAnimation) operation call.
 *
 * Gets the remote object of the Animation.
 * @link [Animation#resolveAnimation](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-resolveAnimation) method documentation.
 * @see [AnimationOperations.resolveAnimation]
 */
data class ResolveAnimationRequest(
    /**
     * Animation id.
     */
    val animationId: String

)
/**
 * Represents response frame that is returned from [Animation#resolveAnimation](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-resolveAnimation) operation call.
 * Gets the remote object of the Animation.
 *
  
 * @link [Animation#resolveAnimation](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-resolveAnimation) method documentation.
 * @see [AnimationOperations.resolveAnimation]
 */
data class ResolveAnimationResponse(
    /**  
     * Corresponding remote object.  
     */  
    val remoteObject: pl.wendigo.chrome.api.runtime.RemoteObject

)

/**
 * Represents request frame that can be used with [Animation#seekAnimations](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-seekAnimations) operation call.
 *
 * Seek a set of animations to a particular time within each animation.
 * @link [Animation#seekAnimations](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-seekAnimations) method documentation.
 * @see [AnimationOperations.seekAnimations]
 */
data class SeekAnimationsRequest(
    /**
     * List of animation ids to seek.
     */
    val animations: List<String>,

    /**
     * Set the current time of each animation.
     */
    val currentTime: Double

)

/**
 * Represents request frame that can be used with [Animation#setPaused](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setPaused) operation call.
 *
 * Sets the paused state of a set of animations.
 * @link [Animation#setPaused](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setPaused) method documentation.
 * @see [AnimationOperations.setPaused]
 */
data class SetPausedRequest(
    /**
     * Animations to set the pause state of.
     */
    val animations: List<String>,

    /**
     * Paused state to set to.
     */
    val paused: Boolean

)

/**
 * Represents request frame that can be used with [Animation#setPlaybackRate](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setPlaybackRate) operation call.
 *
 * Sets the playback rate of the document timeline.
 * @link [Animation#setPlaybackRate](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setPlaybackRate) method documentation.
 * @see [AnimationOperations.setPlaybackRate]
 */
data class SetPlaybackRateRequest(
    /**
     * Playback rate for animations on page
     */
    val playbackRate: Double

)

/**
 * Represents request frame that can be used with [Animation#setTiming](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setTiming) operation call.
 *
 * Sets the timing of an animation node.
 * @link [Animation#setTiming](https://chromedevtools.github.io/devtools-protocol/tot/Animation#method-setTiming) method documentation.
 * @see [AnimationOperations.setTiming]
 */
data class SetTimingRequest(
    /**
     * Animation id.
     */
    val animationId: String,

    /**
     * Duration of the animation.
     */
    val duration: Double,

    /**
     * Delay of the animation.
     */
    val delay: Double

)

/**
 * Event for when an animation has been cancelled.
 *
 * @link [Animation#animationCanceled](https://chromedevtools.github.io/devtools-protocol/tot/Animation#event-animationCanceled) event documentation.
 */
data class AnimationCanceledEvent(
    /**  
     * Id of the animation that was cancelled.  
     */  
    val id: String

) : pl.wendigo.chrome.protocol.Event(domain = "Animation", name = "animationCanceled")

/**
 * Event for each animation that has been created.
 *
 * @link [Animation#animationCreated](https://chromedevtools.github.io/devtools-protocol/tot/Animation#event-animationCreated) event documentation.
 */
data class AnimationCreatedEvent(
    /**  
     * Id of the animation that was created.  
     */  
    val id: String

) : pl.wendigo.chrome.protocol.Event(domain = "Animation", name = "animationCreated")

/**
 * Event for animation that has been started.
 *
 * @link [Animation#animationStarted](https://chromedevtools.github.io/devtools-protocol/tot/Animation#event-animationStarted) event documentation.
 */
data class AnimationStartedEvent(
    /**  
     * Animation that was started.  
     */  
    val animation: Animation

) : pl.wendigo.chrome.protocol.Event(domain = "Animation", name = "animationStarted")