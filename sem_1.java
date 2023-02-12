import java.util.Random;


public class sem_1 {
static String str;

public static void main(String[] args) {
    int [] ints = new int [10];
    ints[4] = Integer.parseInt("56");
//    System.out.println(ints [4]);
//    System.out.println(Integer.toBinaryString(75843));
  
   Random random = new Random();
   
   for (int i = 0; i< ints.length; i++){
    ints [i] = random.nextInt(100);
    if (ints [i] % 2 != 0) {
    // System.out.println(ints [i]);
   }
}   
int [] df = new int[ints.length + ints.length/2+1];
for(int i =0; i< ints.length;i++){
    df [i] = ints [i];
}
ints = df;

str  = "Hello! World!"; // если мы в этом классе public static void main(String[] args) {, тогда и переменные тоже должны быть статическими static String str;
str += "?";
String str2 = "Hello";

System.out.println(str.toLowerCase() );
System.out.println(str.toUpperCase());
if(str.equals(str2)) System.out.println("Equale");
if(str.contains(str2)) System.out.println("contains");
System.out.println("авп.".repeat(5));
System.out.println(str.replace(str2, "ты"));
String[] sStr= str.split("!");
}
}



