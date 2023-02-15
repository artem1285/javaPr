import java.util.Random;

public class sem_1_HW_1 {
    public static void main(String args[]) {
        Random random = new Random();
        int num = random.nextInt(2001);
        int i = num;
        System.out.println(i);
        int binary = i;
        String bin = Integer.toBinaryString(binary);
        System.out.println(bin); // перевели в двоичную систему
        // System.out.println(Integer.toBinaryString(i));
        int n = Integer.toBinaryString(i).length(); // посчитал количество символов
        System.out.println(n);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в
        // массив m1
        int count = 0;
        for (int a = n; a <= Short.MAX_VALUE; a++) {
            if (a % n == 0) {
                count++;
            }
            int[] m1 = new int[count];

            int count = 0;
            for (int a = Short.MIN_VALUE; a <= n; a++) {
                if (a % n == 0) {
                    m1[count++] = a;

                }
            }
        }
        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и
        // сохранить в массив m2
        int cnt = 0;
        for (int a = Short.MIN_VALUE; a <= n; a++) {
            if (a % n != 0) {
                cnt++;
            }
            int[] m2 = new int[cnt];

            int cnt = 0;
            for (int a = Short.MIN_VALUE; a <= n; a++) {
                if (a % n == 0) {
                    m2[cnt++] = a;
                }
            }
        }
    }
}

