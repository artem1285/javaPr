import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class sem_6 {
    public static void main(String[] args) {
/*Задание 
Написать класс который будет имитировать работу Set
 */
MySet set = new MySet();
set.add(5);
set.add(6);
set.add(7);
set.add(8);
set.add(9);
set.add(10);
System.out.println(set);
System.out.println(set.contains(11));
System.out.println(set.contains(5));
System.out.println(set.get(5));
System.out.println(set.getArrayList());
System.out.println(set.headSet(7));
System.out.println(set.tailSet(7));

}
}

class MySet{
    private HashMap <Integer, Object> values = new HashMap <> ();
   private static final Object X = new Object();
private static final String ArrayList = null;
    
    void add (int data){
   values.put(data, X);
    }
    // метод вывода
    public String toString() {
       return values.keySet().toString();
    } 
       // получить доступ (считать) к элементам нашего списка
   Boolean contains (int data){
    return values.containsKey(data);
   }
   //очистка
   void clear () {
    values.clear();
   }
   // удаление элемента
   void remove(int data){
    values.remove(data);
   }
   /*Сделать метод, который будет возвращать количество 
   элементов в сете, и метод, который будет возвращать 
   элемент по индексу.*/
   int size(){
    return values.size(); 
   } //возвращает количество элементов
// метод, который будет возвращает элемент по индексу
   int get(int ind){
    return (int) values.keySet().toArray()[ind];
   }
    /*Сделать метод, который будет возвращать Arraylist . 
    Т.е. он будет создавать Arraylist в котором будут наши ключи 
    и возвращать Arraylist  */
ArrayList getArrayList(){
    ArrayList <Integer> res = new ArrayList<>(); 
    values.forEach((k,v) -> res.add(k));
    return res;

}
    /*Сделать 2 метода, TeilSet, принимает в параметре ключ, 
а возвращает наш Set, но клбчи в нем указанные нами и до конца Set.
И HeadSet который тоже принимает ключ ,но он будет сначала Set 
и до указанного нами. */

MySet headSet (int data){ 
       MySet res = new MySet();
    for (int el : values.keySet()) {
        res.add(el);
        if(data ==el) 
        break;
    }
    return res;
}
MySet tailSet (int data){
    boolean ad = false;
    MySet res = new MySet();
    for (int el : values.keySet()) {
        if(data ==el) ad = true;
        if(ad){res.add(el);}
       
    }
    return res;
}
    /*SubSet. Вы даем два ключа и он возвращает MySet начиная с  */
    MySet subSet (int key1, int key2){
        MySet res = new MySet();
        boolean ad = false;
        for (int el : values.keySet()){
            if(el == key1 || el == key2){
                ad = true;
            }
            if(ad){
                res.add(el);
                if(el == key1 || el == key2){
                   break;
                }

            }
        }
        return res;   
    }
}


