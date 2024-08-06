package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.myapplication.model.ListItem
import com.example.myapplication.theme.DBTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DemoScreen(items: List<ListItem>) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(DBTheme.colors.neutral.bgBasicLevel3Default)
    ) {
        items(items) { item ->
            ListItemComponent(item)
        }
    }
}

@Composable
fun ListItemComponent(item: ListItem) {
    Column(
        modifier = Modifier
            .padding(DBTheme.dimensions.spacing.fixedMd)
            .background(DBTheme.colors.neutral.bgBasicLevel1Default)
    ) {
        Text(
            text = item.title,
            style = DBTheme.typography.h3,
            color = DBTheme.colors.neutral.onBgBasicEmphasis100Default,
            modifier = Modifier.padding(DBTheme.dimensions.spacing.fixedXs)
        )
        Text(
            text = item.description,
            style = DBTheme.typography.body,
            color = DBTheme.colors.neutral.onBgBasicEmphasis100Default,
            modifier = Modifier.padding(DBTheme.dimensions.spacing.fixedXs)
        )
    }
}
