package com.eltonkola.data

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.vector.ImageVector

data class EkContent(
    val topMenu: TopMenu,
    val home: HomeContent,
    val about: AboutContent,
    val portfolio: PortfolioContent,
    val resume: ResumeContent,
    val contact: ContactContent,
    val footer: String,
    val settings: SettingsContent
)

data class ResumeContent(
    val title: String,
    val body: String,
    val roles: List<ResumeRole>,
    val downloadResume: String,
    val likedInProfile: String,
)

data class ResumeRole(
    val startEndDate: String,
    val role: String,
    val company: String,
    val descriptionList: List<String>
)


data class HomeContent(
    val title: String,
    val body: String,
    val liteVersion : String
)

data class AboutContent(
    val title: String,
    val body: String,
)

data class SettingsContent(
    val title: String,
    val language: String,
    val color: String,
    val theme: String,
    val background: String,
    val mode: String,
    val close: String,
)

data class PortfolioContent(
    val title: String,
    val body: String,
    val playStore: String,
    val github: String,
)

data class ContactContent(
    val title: String,
    val body: String,
    val action: String,
    val emailHint: String,
    val messageHint: String,
    val error: String,
    val success: String,
    val retry: String,
)

data class TopMenu(
    val home: TopMenuItem,
    val about: TopMenuItem,
    val portfolio : TopMenuItem,
    val resume : TopMenuItem,
    val contact : TopMenuItem
)

data class TopMenuItem(
    val title: String,
    val subTitle: String,
    val icon: ImageVector
)




val englishContent = EkContent(
    home = homeEnglish,
    footer = englishFooter,
    topMenu = englishMenu,
    about = aboutEnglish,
    portfolio = portfolioEnglish,
    contact = contactEnglish,
    resume = englishResume,
    settings = settingsEnglish
)
val italianContent = EkContent(
    home = homeItalian,
    footer = italianFooter,
    topMenu = italianMenu,
    about = aboutItalian,
    portfolio = portfolioItalian,
    contact = contactItalian,
    resume = italianResume,
    settings = settingsItalian
)
val albanianContent = EkContent(
    home = homeAlbanian,
    footer = albanianFooter,
    topMenu = albanianMenu,
    about = aboutAlbanian,
    portfolio = portfolioAlbanian,
    contact = contactAlbanian,
    resume = albanianResume,
    settings = settingsAlbanian
)

val LocalContent = compositionLocalOf { englishContent }






