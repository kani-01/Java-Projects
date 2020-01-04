
public class ArrayOperations<E extends Comparable>{

	private E[] data;
	private int length;
	
	public ArrayOperations(E[] data)
	{
		this.length =data.length;
		this.data = data;
	}
	
	public E findMax(E[] data)
	{
		E max = data[0];
		for(int i=0;i<data.length;i++)
		{
			if(data[i].compareTo(max)>0)
				max = data[i];
		}
		return max;
	}
	
	public E findMin(E[] data)
	{
		E min = data[0];
		for(int i=0;i<data.length;i++)
		{
			if(data[i].compareTo(min)<0)
				min = data[i];
		}
		return min;
	}
	
	public E[] selectionsort1(E[] data)
	{
		int n = data.length;
		int i,j;
		for(i=0;i<n-1;i++)
		{
			int minindex=i;
			for(j=i+1;j<n;j++)
			{
				if(data[j].compareTo(data[minindex])<0)
				{
					minindex=j;
				}
			}
			E temp=data[i];
			data[i]=data[minindex];
			data[minindex]=temp;
		}
		return data;
	}
	
	
}
