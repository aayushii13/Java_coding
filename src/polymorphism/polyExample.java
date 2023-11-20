package polymorphism;

public class polyExample {

	public int addIt(int a, int b, int c) {
		return(a+b+c);
	}
	
	public int addIt(int a, int b)
	{
		return(a+b);
	}
	public String addIt(String a, String b)
	{
		return(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyExample obj = new polyExample();
		obj.addIt(2, 3);
		obj.addIt("22", "44");
		obj.addIt(10, 20, 30);
		
	}

}
