import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class sem_3 {
    public static void main(String[] args) {
//     List<String>list = new ArrayList<String>();
//     list.add("1");
//     list.add("true");
//     list.add("Привет");
//     list.add(1, "One");
//     list.add("2");
//     list.add("3");
//     list.add("4");
//         list.set(1, "Two");
//     String a1 = list.get(1);
//     // List<List<List>> lists;
//     list.remove(1);
//     list.remove("Two");
//     // System.out.println( list.remove("Two"));
//     // System.out.println( list.remove("Two"));
//     String []j = new String[list.size()];
//     list.toArray(j);

//     List<String>list1 = new ArrayList<String>();
//     list1.add("1");
//     list1.add("true");
//     list1.add("Привет");
//     list1.add(1, "One");
//     // list1.add("2");
//     // list1.add("3");
//     // list1.add("4");
//     list1.set(1, "Two");
//     list.subList(1, 12);
//      list.forEach(n ->System.out.println(n));
//      System.out.println(list);
     
//      //тоже .forEach, но только в таком виде 
//     //  for (String string : list) {
//     //     string = "r";
//     //     list.remove(list1)
//     //     }
//     // Iterator<String>iterator = list.iterator();
//     // while(iterator.hasNext()){
//     // String string = iterator.next();
//     // // if (string.equals("1"))iterator.remove();
//         ListIterator<String>iterator = list.listIterator(list.size()-1);
//         while(iterator.previous()){
//             String string = iterator.previous();
//             for(int i = 0; i<list.size();i++){
//                 // System.out.println(list.get(i));
                
//             }
//     }
//     // System.out.println(list);
//     // System.out.println(list1);
//     // System.out.println("-".repeat(16));
//     // // list.retainAll(list1);
//     // list.removeAll(list1);
//     //     System.out.println(list);
//    LinkedList<String>list2 = new LinkedList<>();
//    list.add(0, "true");
//    list2.getLast();
//    list2.getFirst();
//    list2.addLast();
//    list2.addFirst();

// Задача 1.
// Создать новый список ArrayList , добавить в него 5 строк 
// и тремя способами вывести на экран - перебрать.
List<String>list = new ArrayList<String>();
    list.add("первый");
    list.add("второй");
    list.add("третий");
    list.add("четвертый");
    list.add("пятый");
    System.out.println( "просто список: " + list);
    for(String el: list){
        System.out.println("через foreach: " + el);
    }
    System.out.println("* звездочка повторить 10 раз: " + "*".repeat(10));

    for (int i = 0; i<list.size();i++){
        System.out.println("через for: "+ list.get(i));

    }
    ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String el = iterator.next();
            System.out.println("через цикл while: " + el);
        }
        // Задача 2.
        // Сделать второй список и заполнить его данными из первого списка 
        // в обратном порядке, двумя методами
        List<String>list2 = new ArrayList<String>();
        for (int i = list.size ()-1; i>=0;i--){
            list2.add(list.get(i));
            System.out.println(list2); // первый метод
            // второй метод
            ArrayList<String> list3 = new ArrayList<>();
            iterator = list.listIterator(list.size()); // итератор надо создавать, так как тот что вверху, он работает один раз
            while (iterator.hasPrevious()){
           list3.add (iterator.previous());  
        }
        System.out.println(list3);
    }
        }
    }
    
