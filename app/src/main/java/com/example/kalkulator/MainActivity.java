package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextLayar;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttontambah, buttonkurang, buttonkali, buttonbagi, buttonsamadengan;
    Button buttonclear;

    public static double nilaisekarang = 0;
    public static String operasi = "";
    public static double hasil = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init() {
        editTextLayar = (EditText) findViewById(R.id.editTextLayar);
        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        buttontambah = (Button) findViewById(R.id.buttontambah);
        buttontambah.setOnClickListener(this);
        buttonkurang = (Button) findViewById(R.id.buttonkurang);
        buttonkurang.setOnClickListener(this);
        buttonkali = (Button) findViewById(R.id.buttonkali);
        buttonkali.setOnClickListener(this);
        buttonbagi = (Button)findViewById(R.id.buttonbagi);
        buttonbagi.setOnClickListener(this);
        buttonsamadengan = (Button)findViewById(R.id.buttonsamadengan);
        buttonsamadengan.setOnClickListener(this);

        buttonclear = (Button)findViewById(R.id.buttonclear);
        buttonclear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"0");
                break;
            case R.id.button1:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"1");
                break;
            case R.id.button2:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"2");
                break;
            case R.id.button3:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"3");
                break;
            case R.id.button4:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"4");
                break;
            case R.id.button5:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"5");
                break;
            case R.id.button6:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"6");
                break;
            case R.id.button7:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"7");
                break;
            case R.id.button8:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"8");
                break;
            case R.id.button9:
                editTextLayar.setText(editTextLayar.getText().toString().trim()+"9");
                break;


            case R.id.buttontambah:
                if(editTextLayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Angka harus diisi.", Toast.LENGTH_SHORT).show();
                    return;
                }

                operasi = "tambah";
                nilaisekarang = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;
            case R.id.buttonkurang:
                if(editTextLayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Angka harus diisi.", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasi = "kurang";
                nilaisekarang = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;
            case R.id.buttonkali:
                if(editTextLayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Angka harus diisi.", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasi = "kali";
                nilaisekarang = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;
            case R.id.buttonbagi:
                if(editTextLayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Angka harus diisi.", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasi = "bagi";
                nilaisekarang = Double.parseDouble(editTextLayar.getText().toString());
                editTextLayar.setText("");
                break;
            case R.id.buttonsamadengan:
                if(operasi.equals("tambah")){
                    hasil = nilaisekarang + Double.parseDouble(editTextLayar.getText().toString().trim());

                }
                if(operasi.equals("kurang")){
                    hasil = nilaisekarang - Double.parseDouble(editTextLayar.getText().toString().trim());

                }
                if(operasi.equals("kali")){
                    hasil = nilaisekarang * Double.parseDouble(editTextLayar.getText().toString().trim());

                }
                if(operasi.equals("bagi")){
                    hasil = nilaisekarang / Double.parseDouble(editTextLayar.getText().toString().trim());
                }

                //hasil=2.1
                //nilaiTemp=2
                int nilaiTemp = (int) hasil;

                //2.1==2? tidak sama
                if(nilaiTemp == hasil){
                editTextLayar.setText(String.valueOf((int)hasil));
                }else {
                    editTextLayar.setText(String.valueOf(hasil));
                }
                break;

            case R.id.buttonclear:
                nilaisekarang = 0;
                editTextLayar.setText("");
                break;
        }
    }
}
