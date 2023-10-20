package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.adText
import kotlinx.android.synthetic.main.activity_main.bolumText
import kotlinx.android.synthetic.main.activity_main.okulText
import kotlinx.android.synthetic.main.activity_main.sinifText
import kotlinx.android.synthetic.main.activity_main.soyadText
import kotlinx.android.synthetic.main.activity_main.textView2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun OgrenciKaydet(view: View){
        val ad = adText.text.toString()
        val soyad = soyadText.text.toString()
        val okul = okulText.text.toString()
        val bolum = bolumText.text.toString()
        val sinif = sinifText.text.toString().toIntOrNull()

        if(sinif == null)
        {
            textView2.text = "Lütfen Bir Tamsayı Girin!!!"
        } else {
            val ogrenci1 = Ogrenci(ad, soyad, okul, bolum, sinif)
            textView2.text = "Ad: ${ogrenci1.ad}, Soyad:${ogrenci1.soyad}, Okul:${ogrenci1.okul}, Bölüm:${ogrenci1.bolum}, Sınıf:${ogrenci1.sinif}"
        }
    }
}