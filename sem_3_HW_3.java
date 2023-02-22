import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class sem_3_HW_3 {
public static void main(String[] args) {
// 1.Создать новый список, добавить несколько строк 
// с названиями цветов и вывести коллекцию на экран.
List<String>color = new ArrayList<String>();
color.add("Белый");
color.add("Черный");
color.add("Красный");
System.out.println(color);

// 2.Итерация всех элементов списка цветов 
// и добавления к каждому символа '!'.
ListIterator<String> iterator = color.listIterator();
while (iterator.hasNext()){
String el = iterator.next();
System.out.println(el + "!");

// 3. Вставить элемент в список в первой позиции.
color.add(1, "что-то");
System.out.println(color);
// 4. Извлечь элемент (по указанному индексу) из заданного списка.
System.out.println(color.get(2));
// 5. Обновить определенный элемент списка по заданному индексу.
color.set(3, "Обновил");
System.out.println(color);
// 6. Удалить третий элемент из списка.
color.remove(2);
System.out.println(color);
// 7. Поиска элемента в списке по строке.

if(color.indexOf("Черный") != -1) {
    System.out.println(color);
}
// 8. Создать новый список и добавить в него несколько 
// елементов первого списка.
List<String>newcolor = new ArrayList<String>();
newcolor.add("зеленый");
newcolor.add("оранжевый");
newcolor.add("Синий");
System.out.println(newcolor);
// 9. Удалить из первого списка все элементы 
// отсутствующие во втором списке.
color.removeAll(newcolor);
System.out.println(color);

// 10. *Сортировка списка.
Collections.sort(color);
System.out.println(color);
// 11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
//это для меня очень сложно, я не понимаю как это делается
}
}
}

