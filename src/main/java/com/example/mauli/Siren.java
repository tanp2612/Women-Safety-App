package com.example.mauli;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Siren extends MainActivity {
    ImageView alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        alarm = (ImageView) this.findViewById(R.id.alarm);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.siren);

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }
}

