package com.example.navigationapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LanguageItem(
    @StringRes val nameRes: Int,
    @StringRes val descRes: Int,
    @DrawableRes val logoRes: Int
)
