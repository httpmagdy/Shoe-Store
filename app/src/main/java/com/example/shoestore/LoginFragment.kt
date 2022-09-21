package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shoestore.databinding.ActivityMainBinding

import com.example.shoestore.databinding.FragmentLoginBinding
class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.loginButton.setOnClickListener { view: View ->
            Toast.makeText(
                activity, "Successfully Login",
                Toast.LENGTH_LONG).show();
            view.findNavController().navigate(R.id.onboardingFragment)
        }

        binding.registerButton.setOnClickListener { view: View ->
            Toast.makeText(
                activity, "Successfully Register",
                Toast.LENGTH_LONG).show();
            view.findNavController().navigate(R.id.onboardingFragment)
        }

        return binding.root
    }

}