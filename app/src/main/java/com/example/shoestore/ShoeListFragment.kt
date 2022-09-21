package com.example.shoestore

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.shoestore.databinding.FragmentShoeListBinding
import androidx.lifecycle.Observer
import com.example.shoestore.databinding.ShoeItemBinding


class ShoeListFragment : Fragment() {
    private lateinit var binding: FragmentShoeListBinding
    private lateinit var viewModel: ShoeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)
        viewModel = ViewModelProvider(requireActivity())[ShoeViewModel::class.java]

        viewModel.shoeList.observe(viewLifecycleOwner, Observer { shoes ->

            shoes.forEach { shoe ->
                val shoeLayout: ShoeItemBinding =
                    DataBindingUtil.inflate(inflater, R.layout.shoe_item, container, false)
                shoeLayout.item = shoe
                binding.shoeItemsList.addView(shoeLayout.root)
            }
        })
        binding.floatingActionButton.setOnClickListener { view: View ->
           view.findNavController().navigate(R.id.createNewShoeFragment)
        }
        return binding.root
    }
}