package com.soyaaroncervantes.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.soyaaroncervantes.recyclerview.adapters.HeroeAdapter
import com.soyaaroncervantes.recyclerview.data.Heroe
import com.soyaaroncervantes.recyclerview.interfaces.HeroeListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HeroeListener {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val heroes: List<Heroe> = listOf(
      Heroe(
        0,
        "Spiderman",
        "Spider web",
        "Marvel",
        "Peter Parker",
        "Male"
      ),
      Heroe(
        1,
        "Wonder Woman",
        "Agility",
        "DC",
        "Diana Prince",
        "Female"
      ),
      Heroe(
        2,
        "Iron-man",
        "Genius",
        "Marvel",
        "Tony Stark",
        "Male"
      ),
      Heroe(
        3,
        "Hulk",
        "Superhuman Strength",
        "Marvel",
        "Bruce Banner",
        "Male"
      )
    )

    val heroeAdapter: HeroeAdapter = HeroeAdapter( heroes );
    heroeAdapter.setHeroeListener(this);
    recycleView__Heroe.adapter = heroeAdapter;
    val layoutManager = LinearLayoutManager( recycleView__Heroe.context )
    recycleView__Heroe.layoutManager = layoutManager;
  }

  override fun onClickCard( heroe: Heroe ) {
    Toast.makeText(this,"View's click", Toast.LENGTH_SHORT ).show()
    setHeroeToActivity( heroe );
  }

  override fun onShareButton(heroe: Heroe) {
    Toast.makeText(this,"Button click", Toast.LENGTH_SHORT ).show()
    setHeroeToActivity( heroe );
  }

  private fun setHeroeToActivity( heroe: Heroe ) {
    val detailIntent = Intent( this, DetailActivity::class.java )
    val detailBundle = Bundle();
    detailBundle.putParcelable( "heroe", heroe);
    detailIntent.putExtras( detailBundle )
    startActivity(  detailIntent )
  }

}