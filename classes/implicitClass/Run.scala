/*  Syntax:
    object <object name> {
        implicit class <class name>(<Variable>: Data type) {
            def <method>(): Unit =
        }
    }
*/

object Run {
    implicit class IntTimes(x: Int) {
        def times [A](f: =>A): Unit = {
            def loop(current: Int): Unit =

            if (current > 0) {
                f
                loop(current - 1)
            }
            loop(x)
        }
    }
}