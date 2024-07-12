import java.util.*;
public class Merging_2 {
    public static void main(String [] args){
        String word1="abcdlmnop";
        String word2="efgxyz";
        /*  If one word is longer than the other it gets the larger word to 
        the same amount of characters and sorts it and puts the rest 
        at the end of the merged word*/
        if(word1.length()==word2.length()){
            String answer1= LexoMerging(word1,word2);
            System.out.println(Sorting(answer1));
        }
        else if(word1.length()>word2.length()){
            String answer2= LexoMerging(word1.substring(0, word2.length()),word2);
            answer2+=word1.substring(word2.length());
            System.out.println(Sorting(answer2));
        }
        else{
            String answer3 = LexoMerging(word1, word2.substring(0, word1.length()));
            answer3+=word2.substring(word1.length());
            System.out.println(Sorting(answer3));
        }

    }
    public static String LexoMerging(String s1,String s2)
    {
        String res= "";//Initialize an empty string
        for(int i=0;i<s1.length();i++)//Iterate over each character position in the strings
        {
            res+=s1.charAt(i);//Append each character to the result
            res+=s2.charAt(i);
        }
        return res;//Return result
    }

    public static String Sorting(String input){
        char [] charArray = input.toCharArray();//Convert the input to a character array
        Arrays.sort(charArray);//Sort the character array in ascending order
        return new String(charArray);//Convert the sorted character array back to a string
    }
}
