package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Landforms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landforms);

        PhotoView landforms = findViewById(R.id.landforms);
        PhotoView apo = findViewById(R.id.apo);
        PhotoView dulang = findViewById(R.id.dulang);
        PhotoView pulag = findViewById(R.id.pulag);
        PhotoView kitanglad = findViewById(R.id.kitanglad);
        PhotoView tabayoc = findViewById(R.id.tabayoc);
        PhotoView kalatungan = findViewById(R.id.kalatungan);
        PhotoView piapayungan = findViewById(R.id.piapayungan);
        PhotoView ragang = findViewById(R.id.ragang);
        PhotoView maagnaw = findViewById(R.id.maagnaw);
        PhotoView timbak = findViewById(R.id.timbak);
        PhotoView volcano = findViewById(R.id.volcano);
        PhotoView volcano1 = findViewById(R.id.bulkan);
        PhotoView mayon = findViewById(R.id.mayon);
        PhotoView taal = findViewById(R.id.taal);
        PhotoView kanlaon = findViewById(R.id.kanlaon);
        PhotoView bulusan = findViewById(R.id.bulusan);
        PhotoView hibok = findViewById(R.id.hibok);
        PhotoView pinatubo = findViewById(R.id.pinatubo);


        landforms.setImageResource(R.drawable.landforms);
        apo.setImageResource(R.drawable.apo);
        dulang.setImageResource(R.drawable.dulang);
        pulag.setImageResource(R.drawable.pulag);
        kitanglad.setImageResource(R.drawable.kitanglad);
        tabayoc.setImageResource(R.drawable.tabayoc);
        kalatungan.setImageResource(R.drawable.kalatungan);
        piapayungan.setImageResource(R.drawable.piapayungan);
        ragang.setImageResource(R.drawable.ragang);
        maagnaw.setImageResource(R.drawable.maagnaw);
        timbak.setImageResource(R.drawable.timbak);
        volcano.setImageResource(R.drawable.volcano);
        volcano1.setImageResource(R.drawable.bulkan);
        mayon.setImageResource(R.drawable.mayon);
        taal.setImageResource(R.drawable.taal);
        kanlaon.setImageResource(R.drawable.kanlaon);
        bulusan.setImageResource(R.drawable.bulusan);
        hibok.setImageResource(R.drawable.hibok);
        pinatubo.setImageResource(R.drawable.pinatubo);
    }
}