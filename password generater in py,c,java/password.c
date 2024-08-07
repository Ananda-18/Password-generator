#include <stdio.h>
#include <stdlib.h>
void main()
{
    int digit,amount;
    printf("enter the size and amount");
    scanf("%d%d",&digit,&amount);
    
    char lower_case[]="qwertyuiopasdfghjklzxcvbnm";
    char upper_case[]="QWERTYUIOPASDFGHJKLZXCVBNM";
    char num[]="0123456789";
    char password[digit];
    for(int i=0;i<amount;i++){
        for(int j=0;j<digit;j++){
            int random=rand()%3;
            
            switch(random){
                
                case 0:
                password[j]=num[rand()%10];
                break;
                case 1:
                password[j]=lower_case[rand()%26];
                break;
                case 2:
                password[j]=upper_case[rand()%26];
                break;
                default:
                break;
            }
            
        }
        printf("%s\n",password);
    }
    
}