package com.ync.connect.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenCard(
    searchQuery: String,
    searchResults: List<String>,
    onSearchQueryChange: (String) -> Unit
) {
    Card(
        shape = RoundedCornerShape(0.dp),
    ) {
        Column(
            modifier = Modifier
                .height(200.dp)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "YNC Connect",
                style = MaterialTheme.typography.headlineMedium
            )
            SearchBar(query = searchQuery, onQueryChange = onSearchQueryChange, onSearch = {}, active = true, onActiveChange = {}) {
                
            }
        }
    }

}



@Preview(showBackground = true)
@Composable
fun MainScreenCardPreview() {
    MainScreenCard("something", listOf("something"), { })
}