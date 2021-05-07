class Fibbonacci {

  def fibbo(x:Int): Int =
    {
      if(x<2)
        {
          1
        }
        else
        {
          fibbo(x-1)+fibbo(x-2)
        }
    }
}
