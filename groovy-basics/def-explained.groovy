// def is equivalent of java object
def x = new Date()
Date y = new Date()

println "" + x + "\n" + y

// Untyped function
def doubleIt(def x) {
  println x
  x * 2
}

println doubleIt(5)

// Typed function, types are checked at runtime not compile time
Integer doubleItTyped(Integer x) {
  println x
  x * 2
}

println doubleIt(5)