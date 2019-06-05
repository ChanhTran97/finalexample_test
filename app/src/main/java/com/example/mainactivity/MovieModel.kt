package com.example.mainactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieModel(val title: String?, val imageUrl: String?):Parcelable

