package com.ashupandey.footballtutorails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ashupandey.footballtutorails.recycler.resource.CustomAdapter
import com.ashupandey.footballtutorails.recycler.resource.DataList
import com.ashupandey.footballtutorails.recycler.resource.ItemClicked
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = CustomAdapter(DataList().listRecycler(),this)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun itemClickedListner(position: Int) {
        Toast.makeText(this, "$position Clicked", Toast.LENGTH_SHORT).show()
    }
}