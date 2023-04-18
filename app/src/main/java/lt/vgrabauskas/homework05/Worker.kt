package lt.vgrabauskas.homework05

import java.time.LocalDate
import java.time.Period

class Worker(val name: String, val lastName: String, val IdNumber: String) {

    var age: Int = 0
        private set

    var jobTitle: String = ""
    var jobExperience: Int = 0

    init {
        age = countAge()
    }


    private fun countAge(): Int {
        var ageCount =
            if (IdNumber[0].equals('3') || IdNumber[0].equals('4')) {
                "19" + IdNumber.substring(1, 3) +
                        "-" + IdNumber.substring(3, 5) +
                        "-" + IdNumber.substring(5, 7)
            }else "20" + IdNumber.substring(1, 3) +
                    "-" + IdNumber.substring(3, 5) +
                    "-" + IdNumber.substring(5, 7)
        var birthday: LocalDate = LocalDate.parse(
            ageCount
        )
        return Period.between(birthday, LocalDate.now()).years
    }

}