import java.io._

// Basic Class (when extended - Superclass)
class Point(val xc: Int, val yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int) {
        x = x + dx
        y = y + dy
        println("Point x location: " + x);
        println("Point y location: " + y);
    }
}

object ClassDemo {
    def main(args: Array[String]) {
        // Create objects using a keyword "new" and then 
        // you can access class fields and methods
        val pt = new Point(10, 20);

        // Move to a new location
        pt.move(10, 10);
    }
}

// $ scalac classes.scala
// $ scala ClassDemo
// Outputs:
// Point x location: 20
// Point y location: 30

// Extends (inheritance)
// Extends inherits (non-private) from Point class
// and makes Location a subtype of Point class (subclass)
class Location(override val xc: Int, override val yc: Int,
        val zc: Int) extends Point(xc, yc) {
        var z: Int = zc
        // No override due to different definitions
        // (former takes 2 arguments, this takes 3 args)
        def move(dx: Int, dy: Int, dz: Int) {
            x = x + dx
            y = y + dy
            z = z + dz
            println("Point x location: " + x);
            println("Point y location: " + y);
            println("Point z location: " + z);
        }
    }
object ExtendDemo {
    def main(args: Array[String]) {
        val loc = new Location(10, 20, 35);

        // Move to a new location
        loc.move(10, 20, 5);
    }
}

// \>scalac Demo.scala
// \>scala Demo
// Output:
// Point x location : 20
// Point y location : 30
// Point z location : 20


