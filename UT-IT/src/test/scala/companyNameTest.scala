import com.knoldus.db.CompanyReadDto
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import scala.Console.in

class companyNameTest extends AnyFlatSpec {
  "company name" should "be knoldus" in {
    val name = new CompanyReadDto
    val res = name.getCompanyByName(name="knoldus")
    assert(res == true)
  }
}
