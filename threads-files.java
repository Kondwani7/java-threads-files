import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Vector;
import java.util.Iterator;

class Loader2 implements Runnable{
    public void run(){
        System.out.println("testing");
    }
}

class Myclass{
  public static void main(String[] args) {
    Thread t = new  Thread(new Loader2());
    t.start();
    //Array list
    ArrayList<String> teams = new ArrayList<String>();
    teams.add("Arsenal");
    teams.add("Chelsea");
    teams.add("Liverpool");
    teams.add("Manchester City");
    teams.add("Manchester United");
    Collections.sort(teams);

    System.out.println(teams);

    //Hash Map
    HashMap<String, Integer> points = new HashMap<String, Integer>();
    points.put("Arsenal", 70);
    points.put("Manchester United", 80);
    points.put("Chelsea",75);
    points.put("Liverpool", 99);
    points.put("Manchester City", 85);
    System.out.println(points.get("Liverpool"));

    //Sets
   HashSet<String> grades = new HashSet<String>();
   grades.add("A");
   grades.add("B");
   grades.add("C");
   System.out.println(grades);

   //Vectors 
   Vector<String> v = new Vector<String>();
   v.add("Terry");
   v.add("Jerry");
   v.add("Berry");
   System.out.println(v);

   //Iterator
   ArrayList<String> arr1 = new ArrayList<String>();
   arr1.add("Blue");
   arr1.add("Pink");
   arr1.add("Yellow");
   arr1.add("Green");
   //iterates through every value in the list, like a loop
   Iterator<String> it1 = arr1.iterator();
   /*String value = it1.next();
   System.out.println(value);*/
   while(it1.hasNext()){
     String value = it1.next();
     System.out.println(value);
   }

   }

   

}
