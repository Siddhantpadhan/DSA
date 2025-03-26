package DSA;

public class ProductExceptSelf {
	public static void findproduct(int arr[], int product[],int n)
    {
        int prefix[]=new int[n];
        prefix[0]=1; // since first element can have no prefix
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        int suffix[]=new int[n];
        suffix[n-1]=1; // since last element can have no suffix
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        // Building Product Array
        for(int i=0;i<n;i++)
        {
            product[i]=prefix[i]*suffix[i];
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1 , 4 , 6 , 2 , 3};
        int n = arr.length;
        int product[]=new int[n];
        findproduct(arr,product,n);
 
        System.out.print("The product of array Except itself is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(product[i]+", "); 
        }
        System.out.println();

	}

}
