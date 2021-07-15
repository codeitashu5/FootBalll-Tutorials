package com.ashupandey.footballtutorails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.ashupandey.footballtutorails.fragments.FragmentSkill
import kotlinx.android.synthetic.main.activity_recycler.*

class ActivityRecycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)


        val  b = Bundle()
        b.putString("tittle","Receving Basics")
        b.putInt("imageId",R.drawable.ic_receving)

        val f = FragmentSkill()
        f.arguments = b

        if(savedInstanceState == null){
            supportFragmentManager.commit{
                setReorderingAllowed(true)
                replace(R.id.containerFragment,f)
                addToBackStack(null)
                setPrimaryNavigationFragment(f)
            }
        }
    }
}