#! /usr/bin/bash

echo "Enter names: "

# use the -a flag to read all arguments

read -a names
echo "Names: ${names[0]}, ${names[1]}"

# if you don't give a variable to read, the user input gets stored
# in a temporary variable $REPLY

echo "Enter name: "
read
echo "Name: $REPLY"
