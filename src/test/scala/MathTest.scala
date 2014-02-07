import org.specs2.mutable._

class MathTest extends Specification {
   "Calculations " should {
     " add natural numbers" in {
        Math.add(5,3) must beEqualTo(8)
       Math.add(2,4) === 6
     }
   }
}
