package test;

class EncapClass {
   private String name;
   public final String constantStr = "stre"; 
   private String idNum;
   private int age;
   
   EncapClass (String n, String id, int a) {
	   name = n;
	   idNum = id;
	   age = a;
   }

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge(int newAge) {
	   if (newAge >= 0) {
		  age = newAge;
	   }
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}

public class Encapsulation {

	public static void main(String[] args) {
		
		EncapClass obj = new EncapClass("Bob", "ABC123", 22);
		System.out.println(obj.getName());
		obj.setAge(-5);
		System.out.println(obj.getAge());
		
		
	}
	
}
