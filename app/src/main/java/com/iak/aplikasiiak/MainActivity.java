package com.iak.aplikasiiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText berat;
    EditText tinggi;
    RadioButton lk;
    RadioButton pr;
    Button oke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        berat=(EditText) findViewById(R.id.berat);
        tinggi=(EditText) findViewById(R.id.tinggi);
        lk=(RadioButton) findViewById(R.id.lk);
        pr=(RadioButton) findViewById(R.id.pr);
        oke=(Button) findViewById(R.id.oke);

        oke.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                double dblBerat = Double.parseDouble(berat.getText().toString());
                double dblTinggi = Double.parseDouble(tinggi.getText().toString());
                final double hitung = dblBerat / ( dblTinggi/100 * dblTinggi/100 );

                if(lk.isChecked()) {
                    final String kelamin = "lk";

                    Intent lemparan = new Intent (MainActivity.this, HasilActivity.class);

                    lemparan.putExtra( "hitung", String.valueOf(hitung) );
                    lemparan.putExtra( "kelamin", kelamin );

                    startActivity(lemparan);
                }

                if(pr.isChecked()){
                    final String kelamin = "pr";

                    Intent lemparan = new Intent (MainActivity.this, HasilActivity.class);

                    lemparan.putExtra( "hitung", String.valueOf(hitung) );
                    lemparan.putExtra( "kelamin", kelamin );

                    startActivity(lemparan);
                }


            } //end void
        });// end set on click
    }
}
