package com.developers.rsons.gatecswithlecturepro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Brother's on 6/21/2016.
 */
public class SelectTeacher extends Activity {

    Button ravindra,nptel,motivation,moreVideos;
    Config config=new Config();

    //InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_teacher);

        ravindra = (Button) findViewById(R.id.ravindra);
        nptel= (Button) findViewById(R.id.nptel);
        motivation= (Button) findViewById(R.id.motivation);
        moreVideos= (Button) findViewById(R.id.morevideo);


        ravindra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                config.setLectureTeacher(1);
                Intent intent =new Intent(SelectTeacher.this,VideoLec.class);
                startActivity(intent);
            }
        });

        nptel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                config.setLectureTeacher(2);
                Intent intent =new Intent(SelectTeacher.this,VideoLec.class);
                startActivity(intent);
            }
        });

        motivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                config.setLectureTeacher(3);
                Intent intent =new Intent(SelectTeacher.this,VideoLec.class);
                startActivity(intent);
            }
        });

        moreVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                config.setLectureTeacher(4);
                Intent intent =new Intent(SelectTeacher.this,VideoLec.class);
                startActivity(intent);
            }
        });
    }

}
