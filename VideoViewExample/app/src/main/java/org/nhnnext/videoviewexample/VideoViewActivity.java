package org.nhnnext.videoviewexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.MalformedURLException;


public class VideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoview);

        VideoView videoView = (VideoView)findViewById(R.id.videoView);

        // local resource
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/too_cute");

        // external URL
//        String path = "http://techslides.com/demos/sample-videos/small.mp4";
//        Uri uri= Uri.parse(path);
        videoView.setVideoURI(uri);


        final MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.postDelayed(new Runnable() {
            @Override
            public void run() {
                mediaController.show(0);
            }
        }, 100);

    }
}
