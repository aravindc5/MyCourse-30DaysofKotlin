package com.arvi.mycourse

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)
        val title=intent.getStringExtra("title")
        val desc=intent.getStringExtra("desc")
        val mTitle: TextView=findViewById(R.id.tv_title)
        val mDesc: TextView=findViewById(R.id.tv_desc)
        val ranking: TextView=findViewById(R.id.ranking)
        val rank=intent.getStringExtra("rank")

        //Lambda
        val showranking={ ranking.text = rank.toString() }

        mTitle.text=title.toString()
        mDesc.text=desc.toString()
        showranking()
    }


}