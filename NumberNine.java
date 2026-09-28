public class NumberNine {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            int value = i + 1;
            array[i] = value;
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j]%3 == 0 && array[j]%5 == 0) {
                System.out.println(array[j] + " FizzBuzz");
            }
            else if (array[j]%3 == 0) {
                System.out.println(array[j] + " Fizz");
            }
            else if (array[j]%5 == 0) {
                System.out.println(array[j] + " Buzz");
            }
            else {
                System.out.println(array[j]);
            }

            
        }
    }
}
