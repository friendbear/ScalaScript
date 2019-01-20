@main
def hello(thing: String = "World") = {
  println(s"Hello, $thing")
}

@main
def fizzbuzzJson(i: Int) = {
  val fizzbuzz = (1 to i).map { i =>
    (i % 3, i % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => i.toString
    }
  }
  val json = ujson.Obj("fizzbuzz" -> fizzbuzz)
  println(json)
}
