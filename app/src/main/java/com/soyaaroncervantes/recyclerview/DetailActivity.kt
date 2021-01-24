package com.soyaaroncervantes.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soyaaroncervantes.recyclerview.data.Heroe
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val heroe = intent.getParcelableExtra<Heroe>("heroe" )
        textView__name.text = heroe?.name
        textView__ability.text = heroe?.power
        textView__publishingHouse.text = heroe?.publishing_house
    }
}