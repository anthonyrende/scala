/* ScalaTest makes three assertions available by default in any style 
trait. You can use:

    assert - for general assertions;
    assertResult - to differentiate expected from actual values;
    intercept - to ensure a bit of code throws an expected exception.

In any Scala program, you can write assertions by invoking assert 
and passing in a Boolean expression: */

val left = 2
val right = 1
assert(left == right)

// returns AssertionError

/* 
result should equal(3) // can customize equality
result should ===(3) // can customize equality and enforce type constraints
result should be(3) // cannot customize equality, so fastest to compile
result shouldEqual 3 // can customize equality, no parentheses required
result shouldBe 3       // cannot customize equality, so fastest to compile, no parentheses required */

// val myVal: Int = 4
val v1 = 4;
v12 shouldBe 4

assert(2 == 1 + 1)
