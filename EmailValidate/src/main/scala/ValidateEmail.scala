class ValidateEmail {
  def emailValid(email : String): Boolean =
    if("""^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\.)*(aero|biz|cat|com|coop|edu|info|int|jobs|mil|mobi|name|net|org|pro|tel|[a-z][a-z])$""".r.findFirstIn(email) == None)
      false
    else
      true

}
