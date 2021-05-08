import org.scalatest.flatspec.AnyFlatSpec

class ValidateEmailTest extends AnyFlatSpec{
  "aditya@gmail.com" should "be true" in {
    val checkMail = new ValidateEmail
    val result  = checkMail.emailValid("aditya@gmail.com")
    assert(result===true)
  }
}
