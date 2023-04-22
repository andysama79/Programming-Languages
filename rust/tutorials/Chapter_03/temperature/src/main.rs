use std::io;

fn main() {
    println!("Enter choice:");
    println!("1) Convert Fahrenheit to Celsius");
    println!("2) Convert Celsisus to Fahrenheit");
    
    let mut choice = String::new();

    io::stdin()
        .read_line(&mut choice)
        .expect("Waiting for response");

    let choice: i32 = choice.trim().parse().expect("Number expected"); 

    println!("Enter temperature:");

    let mut temp = String::new();

    io::stdin()
        .read_line(&mut temp)
        .expect("Waiting for response");

    let temp: f32 = temp.trim().parse().expect("Number expected");

    let answer;
    if choice == 1 {
        answer = (temp - 32.0) * 5.0 / 9.0;
    }
    else {
        answer = (temp * 9.0 / 5.0) + 32.0;
    }

    println!("The converted temperature is: {answer}");   
}
