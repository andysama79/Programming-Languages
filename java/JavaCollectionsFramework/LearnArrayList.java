import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // List<Type> list = new LinkedList<>(); also works

        // inserting elements
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i*10);
        }
        System.out.println(arrayList);

        // inserting at specified index
        arrayList.add(5, 55);
        arrayList.add(7, 75);
        System.out.println(arrayList);

        // append a new list
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList.add(19);
        newArrayList.add(79);
        newArrayList.add(69);

        arrayList.addAll(newArrayList);
        System.out.println(arrayList);

        // retrieving and deleting elements
        for (int i = 1; i < arrayList.size(); i += 2) {
            arrayList.get(i);
            arrayList.remove(i+1); // deletes at index
            arrayList.remove(Integer.valueOf(i*10)); // deletes element
        }
        System.out.println(arrayList);

        // updating elements 
        for (int i = 1; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i)+1);
        }
        System.out.println(arrayList);

        // checking presence
        System.out.println(arrayList.contains(29));
        System.out.println(arrayList.contains(79));
    }
}
