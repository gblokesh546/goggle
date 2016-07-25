
package tcsdrinks;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.A;


public class Tcsdrinks {

    public static void main(String[] args) {
       int i=0,flag=0;
        Scanner s=new Scanner(System.in);
       int N=s.nextInt();
       int A[]=new int[N];
       for(i=0;i<N;i++){
           A[i]=s.nextInt();
       }
       int X=s.nextInt();
       for(int j=0;j<N;j++){
           for(i=1;i<N;i++){
               for(int k=2;k<N;k++){
                   if(i==j||j==k||k==i)
                       continue;
          else if((A[j]+A[i]+A[k])==X)
               flag=flag+1;
               
       }
    }
       }
 if(flag>0)
     System.out.println("True");
 else
     System.out.println("False");
}
}
