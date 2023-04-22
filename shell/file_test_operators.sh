#! /usr/bin/bash

echo -e "Enter the name of the file: \c" # take input on the same line
# \c keeps cursor on the same line
# to enable \c's interpretation use -e flag

read file_name

if [ -e $file_name ] # -e is special; checks if the file exists
then
    echo "$file_name found"
else
    echo "$file_name not found"
fi

# -f : checks if it is a regular file or not and if it exists
# -d : checks if directory exists or not
# -b : checks if block special file
# -c : checks if character special file
# -s : check if file empty or not
# -r : check if file has read permission
# -w : check if file has write permission
# -x : check if file has execute permission

# file that contains normal characters, or text, are called character special files
# files containing images, and, or, videos (in binary format) are block special files
