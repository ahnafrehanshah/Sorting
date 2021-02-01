public class BubbleSort 
	{	
		static void bubbleSort(int[] arr) 
		{
			int len = arr.length;
			int tempInt = 0;
			
			for(int i = 0; i < len; i++) 
			{
				for(int j = 1; j < (len-i); j++) 
				{
					if(arr[j-1] > arr[j]) 
					{
						tempInt = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = tempInt;
					}
				}
			}
		}
		

		public static void main(String[] args) 
		{
			int intArr[] = {4,26,64,3,5,1,52,66,7};
			
			System.out.println("Array Before Sorting: ");
			
			for(int i = 0; i < intArr.length; i++) 
			{
				System.out.print(intArr[i] + " ");
			}
			
			System.out.println();
			
			//Sorting 
			bubbleSort(intArr);
			
			System.out.println("Array After Sorting: ");
			
			for(int i = 0; i < intArr.length; i++) 
			{
				System.out.print(intArr[i] + " ");
			}
		}

	}

