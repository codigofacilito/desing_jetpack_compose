package com.codigofacilito.tallerecommerce.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.codigofacilito.tallerecommerce.view.screen.Section

@Composable
fun BottomBarApp(
    items:List<Section>,
    currentSection: Section,
    onSectionSelected: (Section)->Unit,
) {
    BottomNavigation(
        modifier = Modifier.height(50.dp),
        backgroundColor = MaterialTheme.colors.background,
        contentColor =  MaterialTheme.colors.surface
    ) {
        items.forEach{section ->
            val selected = section == currentSection
            BottomNavigationItem(
                selected =selected ,
                onClick = { onSectionSelected(section) },
            icon = {Icon(
                painter = painterResource(id = section.icon),
                contentDescription ="",
            modifier = Modifier.size(24.dp))},
            selectedContentColor =  MaterialTheme.colors.primary,
            unselectedContentColor =MaterialTheme.colors.onBackground,
            )
        }
    }

}