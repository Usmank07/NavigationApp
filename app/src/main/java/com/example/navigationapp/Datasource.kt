package com.example.navigationapp

object Datasource {
    fun loadLanguages(): List<LanguageItem> = listOf(
        LanguageItem(R.string.lang_python, R.string.desc_python, R.drawable.python),
        LanguageItem(R.string.lang_java, R.string.desc_java, R.drawable.java),
        LanguageItem(R.string.lang_kotlin, R.string.desc_kotlin, R.drawable.kotlin),
        LanguageItem(R.string.lang_javascript, R.string.desc_javascript, R.drawable.javascript),
        LanguageItem(R.string.lang_cplusplus, R.string.desc_cplusplus, R.drawable.cplusplus),
        LanguageItem(R.string.lang_csharp, R.string.desc_csharp, R.drawable.csharp),
        LanguageItem(R.string.lang_swift, R.string.desc_swift, R.drawable.swift),
        LanguageItem(R.string.lang_flutter, R.string.desc_flutter, R.drawable.flutter),
        LanguageItem(R.string.lang_rust, R.string.desc_rust, R.drawable.rust),
        LanguageItem(R.string.lang_sql, R.string.desc_sql, R.drawable.sql)
    )
}