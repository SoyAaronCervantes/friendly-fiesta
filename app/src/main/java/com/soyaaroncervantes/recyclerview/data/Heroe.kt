package com.soyaaroncervantes.recyclerview.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Heroe(
  val id: Int,
  val name: String,
  val power: String,
  val publishing_house: String,
  val human_name: String,
  val genre: String,
): Parcelable