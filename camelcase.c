#include<stdio.h>
#include<string.h>

void main(){
    int i=0,j=0;
    char ch[520];
    printf("Enter your String :  ");

    gets(ch);

    do{
        if(i=0 || ch[i-1]== ' ' && ch[i]>97){
            ch[i]=(char)((int)ch[i]-32);
        }
        else if(ch[i]<97 && ch[i]!= ' '){
            ch[i] = (char)((int)ch[i]+32);

        }
        i++;
    }while(i!=strlen(ch));
    printf("String is ");
    puts(ch);
    getch();
}
