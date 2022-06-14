package de.jensklingenberg.mealapp.mainpage

import androidx.compose.runtime.Composable
import dev.petuska.kmdc.button.MDCButton
import dev.petuska.kmdc.button.MDCButtonType
import dev.petuska.kmdc.checkbox.MDCCheckbox
import dev.petuska.kmdc.dialog.Content
import dev.petuska.kmdc.dialog.MDCDialog
import dev.petuska.kmdc.dialog.onClosed
import dev.petuska.kmdc.textfield.MDCTextField
import org.jetbrains.compose.web.dom.Div

@Composable
fun JoinGameDialog(openJoinDialog: Boolean) {
    var openJoinDialog1 = openJoinDialog
    MDCDialog(open = openJoinDialog1, attrs = {
        this.onClosed {
            openJoinDialog1 = false
        }
    }) {
        Div {
            MDCTextField(value = "ahhhhh", label = "Insert a name")
        }
        this.Content {

            Div {
                MDCCheckbox(true, label = "I'm a spectator")
            }
            Div {
                MDCButton(text = "Join Game", type = MDCButtonType.Raised) {
                    onClick { openJoinDialog1 = false }

                }
            }
        }


    }
}