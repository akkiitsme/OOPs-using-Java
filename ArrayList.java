package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

 public static void main(String[] args) {
// TODO Auto-generated method stub
//int arr[] = new int[10];
ArrayList<String> list = new ArrayList<String>();
list.add("KIET");
list.add("AKGEC");
list.add("ABES");
list.add("IMS");
System.out.println(list);
System.out.println(list.get(1));
//System.out.println(list.remove(3));
// System.out.println(list);
Iterator<String> itr = list.iterator();
while(itr.hasNext()) {
String s = itr.next();
System.out.println(s);
}
}

}
