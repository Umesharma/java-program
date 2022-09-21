
// reverse a string 
// public class recursion_2 {

// public static void printRev( String str,int idx ){
// if ( idx ==0){
//     System.out.print(str.charAt(idx));
//      return;

// }
//   System.out.print(str.charAt(idx));
//   printRev(str, idx-1);

// }    
//      public static void main(String[] args) {
//         String str = "umesh sharma ";
//         printRev(str,str .length()-1);

//     }
// }

                          //find the first and leat occuraance of an element in  string 

// public class recursion_2{
//      public static int first=-1;
//      public static int last=-1;
//     public static void findOccurance(String str,int idx ,char element){

//         if (idx==str.length()){
//             System.out.println(first);
//             System.out.println(last );
//             return;
//         }
//          char Currchar=str.charAt(idx);
//          if (Currchar==element){
//              if (first==-1){
//                  first=idx;
//              }else{
//                  last=idx;
//              }
//          }
//          findOccurance(str, idx+1, element);
//         }
//     public static void main (String args[]){
//         String str="abaacdaefaach";
//         findOccurance(str, 0, 'a');
        
//     }
// }    


                                // check whetere the given array is sorted or not 

// public class recursion_2{

//     public static boolean isSorted (int arr[],int idx){
//         if (idx==arr.length-1){
//            return true;
//         }
//         if (arr[idx]>arr[idx+1]){
//             return isSorted(arr, idx+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main (String args[]){
//         int arr[]={8,7,6,5};
//           System.out.println(isSorted(arr,0));
       
//     }
// }




                    // move all X to end of the string 

// public class recursion_2{

//     public static void moveAllX(String str,int idx,int count,String newstring){
//         if (idx==str.length()){
//             for(int i=0;i<count;i++){
//                 newstring+='x';
//             }
//            System.out.print(newstring);
//            return;
//         }
//         char currchar=str.charAt(idx);
//         if (currchar=='x'){
//             count++;
//             moveAllX(str, idx+1, count, newstring);
//         }else{
//             newstring+=currchar;
//             moveAllX(str, idx+1, count, newstring);
//         }
//     }
//     public static void main (String args[]){
//         String str="axbxxdxcx";
//         moveAllX(str,0,0," ");
//     }
// }  

                         //remove duplicates in string 
//  public class recursion_2{
//     public static boolean []map=new boolean[26];

//     public static void removedup(String str,int idx,String newstring){
//         if(idx==str.length()){
//             System.out.println(newstring);
//             return;
//         }
//         char currchar=str.charAt(idx);
//         if (map[currchar-'a']){
//             removedup(str, idx+1, newstring);
//         }else{
//             newstring+=currchar;
//             map[currchar-'a']=true;
//             removedup(str, idx+1, newstring);
//         }
//     }
//     public static void main (String args[]){
//         String str="abbccsjdn";
//         removedup(str, 0, " ");
//     }
//  }     
         