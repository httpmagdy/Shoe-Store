package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shoestore.databinding.FragmentOnboardingBinding

class OnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: FragmentOnboardingBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding, container, false)

        binding.nextButton.setOnClickListener { view: View ->
//            Toast.makeText(
//                activity, "This is my Toast message!",
//                Toast.LENGTH_LONG).show();
            view.findNavController().navigate(R.id.instructionFragment)
        }

        return binding.root
    }
}