# /usr/bin/bash

echo "Enter name: "
read name1 name2 name3 
echo "Entered names: $name1, $name2, $name3"

# to take input on the same line use the -p flag
read -p "username: " user_var

# to make input hidden
read -sp "password: " pass_var

echo # new line

echo "username: $user_var"
