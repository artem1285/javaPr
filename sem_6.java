import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class sem_6 {
    public static void main(String[] args) {
/*Задание 
Написать класс который будет имитировать работу Set
 */
MySet set = new MySet();
set.add(5);
set.add(6);
}
}

class MySet{
    HashMap <Integer, Object> values = new HashMap <> ();
   private static final Object X = new Object();
    
    void add (int data){
   values.put(data, X);
    }
    // метод вывода
    public String toString(){
        values.forEach((k,v) -> System.out.println (k ));   
    }
}
