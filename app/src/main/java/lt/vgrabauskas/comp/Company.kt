package lt.vgrabauskas.comp

class Company(companyName: String, foundationYear: Int) {

    var employeeList = listOf<Employee>()
        get() = employees
    private var employees: MutableList<Employee> = mutableListOf()
    val nameOfCompany = companyName
    val yearFound = foundationYear

    fun addEmployee(worker: Employee, jobTitle: String, jobExperience: Int) {
        worker.jobTitle = jobTitle
        worker.jobExperience = jobExperience
        employees.add(worker)

    }


}