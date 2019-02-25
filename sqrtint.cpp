#include<iostream>
#include<Math.h>

using namespace std;

int main(){

    int x,y,i;
    float s;
    cout<< "Enter the value of x :";
    cin>>x;
    cout<<"Enter value of y :";
    cin>>y;

    for(i=x;i<=y;i++){

        s = sqrt(i);
        if(s==(int)(s))
            cout<<i<<endl;
    }

    return 0;

}
