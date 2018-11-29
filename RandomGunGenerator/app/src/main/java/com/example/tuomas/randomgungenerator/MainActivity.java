package com.example.tuomas.randomgungenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    List<String> guns = new ArrayList<>(Arrays.asList("AK-12", "SCAR-H", "M416", "SAR-21",
            "AEK-971", "FAMAS", "AUG A3", "M16A4", "CZ-805", "ACE 23", "AR160", "AN-94",
            "MX4", "PP-2000", "UMP-45", "CBJ-MS", "PDW-R", "CZ-3A1", "JS2",
            "P90", "MP7", "GROZA-4", "U-100 MK5", "TYPE 88 LMG", "LSAT", "PKP PECHENEG", "QBB-95-1",
            "M240B", "MG4", "M249", "RPK-12", "RPK-74M", "AWS", "L86A1",
            "CS-LR4", "M40A5", "SCOUT ELITE", "SV-98", "JNG-90",
            "338-RECON", "M98B", "SRR-61", "L115"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void drawGun(View view){

        TextView t = (TextView)findViewById(R.id.gunTextView);
        String weapon = guns.get(new Random().nextInt(guns.size()));

        t.setText(weapon);



    }
}
