import java.util.*;
public class duplicate{
    public static void main(String[] args) {
        System.out.println("Duplicate elements.");
        System.out.println("Enter the number of elements required:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the " +i+ "th element ");
            A[i]=sc.nextInt();    
        } 
        for(int i=0;i<n;i++){
            int counter=0;
            for(int j=0;j<n;j++){
                if(A[i]==A[j]){
                    counter++;
                }
            }
            System.out.println("The element " +A[i]+ " occured " +counter+ " times");
        }
        sc.close();
    }
}