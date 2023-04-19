package lt.vgrabauskas.homework05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import lt.vgrabauskas.comp.Company
import lt.vgrabauskas.comp.Employee

class MainActivity : AppCompatActivity() {

    val TAG = "home and work"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var employee01 = Employee("lol", "nub", "39510025444")
        var employee02 = Employee("lol", "nub", "50510025444")
        val company01 = Company("Abstergo", 25)
        company01.addEmployee(employee01, "research manager", 5)

        Log.i(TAG, "onCreate: ${company01.employeeList.toString()}")


    }
}