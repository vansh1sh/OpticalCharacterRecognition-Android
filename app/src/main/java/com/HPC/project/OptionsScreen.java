package com.HPC.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OptionsScreen extends AppCompatActivity {
    TextView serial,parallel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_screen);

        serial = (TextView) findViewById(R.id.serial);
        parallel = (TextView) findViewById(R.id.parallel);

        serial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(OptionsScreen.this, OcrCaptureActivity.class);
                i.putExtra("mytext","Serial");
                startActivity(i);

            }
        });
        parallel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(OptionsScreen.this, OcrCaptureActivity.class);
                i.putExtra("mytext","Parallel");
                startActivity(i);

            }
        });
    }
}
