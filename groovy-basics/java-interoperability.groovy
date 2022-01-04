import java.text.*

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
sdf.setTimeZone(TimeZone.getTimeZone('UTC'))
// Can be written without parentheses: sdf.setTimeZone TimeZone.getTimeZone('UTC')
def now = new Date()

System.out.println("Hello World now: " + sdf.format(now))
// Can be written without parentheses: println "Hello World now: " + (sdf.format now)

def void sayHelloWorld() {
  println 'Hello World'
}

sayHelloWorld()