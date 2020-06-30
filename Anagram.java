import java.util.*;

public class Anagram{
    public static void main(String [] ak){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        
        System.out.print("\nEnter String 1: ");
        String s1 = scan.nextLine();
        
        System.out.print("Enter String 2: ");
        String s2 = scan.nextLine();
        
        String s1temp = s1.replaceAll("\\s", "");
        String s2temp = s2.replaceAll("\\s", "");
        
        if(s1temp.length() != s2temp.length()) flag = false;
        
        else{
            char []s1arr = s1temp.toLowerCase().toCharArray();
            char []s2arr = s2temp.toLowerCase().toCharArray();

            Arrays.sort(s1arr);
            Arrays.sort(s2arr);
            
            flag = Arrays.equals(s1arr,s2arr);
        }
            
        if(flag){
            System.out.println("\n"+s1+" and "+s2+" are Anagrams");
        }
        else{
            System.out.println("\n"+s2+" and "+s2+" are not Anagrams");
        }
    }
}