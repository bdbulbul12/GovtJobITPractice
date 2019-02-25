#include<iostream>

using namespace std;

class Ractangle{

public:
    int height;
    int width;
    int area();
};
int Ractangle::area(){

    return height*width;
}

int main(){

    Ractangle obj;

    obj.height=5;
    obj.width=10;

    cout<<"Area is = "<<obj.area()<<endl;

    return 0;
}
