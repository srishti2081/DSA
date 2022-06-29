import java.util.*;
//time complexity O(n)
public class Reverse_string {
    public static void revString(String s, int index){

        if(index==0){
            System.out.println(s.charAt(index));
            return;  
        }
        System.out.print(s.charAt(index));
        revString(s,index-1);
    }
 public static void main(String[] args) {
    String s="srishti";
    System.out.println("Original string =  " + s );
    System.out.print("Reversed string = ");
    revString(s,s.length()-1);
 }   
}
