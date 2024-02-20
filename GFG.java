

import java.io.*;
class GFG {
    public static void main(String[] args){
        FileReader file = new FileReader("c:\\test\\a.txt");
        BufferedReader fileInput  = new BufferedReader(file);

        for(int counter =0;counter<3;counter++) {
             System.out.println(fileInput.readLine());

            fileInput.close();
        
    }
}
}