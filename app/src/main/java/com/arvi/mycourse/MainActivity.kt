package com.arvi.mycourse

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arvi.mycourse.Adapters.RecyclerViewAdapter
import com.arvi.mycourse.Models.CourseModel

class MainActivity : AppCompatActivity() ,RecyclerViewAdapter.OnItemClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val course = ArrayList<CourseModel>()

        course.add(CourseModel("Kotlin", "Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference.\n \nTutorials: \n-CodeLabs \n-GeeksforGeeks \n-Udemy","Rank: 10"))
        course.add(CourseModel("Java", "Java is a object-oriented, high-level programming language with several features that make it ideal for web-based development.\n" +
                " \n" +
                "Tutorials: \n" +
                "-learnjavaonline \n" +
                "-tutorialspoint \n" +
                "-w3schools","Rank: 2"))
        course.add(CourseModel("Python", "Python is an advanced programming language that is interpreted, object-oriented and built on flexible and robust semantics.\n" +
                " \n" +
                "Tutorials: \n" +
                "-learnpython.org \n" +
                "-python.org \n" +
                "-codecademy","Rank: 1"))
        course.add(CourseModel("Swift", "Swift is Apple’s newest open-source, multi-paradigm programming language for iOS and OS X apps.\n" +
                " \n" +
                "Tutorials: \n" +
                "-Swift.org \n" +
                "-codewithchris \n" +
                "-lynda","Rank: 9"))
        course.add(CourseModel("HTML5", "HTML is the standard markup language used to create web pages.\n" +
                " \n" +
                "Tutorials: \n" +
                "-w3schools \n" +
                "-tutorialspoint \n" +
                "-codecademy","Rank: 14"))
        course.add(CourseModel("PHP", "PHP is an open-source scripting language designed for creating dynamic web pages that effectively work with databases.\n" +
                " \n" +
                "Tutorials: \n" +
                "-learnphp.org \n" +
                "-phptpoint \n" +
                "-lynda","Rank: 5"))
        course.add(CourseModel("Objective C", "Objective-C is a simple, general-purpose and object-oriented language. It uses a system of message passing borrowed from the language Smalltalk.\n" +
                " \n" +
                "Tutorials: \n" +
                "-hackr.io \n" +
                "-coursera \n" +
                "-codescracker","Rank: 8"))
        course.add(CourseModel("C++", "C++ is a general purpose, object-oriented, middle-level programming language and is an extension of C language.\n" +
                " \n" +
                "Tutorials: \n" +
                "-cplusplus.com \n" +
                "-learncpp.com \n" +
                "-hackr.io","Rank: 6"))
        course.add(CourseModel("C#", "Pronounced C-sharp, C# is a multi-paradigm programming language that features strong typing,component-oriented disciplines.\n" +
                " \n" +
                "Tutorials: \n" +
                "-hackr.io \n" +
                "-coursera \n" +
                "-codescracker","Rank: 4"))
        course.add(CourseModel("Ruby", "Ruby is an open-sourced, object-oriented scripting language that can be used independently or as part of the Ruby on Rails web framework.\n" +
                " \n" +
                "Tutorials: \n" +
                "-learnrubyonline.org \n" +
                "-stackify.com \n" +
                "-rubylearning.com","Rank: 11"))
        course.add(CourseModel("JavaScript", "JavaScript is a client-side programming language that runs inside a client browser and processes commands on a computer rather than a server.\n" +
                " \n" +
                "Tutorials: \n" +
                "-javascript.info \n" +
                "-learn-js.org \n" +
                "-javascript.com ","Rank: 3"))
        course.add(CourseModel("C", "C Language is a structure-oriented, middle-level programming language mostly used to develop low-level applications.\n" +
                " \n" +
                "Tutorials: \n" +
                "-learn-c.org \n" +
                "-programiz.com \n" +
                "-edx.org","Rank: 6"))

        val adapter = RecyclerViewAdapter(course,this)
        recyclerView.adapter = adapter



    }

    override fun onItemClick(course: CourseModel) {
        val intent=Intent(this@MainActivity,DetailedActivity::class.java)
        intent.putExtra("title",course.title)
        intent.putExtra("desc",course.desc)
        intent.putExtra("rank",course.rank)
        startActivity(intent)

    }


}



