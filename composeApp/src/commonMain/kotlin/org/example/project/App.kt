package org.example.project

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.example.project.model.PokemonCard
import org.example.project.ui.CardListScreen

@Composable
fun App() {
    val dummyCards = listOf(
        PokemonCard("1", "Glurak", "150/165", 129.99f),
        PokemonCard("2", "Pikachu", "25/25", 5.49f),
        PokemonCard("3", "Turtok", "20/102", 39.00f)
    )

    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            CardListScreen(
                cards = dummyCards,
                onAddClick = {
                    // z. B. neuen Screen öffnen
                }
            )
        }
    }
}
