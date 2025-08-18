class linear{
    public static int linearsearch(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] numbers ={2,3,5,1,7};
        int target=3;
        int result=linearsearch(numbers,target);
        if(result!=-1)
        {
            System.out.println("element found at index:"+result);
        }
        else
        {
            System.out.println("element not foundin the array:");
        }
    }
}