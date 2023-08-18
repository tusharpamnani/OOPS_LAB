/* Practical 6 :
	Write a generic class having functionality addArray() to add all elements in array and print the sum.
	Write a class to test the generic class and its method.
	Define a method isEqual() test whether the sum of two aarays is same or not.
	Define a user exception class 'UnmatchedSum' which is thrown if two sums are not equal.
	Use this class to throw an exception in the method isEqual() if the sum are different. 
*/
class UnmatchedSum extends Exception {
	public UnmatchedSum(String message) {
		super(message);
	}
}
class ArrayAdder<T extends Number> {
	double addArray(T[] array) {
		double sum = 0;
		for(int i=0; i< array.length; i++)
			sum += array[i].doubleValue();
		return sum;
	}
	void isEqual(double s1, double s2) throws UnmatchedSum{
		if(s1==s2)
			System.out.println("The sumof two arrays is same. "+s1);
		else
			throw new UnmatchedSum("The Sumof two arrays is NOT same");
	}
}
class Main6 {
	public static void main(String[] args) {
		Integer[] iarr1 = {1, 2, 3, 44, 5};
		ArrayAdder<Integer> ob1 = new
		ArrayAdder<Integer>();
		double sum1 = ob1.addArray(iarr1);
		System.out.println("Sum: " + sum1);
		Double[] darr1 = {1.0,2.0,3.0,4.0,5.0};
		ArrayAdder<Double> ob2 = new
		ArrayAdder<Double>();
		double sum2 = ob2.addArray(darr1);
		System.out.println("Sum: " + sum2);
		try{
			ob1.isEqual(sum1, sum2);
		}catch(UnmatchedSum e){
			System.out.println("Exception: "+ e.getMessage());
		}
	} 		
}
