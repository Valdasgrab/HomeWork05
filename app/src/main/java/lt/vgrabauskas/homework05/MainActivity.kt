package lt.vgrabauskas.homework05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import lt.vgrabauskas.comp.Company
import lt.vgrabauskas.comp.Employee

class MainActivity : AppCompatActivity() {

    lateinit var company: Company
    lateinit var employeeListView: ListView
    lateinit var button: Button
    lateinit var editText: EditText
    lateinit var adapter: ArrayAdapter<Employee>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)

        company = Company("Abstergo", 25)

        employeeManagement()

        setupEmployeeListView()

        button.setOnClickListener {
            company.sort()
            setupEmployeeListView()
        }
    }

    fun employeeManagement() {
        val employee01 = Employee("John", "Wit", "39510025444")
        val employee02 = Employee("Lenny", "Craw", "50510025444")
        val employee03 = Employee("Jenny", "Block", "60312027897")
        val employee04 = Employee("Andy", "Hull", "39101046987")
        val employee05 = Employee("Tony", "Sow", "38401046987")

        company.addEmployee(employee01, "Research manager", 5)
        company.addEmployee(employee02, "Warehouse assistant", 3)
        company.addEmployee(employee03, "Human resources", 1)
        company.addEmployee(employee05, "Engineer", 15)
        company.addEmployee(employee04, "Engineer", 7)

    }

    private fun setupEmployeeListView() {
        employeeListView = findViewById(R.id.employeeListView)
        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_activated_1,
            company.employeeList
        )
        employeeListView.adapter = adapter
    }
}