package io.tigranes.my_tasks

import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.support.DaggerAppCompatActivity
import io.tigranes.my_tasks.add_task.AddTaskFragment
import io.tigranes.my_tasks.dashboard.DashboardFragment

class BottomNavigationHostingActivity : DaggerAppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id._bottom_nav_bar)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        startFragmentTransaction(DashboardFragment.newInstance("",""))


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {

            R.id.dashboard_menu_item -> {
                startFragmentTransaction(DashboardFragment.newInstance("",""))
                return true
            }

            R.id.create_task_menu_item -> {
                startFragmentTransaction(AddTaskFragment.newInstance())
                return true
            }

            R.id.workspaces_menu_item -> {
                startFragmentTransaction(AddTaskFragment.newInstance())
                return true
            }
        }
        return false
    }

    private fun startFragmentTransaction(fragment: Fragment, addToBackStack: String? = null) {

        when (addToBackStack) {
            null -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id._bottom_navigation_activity_fragment_container, fragment)
                    .commit()
            }
            else -> {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.slide_in, R.anim.fade_out, R.anim.fade_in, R.anim.slide_out)
                    .addToBackStack(addToBackStack)
                    .replace(R.id._bottom_navigation_activity_fragment_container, fragment)
                    .commit()
            }
        }

    }
}