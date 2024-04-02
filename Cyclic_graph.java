
import java.util.Random;//to take com generated no.
import java.util.Scanner;

public class final_code {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the vertices for path or cyclic");
                int v=sc.nextInt();
                Random rand=new Random();//take random set
                float com_num= rand.nextFloat(0.333F,0.334F);//single number from the function
                float round_up_com_num=Math.round(com_num*100.0F)/100.0F;;////reduce the digits of the float number
                int dom_num=0;
//                float fra_com=v*round_up_com_num;

//                                 ****************This is to get the Domination number as integer*********************
//lets take for pentagon    *
//                       *     *
//                       *     *
                       //vertices =5;
        if(v%3==0){                     //5%3!=0;
//            System.out.println("the domination number is"+(v/3));
            System.out.println("the domination number is"+Math.ceil(v*round_up_com_num));
            dom_num=(v/3);//
        }

         else if(v%3==1){                //5%3!=1
//            System.out.println("the domination number is"+(v/3+1));
            System.out.println("the domination number is"+Math.ceil(v*round_up_com_num));
            dom_num=(v/3+1);
        }
        else if(v%3==2){                //5%3==2;
//            System.out.println("the domination number is"+(v/3+1));//(5/3+1)---->2(*_*)
            System.out.println("the domination number is"+Math.ceil(v*round_up_com_num));
            dom_num=(v/3+1);
        }
//***************************Let's find the Fractional domination number******************
        if(v*com_num<dom_num && v*com_num>=1){  //5*1/3<2  && 5*1/3>=1
                    System.out.println("The random no is"+round_up_com_num); //THis is just the Random number
                     System.out.println("This is fractional Domination number"+(v*round_up_com_num));//(vertices/3)
//                    System.out.println("the domination number is"+Math.ceil(v*round_up_com_num));

                }
                else if(v%3==0){                     //same if applied by(vertices/3);
                    System.out.println("The domination number is same as fraction"+Math.ceil(v*round_up_com_num));
                }
                else{                     //That's the code is;
                    System.out.println("please Enter the number>=2 for path && number >=3 for cyclic");
                }
            }
        }
//        ***************************   OVER N OUT  **************************************************************

