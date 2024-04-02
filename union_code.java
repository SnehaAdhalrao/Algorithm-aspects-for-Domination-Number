import java.util.Random;
import java.util.Scanner;
public class union_code {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the vertices for path");
                int v1=sc.nextInt();
                System.out.println("enter the vertices for cyclic");
                int v2=sc.nextInt();
                Random rand=new Random();
                float com_num= rand.nextFloat(0.333F,0.334F);
                float round_up_com_num=Math.round(com_num*100.0F)/100.0F;
                int dom_nump1=0;
        int dom_numc1=0;
        int sum=(int)(Math.ceil(v1*round_up_com_num))+(int)(Math.ceil(v2*round_up_com_num));
        float sumF=(float)(v1*round_up_com_num)+(float)(v2*round_up_com_num);

                if(v1%3==0){
                    dom_nump1=(v1/3);
                    dom_numc1=(v2/3);
                }
                else if(v1%3==1){
                    dom_nump1=(v1/3+1);
                    dom_numc1=(v2/3+1);
                }
                else if(v1%3==2){
                    dom_nump1=(v1/3+1);
                    dom_numc1=(v2/3+1);
                }
                if(v1*com_num<dom_nump1 && v1*com_num>=1){
                    System.out.println("The random no is"+round_up_com_num);
                    System.out.println("This is Domination number for path"+Math.ceil(v1*round_up_com_num));
                    System.out.println("This is fractional Domination number for path"+(v1*round_up_com_num));
                }
                else if(v1%3==0){
                    System.out.println("The domination number is same as fraction for path"+Math.ceil(v1*round_up_com_num));
                }
                else{
                    System.out.println("please Enter the number>=2 for path && number >=3 for cyclic");
                }
                if(v2*com_num<dom_numc1 && v2*com_num>=1){
            System.out.println("This is Domination number for cyclic"+Math.ceil(v2*round_up_com_num));
            System.out.println("This is fractional Domination number for cyclic"+(v2*round_up_com_num));
        }
        else if(v2%3==0){
            System.out.println("The domination number is same as fraction for cyclic"+Math.ceil(v2*round_up_com_num));
        }
        else{
            System.out.println("please Enter the number>=2 for path && number >=3 for cyclic");
        }
        if(v1%3==0 && v2%3==0){
            System.out.println("the domination number for the union graph is"+sum);
        }
else {
 System.out.println("the domination number for the union graph is"+sum);
System.out.println("the fractional domination number for the union graph is"+sumF);
            }
        }}




