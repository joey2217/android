package com.joey.composeapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.joey.composeapp.data.entity.NavigationItem

@Composable
fun MainFrame() {
    var selectedItem by remember {
        mutableIntStateOf(0)
    }

    val items = listOf(
        NavigationItem("首页", Icons.Default.Home),
        NavigationItem("我的", Icons.Default.Person),
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = null
                            )
                        },
                        label = { Text(item.title) },
                        selected = selectedItem == index,
                        onClick = { selectedItem = index })
                }
            }
        }
    ) {
        Box(
            modifier = Modifier.padding(it)
        ) {
            when (selectedItem) {
                0 -> HomeScreen()
                1 -> MineScreen()
            }
        }
    }
}