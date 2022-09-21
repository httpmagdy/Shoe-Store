package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shoestore.databinding.FragmentInstructionBinding
import com.example.shoestore.databinding.FragmentOnboardingBinding

class InstructionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentInstructionBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_instruction, container, false)

        binding.nextButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.shoeListFragment)
        }

        return binding.root
    }

}