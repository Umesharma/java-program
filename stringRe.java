// import java.util.*;

// public class stringRe {
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
// }






// public class stringRe{
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



public class stringRe {
    static final int NO_OF_CHARS = 256;
 
    /* Returns an array of size 256 containing count
       of characters in the passed char array */
    static int[] getCharCountArray(String str)
    {
        int count[] = new int[NO_OF_CHARS];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
 
        return count;
    }
 
    /* removeDirtyChars takes two
    string as arguments: First
    string (str)  is the one from
    where function removes
    dirty characters. Second 
    string is the string which
    contain all dirty characters
    which need to be removed
    from first string */
    static String removeDirtyChars(String str,
                                   String mask_str)
    {
        int count[] = getCharCountArray(mask_str);
        int ip_ind = 0, res_ind = 0;
 
        char arr[] = str.toCharArray();
 
        while (ip_ind != arr.length)
        {
            char temp = arr[ip_ind];
            if (count[temp] == 0) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
 
        str = new String(arr);
 
        /* After above step string is ngring.
        Removing extra "iittg" after string*/
 
        return str.substring(0, res_ind);
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        String mask_str = "mask";
        System.out.println(removeDirtyChars(str, mask_str));
    }
}