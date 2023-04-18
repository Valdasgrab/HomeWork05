package lt.vgrabauskas.homework05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var worker01 = Worker("lol", "nub", "39510025444")
        var worker02 = Worker("lol", "nub", "50510025444")
        worker01.age
        worker02.age
    }
}