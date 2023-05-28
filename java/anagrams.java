import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {
    // Complete the function
    if(a.length() == b.length()){
        
    
        a=a.toUpperCase();
        b=b.toUpperCase();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        char temp;
        for(int i=0;i<ch1.length;i++){
            for(int j=i+1;j<ch1.length;j++){
                if(ch1[i]>ch1[j]){
                    temp =  ch1[i];
                    ch1[i] =ch1[j];
                    ch1[j] = temp; 
                }
            }
        }
        for(int i=0;i<ch2.length;i++){
            for(int j=i+1;j<ch2.length;j++){
                if(ch2[i]>ch2[j]){
                    temp =  ch2[i];
                    ch2[i] =ch2[j];
                    ch2[j] = temp; 
                }
            }
        }
        //System.out.println(ch1);
        //System.out.println(ch2);
        
        //int[] charcounta = new int[ch1.length];
        for (int i = ch1.length - 1; i >= 0; i--)   
        {  
            if(ch1[i]!=ch2[i]){
                return false;
            }else{
                continue;
            }
            
        }  
        return true;
    }
    return false;
}
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}