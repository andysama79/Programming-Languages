public class PlayLambda {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println(myNum.getValue());
        myNum = () -> Math.random() * 100;
        System.out.println(myNum.getValue());
    }

    interface MyNumber { // functional interface and its function is defined by getValue()
        double getValue(); // implicityly abstract method and defined by MyNumber
    }
}
