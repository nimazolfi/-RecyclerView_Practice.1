package com.example.recyclerview_practice

//
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    Create a lateinit variable for viewBinding
    private lateinit var binding: ActivityMainBinding

//    Create a lateinit variable for adapter
    private lateinit var myAdapter: MusicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Create a value as arrayList for adapter items
        val musicList = arrayListOf(

            Music(
                name = "209",
                urlImg = "https://i1.sndcdn.com/artworks-GrcDtYehIDYeWLsP-yq3R5A-t500x500.jpg",
                info = "Shahin Najafi"
            ),

            Music(
                name = "Afsaneye Hasti",
                urlImg = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdY8lpJsJaE0MrJadseOUi7EpXq6hozWGcYQ&usqp=CAU",
                info = "Hayedeh"
            ),
            Music(
                name = "209",
                urlImg = "https://i1.sndcdn.com/artworks-GrcDtYehIDYeWLsP-yq3R5A-t500x500.jpg",
                info = "Shahin Najafi"
            ),

            Music(
                name = "Afsaneye Hasti",
                urlImg = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdY8lpJsJaE0MrJadseOUi7EpXq6hozWGcYQ&usqp=CAU",
                info = "Hayedeh"
            ),
            Music(
                name = "209",
                urlImg = "https://i1.sndcdn.com/artworks-GrcDtYehIDYeWLsP-yq3R5A-t500x500.jpg",
                info = "Shahin Najafi"
            ),

            Music(
                name = "Afsaneye Hasti",
                urlImg = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdY8lpJsJaE0MrJadseOUi7EpXq6hozWGcYQ&usqp=CAU",
                info = "Hayedeh"
            ),
            Music(
                name = "209",
                urlImg = "https://i1.sndcdn.com/artworks-GrcDtYehIDYeWLsP-yq3R5A-t500x500.jpg",
                info = "Shahin Najafi"
            ),

            Music(
                name = "Afsaneye Hasti",
                urlImg = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdY8lpJsJaE0MrJadseOUi7EpXq6hozWGcYQ&usqp=CAU",
                info = "Hayedeh"
            ),
            Music(
                name = "209",
                urlImg = "https://i1.sndcdn.com/artworks-GrcDtYehIDYeWLsP-yq3R5A-t500x500.jpg",
                info = "Shahin Najafi"
            ),

            Music(
                name = "Afsaneye Hasti",
                urlImg = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdY8lpJsJaE0MrJadseOUi7EpXq6hozWGcYQ&usqp=CAU",
                info = "Hayedeh"
            )

        )

//        Set data that we get as arrayList for adapter
        myAdapter = MusicAdapter(musicList.clone() as ArrayList<Music> )

//        Set adapter for recyclerView
        binding.recyclerMain.adapter = myAdapter

//        Manage layout and set it as LinearLayout
        binding.recyclerMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

    }

}