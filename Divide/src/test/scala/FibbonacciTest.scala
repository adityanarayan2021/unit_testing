import org.scalatest.flatspec.AnyFlatSpec

class FibbonacciTest  extends AnyFlatSpec{
  "Fibbonacci Series of 5" should "be 8" in {
    val series = new Fibbonacci
    val result = series.fibbo(5)
    assert(result==8)
  }
}
