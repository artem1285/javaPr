import java.util.Scanner;

public class sem_2 {
    // private static final float TIME = 0;
  public static void main(String[] args) {
 
    // String str  = "HeLLo";
    // str  = str.replace("LL" , "oo");
    // StringBuilder builder = new StringBuilder("HeLLo");
    // str  =builder.toString();
    // builder.append(true);
    
    // builder.append(true).append("!=").append(false);
    // builder.deleteCharAt(0);
    // builder.delete(0, 0)
    // builder.reverse()
    // builder.indexOf(str)
    // builder.replace(0, 0, str)
    // builder.insert(builder.length()/2, 7.34f);
      //builder.toString.contains(bilder.toString);
    // System.out.println(builder);
//     String str = "";
//     StringBuilder builder = new StringBuilder();
//     long begin = System.currentTimeMillis();
//     // System.nanoTime()
// for (int i = 0; i< 1000; i++){
//     str+= Character.getName(i);
// }
//     long end = System.currentTimeMillis();
//     System.out.println(end-begin);

//     begin = System.currentTimeMillis();
//     for (int i = 0; i< 1000; i++){
//       builder.append(Character.getName(i)) ;
// }
//     end = System.currentTimeMillis();
//     System.out.println(end-begin);
//     //Если надо работать с консолью Scanner
// Задача 1.
// Написать программу, в которой будет вводится вручную две строчки, 
// далее будет сравнение этих строк и говорить, есть ли в первой строке 
// элементы другой строки.

// Scanner scanner = new Scanner (System.in);
//     System.out.print("Ведите строку: ");
//      //перевели, что бы был не класс строка, а класс bilder
//      StringBuilder strOne = new StringBuilder(scanner.nextLine()); //одной строчкой инициализировали и засунули в StringBuilder строчку, которую ввел пользоватль
//      System.out.println(strOne);
//     System.out.println("Ведите вторую строку: ");
//     StringBuilder strTwo = new StringBuilder(scanner.nextLine()); //одной строчкой инициализировали и засунули в StringBuilder строчку, которую ввел пользоватль
//      System.out.println(strTwo);
// // что бы проверить есть ли одинаковые элементы в строках
//     // порверяем по условию
//     if(strOne.toString().contains(strTwo.toString())) {
      
// // Задача 2.
//     // Находим в одной строке другую и если находим ее, 
//     // то меняем надписью “найденая строка заменена на другую”, 
//    // если не находим, “совпадений ненайдено”. 
      
//    //если strOne содержит strTwo, то получается в strOne приминяем метод replase
//    //и меняем strTwo на фразу 
//    // и потом всю эту строчку обернуть в System.out.println 
//     //     System.out.println(strOne.toString().replace(strTwo.toString() ,"найденая строка заменена на другую"));
//     // }
//     //     else  System.out.println("совпадений ненайдено");

// // Задача 3.
// // Если сравнивали contains(strTwo.toString, теперь надо сравнить contains bilder
//         int startindex = strOne.indexOf(strTwo.toString()); 
//         System.out.println(startindex);
//         int endindex = startindex + strTwo.length();
//         System.out.println(endindex);
//         System.out.println(strOne.replace(startindex, endindex, "Что надо было написать ?"));
//         }
//             else  System.out.println("совпадений ненайдено");
 // Задача 4.
// Сравнить время замены 3-5 значений в строке методом string replase и stringBilder replase 
   
StringBuilder strOne = new StringBuilder("Hello world");
String strTwo = "Hello world";
long begin = System.currentTimeMillis();
System.out.println(strOne.replace(0, 0, strTwo)); // заменить например какие то буквы, это делали на семинаре
long end = System.currentTimeMillis();
System.out.println(end-begin);

      }
}
