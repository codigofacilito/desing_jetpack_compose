package com.codigofacilito.tallerecommerce.fragment

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.codigofacilito.tallerecommerce.ui.theme.primaryColor

@Composable
fun ProfileFragment(navController: NavController) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()) {
        item {
            Image(
                painter = painterResource(R.drawable.cody),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(3.dp, MaterialTheme.colors.primary, CircleShape)   // add a border (optional)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(40.dp)) {
                Text(
                    text = "Soy Cody",
                    textAlign = TextAlign.Start,
                    style = MaterialTheme.typography.h5,
                )

                Text(
                    text = "3000 puntos",
                    textAlign = TextAlign.Start,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier
                        .padding(bottom=15.dp)
                )
            }

        }

    }
  
}