/*import java.util.*;
public class Solution2 {

	static Map <String,String> food= new HashMap<String,String>();
	static Map<String,String> people= new HashMap<String,String>();
	 
	 static public Map<String, String> getFood(){
	   food.put("pizza","italian");
	   food.put("chowmin","chinese");
	   food.put("Burger","canada");
	   food.put("Puri","Indian");
	   System.out.println(food);
	   return food;
	     
	 }
	 
	 static public Map<String,String> getPeople(){
	     
	   people.put("geeta", "indian");
	   people.put("neha","chinese");
	   people.put("zara", "indian");
	   people.put("haiyan","chinese");
	   people.put("ben", "canada");
	   people.put("paul","italian");
	   people.put("adam","*");
	   
	   
	   System.out.println(people);
	   return people;
	 }
	public static void main(String[] args) {
	  
	   Solution2.getFood();
	   Solution2.getPeople();
	 
	
	
	

	Map<String, List<String>> map = new HashMap<String, List<String>>();
		 
	
	 
	for(Map.Entry<String,String> entry: food.entrySet())
	{
		  List<String> list=new ArrayList<String>();
	       System.out.println("food is" + entry.getValue());
	       for(Map.Entry<String,String> entry2:people.entrySet()) {
	    	 
	    	   if(entry.getValue().equals(entry2.getValue())){
	    		   list.add(entry2.getKey());
	    	   }else if(entry2.getValue()=="*") {
	    		   list.add(entry2.getKey());
	    	   }
	    	   
	       }
	       map.put(entry.getValue(), list);
	       System.out.println(list);
	   
	}
	
System.out.println(map);
	
}
}
*/






import java.util.*;
public class Solution2{
   static Map <String,String> food= new HashMap<String,String>();
   static Map <String,String> people=new HashMap<String,String>();
  static Map<String, List<String>> result=new HashMap<String,List<String>>();
   static List<String> list=new ArrayList<String>();
   
   static public Map<String,String> getFood(){
    
       food.put("indian","puri");
       food.put("chinese","noodles");
       food.put("italian", "pizza");
       System.out.println(food);
       return food;
   } 
    
   static public Map<String,String> getPeople(){
       
       people.put("ram","indian");
       people.put("sham","chinese");
       people.put("tam","italian");
       people.put("bham","indian");
       System.out.println(people);
       return people;
   } 
public static void main(String[] args){
    
    getFood();
    getPeople();
    Map<String, List<String>> map = new HashMap<String, List<String>>();
	 
	
	 
	for(Map.Entry<String,String> entry: food.entrySet())
	{
		  List<String> list=new ArrayList<String>();
	       System.out.println("food is" + entry.getValue());
	       for(Map.Entry<String,String> entry2:people.entrySet()) {
	    	 
	    	   if(entry.getKey().equals(entry2.getValue())){
	    		   list.add(entry2.getKey());
	    	   }
	    //	   else if(entry2.getValue()=="*") {
	    //		   list.add(entry2.getKey());
	    //	   }
	    	   
	       }
	       map.put(entry.getValue(), list);
	       System.out.println(list);
	   
	}
	
System.out.println(map);
	
}
    
    
    
}