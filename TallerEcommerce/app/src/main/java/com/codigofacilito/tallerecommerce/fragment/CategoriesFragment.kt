package com.codigofacilito.tallerecommerce.fragment

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
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
import com.codigofacilito.tallerecommerce.component.card.CategoryCard
import com.codigofacilito.tallerecommerce.component.card.CompanyCard

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoriesFragment(navController: NavController) {
    val categories = Category().getCategories()
   LazyVerticalGrid(cells = GridCells.Fixed(2)){
       items(categories){
           CategoryCard(it,
           onItemClick = {

           })
       }
   }
}