#! /usr/bin/bash

# if [ condition ]
# then
#   statement
# fi #marks the end of if

# -----Integer Comparison-----
# -eq - is equal to - if [ "$a" -eq "$b" ]
# -ne - is not equal to - if [ "$a" -ne "$b" ]
# -gt - is greater than - if [ "$a" -gt "$b" ]
# -ge - is greater than equal to
# -lt - is less than
# -le - is less than or equal to 
# < - is leass than - (("$a" < "$b"))
# <= - is less than or equal to 
# > - is greater than 
# >= is greater than or equal to


# -----String Comparison-----
# = - is equal to - if [ "$a" = "$b" ]
# == - is equal to
# != - is not equal to
# < - is less than, in ASCII alphabetical order - if [[ "$a" < "$b" ]]
# > - is greater than, in ASCII alphabetical order
# -z - stirng is null, that is, has zero length

# simple if-else

count=10

if [ $count -gt 9 ]
then
    echo "condition is true"
else
    echo "condition is false"
fi

# if-else ladder

word=a

if [[ $word == "b" ]]
then
    echo "condition b is true"
elif [[ $word == "a" ]]
then
    echo "condition a is true"
else
    echo "condition is false"
fi
