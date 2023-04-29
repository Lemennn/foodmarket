package com.maspam.foodmarketkotlin.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.LayoutToolbarBinding

class AuthActivity : AppCompatActivity() {

    private var _binding : LayoutToolbarBinding? = null
    private var binding = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val pageRequest = intent.getIntExtra("page_request", 0)
        if(pageRequest == 2) {
            toolbarSignUp()
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn, true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_signUp, null, navOptions)
        }
    }

    fun toolbarSignUp() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        toolbar.title = "Sign Up"
        toolbar.subtitle = "Register and eat"
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24)
        toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

    }
    fun toolbarSignUpAddress() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        toolbar.title = "Address"
        toolbar.subtitle = "Make sure it,s valid"
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24)
        toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

    }
    fun toolbarSignUpSucces() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.visibility = View.GONE
    }
}