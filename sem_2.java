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

Scanner scanner = new Scanner (System.in);
    System.out.print("Ведите строку: ");
     //перевели, что бы был не класс строка, а класс bilder
     StringBuilder strOne = new StringBuilder(scanner.nextLine()); //одной строчкой инициализировали и засунули в StringBuilder строчку, которую ввел пользоватль
     System.out.println(strOne);
    System.out.println("Ведите вторую строку: ");
    StringBuilder strTwo = new StringBuilder(scanner.nextLine()); //одной строчкой инициализировали и засунули в StringBuilder строчку, которую ввел пользоватль
     System.out.println(strTwo);
// что бы проверить есть ли одинаковые элементы в строках
    // порверяем по условию
    if(strOne.toString().contains(strTwo.toString())) {
      System.out.println("содержит");

    }
  } 
}