package com.developers.rsons.gatecswithlecturepro;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Brother's on 5/19/2016.
 */
public class AboutUs extends AppCompatActivity implements Comm {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_activity);

        Helper helper=new Helper();
        helper.setAboutUsIntro(true);

    }



    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void respond(int data) {
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        DescriptionFrag descriptionFrag= (DescriptionFrag) fragmentManager.findFragmentById(R.id.fragment2);
        descriptionFrag.changeData(data);

    }
}
