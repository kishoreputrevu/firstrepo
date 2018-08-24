package javaApplication1;

public class JavaApplication2 {


	public int a(){
		int a=7,b=3,c;
        c= a+b;
		return c;
	}

    public static void main(String[] args) {
    	int c = a();
        System.out.print(c);

	int d = mul();
	System.out.println(d);

    }

    public int mul() {
       int a = 10, b=2, c;
 	c = a*b;
	return c;
   }
    	
}
