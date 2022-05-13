public class stars {
    public static void main(String[] args) {
    
       /* for (int i=0;i<=6;i++){
            for (int j=(6-i);j>=0;j--){

                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();*/
           /* {
            for(int i=6;i>=0;i--){
                for(int j=1;j<=5;j++){
                    System.out.print(" ");
                }
                for(int j=6;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();*/
                    // piramid
                for (int i=0;i<6;i++){
                    for(int j=6-i;j>1;j--){
                        System.out.print(" ");
                    }
                    for( int j=0;j<=i;j++)  {
                    System.out.print("* ");
                }
                System.out.println();
                
                
            }

            for (int i=5;i>=0;i--){
                for(int j=i;j<6;j++){
                    System.out.print(" ");
                }
                for( int j=5;j>=6-i;j--)  {
                System.out.print("* ");
            }
            System.out.println();
            
            
        }
            
     }
}
    

