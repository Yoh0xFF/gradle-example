// Closures are lambda functions in groovy
Closure echoIt = { // This can be defined as "def echoIt" as well
  println "Hello World!"
}
echoIt()
println ""

// By default "it" parameter is passed to the closure
def echoItWithDefaultParam = {
  println it
}
echoItWithDefaultParam("Hello World!")
println ""

// We can pass parameters to the closure as well
def echoItWithParams = {
  a, b, c ->
  println a
  println b
  println c
}
echoItWithParams("Hello World!", "How are you?", "Nice to see you!")
println ""

// We can pass typed parameters to the closure as well
def echoItWithTypedParams = {
  String a, String b, String c ->
  println a
  println b
  println c
}
echoItWithTypedParams("Hello World!", "How are you?", "Nice to see you!")
println ""