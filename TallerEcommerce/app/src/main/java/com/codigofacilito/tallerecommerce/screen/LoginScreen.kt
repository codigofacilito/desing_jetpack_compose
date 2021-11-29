package com.codigofacilito.tallerecommerce.view.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codigofacilito.tallerecommerce.Navigation.Screen
import com.codigofacilito.tallerecommerce.component.*

@Composable
fun LoginScreen(naveController:NavController) {
    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }

    Scaffold(backgroundColor = MaterialTheme.colors.background) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            item {
                LogoApp()
                Spacer(modifier = Modifier.padding(20.dp))
                TextFieldBase("Correo",emailValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassBase("Contraseña",passwordValue,passwordVisible)
                Spacer(modifier = Modifier.padding(20.dp))
                ButtonBase("Iniciar Sesión", onClick ={
                    naveController.navigate(Screen.HomeScreen.route){
                        popUpTo(Screen.LoginScreen.route){
                            inclusive =true
                        }
                    }
                })
                Spacer(modifier = Modifier.padding(20.dp))
                TextClick("Crear Cuenta", onClick = {
                    naveController.navigate(Screen.SignUpScreen.route){
                        popUpTo(Screen.LoginScreen.route){
                            inclusive =true
                        }
                    }
                })
            }
        }
    }

}