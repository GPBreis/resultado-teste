public class Duplicada {
    public static void main(String[] args) {
        int[] array = new int[7];

        array[0] = 2;
        array[1] = 3;
        array[2] = 3;
        array[3] = 5;
        array[4] = 1;
        array[5] = 4;
        array[6] = 2;


        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[i + 1]) {
                    System.out.println(array[i]);
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("-1");
        }

    }
}
