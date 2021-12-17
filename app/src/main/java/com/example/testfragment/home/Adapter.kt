package com.example.testfragment.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R

class Adapter:RecyclerView.Adapter<Adapter.viewholder> {
    var list:List<String>
    constructor( list:List<String>){
        this.list=list
    }
    var onitemclicklisenerr:onitemclicklisener?=null
    interface onitemclicklisener{
        fun onitemclick(pos:Int,name:String)
    }

    class viewholder(itemView:View):RecyclerView.ViewHolder(itemView){
        var name:TextView=itemView.findViewById(R.id.sura_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_sura_name,parent,false)

        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
       var name:String=list.get(position)
        holder.name.setText(name)
        if(onitemclicklisenerr!=null){
holder.itemView.setOnClickListener {
    onitemclicklisenerr?.onitemclick(position,name)
}

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}