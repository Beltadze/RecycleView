package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var textEdit: EditText
    private lateinit var buttonAdd: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.nikolozaRecycle)
        textEdit = findViewById(R.id.textView)
        buttonAdd = findViewById(R.id.button)


        val products = ArrayList<Product>()

        products.add(Product("https://static.wikia.nocookie.net/champloo/images/d/d4/E484c39acf68058301980455366517a4.png/revision/latest/top-crop/width/450/height/450?cb=20200715084234"))
        products.add(Product("https://static.wikia.nocookie.net/akamegakill/images/d/d5/Lubbock_main.png/revision/latest?cb=20140929235527"))
        products.add(Product("https://i1.sndcdn.com/artworks-sNFvaHtyekbKzqTw-DVLyyg-t500x500.jpg"))
        products.add(Product("https://cdn-us.anidb.net/images/main/210376.jpg"))
        products.add(Product("https://i.pinimg.com/originals/96/9e/d9/969ed9e822e193a246599d9346a13df5.jpg"))
        products.add(Product("https://i.pinimg.com/originals/69/b1/f0/69b1f09b9dd4623e9b411fb464807fd4.jpg"))
        products.add(Product("https://i.pinimg.com/originals/88/f8/e4/88f8e457d67bcc073f869810429c3970.jpg"))
        products.add(Product("https://static.wikia.nocookie.net/naruto/images/2/21/Sasuke_Part_1.png/revision/latest/scale-to-width-down/340?cb=20170716092103"))
        products.add(Product("https://i.pinimg.com/originals/e1/1f/06/e11f0644f5cac8de0c875cf246dc35dc.jpg"))
        products.add(Product("https://static.wikia.nocookie.net/zankyou-no-terror/images/5/50/Horriblesubs-zankyou-no-terror-04-720p-mkv_snapshot_17-31_2014-08-01_02-18-52.jpg/revision/latest/top-crop/width/300/height/300?cb=20140822175203"))

        buttonAdd.setOnClickListener {

            val tinkivinki = textEdit.text.toString()
            products.add(Product("$tinkivinki"))

            val nikaAdapter = ProductAdapter(products)
            recyclerView.layoutManager = GridLayoutManager(this, 2)
            recyclerView.adapter = nikaAdapter

        }

        val nikaAdapter = ProductAdapter(products)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = nikaAdapter

    }
}