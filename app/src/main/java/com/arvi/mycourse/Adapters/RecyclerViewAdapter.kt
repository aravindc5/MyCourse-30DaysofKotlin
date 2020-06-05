package com.arvi.mycourse.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arvi.mycourse.Models.CourseModel
import com.arvi.mycourse.R
import kotlinx.android.synthetic.main.itemlayout.view.*


class RecyclerViewAdapter(private val courseList:ArrayList<CourseModel>, private var itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<RecyclerViewAdapter.CourseViewHolder>() {

    private val images = intArrayOf(R.drawable.kotlin,
        R.drawable.java, R.drawable.python,
        R.drawable.swift, R.drawable.html,
        R.drawable.php, R.drawable.obc,
        R.drawable.cplus,R.drawable.csharp,R.drawable.ruby,R.drawable.javascript,
        R.drawable.c)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.itemlayout,
            parent, false)
        return CourseViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val currentItem = courseList[position]

        holder.textView1.text = currentItem.title
        holder.textView2.text = currentItem.desc
        holder.textView3.text=currentItem.rank
        holder.imageView.setImageResource(images[position])
        holder.bind(currentItem,itemClickListener)


    }
    override fun getItemCount() = courseList.size


    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textView1: TextView = itemView.title
        val textView2: TextView = itemView.desc
        val textView3: TextView=itemView.rank
        val imageView:ImageView=itemView.image
        fun bind(course: CourseModel,clickListener: OnItemClickListener){
            textView1.text=course.title
            textView2.text=course.desc
            textView3.text=course.rank
            itemView.setOnClickListener{
                clickListener.onItemClick(course)
            }
         }

    }
    interface OnItemClickListener{
        fun onItemClick(course:CourseModel)
    }


}



