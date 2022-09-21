import java.util.*;

// public class stringReverse {
//     public static void main(String args[]) {
//         // taking input from user
//         Scanner sc = new Scanner(System.in);
//         System.out.println("input some string ");
//         String input = sc.next();

//         // inilization front and back

//         StringBuilder sb = new StringBuilder(input);
//         for (int i = 0; i < sb.length() / 2; i++) {
//             int front = i;
//             int back = sb.length() - 1 - i;

//             char forntchar = sb.charAt(front);
//             char backchar = sb.charAt(back);
//             // set the last string to first
//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, forntchar);
//         }
//         System.out.println("reverse of the " + input + "  is" + " " + sb);
//     }
// public class stringReverse{
//     public static void main(String args[]){
//         StringBuilder name=new StringBuilder("umesharma");
//          System.out.println(name);
        
//         //char at index 
//         System.out.println(name.charAt(0));// index 0
//         System.out.println(name.charAt(4));// index 4

//         // set char at index  it can repalce the chareter at the place
//         name.setCharAt(0, 'm');  // m replace at index 0 value u
//         System.out.println(name);

//         // name.setCharAt(1, 'm');
//         // System.out.println(name);
         
//         // inset charter at index
//         name.insert(0, "u");
//         System.out.println(name);

//         // delete charter at any index 
//         name .delete(1, 2); // delete charter at index 1 to 2 .. 2 index is not count 
//         System.out.println(name);


//         StringBuilder sb=new StringBuilder("h");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb);
        

//     }
// }
public class stringReverse{
public static void main (String args []){
  int a = 3 ;
  int b = 4 + a / 2 ;
  int c = b % 3 ;
  System.out.println(c);
}
}