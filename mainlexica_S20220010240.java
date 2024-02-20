
import java.util.Scanner;


public class mainlexica_S20220010240 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        Lexica lexica = new Lexica(strings);

        lexica.lexicographicalorder();
        String[] sortedLexicographical = lexica.get_sortedstrings();
        System.out.println("Lexicographical Order:");
        for (String str : sortedLexicographical) {
            System.out.println(str);
        }

        Lexica.reverselexicographical_order(sortedLexicographical);
        System.out.println("Reverse Lexicographical Order:");
        for (String str : sortedLexicographical) {
            System.out.println(str);
        }

        String smallestString = Lexica.lexicographicallySmallestString(sortedLexicographical);
        System.out.println("Lexicographically Smallest String: " + smallestString);

        scanner.close();

        
    }
}

class Lexica {
    private String[] Strings;
    public Lexica(String[] Strings) {
        this.Strings = Strings;
    }
    public void lexicographicalorder() {
        for(int i=0;i< Strings.length;i++){
            for(int j=i+1;j<Strings.length;j++){
                if(comp_strings(Strings[i],Strings[j])>0){
                    swapStrings(i,j);
                }
            }
        }
    }
    public static void reverselexicographical_order(String[] Strings){
        for(int i=0;i<Strings.length-1;i++){
            for(int j=i+1;j<Strings.length;j++){
                if(comp_strings(Strings[i],Strings[j])<0) {
                    swapStrings(Strings,i,j);
                }
            }
        }
    }
    public static String lexicographicallySmallestString(String[] Strings){
        String smallest = Strings[0];
        for(int i=1;i<Strings.length;i++){
            if(comp_strings(Strings[i],smallest)<0) {
                smallest = Strings[i];
            }
        }
        return smallest;
    }
    private static int comp_strings(String n,String m){
        int min_len = Math.min(n.length(),m.length());
        for(int i=0 ;i<min_len;i++){
            if(n.charAt(i)!=m.charAt(i)){
                return n.charAt(i)- m.charAt(i);
            }
        }
        return n.length() - m.length();
    }
    private void swapStrings(int a,int b) {
        String temp = Strings[a];
        Strings[a] = Strings[b];
        Strings[b] = temp;
    }

    private static void swapStrings(String[] arr,int i,int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public String[] get_sortedstrings(){
        return Strings;
    }
}
