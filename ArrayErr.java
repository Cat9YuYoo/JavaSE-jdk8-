// Demonstrate an array overrun.
// java.lang.ArrayIndexOutOfBoundsException
class ArrayErr{
	public static void main(String[] args) {
		int sample[] = new int[10];
		int i;

		// generate an array overrun
		for(i = 0;i<100;i+=1)
			sample[i] = i;
	}
}