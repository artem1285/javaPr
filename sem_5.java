import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class sem_5 {
    private static final String HashMap = null;

    public static void main(String[] args) {
    /*java.util.HashMap<String, String>  hashMap = new HashMap<String, String>();
    hashMap.put("0sdas", "д"); // положить
     hashMap.putIfAbsent("1", " д");  //-положит если такого не было
     hashMap.remove("1sd"); // если  надо убрать. Убирает по ключу
    hashMap.put("1sd", "0");
    hashMap.put("2as", "Е");
    hashMap.put("3wq", "Е");
    hashMap.put("4qw", "А");
     hashMap.get("0"); //  – получтить значение.
     hashMap.getOrDefault("4", "def");
    //  hashMap.forEach((k, v) ->System.out.println(k+ " " + v));
// возращает значения
   /* for (String string : hashMap.values()) {
    System.out.println(string);
   }*/ 
   // возвращает ключи
  /*  for (Integer string : hashMap.keySet()) {
    System.out.println(string); */
 
//    for (Integer string : hashMap.keySet()) {
//     System.out.println(hashMap.get(string));
//    }
//    for (Map.Entry<Integer, String> item:hashMap.entrySet()){
//     System.out.printf("[%d,%s]",item.getKey(),item.getValue());
//    }
//    for (int i = 0; i < hashMap.keySet().size(); i++) {
//     System.out.println(hashMap.get(hashMap.keySet().toArray()[i]));
//    }

/* hashMap.values(); //возвращает коллекцию  всех значений. Коллекция это список
hashMap.containsValue("D"); //если такое значение есть, оно вернет истину, если его нет- ложь.
hashMap.compute("1", (k,v) -> v += "!");//.compute он может менять сожержимое элементов.
hashMap.computeIfAbsent("5", v ->String.valueOf(System.currentTimeMillis())+"F!"); //он сработает только если ключа не существует и можно использовать какой то функционал
hashMap.computeIfPresent("5", ( k, v)  -> v  += "!" );
hashMap.merge("4", "?", (nV, tV)-> "<" + nV + tV + ">");
// hashMap.forEach((k, v) ->System.out.println(k+ " " + v));

LinkedHashMap<String, String>LinkedHashMap = new LinkedHashMap<>();
LinkedHashMap.put("1sd", "0");
LinkedHashMap.put("2as", "Е");
LinkedHashMap.put("3wq", "Е");
LinkedHashMap.put("4qw", "А");
// LinkedHashMap.forEach((k, v) ->System.out.println(k+ " " + v));

TreeMap<String, String> TreeMap = new TreeMap<>();
TreeMap.put("1sd", "0");
TreeMap.put("2as", "Е");
TreeMap.put("3wq", "Е");
TreeMap.put("4qw", "А");
TreeMap.forEach((k, v) ->System.out.println(k+ " " + v));
TreeMap.tailMap("Odsf" , true);
TreeMap.headMap("Odsf" , false); 

/*Задача 1
Создать HashMap что бы там был ключ строка, значение строка, 
записать 10 значений и вывести результат двумя разными методами, убедитья 
что они перепутаны.*/
java.util.HashMap<String, String>  hM = new HashMap<String, String>();
hM.put("ноль", "петя");
hM.put("один", "Вася");
hM.put("два", "Юра");
hM.put("три", "СВета");
hM.put("четыре", "аня");
hM.putIfAbsent("десять", "Сергей");


/*Задача 2
Сделать два перебора и вывод на экран двумя разными переборами*/

}
}