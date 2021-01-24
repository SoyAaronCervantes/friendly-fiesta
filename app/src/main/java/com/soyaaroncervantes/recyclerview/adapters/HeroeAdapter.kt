package com.soyaaroncervantes.recyclerview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soyaaroncervantes.recyclerview.R
import com.soyaaroncervantes.recyclerview.data.Heroe
import com.soyaaroncervantes.recyclerview.interfaces.HeroeListener
import com.soyaaroncervantes.recyclerview.viewHolder.HeroeViewHolder

class HeroeAdapter(private val heroes: List<Heroe> ) : RecyclerView.Adapter<HeroeViewHolder>() {

  private var heroeListener: HeroeListener? = null
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeViewHolder {
    val view = LayoutInflater
      .from( parent.context )
      .inflate( R.layout.heroe, parent, false )

    val heroeViewHolder = HeroeViewHolder( view )
    heroeViewHolder.setHeroeListener( this.heroeListener );

    return heroeViewHolder;
  }

  override fun onBindViewHolder(holder: HeroeViewHolder, position: Int) {
    holder.bindHeroe( heroes[ position ] )
  }

  override fun getItemCount(): Int {
    return heroes.size;
  }

  fun setHeroeListener( heroeListener: HeroeListener ){
    this.heroeListener = heroeListener
  }

}