package org.example.project.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.project.model.PokemonCard
import org.example.project.utils.formatPrice

@Composable
fun CardListScreen(
    cards: List<PokemonCard>,
    onAddClick: () -> Unit
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = onAddClick) {
                Text(text= "Neue Karte hinzufügen")
            }
        },
        topBar = {
            TopAppBar(
                title = { Text("Meine Pokémon Karten") }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            items(cards) { card ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                        .clickable {
                            // Detailansicht vorbereiten
                        },
                    elevation = 4.dp
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = card.name, style = MaterialTheme.typography.h6)
                        Text(text = "Set: ${card.setNumber}")
                        Text(text = "Preis: ${formatPrice(card.marketPrice)}")
                    }
                }
            }
        }
    }
}

