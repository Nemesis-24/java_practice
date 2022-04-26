import java.io.*;
class sumArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your array size: ");
        int n= Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int j;
        System.out.println("Enter your desire value of  position: ");
        for(j=0;j<n;j++){
            a[j] = Integer.parseInt(br.readLine());
        }
        int sumnum=0;
         for (int i=0;i<n;i++){
            sumnum=sumnum+a[i];

        }
        System.out.println(sumnum);
    }
}
        
        
