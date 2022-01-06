// We can pass closure as an argument to the function
def oneArgFunc(closure) {
  closure() * 2
}

def rslt = oneArgFunc { 5 }
assert rslt == 10

rslt = oneArgFunc {
  def y = 3
  y * 2
}
assert rslt == 12

// We can pass closure as an argument to the function along with other arguments
def twoArgFunc(factor, closure) {
  closure() *  factor
}

rslt = twoArgFunc(3, {10})
assert rslt == 30

rslt = twoArgFunc 2, {5}
assert rslt == 10

rslt = twoArgFunc 2, {
  def y = 3
  y * 2
}
assert rslt == 12

println 'Success!'