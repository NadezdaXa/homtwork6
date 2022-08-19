public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // задание 1
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        System.out.println("сумма трат за месяц " + total + " рублей");

        // задание 2
        int maxMany = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxMany) {
                maxMany = arr[i];
            }
        }
        System.out.println("максимальная сумма трат за месяц " + maxMany + " рублей");

        // задание 2

        int minMany = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != 0 + minMany) {
                minMany = arr[i];
            }
        }
        System.out.println("минимальная сумма трат за месяц " + minMany + " рублей");

        //задание 3
        double average = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                average = maxMany + minMany/arr.length;
            }
        }
        System.out.println("средняя сумма трат за месяц " + average + " рублей");

        // задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}













    
    
























        

    
    
