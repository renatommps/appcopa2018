package com.example.appcopa2018;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class DisplayVideosActivity extends YouTubeBaseActivity implements OnInitializedListener {

    public static final String API_KEY = "AIzaSyD9YG6QcZU1L8nC1eRuzq36NeE4FW3jXfs";

    public static final String VIDEO_ID = "JrL7IsBrLUM";

    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener(){

        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(YouTubePlayer.ErrorReason errorReason) {

        }
    };

    private PlaybackEventListener playbackEventListener = new PlaybackEventListener(){

        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_videos);

        // inicializa o YouTube Player View
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY, this);
    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        // adiciona listeners para a instancia do YouTubePlayer
        youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
        youTubePlayer.setPlaybackEventListener(playbackEventListener);

        // começa a bufferizar
        if (!wasRestored) {
            youTubePlayer.cueVideo(VIDEO_ID);
        }
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Falhou ao iniciar o YouTube Player!", Toast.LENGTH_LONG).show();
    }
}

//package com.example.appcopa2018;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//
//import com.google.android.youtube.player.YouTubeBaseActivity;
//import com.google.android.youtube.player.YouTubeInitializationResult;
//import com.google.android.youtube.player.YouTubePlayer;
//import com.google.android.youtube.player.YouTubePlayer.Provider;
//import com.google.android.youtube.player.YouTubePlayerView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class DisplayVideosActivity extends YouTubeBaseActivity {
//
//    private static final String TAG = "DisplayVideosActivity";
//    public static final String API_KEY = "AIzaSyD9YG6QcZU1L8nC1eRuzq36NeE4FW3jXfs";
//
//    public static final String VIDEO_1_ID = "SssLX7zW5EI";
//    public static final String VIDEO_2_ID = "6tHrhzCIyHs";
//    public static final String VIDEO_3_ID = "jhK2ev_O-pc";
//    public static final String VIDEO_4_ID = "EYH6ubNJqck";
//
//    private YouTubePlayerView mYouTubePlayerView;
//    private Button btnPlay;
//    private YouTubePlayer.OnInitializedListener mOnInitializedListener;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_videos);
//
//        btnPlay = findViewById(R.id.btn_play);
//        mYouTubePlayerView = findViewById(R.id.youtube_player);
//
//        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
//
//            @Override
//            public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                List<String> videoList = new ArrayList<>();
//                videoList.add(VIDEO_1_ID);
//                videoList.add(VIDEO_2_ID);
//                videoList.add(VIDEO_3_ID);
//                videoList.add(VIDEO_4_ID);
//
//                youTubePlayer.loadVideos(videoList);
//            }
//
//            @Override
//            public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Log.d(TAG, "onClick: Falou ao iniciar player do youtube.");
//            }
//        };
//
//        btnPlay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick: Iniciando player do youtube.");
//                mYouTubePlayerView.initialize(API_KEY, mOnInitializedListener);
//            }
//        });
//
//    }
//
//}
