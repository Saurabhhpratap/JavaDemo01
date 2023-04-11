
public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+"20");
		System.out.println("10"+20);
		
		int a = 5;
		//preinrciment
		System.out.println(++a);
		
		int b = 8;
		//postincrement
		System.out.println(b++);
		
	    int c = b;
	    System.out.println(c);
	    
	    Logical_ops(); 
	}
       public static void contatination()
       {
        System.out.println(10+20);
   		System.out.println(10+"20");
   		System.out.println("10"+"20");
   		System.out.println("10"+20);    	   
       }
    	   public static void increment_ops()
    	   {
    		   int a = 5;
    			//preinrciment
    			System.out.println(++a);
    			
    			int b = 8;
    			//postincrement
    			System.out.println(b++);
    			
    		    int c = b;
    		    System.out.println(c);
    	   }
	
    	   public static void relational_ops()
    	   {
    		   int a = 10;
    		   int b = 20;
    		   
    		   System.out.println(a<b);  
    		   System.out.println(a>b);
    		   System.out.println(a<=b);
    		   System.out.println(a>=b);
    		   }
    	   
    	   public static void Logical_ops()
    	   {
    		   int a = 10;
    		   int b = 20;
    		   
    		   System.out.println(true && true);  
    		   System.out.println(true && false);
    		   System.out.println(true || true);
    		   System.out.println(true || false);
    		   System.out.println(false || false);
    		   }

}
