package uz.itschool.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.isGone
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var images:MutableList<Int> = mutableListOf()
        images.add(R.drawable.img)
        images.add(R.drawable.img_1)
        images.add(R.drawable.img_2)
        images.add(R.drawable.img_3)
        images.add(R.drawable.img_4)
        images.add(R.drawable.img_5)

        imageView1.setOnClickListener {
            linearLayout.visibility= View.INVISIBLE
            linearLayout3.visibility= View.INVISIBLE
            linearLayout2.visibility= View.INVISIBLE
        }


    }
}