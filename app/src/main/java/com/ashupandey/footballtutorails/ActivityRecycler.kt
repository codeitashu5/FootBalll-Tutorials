package com.ashupandey.footballtutorails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.commit
import com.ashupandey.footballtutorails.fragments.FragmentSkill
import kotlinx.android.synthetic.main.activity_recycler.*

class ActivityRecycler : AppCompatActivity() {
    val  b = Bundle()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)


        b.putString("tittle","Passing Basics")
        b.putInt("imageId",R.drawable.ic_passing)

        val f = FragmentSkill()
        f.arguments = b

        if(savedInstanceState == null){
            supportFragmentManager.commit{
                setReorderingAllowed(true)
                add(R.id.containerFragment,f)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu,menu)
        //if you want to give any initial icon or tittle work with initial visibility you can do here
        // val itemArrow = menu?.findItem(R.id.itemArrow)
        //itemArrow?.isVisible  = true
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.itemArrow ->{
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                val frag =FragmentSkill().apply {
                   val  bundel =  Bundle()
                    arguments = bundel.apply {
                        putString("tittle","Passing Intermediate")
                        putInt("imageId",R.drawable.ic_passing)
                    }
                }
                replace(R.id.containerFragment,frag)
                addToBackStack(null)
            }

                return true
            }

            else-> return super.onOptionsItemSelected(item)

        }


    }
}