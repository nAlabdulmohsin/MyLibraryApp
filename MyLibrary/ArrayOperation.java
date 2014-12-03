package ArrayOperation;

public class ArrayOperation {
	public static Integer[] reverseArray (int[] array)
	{
		Integer[] newArray = new Integer[array.length];
		for (int i =0; i < array.length/2; i++)
		{
			
			newArray[i] = array[array.length - (1+i)];
		}
		return newArray;
	}
	
	public static int arraySum(int[] [] array)
	{
		int total =0;
		for( int i = 0; i < array.length; i++)
		{
			for (int col =0; col< array[i].length ; col++)
			{
				total += array[i][col];
			}
		}
		return total;
	}

}
