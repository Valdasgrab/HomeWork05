package lt.vgrabauskas.comp

class Company (val companyName: String, val foundationYear: Int ) {

    var employeeList = listOf<Employee>()
    get() = employees
    private var employees: MutableList<Employee> = mutableListOf()

    fun addEmployee (worker: Employee, jobTitle: String, jobExperience: Int) {
        employees.add(worker)
        worker.jobTitle = jobTitle
        worker.jobExperience = jobExperience
    }


}