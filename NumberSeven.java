public class NumberSeven {
    public static void main(String[] args) {
        int[] allNumbers = new int[99];
        for (int i = 0; i < allNumbers.length; i++) {
            int value = i + 2;
            allNumbers[i] = value;
        }

        for (int j = 2; j <= Math.ceil(Math.pow(allNumbers.length, 0.5)); j++) {
            for (int i = 0; i < allNumbers.length; i++) {
                if (allNumbers[i]%j == 0) {
                    allNumbers[i] = 0;
                }
            }
        }
        for (int i = 0; i < allNumbers.length; i++) {
            if (allNumbers[i] != 0) {
                System.out.print(allNumbers[i] + " ");
            }
        }

        
    }
}
