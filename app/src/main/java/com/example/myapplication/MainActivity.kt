package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.myapplication.model.ListItem
import com.example.myapplication.theme.DBTheme
import com.example.myapplication.theme.Density

class MainActivity : AppCompatActivity() {

    // mocked items
    private val photographItems = listOf(
        ListItem(
            description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua",
            title = "Title 1"
        ),
        ListItem(
            description = "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua",
            title = "Title 2"
        ),
        ListItem(
            description = "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.",
            title = "Title 3"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DBTheme(density = Density.FUNCTIONAL) {
                DemoScreen(photographItems)
            }
        }
    }
}
