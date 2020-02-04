package com.example.jogodaveia.views

import com.example.jogodaveia.R
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.schibsted.spain.barista.interaction.BaristaDialogInteractions.clickDialogPositiveButton
import com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo
import org.junit.Test

@Test
@Throws(Exception::class)
fun display_same_names_message_if_names_same() {
    writeTo(R.id.et_player1, "Heider")
    writeTo(R.id.et_player2, "Heider")
    clickDialogPositiveButton()
    assertDisplayed(R.string.game_dialog_same_names)
}