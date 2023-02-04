package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    EditText edtNilaiA,edtNilaiB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtNilaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);


       btnTambah.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
               int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

               int hasil = nilaiA + nilaiB;
               txtHasil.setText(String.valueOf(hasil));
               Toast.makeText(getApplicationContext(), "hasilnya adalah "+hasil, Toast.LENGTH_SHORT).show();
           }
       });

       btnKurang.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
               int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

               int hasil = nilaiA - nilaiB;
               txtHasil.setText(String.valueOf(hasil));
               Toast.makeText(getApplicationContext(), "hasilnya adalah "+hasil, Toast.LENGTH_SHORT).show();
           }
       });

       btnKali.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
               int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

               int hasil = nilaiA * nilaiB;
               txtHasil.setText(String.valueOf(hasil));
               Toast.makeText(getApplicationContext(), "hasilnya adalah "+hasil, Toast.LENGTH_SHORT).show();
           }
       });

       btnBagi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
               double nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

               double hasil = nilaiA / nilaiB;
               txtHasil.setText(new DecimalFormat("##.##").format(hasil));

               Toast.makeText(getApplicationContext(), "hasilnya adalah "+new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
           }
       });
    }
}