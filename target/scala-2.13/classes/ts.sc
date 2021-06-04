println("hello")
println("world")
println("world")
println("world")

def factorial(x: BigInt): BigInt =
  if (x == 0) 1 else x * factorial(x - 1)

println(factorial(5))