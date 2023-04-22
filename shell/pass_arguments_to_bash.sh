#! /usr/bin/bash

echo $0 $1 $2 $3 ' > echo $1 $2 $3'

# if you were to use double quotes above, your variables
# would have been printed

echo $0 $1 $2 $3 " > echo $1 $2 $3"

# stores arguments as an array
args=("$@") # however, here offset by -1

echo ${args[0]} ${args[1]} ${args[2]}

# to print all the arguments

echo $@

# to print the number of arguments

echo $#
