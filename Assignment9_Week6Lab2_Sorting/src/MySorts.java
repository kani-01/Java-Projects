
public class MySorts {
		
	public static int[] selectionsort(int[] array)
	{
		int n = array.length;
		//int minindex;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(array[j]<array[i])
				{
					//minindex=j;
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	
	public static int[] bubblesort(int[] array)
	{
		int n = array.length;
		for(int m=n;m>0;m--)
		{
			for(int i=0;i<m-1;i++)
			{
				if(array[i]>array[i+1])
				{
					int temp;
					temp=array[i+1];
					array[i+1]=array[i];
					array[i]=temp;
				}
			}
		}
		return array;
	}

	public static int[] selectionsort1(int[] array)
	{
		int n = array.length;
		int i,j;
		for(i=0;i<n-1;i++)
		{
			int minindex=i;
			for(j=i+1;j<n;j++)
			{
				if(array[j]<array[minindex])
				{
					minindex=j;
				}
			}
			int temp=array[i];
			array[i]=array[minindex];
			array[minindex]=temp;
		}
		return array;
	}

	
	public static int[] BubbleSort1(int [] array)
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag )
	     {
	    	 flag= false;    //set flag to false awaiting a possible swap
	         for(j=0;j<array.length-1;j++)
	         {
	        	 if (array[j]>array[j+1])   // change to > for ascending sort
	             {
	        		 temp = array[j];                //swap elements
	                 array[j] = array[j+1];
	                 array[j+1] = temp;
	                 flag = true;              //shows a swap occurred  
	            } 
	        } 
	      } 
	return array;
	} 
}

