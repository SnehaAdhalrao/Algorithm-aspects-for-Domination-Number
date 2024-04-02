import java.util.Scanner;

public class Wheel_graph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices for wheel graph");
        int ver=sc.nextInt();
        System.out.println("Enter the vertices for star graph");
        int v=sc.nextInt();
        System.out.println("the wheel graph containing "+ v+"vertices, having the domination number as --> (1)");
        System.out.println("the star graph containing "+ ver+"vertices, having the domination number as --> (1)");

    }
}
