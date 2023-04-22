#include<iostream>
using namespace std;

bool validate(unsigned short[], unsigned short, unsigned short);
bool search(unsigned short[], unsigned short);

int main() {
    unsigned short userList[1024]; // EEPROM
    unsigned short man_id = 0;
    unsigned short man_pwd = 123;
    int op = 0;
    unsigned user_id, user_pwd, id, pwd;

    do {
        cout << "1) Log in to existing account" << endl;
        cout << "2) Add a new account" << endl;
        cout << "3) Delete a account" << endl;
        cout << "4) Exit" << endl;
        cin >> op;
    } while (op > 4)

    switch (op) {
        case 1:
            cout << "Enter User ID:" << endl;
            cin >> user_id;
            cout << "Enter Password:" << endl;
            cin >> user_pwd;
            break;

        case 2:
            cout << "Enter root id:" << endl;
            cin >> id;
            cout << "Enter root password:" << endl;
            cin >> pwd;
            if (id != man_id && pwd != man_pwd) {
                cout << "Incorrect credentials" << endl;
                break;
            }
            else {
                unsigned user_id, user_pwd;
                cout << "Enter User ID:" << endl;
                cin >> user_id;
                cout << "Enter Password:" << endl;
                cin >> user_pwd;
                userList
            }
            break;

        case 3:
            break;
    };

    return 0;
}

bool validate(unsigned short userList[], unsigned short id, unsigned short pwd) {
    bool flag_id = false, flag_pwd = false;
    for(int i = 0; i < 1024; i = i + 2) {
        if (userList[i] == id) {
            flag_id = true;
            if (userList[i+1] == pwd) {
                flag_pwd = true;
            }
        }
    }
    return flag_id && flag_pwd;
}

bool search(unsigned short userList[], unsigned short id) {
    bool flag_id = false;
    for (int i = 0; i < 1024; i = i + 2) {
        if (userList[i] == id) {
            flag_id = true;
        }
    }
    return flag_id;
}