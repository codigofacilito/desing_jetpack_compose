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
fun SignUpScreen(naveController: NavController) {
    val emailValue = remember { mutableStateOf("") }
    val nameValue = remember { mutableStateOf("") }
    val phoneValue = remember { mutableStateOf("") }


    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }

    val passwordValueConfirm = remember { mutableStateOf("") }
    val passwordVisibleConfirm = remember { mutableStateOf(false) }

    Scaffold(backgroundColor = MaterialTheme.colors.background) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            item {
                LogoApp()
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase("Nombre",nameValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase("Correo",emailValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase("Telefono",phoneValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassBase("Contraseña",passwordValue,passwordVisible)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassBase("Confirmar Contraseña",passwordValueConfirm,passwordVisibleConfirm)
                Spacer(modifier = Modifier.padding(20.dp))
                ButtonBase("Registrar", onClick = {})
                Spacer(modifier = Modifier.padding(10.dp))
                TextClick("Iniciar Sesión", onClick = {
                    naveController.navigate(Screen.LoginScreen.route){
                        popUpTo(Screen.SignUpScreen.route){
                            inclusive =true
                        }
                    }
                })
            }
        }
    }

}