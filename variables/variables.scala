// Variable Declaration

// // var == mutable
// var myVar : String = "Foo";

// // var or val VariableName : DataType = [Initial Value]

// // val == immutable
// val myVal : String = "Bar";

// // Variable Type Inference
// var myVar = 10;
// val newVal = "Hello, Scala";

// // Multiple assignments
// val (myVar1: Int, myVar2: String) = Pair(40, "Foo");
// // Inference
// val (myVar3, myVar4) = Pair2(40, "foo");

object Demo {
   def main(args: Array[String]) {
      var myVar :Int = 10;
      val myVal :String = "Hello Scala with datatype declaration.";
      var myVar1 = 20;
      val myVal1 = "Hello Scala new without datatype declaration.";

      println(myVar); println(myVal); println(myVar1); 
      println(myVal1);
   }
}