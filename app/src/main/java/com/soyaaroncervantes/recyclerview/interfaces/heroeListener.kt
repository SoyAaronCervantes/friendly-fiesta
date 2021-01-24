package com.soyaaroncervantes.recyclerview.interfaces

import com.soyaaroncervantes.recyclerview.data.Heroe

interface HeroeListener {
  fun onClickCard( heroe: Heroe );
  fun onShareButton( heroe: Heroe );
}