package com.developers.rsons.gatecswithlecturepro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Instruction extends AppCompatActivity {
    Button button;
    int position;
    boolean Selecttopic;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

       // StartAppSDK.init(this, "104130031", "204644773", true);

        button = (Button) findViewById(R.id.bigen);

        Selecttopic = getIntent().getExtras().getBoolean("TopicWise", false);
        i = getIntent().getExtras().getInt("Subject", 0);
        position = getIntent().getExtras().getInt("position", 0);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Selecttopic) {
                    // Toast.makeText(Instruction.this, Topic[i]+" is selected", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(Instruction.this, ProceedToQuestion.class);
                    in.putExtra("position", position);
                    in.putExtra("TopicWise", true);
                    in.putExtra("Subject", i);
                    startActivity(in);
                } else {
                    Intent in = new Intent(Instruction.this, ProceedToQuestion.class);
                    in.putExtra("position", position);
                    in.putExtra("TopicWise", false);
                    in.putExtra("Subject", 0);
                    startActivity(in);
                }

                //showInterstitial();

            }
        });


    }

}
