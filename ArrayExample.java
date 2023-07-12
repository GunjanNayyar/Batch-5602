// example for Array
class ArrayExample
{
	public static void main(String[] args)
	{
		//datatype name_of_array[]=new datatype[size]
		/* int arr[]=new int[5]; // declaration and instantiation
		arr[0]=100; // initializing the array
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50; */
		int arr[]={10,20,30,40,50}; // declaration, instantiation and initializing
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]); // printing the value
		}		
		
	}
}