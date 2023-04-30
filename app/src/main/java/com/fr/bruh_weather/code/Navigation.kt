
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.fr.bruh_weather.Form
import com.fr.bruh_weather.Home
import com.fr.bruh_weather.LoginPage
@Preview
@Composable
fun Navi() {
    val navController = rememberNavController()

    NavHost(navController , startDestination = "landing") {
        composable("landing") {
            LoginPage(
                onGetStarted = {
                    navController.navigate("form_page")
                }
            )
        }
        composable("form_page") {
            Form(
                onContinueClick = { fname , lname ->
                    navController.navigate("home_page/$fname/$lname")
                }
            )
        }
        composable("home_page/{fname}/{lname}") { backStackEntry ->
            val fname = backStackEntry.arguments?.getString("fname") ?: ""
            val lname = backStackEntry.arguments?.getString("lname") ?: ""

            Home(fname , lname, onProfileClick = {null}
            )

        }


    }
}
