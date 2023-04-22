#! /usr/bin/bash

echo -e "Enter the file name: \c"
read file_name

if [ -f $file_name ]
then
    if [ -w $file_name ]
    then
        echo "Type some text data. To quit press ctrl+d"
        # ctrl+d is used to come out of cat command
        cat >> $file_name
        # if single angle bracket, your file will be over-written
        # if double angle bracket, your text will be appended
    else
        echo "The file does not have write permissions"
    fi
else
    echo "$file_name does not exist"
fi
