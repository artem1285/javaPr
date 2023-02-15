// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
import java.util.Random;

public class dz_sem1 {
public static void main(String args[]){
Random random = new Random(); 
int num = random.nextInt(0, 2000);
int i = num;
System.out.println(i);
// Или так
// import java.util.Random;

// public class lekcuya {

// public static void main(String args[]){
// int i = new Random().nextInt(0,2000);
// System.out.println(i); 
// } 
// }

// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
int binaryNumber = i;
System.out.println(Integer.toBinaryString(binaryNumber));
int [] bit = new int [binaryNumber];


// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)
}
}