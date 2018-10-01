// Demonstrate the switch.

class SwitchDemo{
	public static void main(String[] args) {
		int i ;
		for(i=0;i<10;i++)
			switch(i){
				case 0:
					System.out.println("i is zero");
					break;
				case 1:
					System.out.println("i is the one");
					break;
				case 2:
					System.out.println("i is the two");
					break;
				case 3:
					System.out.println("i is the three");
					break;
				case 4:
					System.out.println("i is the four");
					break;
				default:
					System.out.println("i is five or more");
				
			}
	}
}