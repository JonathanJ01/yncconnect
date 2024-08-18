package com.ync.connect.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.ync.connect.ui.theme.AppTheme
import com.ync.connect.viewmodel.impl.MainActivityViewModelImpl
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProvider(this)[MainActivityViewModelImpl::class.java]

        lifecycleScope.launch(Dispatchers.IO) {

        // TODO get profile data

        }
        enableEdgeToEdge()
        setContent {
            AppTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                //}
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowPreview() {
    Text(text = "Hello YNC Connect")
}
