package wyl.kobe.com.navigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setupWithNavController(mainFragment.findNavController())

        //不能设置setOnNavigationItemSelectedListener，并且保证navigation中fragment的id和menu文件中的item的id相同
//        bottomNavigationView.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.nav_first -> {
//                    Navigation.findNavController(it.actionView).navigate(R.id.nav_first)
//                    true
//                }
//                R.id.nav_home -> {
//                    Navigation.findNavController(it.actionView).navigate(R.id.nav_home)
//                    true
//                }
//                R.id.nav_third -> {
//                    Navigation.findNavController(it.actionView).navigate(R.id.nav_third)
//                    true
//                }
//            }
//            false
//        }

    }

    override fun onSupportNavigateUp() = mainFragment.findNavController()?.navigateUp()
}
