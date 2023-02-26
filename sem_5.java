import java.util.HashMap;
public class sem_5 {
    private static final String HashMap = null;

    public static void main(String[] args) {
    java.util.HashMap<Integer, String>  hashMap = new HashMap<Integer, String>();
    hashMap.put(0, "д"); // положить
     hashMap.putIfAbsent(1, " д");  //-положит если такого не было
     hashMap.remove(1); // если  надо убрать. Убирает по ключу
    hashMap.put(1, "0");
    hashMap.put(2, "Е");
    hashMap.put(3, "Е");
    hashMap.put(4, "А");
     hashMap.get(0); //  – получтить значение.
    //  hashMap.forEach((k, v) ->System.out.println(k+ " " + v));
for (String string : hashMap.values()) {
    System.out.println(string);
   }
    }
}
