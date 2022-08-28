package com.example.make_your_outfit_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.make_your_outfit_app.items.Hats
import com.example.make_your_outfit_app.items.Pants
import com.example.make_your_outfit_app.items.Shoes
import com.example.make_your_outfit_app.items.TShirts

class MainActivity : AppCompatActivity() {

    private lateinit var hatsArrayList : ArrayList<Hats>
    private lateinit var tShirtArrayList : ArrayList<TShirts>
    private lateinit var pantsArrayList : ArrayList<Pants>
    private lateinit var shoesArrayList : ArrayList<Shoes>

    private lateinit var hatsImages : Array<Int>
    private lateinit var tShirtsImages : Array<Int>
    private lateinit var pantsImages : Array<Int>
    private lateinit var shoesImages : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hatsImages = arrayOf(
            R.drawable.cowboy,
            R.drawable.winterhat,
            R.drawable.cap,
            R.drawable.panama,
            R.drawable.grad
        )
        tShirtsImages = arrayOf(
            R.drawable.yellow,
            R.drawable.sun,
            R.drawable.hawaiitshirt,
            R.drawable.longsleeve,
            R.drawable.robe
        )
        pantsImages = arrayOf(
            R.drawable.jeans,
            R.drawable.shorts,
            R.drawable.sportpants,
            R.drawable.yoga,
            R.drawable.soccershorts
        )
        shoesImages = arrayOf(
            R.drawable.sportshoes,
            R.drawable.formalshoes,
            R.drawable.skateboard,
            R.drawable.sandals,
            R.drawable.colorful
        )

        val hatsRecyclerView = findViewById<RecyclerView>(R.id.HatsRecyclerView)
        hatsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        hatsArrayList = arrayListOf<Hats>()
        hatsRecyclerView.setHasFixedSize(true)
        getHats()

        val tShirtRecyclerView = findViewById<RecyclerView>(R.id.TShirtsRecyclerView)
        tShirtRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        tShirtArrayList = arrayListOf<TShirts>()
        tShirtRecyclerView.setHasFixedSize(true)
        getTShirts()

        val pantsRecyclerView = findViewById<RecyclerView>(R.id.PantsRecyclerView)
        pantsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        pantsArrayList = arrayListOf<Pants>()
        pantsRecyclerView.setHasFixedSize(true)
        getPants()

        val shoesRecyclerView = findViewById<RecyclerView>(R.id.ShoesRecyclerView)
        shoesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        shoesArrayList = arrayListOf<Shoes>()
        shoesRecyclerView.setHasFixedSize(true)
        getShoes()
    }

    private fun getHats (){
        for (i in hatsImages.indices) {

            val hats = Hats(hatsImages[i])
            hatsArrayList.add(hats)

        }
        val hatsRecyclerView = findViewById<RecyclerView>(R.id.HatsRecyclerView)
        hatsRecyclerView.adapter = HatsAdapter(hatsArrayList)
    }

    private fun getTShirts() {
        for (i in tShirtsImages.indices) {

            val tShirts = TShirts(tShirtsImages[i])
            tShirtArrayList.add(tShirts)

        }
        val tShirtRecyclerView = findViewById<RecyclerView>(R.id.TShirtsRecyclerView)
        tShirtRecyclerView.adapter = TShirtAdapter(tShirtArrayList)
    }

    private fun getPants() {
        for (i in pantsImages.indices) {

            val pants = Pants(pantsImages[i])
            pantsArrayList.add(pants)

        }
        val pantsRecyclerView = findViewById<RecyclerView>(R.id.PantsRecyclerView)
        pantsRecyclerView.adapter = PantsAdapter(pantsArrayList)
    }

    private fun getShoes() {
        for (i in shoesImages.indices) {

            val shoes = Shoes(shoesImages[i])
            shoesArrayList.add(shoes)

        }
        val shoesRecyclerView = findViewById<RecyclerView>(R.id.ShoesRecyclerView)
        shoesRecyclerView.adapter = ShoesAdapter(shoesArrayList)
    }
}