package com.codigofacilito.tallerecommerce.fragment

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codigofacilito.tallereccommer.model.Category
import com.codigofacilito.tallerecommerce.R
import com.codigofacilito.tallerecommerce.component.card.TagCard
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.codigofacilito.tallereccommer.model.Company
import com.codigofacilito.tallereccommer.model.Order
import com.codigofacilito.tallerecommerce.component.card.CategoryCard
import com.codigofacilito.tallerecommerce.component.card.CompanyCard
import com.codigofacilito.tallerecommerce.component.card.ProductCard

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OrderCardFragment(navController: NavController) {
    val orders = Order().getOrders()
    Column(  verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxHeight()) {
        LazyColumn(Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween){
            items(orders){
                ProductCard(it.title,
                    "${it.count} Articulos \n MXN ${it.total} \n ${it.direction}",
                    it.image,
                    Icons.Default.Close,
                    onItemClick = {

                    })
            }
        } 
        Button(onClick = { /*TODO*/ },
        modifier = Modifier.height(50.dp).width(150.dp)) {
            Text(text = "PAGAR", style = MaterialTheme.typography.body1)
        }
    }
  
}