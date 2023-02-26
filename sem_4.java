import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
  /*Задание
    1. Ввод с консоли в формате Ф.И.О Возраст пол
    2. Выход из режима вода по горячей кнопке
    3. Вывод несортированного списка в формате Иванов И.И.
    4. Два варианта продолжения, либо вывод списка сортированного 
    по возрасту либо завершение приложения.
    */
public class sem_4 {
    // класс пузырьковой сортировки, сортировать будем по возрасту
    public static void bubleSortAge(ArrayList<Integer>age,LinkedList <Integer> index){
        ArrayList<Integer>ageTmp = new ArrayList<Integer>(age);

        boolean sort = true;
        int k  = ageTmp.size();
        while(sort){
            sort = false;
        for (int i = 0; i < k-1; i++) {
            if(ageTmp.get(i)>ageTmp.get(i+1)){
                int temp = ageTmp.get(i);
                ageTmp.set(i, ageTmp.get(i+1));
                ageTmp.set(i+1, temp);

                int temp2 = index.get(i);
                index.set(i, index.get(i+1));
                index.set(i+1, temp2);
                sort = true;
           }      
        }
        k--;
    }
    }
    public static void sortGender(ArrayList<Boolean>gender,LinkedList <Integer> index){ 
      
        int i = 0;
        int f = index.size();
        while (i > -1) {
            if(! gender.get(index.get(i))){
                int temp = index.get(i);
                index.remove(i);
                index.add(temp);
                i++; 
            }
            i++;     
         }
        }

        public static void sortGender2(ArrayList<Boolean> gender, LinkedList<Integer> index) {
            LinkedList<Integer> indexM = new LinkedList<>();
            LinkedList<Integer> indexW = new LinkedList<>();
    
            for (int i : index) {
                if (!gender.get(index.get(i))) {
                    indexW.add(index.get(i));
                } else {
                    indexM.add(index.get(i));
                }
            }
            index.clear();
            index.addAll(indexM);
            index.addAll(indexW);
        }
    
        public static void printData(ArrayList<String> lastName,
                                     ArrayList<String> firstName,
                                     ArrayList<String> patronymic,
                                     ArrayList<Boolean> gender,
                                     ArrayList<Integer> age,
                                     LinkedList<Integer> index) {
            for (int i : index) {
                StringBuilder str = new StringBuilder();
                str.append(lastName.get(i)).
                        append(" ").
                        append(firstName.get(i).charAt(0)).
                        append(". ").
                        append(patronymic.get(i).charAt(0)).
                        append(". ").
                        append(age.get(i)).
                        append(". ").
                        append(gender.get(i) ? "М" : "Ж");
                System.out.println(str);
            }
            System.out.println("*".repeat(10));
        }


        public static void main(String[] args) {
 

    // 1. Ввод с консоли в формате Ф.И.О Возраст пол
    LinkedList <Integer> index = new LinkedList<>(); //в него положили наши индексы
    ArrayList<String>LastName = new ArrayList<String>(); // тут положили в список наш массив
    ArrayList<String>firstName = new ArrayList<String>();
    ArrayList<String>patronymic = new ArrayList<String>();
    ArrayList<Integer>age = new ArrayList<Integer>();
    ArrayList<Boolean>gender = new ArrayList<Boolean>();

   Scanner scanner = new Scanner(System.in);
   System.out.println("Ведите ФИО, пол, возраст через пробел.Выход через Х");
   // для стоп слова
   boolean run = true;
    while(run){
   String in = scanner.nextLine();
//    2. Выход из режима вода по горячей кнопке
   if (in.equals("x")){
    run = false;
   }
   else{
    String [] data = in.split(" ");
    index.add(LastName.size());
    LastName.add(data[0]);
    firstName.add(data[1]);
    patronymic.add(data[2]);
    age.add(Integer.parseInt(data[3])); // перевод из стринга в интеджер
        gender.add(data[4].contains("м"));
   }
}
//    3. Вывод несортированного списка в формате Иванов И.И. через форич

for(int i = 0; i< LastName.size(); i++){
    StringBuilder str = new StringBuilder();
    str.append(LastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ").append(patronymic.get(i).  charAt(0)).append(". ");
    System.out.println(str);
}
/*4. Два варианта продолжения, либо вывод списка сортированного 
по возрасту либо завершение приложения.*/
//сначала надо сделать разные списки
System.out.println("*".repeat(10));
bubleSortAge(age, index);

for (int i: index) {
    StringBuilder str = new StringBuilder();
    str.append(LastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ").append(patronymic.get(i).  charAt(0)).append(". ").append(age.get(i)).append(". ").append(gender.get(i));
    System.out.println(str);   
}
System.out.println("*".repeat(10));
sortGender(gender,index);
for (int i: index) {
    StringBuilder str = new StringBuilder();
    str.append(LastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ").append(patronymic.get(i).  charAt(0)).append(". ").append(age.get(i)).append(". ").append(gender.get(i));
    System.out.println(str);   
}
}
}
