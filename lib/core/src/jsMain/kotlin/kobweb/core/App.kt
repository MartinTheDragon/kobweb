package kobweb.core

import androidx.compose.runtime.Composable
import kobweb.compose.css.Cursor
import kobweb.compose.css.cursor
import org.jetbrains.compose.web.css.*

interface App {
    @Composable
    fun render(content: @Composable () -> Unit)
}

object DefaultStyleSheet : StyleSheet() {
    init {
        "html, body" style {
            padding(0.px)
            margin(0.px)
        }

        "a" style {
            color(Color.blue)
            textDecoration("underline")
        }

        "a:hover" style {
            cursor(Cursor.Pointer)
        }

        "*" style {
            boxSizing("border-box")
        }
    }
}

object DefaultApp : App {
    @Composable
    override fun render(content: @Composable () -> Unit) {
        Style(DefaultStyleSheet)
        content()
    }
}