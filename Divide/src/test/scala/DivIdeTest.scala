import org.scalatest.flatspec.AnyFlatSpec
class DivIdeTest extends AnyFlatSpec {
  "Division of 10 and 2" should "be 5" in {
  var str = new Division
  var result = str.divide(10, 2)
  assert(result == 5)
}
}
