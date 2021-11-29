package com.codigofacilito.tallerecommerce.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codigofacilito.tallereccommer.model.Company
import com.codigofacilito.tallerecommerce.Navigation.Screen
import com.codigofacilito.tallerecommerce.component.*
import com.codigofacilito.tallerecommerce.component.card.ProductCard
import com.codigofacilito.tallerecommerce.component.card.TagCard

@Composable
fun DetailsScreen(naveController:NavController,index:Int) {
    val company = Company().getCompanies()[index]
    Scaffold(backgroundColor = MaterialTheme.colors.background) {

       LazyColumn(modifier = Modifier.fillMaxWidth()){
         item{
             val image: Painter = painterResource(id = company.image)
             Image(
                 painter = image, contentDescription = "",
                 modifier = Modifier
                     .height(350.dp)
                     .fillMaxWidth(),
                 contentScale = ContentScale.Crop
             )
             CompanyInfo(company)
         }

           items(company.products.size){index->
               val company =company.products[index]
               ProductCard(title = company.name, subtitle = company.price.toString(), idImage =company.image , idIcon = Icons.Default.Add, onItemClick ={} )
           }
       }

    }

}

@Composable
fun CompanyInfo(company:Company){
    Column(modifier = Modifier.padding(10.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text =company.name,
                style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold)
            )
            TagCard(company.rating)
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Text(
            text =company.description,
            style = MaterialTheme.typography.body1
        )
    }
}