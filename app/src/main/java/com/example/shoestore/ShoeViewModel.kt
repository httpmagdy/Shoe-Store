package com.example.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.model.DataModel

class ShoeViewModel : ViewModel() {
    private val _shoes = MutableLiveData<MutableList<DataModel>>()
    val shoeList: LiveData<MutableList<DataModel>> get() = _shoes

    init {
        _shoes.value = mutableListOf()
        addNewShoe(DataModel("Men's Puma Pacer", "Nike", 14, "Men's Puma Pacer Future Running Shoes"))
//        addNewShoe(DataModel("Adults' Crocs", "Adidas", 20, "Adults' Crocs Work Mercy Slip-Resistant Clogs\n"))
//        addNewShoe(DataModel("Women's HEY DUDE", "Puma: 34", 11, "Women's HEY DUDE Wendy Stretch Fleece Slip-On Shoes\n"))
    }

    // Add Shoe Function ...
    fun addNewShoe(shoe: DataModel) {
        _shoes.value?.add(shoe)
    }
}