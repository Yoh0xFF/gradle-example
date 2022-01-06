// Properties example on class
class Person {

  String firstName
  String lastName

  Person(firstName, lastName) {
    this.firstName = firstName
    this.lastName = lastName
  }

  def setFirstName(firstName) {
    println '-----> firstName setter called'
    this.firstName = firstName
  }

  def getFirstName() {
    println '-----> firstName getter called'
    this.firstName
  }
}

def p = new Person('Ada', 'Lovelace')
println p.firstName + ' ' + p.lastName

p.firstName = 'Alan'
p.lastName = 'Turing'
println p.firstName + ' ' + p.lastName

// Properties example on hash map
def map = new HashMap()

// Java style api
map.put('foo', 'x')
println map.get('foo')

// Groovy style api
map.foo = 'x'
map.bar = 'y'
map.baz = 'z'

println map.foo
println map.bar
println map.baz