import Run._

object Demo {
    def main(args: Array[String]) {
        4 times println("hello")
    }
}
/*
\> scalac Run.scala
\> scalac Demo.scala
\> scala Demo
    Output:
    Hello
    Hello
    Hello
    Hello
*/