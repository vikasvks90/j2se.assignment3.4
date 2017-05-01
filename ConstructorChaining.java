package Assignment3;

public class ConstructorChaining {
	
	public ConstructorChaining(){
        System.out.println("In default constructor...");
    }
    public ConstructorChaining(int i){
        this();
        System.out.println("In single parameter constructor...");
    }
    public ConstructorChaining(int i,int j){
        this(j);
        System.out.println("In double parameter constructor...");
    }
     
   	public static void main(String[] args) {
   		ConstructorChaining cc = new ConstructorChaining(10,20);
//when we create the constructor,first double parameter constructor will be called
//using this(j) we have called  single parameter constructor
//using this() we have called default constructor
	}

}
