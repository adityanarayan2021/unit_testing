
import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec

class companyNameTest extends AnyFlatSpec {
  "Company Name" should "be in db" in{
    val companyCheck = new CompanyValidator
    val company =  Company("Knoldus","abc@gmail.com","noida")
    val result = companyCheck.companyIsValid(company)
    assert(result === true)
  }
}
