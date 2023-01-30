public class SomeLabs{

  //reverse
  public static String reverse(String s){
    return reverse(s,"");
  }
  public static String reverse(String s, String result){
    if(s.length() == 1){
      String hey = s.substring(0);
      return result + hey;
    }
    else{
      String hey = s.substring(s.length()-1);
      return reverse(s.substring(0,s.length()-1), result + hey);
    }
  }


  /*
  *@param n any non-negative value you want to take the sqrt of
  *@return the approximate sqrt of n within a tolerance of 0.001%
  */
  public static double sqrt(double n){
    double hey = 0.0;
    //Hint: This is a wrapper method.
    for(int i = 0; i < n; i++){
      if(i * i < n){
        hey = i;
      }
    }
    return sqrt(n, 0,hey);
  }
  public static double sqrt(double n, double result,double start){
    double joe = result * result;
    double woof = joe - n;
    double dog = woof/n;
    double cat = dog * 100;
    if(Math.abs(cat) <= 0.001){
      return result;
    }
    else{
      double nah = n / start;
      double check = nah + start;
      double hah = check / 2.0;
      return sqrt(n, hah, hah);
    }
  }

}
