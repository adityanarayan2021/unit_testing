package com.knoldus.validator

import com.knoldus.models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    if(company.name=="knoldus")
      true
      else
      false
  }
}
