class Person {
  String firstName
  String lastName

  Person(String firstName, String lastName) {
    this.firstName = firstName
    this.lastName = lastName
  }

  def executeInside(Closure c) {
    c.delegate = this // Change the closure owner
    c()
  }
}

def p = new Person("Dennis", "Ritchie")

p.executeInside { println "Hello $firstName $lastName" }