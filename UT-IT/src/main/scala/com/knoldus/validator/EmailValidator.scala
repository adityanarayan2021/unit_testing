package com.knoldus.validator

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean =
    if("""^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\.)*(aero|biz|cat|com|edu|info|int|jobs|mil|mobi|net|org|pro|tel|[a-z][a-z])$""".r.findFirstIn(emailId) == None)
    false
    else
      true
}
