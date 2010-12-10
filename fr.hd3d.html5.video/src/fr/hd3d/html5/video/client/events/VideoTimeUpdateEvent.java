package fr.hd3d.html5.video.client.events;

import com.google.gwt.event.dom.client.DomEvent;

import fr.hd3d.html5.video.client.handlers.VideoTimeUpdateHandler;

/**
 * The current playback position changed as part of normal playback or in an
 * especially interesting way, for example discontinuously.
 * 
 * @author michael.guiral
 * 
 */
public class VideoTimeUpdateEvent extends DomEvent<VideoTimeUpdateHandler> {
    private static final Type<VideoTimeUpdateHandler> TYPE = new Type<VideoTimeUpdateHandler>("timeupdate", new VideoTimeUpdateEvent());

    public static Type<VideoTimeUpdateHandler> getType() {
        return TYPE;
    }

    protected VideoTimeUpdateEvent() {
    }

    @Override
    public com.google.gwt.event.dom.client.DomEvent.Type<VideoTimeUpdateHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(VideoTimeUpdateHandler handler) {
        handler.onTimeUpdated(this);
    }
}
