package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AllFibonacci (var fibonacciList: List<Int>):RecyclerView.Adapter<AllFibonacciHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllFibonacciHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacci_list,parent,false)
        return  AllFibonacciHolder(itemView)

    }

    override fun onBindViewHolder(holder: AllFibonacciHolder, position: Int) {
        holder.tvNumber.text = fibonacciList[position].toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}
class AllFibonacciHolder(itemView: View): ViewHolder(itemView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}