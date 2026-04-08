import java.util.Scanner;
public class AllDivOfNumberTLE {  //This method can cause Time limit exceeded (TLE) error to pop up and is not an efficient method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n;i++){
//            while(n%i==0){  //using while-loop
//                System.out.println(i + " ");
//                break;
//            }
            if(n%i==0){ //same using if-else conditional statement
                System.out.println(i + " ");
            }
        }
    }
}
