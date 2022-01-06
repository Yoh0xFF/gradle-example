def s1 = 'single-quoted string literal'
def s2 = "double-quoted string literal"
println s1 + '\n' + s2

def multiLine = """
  multi-line string example
  hello world
"""
println multiLine

def x = 2
def y = 3

// Interpolation will not work with single-quoted string
def interpolation = "string interpolation. $x + $y = ${x + y}\n"
println interpolation