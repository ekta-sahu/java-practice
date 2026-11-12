package JavaGenerics;

public class Test {
        public static void main(String[] args) {

            Box<Integer> box = new Box<>();  // Box is now type-safe
            box.setValue(1);  // No issue, it's an Integer
            Integer i = box.getValue();  // No casting needed
            System.out.println(i);

            Pair<String, Integer> pair = new Pair<>("Age", 30);
            System.out.println("Key: " + pair.getKey());
            System.out.println("Value: " + pair.getValue());
        }
}
