package collectiondemo;

import java.util.HashMap;

public class HashMapDemo {

 public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put(123, "Rajat");
map.put(124, "Ankit");
map.put(125, "Mayak");
map.put(126, "Mohit");
map.put(127, "Verma");
map.put(128, "Sumit");
map.put(128, "Gupta");
map.put(null, "Sumit");
System.out.println(map.keySet());
System.out.println(map.values());
System.out.println(map.get(126));
//iteration
for(Integer i:map.keySet()) {
System.out.println(map.get(i));
}
}

}
