package br.com.rectius.placapp.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()