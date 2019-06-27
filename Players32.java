public class Players32{
     public static void main(String []args){
      java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        boolean flg=false;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==k)
               flg=true;
        }
        System.out.println((flg)?"yes":"no");
     }
}
