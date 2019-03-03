package com.example.practicewithrecyclerview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileDesignActivity extends AppCompatActivity {
    private ImageView facebookIv, twitterIv, instagramIv, googlePlusIv;
   /* private Button followBtn;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_design);

        facebookIv = findViewById(R.id.facebookIvId);
        twitterIv = findViewById(R.id.twitterIvId);
        instagramIv = findViewById(R.id.instagramIvId);
        googlePlusIv = findViewById(R.id.googlePlusIvId);


        facebookIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/kushtiarpiccikhan"));
                startActivity(browserIntent);
            }
        });

        twitterIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/nababkhan739"));
                startActivity(browserIntent);
            }
        });

        instagramIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/kushtiarpiccikhan/"));
                startActivity(browserIntent);
            }
        });

        googlePlusIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aboutme.google.com/u/0/?referer=gplus"));
                startActivity(browserIntent);
            }
        });

        ((Button)findViewById(R.id.followBtnId)).setOnClickListener(followButtonClickListener);

    }

    private View.OnClickListener followButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showText(new MyCreateListener() {
                @Override
                public void onFinished() {
                    ((TextView)findViewById(R.id.showMessageTvId)).setText("After 5 seconds, now  i am following!");
                }
            });
        }
    };

    private void showText(MyCreateListener myCreateListener) {
        try {
            Thread.sleep(5000);
            myCreateListener.onFinished();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private interface MyCreateListener{
        void onFinished();
    }
}
