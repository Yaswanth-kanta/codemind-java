import java.util.*;
class sort  
{   
    public static void main(String[] args)   
    {   
        Scanner sc=new Scanner(System.in);
        int [] arr=new int [30];  
        int n=sc.nextInt(),temp;
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) 
        {
            for (int j=i+1;j<n;j++) 
            {     
               if(arr[i]>arr[j]) 
               {    
                   temp=arr[i];    
                   arr[i]=arr[j];    
                   arr[j]=temp;    
               }     
            }     
        }    
         for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

  
