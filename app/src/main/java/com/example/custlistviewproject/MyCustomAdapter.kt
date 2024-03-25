package com.example.custlistviewproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MyCustomAdapter(val ctx: Context, val ourResource: Int,
                      val items: ArrayList<Model>): ArrayAdapter<Model>(ctx,ourResource,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null)

        // variables for layout views
        val title = view.findViewById<TextView>(R.id.idTitle)
        val author = view.findViewById<TextView>(R.id.idAuthor)
        val img = view.findViewById<ImageView>(R.id.idCover)

        title.text = items[position].title
        author.text = items[position].author
        img.setImageDrawable(ctx.resources.getDrawable(items[position].img))

        return view
    }
}