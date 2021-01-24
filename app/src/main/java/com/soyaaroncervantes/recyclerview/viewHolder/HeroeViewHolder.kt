package com.soyaaroncervantes.recyclerview.viewHolder

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.soyaaroncervantes.recyclerview.R
import com.soyaaroncervantes.recyclerview.data.Heroe
import com.soyaaroncervantes.recyclerview.interfaces.HeroeListener

class HeroeViewHolder(private val itemView: View ): RecyclerView.ViewHolder( itemView ) {

  private var heroeListener: HeroeListener? = null
  private var heroe: Heroe? = null;

  private var textViewName: TextView = itemView.findViewById( R.id.textView__hero__name );
  private var textViewPower: TextView = itemView.findViewById( R.id.textView__hero__power );
  private var textViewPublishingHouse: TextView = itemView.findViewById( R.id.textView__hero__publishingHouse );
  private var buttonMore: Button =  itemView.findViewById( R.id.button__more );

  fun bindHeroe( heroe: Heroe ) {

    this.heroe = heroe;
    textViewName.text = heroe.name;
    textViewPublishingHouse.text = heroe.publishing_house;
    textViewPower.text = heroe.power

    itemView.setOnClickListener { _ ->
      heroeListener?.onClickCard( heroe )
    }

    buttonMore.setOnClickListener { _ ->
      heroeListener?.onShareButton( heroe )
    }

  }


  fun setHeroeListener( listener: HeroeListener? ){
    this.heroeListener=listener;
  }

}