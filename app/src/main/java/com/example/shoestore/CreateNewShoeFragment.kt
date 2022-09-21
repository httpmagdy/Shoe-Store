package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.shoestore.databinding.FragmentCreateNewShoeBinding
import com.example.shoestore.model.DataModel

class CreateNewShoeFragment : Fragment() {
    private lateinit var binding: FragmentCreateNewShoeBinding
    private val viewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_create_new_shoe, container, false)

        binding.shoe = DataModel("", "", 0,"")

        // Add Button ...
        binding.btnAddList.setOnClickListener {
            viewModel.addNewShoe(binding.shoe as DataModel)
            findNavController().navigateUp()
        }

        // Cancel Button ...
        binding.btnCancel.setOnClickListener {
            findNavController().navigateUp()
        }
        return binding.root
    }

}