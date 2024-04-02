
import java.util.Scanner;
public class Path_graph {
    public static void main(String[] args) {
//        for path graph
        int v;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vertices here for only path graph");
        v=sc.nextInt();
        if(v<=1){
            System.out.println("single vertie not allowed");
        } else if (v>1 && v<=3) {
            System.out.println("domination number is"+1);
        } 
	else if(v%3==0){
		System.out.println("domination number is"+(v/3));
			}
	else if(v%3==1 || v%3==2){
		System.out.println("domination number is"+((v/3)+1));
			}

    }
}
