import java.util.*;
public class Reversearray {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       
    int a[] = new int[n];
  
    for (int i = 0; i < a.length; i++){
        a[i]= sc.nextInt();
    }
    int first=a[0];
    int last=a[n-1];
  
    int temp = a[first];
    a[first]=a[last];
    a[last]=temp;
    
    first++;
    last--;

      
      
      sc.close();
      
  }  
}
