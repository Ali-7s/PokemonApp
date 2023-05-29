package com.example.pokemon

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokemon.ui.theme.PokemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokemonTheme {
                PokemonApp()
            }
        }
    }
}

@Composable
fun PokemonApp(modifier: Modifier = Modifier) {

    var currentStep by remember { mutableStateOf(1) }

    Surface (modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){ when (currentStep) {
        1 -> {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {

                Text(text = stringResource(id = R.string.charmander))
                Spacer(modifier = Modifier.height(32.dp))
                Image (
                    painter = painterResource(id = R.drawable.charmander_evol),
                    contentDescription = stringResource(id = R.string.charmander_content_description),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable {
                            currentStep = 2
                        }

                )
            }
        }
        2 -> {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {

                Text(text = stringResource(id = R.string.charmeleon))
                Spacer(modifier = Modifier.height(32.dp))
                Image (
                    painter = painterResource(id = R.drawable.charmeleon_evol),
                    contentDescription = stringResource(id = R.string.charmeleon_content_description),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable {
                            currentStep = 3
                        }

                )
            }
        }
        3 -> {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {

                Text(text = stringResource(id = R.string.charizard))
                Spacer(modifier = Modifier.height(32.dp))
                Image (
                    painter = painterResource(id = R.drawable.charizard_evol),
                    contentDescription = stringResource(id = R.string.charizard_content_description),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable {
                            currentStep = 4
                        }

                )
            }
        }

        4 -> {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {

                Text(text = stringResource(id = R.string.reset_evolution))
                Spacer(modifier = Modifier.height(32.dp))
                Image (
                    painter = painterResource(id = R.drawable.char_flame),
                    contentDescription = stringResource(id = R.string.charizard_surprise_content_description),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable {
                            currentStep = 1
                        }

                )
            }

        }


    }




    }

}

@Preview(showBackground = true)
@Composable
fun PokemonPreview() {
    PokemonTheme {
        PokemonApp()
    }
}
