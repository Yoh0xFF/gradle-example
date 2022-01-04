def courses = ["neo4j", "maven-101", "maven-102", "Spring"]

courses.each {
    println it
}

class Person {
    String firstName
    String lastName

    Person(firstName, lastName) {
        this.firstName = firstName
        this.lastName = lastName
    }

    def fullName() {
        return this.firstName + " " + this.lastName
    }
}

def people = [new Person("Ada", "Lovelace"), new Person("Alan", "Turing"), new Person("Dennis", "Ritchie"), new Person("Brian", "Kernighan")]

people.each {
    println it.fullName()
}