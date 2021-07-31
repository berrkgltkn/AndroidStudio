package com.example.tas_kagt_makas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var computerscore=0
    var userscore=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tikla(view: View){
        val rnd = 1 + Random.nextInt(3)
        val imgButton = view as ImageButton
        if (rnd == 1) {
            sonuc.text = "TAŞ"
        } else if (rnd == 2) {
            sonuc.text = "KAĞIT"
        } else if (rnd == 3) {
            sonuc.text = "Makas"
        }
        when (imgButton.id) {
            R.id.tas -> {
                if (rnd == 1) {
                    sonuc.text = "Berabere"
                    pcsecim.text="Taş"
                } else if (rnd == 2) {
                    sonuc.text = "Bilgisayar Kazandı"
                    pcsecim.text="Kağıt"
                    computerscore+=1
                    skorb.text=computerscore.toString()

                } else if (rnd == 3) {
                    sonuc.text = "Tebrikler Kazandınız"
                    userscore+=1
                    skors.text=userscore.toString()
                    pcsecim.text="Makas"
                }

            }
            R.id.kagit -> {
                if (rnd == 1) {
                    sonuc.text = "Tebrikler Kazandınız"
                    pcsecim.text="Taş"
                    userscore+=1
                    skors.text=userscore.toString()
                } else if (rnd == 2) {
                    sonuc.text = "Berabere"
                    pcsecim.text="Kağıt"
                } else if (rnd == 3) {
                    sonuc.text = "Bilgisayar Kazandı"
                    computerscore+=1
                    skorb.text=computerscore.toString()
                    pcsecim.text="Makas"
                }


            }
            R.id.makas -> {
                if (rnd == 1) {
                    sonuc.text = "Bilgisayar Kazandı"
                    pcsecim.text="Taş"
                    computerscore+=1
                    skorb.text=computerscore.toString()
                } else if (rnd == 2) {
                    sonuc.text = "Tebrikler Kazandınız"
                    pcsecim.text="Kağıt"
                    userscore+=1
                    skors.text=userscore.toString()
                } else if (rnd == 3) {
                    sonuc.text = "Berabere"
                    pcsecim.text="Makas"
                }


            }
    }

    }
}