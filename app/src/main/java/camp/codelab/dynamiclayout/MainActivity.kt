package camp.codelab.dynamiclayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobile1: Mobile = Mobile(make = "SAMSUNG", name = "Note 9", color = "Black")
        val mobile2: Mobile = Mobile("S6", "APPLE", "White")
        val mobile3: Mobile = Mobile("P9", "Huawei", "Green")

        val carsArray = listOf(mobile1, mobile2, mobile3, mobile2, mobile1)

        val adapter = MobileAdapter(carsArray)

        dynamicLayout.layoutManager = GridLayoutManager(this, 2)
        dynamicLayout.adapter = adapter


    }
}
