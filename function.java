 
// calculate sum of two number 
import java.util.Scanner;
public class function{
    public static int calculateSum(int a,int b){
        int sum=a*b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println(sum);

    }
}
 

      // average of 3 number
import java.util.*;
public class function{
    public static int average(int a,int b,int c){
        int sum=(a+b+c)/3;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=average(a, b, c);
        System.out.println("the average of three number is "+sum);
    }
}

 
      //  sum of odd number 
public class function {
    public static int sumOfOdd(int num){
        int sum=0;
        for (int i=1;i<=num;i=i+2){
             sum=sum+i;          
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter  number ");
        int num=sc.nextInt();
        int sum=sumOfOdd(num);
        System.out.print("the sum of odd number upto "+num+" is "+sum);

    }
}


     //  greatest of 3 number

public class function{
    public static void greatest(int a,int b){
        if(a>b){
            System.out.println("number first is greater than b");
        }
         else if(b>a){
             System.out.println("number second is gretaer than first number");
         }else{
             System.out.println("number first is equal to second");
         }
    }
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greatest(a, b);
    }
}



          // calculate circumfrence of circle
public class function{
    public static double circumfrence(double r){
        double sum=2*3.14*r;
        return sum;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
       double sum=circumfrence(r);
       System.out.println("the circumfrence of circle is "+sum);
    }
}

 
       //   eligible For Vote
public class function{
    public static void eligibleForVote(int age ){
        if (age >=18){
            System.out.println("you are eligible for vote");
        }else {
            System.out.println("you are not eligible for vote");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        eligibleForVote(age);

    }
}

                          
   // x to the power m  
public class function {
    public static double power(int x,int m){
        double result = Math.pow(x,m);
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int m=sc.nextInt();
        double result=power(x, m);
        System.out.println(x+ " to the power "+m+" is "+result);
    }
}

