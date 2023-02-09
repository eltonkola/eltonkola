package com.eltonkola.model


data class UiState(
    var mobileMode: Boolean,
    var darkMode: Boolean = false,
    var wallpaper: Wallpaper = Wallpaper.Wallpaper1,
    var language: Lang = Lang.English,
    var color: ColorScheme = ColorScheme.Default,
    var page: Page = Page.Home
)

sealed class Wallpaper {
    object Wallpaper1 : Wallpaper()
    object Wallpaper2 : Wallpaper()
    object Wallpaper3 : Wallpaper()
    object Wallpaper4 : Wallpaper()
    object Wallpaper5 : Wallpaper()

    fun next(): Wallpaper {
        return when (this) {
            Wallpaper1 -> Wallpaper2
            Wallpaper2 -> Wallpaper3
            Wallpaper3 -> Wallpaper4
            Wallpaper4 -> Wallpaper5
            Wallpaper5 -> Wallpaper1
        }
    }

    fun prev(): Wallpaper {
        return when (this) {
            Wallpaper1 -> Wallpaper5
            Wallpaper2 -> Wallpaper1
            Wallpaper3 -> Wallpaper2
            Wallpaper4 -> Wallpaper3
            Wallpaper5 -> Wallpaper4
        }
    }
}

sealed class Lang {
    object Albanian : Lang()
    object Italian : Lang()
    object English : Lang()
}

sealed class ColorScheme {
    object Default : ColorScheme()
    object Blue : ColorScheme()
    object Red : ColorScheme()
    object Green : ColorScheme()
    object Yellow : ColorScheme()
}

sealed class Page {
    object Home : Page()
    object About : Page()
    object Resume : Page()
    object Portfolio : Page()
    object Contact : Page()
}
