// 1 
class pattern{ 
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// 2
class pattern {
    public static void main (String args[]){
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


// 3
class pattern {
    public static void main (String args[]){
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// 4
class pattern {
    public static void main (String args[]){
        for (int i=1;i<=4;i++){
             for (int j=1;j<=4-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
           System.out.println();
        }
    }
}


// 5
class pattern{
    public static void main (String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


// 6
class pattern{
    public static void main (String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


// 7
class pattern{
    public static void main (String args[]){
        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                 number++;
            }
            System.out.println();
        }
    }
}



// 8
class pattern {
    public static void main(String args[]){
        for (int i=5;i>=1;i--){
            for(int j=1 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


// 9
class pattern {
    public static void main(String args[]){
        for (int i=5;i>=1;i--){
            for(int j=1 ;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


// 10
class pattern {
    public static void main(String args[]){
        int number=15;
        for (int i=5;i>=1;i--){
            for(int j=1 ;j<=i;j++){
                System.out.print(number+" ");
                number--;
            }
            System.out.println();
        }
    }
}


// 11
class pattern {
    public static void main (String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1||j==1||j==n||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



////////////////////////////////////////////advance patterns///////////////////////////////////////

 // 1
class pattern{
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(int j=1 ;j<=spaces;j++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(int j=1 ;j<=spaces;j++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


// 2
class pTTERN{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 3
class pattern{
    public static void main(String args[]){
        int n=8;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }


            System.out.println();
        }
    }
}

