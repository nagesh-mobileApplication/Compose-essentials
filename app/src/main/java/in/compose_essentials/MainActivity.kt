package `in`.compose_essentials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import `in`.compose_essentials.ui.theme.ComposeessentialsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeessentialsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = Color.Red,
        fontSize =dimensionResource(id = R.dimen._18sp).value.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Black,
        fontFamily = FontFamily.Monospace,
        letterSpacing =dimensionResource(id = R.dimen._2sp).value.sp,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center,
        lineHeight =dimensionResource(id = R.dimen._2sp).value.sp,
        maxLines = 1,
        minLines = 1,
        overflow = TextOverflow.Ellipsis,
        softWrap = false,
        onTextLayout={ textLayoutResult ->
            if (textLayoutResult.lineCount > 0){
                println("Text exceeds 2 lines")
            }
        },
        style = TextStyle(
            color = Color.Blue,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeessentialsTheme {
        Greeting("Android")
    }
}