public class TrappedWater
{

public int water(int arr[])
{   

    int ans=0;
    //calculate the array length
    int length=arr.length;
    
    //creating left array
    int left[]=new int[length];

    //creating right array
    int right[]=new int[length];
    
    //filling left array
    left[0]=arr[0];
    for(int i=1;i<length;i++)
    {
        left[i]=Math.max(left[i-1],arr[i]);
    }

    //filling right array
    right[length-1]=arr[length-1];
    for(int i=length-2;i>=0;i--)
    {
        right[i]=Math.max(right[i+1],arr[i]);
    }
    

    //calculating the total water amount
    for(int i=0;i<length;i++)
    {
        ans+=Math.min(left[i],right[i])-arr[i];
    }

return ans;

}


public static void main(String args[])
{
    TrappedWater t=new TrappedWater();
    int array[]={ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    System.out.print("Trapped Water:"+t.water(array));
}

}