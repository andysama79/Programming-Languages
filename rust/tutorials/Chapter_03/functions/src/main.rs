fn main() {
    println!("Hello, world!");
    
    another_function();
    yet_another_function(5);
    print_labeled_measurement(5, 'h');

    let mut x = five();

    println!("The value of x is: {x}");

    x = plus_one(5);

    println!("The value of x is: {x}");
}

fn another_function() {
    println!("Another function.");
}

fn yet_another_function(x: i32) {
    println!("Yet another function: {x}");
}

fn print_labeled_measurement(value: i32, unit_label: char) {
    println!("The measurement is: {value}{unit_label}");
} 

fn five() -> i32 {
    5
}

fn plus_one(x: i32) -> i32 {
    x + 1
}
