package com.eltonkola.data

import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.*


const val englishFooter = "© 2023 Elton Kola. All rights reserved."
const val italianFooter = "© 2023 Elton Kola. Tutti i diritti riservati."
const val albanianFooter = "© 2023 Elton Kola. Të gjitha të drejtat e rezervuara."

const val EK_TITLE = "Elton Kola - designing and coding my dreams"

val englishMenu = TopMenu(
    TopMenuItem("Home", "Welcome", EKIcon.NavHome),
    TopMenuItem("About", "About me", EKIcon.NavAbout),
    TopMenuItem("Portfolio", "My projects", EKIcon.NavPortfoglio),
    TopMenuItem("Resume", "My experience", EKIcon.NavResume),
    TopMenuItem("Contact", "Write me", EKIcon.NavContact)
)
val italianMenu = TopMenu(
    TopMenuItem("Home", "Benvenuto", EKIcon.NavHome),
    TopMenuItem("Chi sono", "Chi sono", EKIcon.NavAbout),
    TopMenuItem("Portfolio", "I miei progetti", EKIcon.NavPortfoglio),
    TopMenuItem("Curriculum", "La mia esperienza", EKIcon.NavResume),
    TopMenuItem("Contatti", "Scrivimi", EKIcon.NavContact)
)

val albanianMenu = TopMenu(
    TopMenuItem("Home", "Faqja kryesore", EKIcon.NavHome),
    TopMenuItem("Kush jam", "Rreth meje", EKIcon.NavAbout),
    TopMenuItem("Portfolio", "Projektet e mia", EKIcon.NavPortfoglio),
    TopMenuItem("CV", "Eksperienca ime", EKIcon.NavResume),
    TopMenuItem("Kontakt", "Më shkruaj", EKIcon.NavContact)
)