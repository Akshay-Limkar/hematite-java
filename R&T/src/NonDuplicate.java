public class NonDuplicate {
	
	public static void main(String[] args) {

		int[] arr = {1,1,1,2,3,4,5,8,5,6,3,5,6};
		int[] unique = new int[9];
		int uniqueLength = 0;

		outerloop:for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<uniqueLength; j++)
			{
				if (arr[i] == unique[j])
				{
					continue outerloop;
				}
			}
			unique[uniqueLength] = arr[i];
			System.out.println(arr[i]);
			uniqueLength++;
		}
	} 
}