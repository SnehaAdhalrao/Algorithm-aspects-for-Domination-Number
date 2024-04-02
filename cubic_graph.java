import java.util.Scanner;

public class cubic_graph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vertices for cubic graph");
        int v=sc.nextInt();
        float fra_dmn=v/4F;
       do{
        if(v%2!=0){
            System.out.println("please entered the even number");
           break;
        }
        if(v<4){
            System.out.println("At least 4 vertices are needed for the Cubic graph");
            break;
        } else if (v==4 ) {
            System.out.println("The  integer Domination number is"+1);
            System.out.println("the FRACTIONAL domination number is"+fra_dmn);
            break;
        } else if (v==6) {
            System.out.println("THe  domiination number is"+2);
            System.out.println("the FRACTIONAL domination number is"+fra_dmn);
            break;
        } else {
            System.out.println("the domination number is"+(v-4)/2);
            System.out.println("the FRACTIONAL domination number is"+fra_dmn);
            break;
        }
    }while(v>0);
    }
}
