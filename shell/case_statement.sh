#! /usr/bin/bash

# case expression in
#   pattern1 )
#       statements ;;
#   pattern2 )
#       statements ;;
# esac - ends case

vehicle=$1

case $vehicle in
    "car" )
        echo "Rent of $vehicle is 100 dollar" ;;
    "van" )
        echo "Rent of $vehicle is 80 dollar" ;;
    "bicycle" )
        echo "Rent of $vechicle is 5 dollar" ;;
    "truck" )
        echo "Rent of $vechicle is 150 dollar" ;;
    * )
        echo "Unknown vehicle" ;;
esac

# please refer to Linux shell automation, and 
