package com.sarvarmasharipov72.cafe.model

import androidx.recyclerview.widget.DiffUtil

data class MenuModel(
    val id: String,
    val img: String,
    val name: String,
    val dsc: String,
    val price: Int,
    val rate: Int
) {


    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<MenuModel>() {
            override fun areItemsTheSame(oldItem: MenuModel, newItem: MenuModel): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: MenuModel, newItem: MenuModel): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MenuModel

        if (id != other.id) return false
        if (img != other.img) return false
        if (name != other.name) return false
        if (dsc != other.dsc) return false
        if (price != other.price) return false
        if (rate != other.rate) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + img.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + dsc.hashCode()
        result = 31 * result + price
        result = 31 * result + rate
        return result
    }
}