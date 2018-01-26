package org.bubulescu.recapdialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnWarn, btnList, btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWarn = findViewById(R.id.btnWarn);
        btnWarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WarnDialog warnDialog = new WarnDialog();
                warnDialog.show(getSupportFragmentManager(), "wd");
            }
        });

        btnList = findViewById(R.id.btnList);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListDialog listDialog = new ListDialog();
                listDialog.show(getSupportFragmentManager(), "ld");
            }
        });


        btnCustom = findViewById(R.id.btnCustom);
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog customDialog = new CustomDialog();
                customDialog.show(getSupportFragmentManager(), "cd");
            }
        });

    }

}
