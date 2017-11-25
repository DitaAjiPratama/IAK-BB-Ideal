package com.iak.aplikasiiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        String strHitung = getIntent().getStringExtra("hitung");
        String strKelamin = getIntent().getStringExtra("kelamin");

        TextView bmi = (TextView) findViewById(R.id.bmi);
        TextView hasil = (TextView) findViewById(R.id.hasil);

        bmi.setText(strHitung);

        double dblHitung = Double.parseDouble(strHitung);

        if (strKelamin.equals("lk")){
            if (dblHitung<17){
                hasil.setText("Under Weight");
            }
            if (dblHitung>=17){
                hasil.setText("Normal Weight");
            }
            if (dblHitung>=23){
                hasil.setText("Over Weight");
            }
            if (dblHitung>=27){
                hasil.setText("Obesity");
            }
        }

        if (strKelamin.equals("pr")){
            if (dblHitung<18){
                hasil.setText("Under Weight");
            }
            if (dblHitung>=18){
                hasil.setText("Normal Weight");
            }
            if (dblHitung>=25){
                hasil.setText("Over Weight");
            }
            if (dblHitung>=27){
                hasil.setText("Obesity");
            }
        }

        Button back;

        back = (Button) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}
