package Assignment3;

public class Static {
	static int a = 15;
	public static void main(String[] args) {
		int b,c,d;
		b = a;		//we can call static variable without creating any class object
		c = 10;
		d = add(b,c); //we can call static method without creating any class object
		System.out.println(d);
	}
    
	public static int add(int x,int y){
	    int z = x+y;
	    return z;
	}
	
	
}
