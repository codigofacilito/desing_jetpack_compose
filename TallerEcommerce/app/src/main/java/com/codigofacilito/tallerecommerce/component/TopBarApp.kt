package com.codigofacilito.tallerecommerce.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun TopBarApp(
    title:String,
    description:String,
    idIcon: Int,onIconClick:()->Unit
) {
    Row(horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp)){
        Column {
           Text(text = title, style =
               MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold)
           )
            Spacer(modifier = Modifier.padding(8.dp))
            Text(text = description, style =
            MaterialTheme.typography.subtitle1
            )
        }
        IconButton(onClick = { onIconClick() }) {
            Icon(painter = painterResource(id = idIcon), contentDescription = "",
            modifier = Modifier.size(24.dp),
            tint = MaterialTheme.colors.primary)
        }
    }

}