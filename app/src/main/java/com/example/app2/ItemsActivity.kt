package com.example.app2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)

        val ItemsList: RecyclerView = findViewById(R.id.itemsList);
        val items = arrayListOf<Item>();

        items.add(Item(1, "sofa", "Диван", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "Pellentesque suscipit urna in ligula imperdiet, quis vulputate turpis ultricies. In interdum a neque non hendrerit. Ut eu purus sed ligula placerat lobortis. Nunc dapibus, ligula sit amet pellentesque dictum, mi mauris sollicitudin nunc, quis mattis felis turpis quis ex. Maecenas maximus turpis sit amet dapibus sollicitudin. Vestibulum ac felis nulla. Cras erat quam, volutpat at accumsan a, pellentesque id nunc. Donec sollicitudin purus vel condimentum lacinia. Vivamus sit amet tincidunt massa, ut ultrices neque. Nunc gravida erat vel sodales ullamcorper. Fusce posuere efficitur neque at pharetra. Quisque velit ex, blandit non tortor in, aliquam laoreet ex.", 3999))
        items.add(Item(2, "light", "Свет", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "Pellentesque suscipit urna in ligula imperdiet, quis vulputate turpis ultricies. In interdum a neque non hendrerit. Ut eu purus sed ligula placerat lobortis. Nunc dapibus, ligula sit amet pellentesque dictum, mi mauris sollicitudin nunc, quis mattis felis turpis quis ex. Maecenas maximus turpis sit amet dapibus sollicitudin. Vestibulum ac felis nulla. Cras erat quam, volutpat at accumsan a, pellentesque id nunc. Donec sollicitudin purus vel condimentum lacinia. Vivamus sit amet tincidunt massa, ut ultrices neque. Nunc gravida erat vel sodales ullamcorper. Fusce posuere efficitur neque at pharetra. Quisque velit ex, blandit non tortor in, aliquam laoreet ex.", 3999))
        items.add(Item(3, "kitchen", "Кухня", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "Pellentesque suscipit urna in ligula imperdiet, quis vulputate turpis ultricies. In interdum a neque non hendrerit. Ut eu purus sed ligula placerat lobortis. Nunc dapibus, ligula sit amet pellentesque dictum, mi mauris sollicitudin nunc, quis mattis felis turpis quis ex. Maecenas maximus turpis sit amet dapibus sollicitudin. Vestibulum ac felis nulla. Cras erat quam, volutpat at accumsan a, pellentesque id nunc. Donec sollicitudin purus vel condimentum lacinia. Vivamus sit amet tincidunt massa, ut ultrices neque. Nunc gravida erat vel sodales ullamcorper. Fusce posuere efficitur neque at pharetra. Quisque velit ex, blandit non tortor in, aliquam laoreet ex.", 3999))

        ItemsList.layoutManager = LinearLayoutManager(this)
        ItemsList.adapter = ItemsAdapter(items, this)

    }
}