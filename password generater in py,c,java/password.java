import java.util.Scanner;

class password
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter digit");
        int digit=input.nextInt();
        System.out.println("Enter amount");
        int amount=input.nextInt();

        String lower_case="qwertyuiopasdfghjklzxcvbnm";
        String upper_case="QWERTYUIOPASDFGHJKLZXCVBNM";
        String password="";

        for (int i=0;i<amount;i++) {
            password="";
            for(int j=0;j<digit;j++){
            int rand=(int)(3 * Math.random());
            
            switch (rand) {

                case 0:
                    password+=String.valueOf((int)(9 * Math.random()));
                    break;
                case 1:
                    rand=(int)(lower_case.length() * Math.random());
                    password+=String.valueOf(lower_case.charAt(rand));
                    break;

                case 2:
                    rand=(int)(upper_case.length() * Math.random());
                    password+=String.valueOf(upper_case.charAt(rand));
                    break;

                default :
                    break;
            }
            }
            System.out.println(password);}
        } 
    }