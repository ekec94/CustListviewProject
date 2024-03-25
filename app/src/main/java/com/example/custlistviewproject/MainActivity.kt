// working list view with customized line item

package com.example.custlistviewproject

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val list = ArrayList<Model>()

        list.add(Model("Slaughterhouse 5", "Kurt Vonnegut", R.drawable.cover))
        list.add(Model("All Quiet on the Western Front", "Erich Maria Remarque", R.drawable.cover2))

        listView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout,list)

    }
}