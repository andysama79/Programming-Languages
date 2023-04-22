#include<iostream>
using namespace std;

class User {
    unsigned short id;
    unsigned short pwd;
    User(unsigned short id, unsigned short pwd) {
        this->id = id;
        this->pwd = pwd;
    }
};

class UserList {
    unsigned short list[1024];
    User man = new User
};