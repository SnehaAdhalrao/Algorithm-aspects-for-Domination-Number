import java.util.Scanner;

public class sunlet_java {
    public static void main(String[] args) {
        System.out.println("Enter the vertices for sunlet graph");
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        if(v%2!=0){
            System.out.println("please enter the even number for sunlet graph!!!");
        }
        else if(v<6 || v%2!=0){
            System.out.println("enter the vertices >=6");
        }
        else{
            System.out.println("the domination number is"+(v/2));
        }
    }
}
