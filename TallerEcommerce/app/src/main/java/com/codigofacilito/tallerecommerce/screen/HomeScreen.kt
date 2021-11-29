package com.codigofacilito.tallerecommerce.view.screen

import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codigofacilito.tallerecommerce.R
import com.codigofacilito.tallerecommerce.component.*
import com.codigofacilito.tallerecommerce.fragment.CategoriesFragment
import com.codigofacilito.tallerecommerce.fragment.CompaniesFragment
import com.codigofacilito.tallerecommerce.fragment.OrderCardFragment
import com.codigofacilito.tallerecommerce.fragment.ProfileFragment

@Composable
fun HomeScreen(naveController:NavController) {
    val navItems = Section.values().toList()
    val section = remember{ mutableStateOf(Section.Companies)}
    val currentTheme = isSystemInDarkTheme()

    val toggleTheme:()->Unit={
        if(currentTheme) setDayTheme()else setDarkTheme()
    }
    Scaffold(backgroundColor = MaterialTheme.colors.background,
         modifier = Modifier.padding(15.dp),
    topBar ={
        Crossfade(targetState = section.value) { section ->
            when (section) {
                Section.Companies ->
                    TopBarApp("Restaurantes","Pide tu comida para llevar",R.drawable.ic_baseline_lightbulb_24, onIconClick = {toggleTheme()})
                Section.Explore ->
                    TopBarApp("Categorias","Categorias principales",R.drawable.ic_baseline_search_24, onIconClick = {})
                Section.Orders ->
                    TopBarApp("Carrito","Productos adquiridos",R.drawable.ic_baseline_filter_list_24, onIconClick = {})
                Section.Profile ->
                    TopBarApp("Perfil","Datos personales",R.drawable.ic_baseline_logout_24, onIconClick = {})
            }
        }},
        bottomBar = {BottomBarApp(
        items = navItems,
        currentSection = section.value,
        onSectionSelected = {section.value=it}
    )}) {
        innerPadding->
        Crossfade(
            modifier=Modifier.padding(innerPadding),
            targetState = section.value) {
            section ->
            when(section){
                Section.Companies->CompaniesFragment(naveController)
                Section.Explore->CategoriesFragment(naveController)
                Section.Orders->OrderCardFragment(naveController)
                Section.Profile->ProfileFragment(naveController)
            }
        }
    }

}

private fun setDayTheme(){
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
}

private fun setDarkTheme(){
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

}
enum class Section(val icon:Int){
    Companies(R.drawable.ic_baseline_home_24),
    Explore(R.drawable.ic_baseline_search_24),
    Orders(R.drawable.ic_baseline_shopping_cart_24),
    Profile(R.drawable.ic_baseline_person_24)
}
