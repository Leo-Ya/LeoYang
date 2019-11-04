public class Calculate {
  public static int square(int num) {
    return num *num;
    
  }
  
  public static int cube(int num) {
    return num * num * num;
    
  }
  
  public static double average(double num1, double num2) {
    return (num1 + num2) /2;
    
  }
  
  public static double average(double num1, double num2, double num3) {
    return (num1 + num2 + num3) / 3;
    
  }
  
  public static double toDegrees(double radian) {
    return (radian * 180) / 3.14159;
  }
  
  public static double toRadians(double degree) {
    return (degree * 3.14159) / 180;
    
  }
  
  public static double discriminant(double a, double b, double c) {
    return (b * b) - (4 * a * c);
    
  }
  
  public static String toImproperFrac(int num, int numerator, int denominator) {
    String answer = num * denominator + numerator + "/" + denominator;
    return answer;
  }
  
  public static String toMixedNum(int numerator, int denominator) {
    String answer = numerator/denominator + "_" + (numerator%denominator) + "/" + denominator;
    return answer;
  }
  
  public static String foil(int a, int b, int c, int d, String string) {
    String answer = (a * c) + string + "^2" + "+" + ((a * d)+(b * c)) + string + "+" + (b * d);
    return answer;
  }
  
  public static boolean isDivisibleBy(int num, int factor) {
    return num % factor == 0;
  }
  
  public static double absValue(double num) {
    if(num < 0 ) {
 	 num *= -1;
    }
   return num;
  }
  
  public static double max(double num1, double num2) {
    if(num1 > num2){
     return num1;
   }
    return num2;
  }
  
  public static double max(double num1, double num2, double num3) {
    double max = num1;
   if(max < num2){
     max = num2;
   }
   if(max < num3){
     max = num3;
   }
   return max;
  }
  
  public static int min(int num1, int num2) {
    if(num1 < num2) {
      return num1;
    }
    return num2;
  }
  
  public static double round2(double num) {
   double shouldRound = num % 0.01;
   num -= shouldRound;
   shouldRound /= 0.001;
    if(absValue(shouldRound) >= 5){
     if(shouldRound < 0){
       num -= 0.01;
     }
     else{
       num += 0.01;
     }
   }
   return num;
  }
 
  public static double exponent(double base, int power) {
    if(power < 0) {
      throw new IllegalArgumentException("Cannot have negative powers");
    }
    if(power == 0) {
      return 1;
    }
    double answer = base;
    for(int i = power - 1; i > 0; --i) {
      answer *= base;
    }
    return answer;
  }
  
  public static int factorial(int num) {
   if(num < 0) {
      throw new IllegalArgumentException("Cannot have negative number");
    }
 
   if(num < 2){
     return 1;
   }
 
   int answer = num;
    for(int i = num - 1; i > 0; --i) {
      answer *= i;
    }
    return answer;
  }
  
  public static boolean isPrime(int num) {
     if (num < 2){
       return false;
     }
 
     for (int i = 2; i < num; i++)
       if (isDivisibleBy(num, i)){
         return false;
       }
     return true;
 }
  
  public static int gcf(int num1, int num2) {
    int minNum = min(num1, num2);
    for(int i = minNum; i > 1; --i) {
      if(!isDivisibleBy(num1,i)) {
       continue;
     }
     if(!isDivisibleBy(num2,i)){
        continue;
     }
     return i;
    }
    return 1;
  }
  
  public static double sqrt(double num) {
   if(num < 0) {
      throw new IllegalArgumentException("Bro, Stop!");
   }
   if(num == 0){
     return 0;
   }
   double temp;
    double answer = num/2;
   do  {
     temp = answer;
 	 answer = (temp + (num / temp)) / 2;
   } while((temp - answer) != 0);
    return answer;
  }
  
  public static String quadForm(int a, int b, int c) {
   double dis = discriminant(a, b, c);
   if(dis < 0){
     return "No real roots";
   }
   dis = sqrt(dis);
   double root1 = (-1*b + dis)/(2*a);
   System.out.println(root1);
   double root2 = (-1*b - dis)/(2*a);
   System.out.println(root2);
   if(root1 == root2){
     return Double.toString(round2(root1));
   }
 
   return Double.toString(round2(root1)) + " and " + Double.toString(round2(root2));
  }
}