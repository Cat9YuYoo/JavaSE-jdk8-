//Demonstrate boolean values.
class BoolDemo{

	public static void main(String[] args){

		boolean b;
		b=false;
		System.out.println("b is "+b);

		b=true;
		System.out.println("b is "+b);

		// a boolean value can control the if statement
		if(b)System.out.println("This is excuted.");

		b=false;
		if(b)System.out.println("This is not excuted.");
		//outcome of arelational operator is a booean value
		System.out.println("10>9 is "+(10>9));
	}
}