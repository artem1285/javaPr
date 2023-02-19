import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class sem_2_HW_2 {
    public static void main(String[] args) {

    // 1.Напишите программу, чтобы найти вхождение в строке 
    //(содержащей все символы другой строки).
  
   Scanner scanner = new Scanner(System.in);
   System.out.print("Ведите строку: ");
   StringBuilder str1 = new StringBuilder(scanner.nextLine()); 
   System.out.println(str1);
   System.out.print("Ведите строку: ");
   StringBuilder str2 = new StringBuilder(scanner.nextLine()); 
   System.out.println(str2);
   if(str1.toString().contains(str2.toString())){
    System.out.println("строка содержит все символы");
   }
   else System.out.println("не содержит все символы");
   
    // 2.Напишите программу, чтобы проверить, являются ли две данные 
    //строки вращением друг друга (вхождение в обратном порядке).
    StringBuilder str2rev = str2.reverse();
    if(str1.toString().equals(str2.toString())){
        System.out.println("строки являются вращением друг друга");
       }
       else System.out.println("строки не являются вращением друг друга");

    // 3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    // 4.Дано два числа, например 3 и 56, необходимо составить следующие 
    //строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
    // Используем метод StringBuilder.append().
    System.out.println("\\\\");
    StringBuilder num1 = new StringBuilder("3");
    StringBuilder num2 = new StringBuilder("56");
    StringBuilder plus = num1.append("+").append(num2).append("=").append("59");
    System.out.println (plus);
    num1 = new StringBuilder("3");
    num2 = new StringBuilder("56");
    StringBuilder minus = num1.append("-").append(num2).append("=").append("-53");
    System.out.println (minus);
    num1 = new StringBuilder("3");
    num2 = new StringBuilder("56");
    StringBuilder multiply = num1.append("*").append(num2).append("=").append("-53");
    System.out.println (multiply);
    // 5.Замените символ “=” на слово “равно”. Используйте методы 
    // StringBuilder.insert(),StringBuilder.deleteCharAt().
    int index = multiply.indexOf("=");
    System.out.println(index);
    StringBuilder delitestr = multiply.deleteCharAt(5);
    System.out.println(delitestr);
    multiply.insert(5, " равно ");
    System.out.println(multiply);

    // 6.Замените символ “=” на слово “равно”. Используйте методы 
    // StringBuilder.replace().
    multiply.replace(5, 6, " равно ");
        System.out.println(multiply.toString());

    // *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
    // это задание я не понял как делать

   }  
}
