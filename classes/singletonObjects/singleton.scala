/*
 A singleton is a class that can have only one instance, i.e., Object. 
 You create singleton using the keyword object instead of class keyword. 
 Since you can't instantiate a singleton object, you can't pass parameters to the primary constructor. 

 (All the examples using singleton objects where you called Scala's main method)
*/

import java.io._

class Point(val xc: Int, val yc: Int, val zc: Int ) {
    // Note *var* in fields
    var x: Int = xc
    var y: Int = yc
    var z: Int = zc

    def move(dx: Int, dy: Int, dz: Int) {
        x = x + dx
        y = y + dy
        z = z + dz
    }
}

object PointDemo {
    def main(args: Array[String]) {
        val p = new Point(5,10,15);

        // Move new location
        p.move(5,5,5);
        printPoint
        def printPoint {
            println("Location x: " + p.x)
            println("Location y: " + p.y)
            println("Location z: " + p.z)
        }
    }
}