// import javax.naming.spi.DirStateFactory.Result;
// import javax.print.FlavorException;

// public class recursion{
// public static void printinfo(int n){
//     if (n==0){
//         return;
//     }

//     System.out.println(n);
//     printinfo(n-1);
// }

//     public static void main(String args[]){
//         int n=5;
// printinfo(n);
//     }
// }

// public class recursion{

//     public static void printNum(int n){
//        if (n==6){
//            return;

//        }
//        System.out.println(n);
//        printNum(n+1);
//     }
//     public static void main(String args[]){
//         int n=1;
//         printNum(n);
//     }
// }


// public class recursion{
//     public static void printSum(int n , int i,int sum){
//         // base condition
//        if (i==n){
//            sum=sum+i;
//            System.out.println(sum);
//            return;
//        }
//        sum+=i;
//    // recursive call 
//        printSum(n, i+1, sum);
//     }
//     public static void main(String args[]){
//         printSum(4,1, 0);
//     }
// }


//       factorial of a number
// public class recursion{

//     public static int calcfactorial(int n){
//        if (n==0||n==1){
//       return 1;
//    }
//     int fact_nm1=calcfactorial(n-1);
//     int fac_n=n*fact_nm1;
//       return fac_n;

//     }
//     public static void main(String args[]){
//       int ans=  calcfactorial(5);
//         System.out.println(ans);
//     }
// }

//  fibonacci sequence till n term  

// public class recursion{
//     public static void printFib(int a,int b,int n){
//         if (n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.print(c+" ");
//         printFib(b, c, n-1);

//     }
//     public static void main (String args[]){
//         int a=0;
//         int b=1;
//         System.out.print(a+" ");
//         System.out.print(b+" ");
//         int n=7;
//         printFib(a, b, n-2);
//     }
// }


//  print x^n  
// public class recursion{
//  public static int clacPower(int x,int n){
//      if (n==0){
//          return 1;
//          }
//     if (x==0){
//         return 1 ;

//     }
//     int xPownm1=clacPower(x, n-1);
//     int xPown=x*xPownm1;
//     return(xPown);
   
//  }
 
//  public static void main(String args[]){
//      int x=2,n=5;
//     int ans= clacPower(x, n);
// System.out.println(ans);
//  }
// }
 

                           // reverse a string 

//  public class recursion{
//        public static void revString (String str , int idx){
//            if (idx==0){
//                System.out.println(str.charAt(idx));
//                return;
//            }else{
//                System.out.print(str.charAt(idx));
//                revString(str, idx-1);
//            }
//  }

//      public static void main (String args[]){
//          String str="abc";
//          revString(str, str.length()-1);

//      }
//  }

                        // find the first and last occurance of an element  index

// public class recursion {

// public static int first =-1;
// public static int  last=-1;

//     public static void findOcurrance(String str,int idx,char element){
//         if (idx==str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }

//         char currchar=str.charAt(idx);
//         if (currchar==element){

//             if (first==-1)
           
//             first=idx;

//         }else{
//             last=idx;
//         }
//         findOcurrance(str, idx+1, element);
//     }
//     public static void  main (String args[]){
//         String str= "abaacdaefaah";
//        findOcurrance(str, 0, 'a');

//     }
// }                   


                               // check  if a array is sorted or not  (strictly increasing ) 

// public class recursion{
//     public static boolean isSorted(int arr[],int idx){
//         if (idx==arr.length-1){
//             return true;

//         } 
//          if (arr[idx]<arr[idx+1]){
//              // array is sorted 
//               return isSorted(arr, idx+1);
//          }else{
//              return false;
//          }
//     }
//     public static void main(String args[]){
//         int arr[]={8,7,9};
//        System.out.print(isSorted(arr, 0));

//     }
// }                               




