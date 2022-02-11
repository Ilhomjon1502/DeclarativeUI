package uz.ilhomjon.declarativeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ilhomjon.declarativeui.ui.theme.DeclarativeUITheme

//o'zbekcha link: https://techreaderdigest.com/?p=12450
//o'zbekcha link: https://techreaderdigest.com/?p=12849

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Greeting("Ilhomjon", TextStyle(fontSize = 24.sp), 2)
                Greeting2("Ikromjon")
                SimpleCardComponent()
            }
        }
    }
}

@Composable
fun Greeting(name: String, style: TextStyle? = null, maxLines:Int? = null) {
    Text(
        text = "Hello $name!",
        modifier = Modifier.padding(16.dp),
        style = style ?: TextStyle.Default,
        overflow = TextOverflow.Ellipsis,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}


@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

//link: https://stackoverflow.com/questions/58432372/jetpack-compose-ui-how-to-create-cardview
@Composable
fun SimpleCardComponent() {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Column(
            modifier = Modifier
                .height(200.dp)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "This is a card view",
                style = MaterialTheme.typography.h4)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DeclarativeUITheme {
        Greeting("Android")
    }
}