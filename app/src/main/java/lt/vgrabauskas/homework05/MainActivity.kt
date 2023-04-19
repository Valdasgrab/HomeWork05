package lt.vgrabauskas.homework05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import lt.vgrabauskas.comp.Company
import lt.vgrabauskas.comp.Employee

class MainActivity : AppCompatActivity() {

    val TAG = "home and work"
    lateinit var company: Company
    lateinit var employeeListView: ListView
    lateinit var adapter: ArrayAdapter<Employee>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun employeeManagement() {
        val employee01 = Employee("John", "Wit", "39510025444")
        val employee02 = Employee("Lenny", "Craw", "50510025444")
        val employee03 = Employee("Jenny", "Block", "60312027897")
        val employee04 = Employee("Andy", "Hull", "39101046987")

        val company01 = Company("Abstergo", 25)

        company01.addEmployee(employee01, "Research manager", 5)
        company01.addEmployee(employee02, "Warehouse assistant", 3)
        company01.addEmployee(employee03, "Human resources", 1)
        company01.addEmployee(employee04, "Engineer", 7)
    }


}