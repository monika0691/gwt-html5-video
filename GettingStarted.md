# Getting started #

## Adding gwt-html5-video to an (Eclipse) GWT Project ##

  1. Download last version of the library [fr.hd3d.html5.video.&lt;version&gt;.jar](http://code.google.com/p/gwt-html5-video/downloads/list)
  1. Add the library into your Eclipse GWT project
  1. Edit GWT module to include the following line

```
<inherits name='fr.hd3d.html5.video.HTML5Video'/>
```

## Simple Example ##
```

package fr.hd3d.html5.video.demo.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import fr.hd3d.html5.video.client.VideoSource;
import fr.hd3d.html5.video.client.VideoWidget;
import fr.hd3d.html5.video.client.VideoSource.VideoType;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Html5VideoDemo implements EntryPoint {
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        VideoWidget videoPlayer = new VideoWidget(false, true, "fr_hd3d_html5_video_demo/videos/bbb480.jpg");
        List<VideoSource> sources = new ArrayList<VideoSource>();
        sources.add(new VideoSource("fr_hd3d_html5_video_demo/videos/bbb_trailer_400p.ogv"));
        sources.add(new VideoSource("fr_hd3d_html5_video_demo/videos/bbb_trailer_360p.webm", VideoType.WEBM));
        videoPlayer.setSources(sources);
        videoPlayer.setPixelSize(500, 400);
        RootPanel.get().add(videoPlayer);
    }
}
```