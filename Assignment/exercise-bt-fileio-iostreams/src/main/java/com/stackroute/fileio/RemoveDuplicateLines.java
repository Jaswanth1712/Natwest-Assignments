package com.stackroute.fileio;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLines {
    //write logic to read data from input.txt and  write result to output.txt
    public void removeDuplicateLines() throws IOException {
        Set<String> unique=new HashSet<>();

        try(BufferedReader reade=new BufferedReader(new FileReader("input.txt"))){
            String s;
            while((s=reade.readLine())!=null){
                unique.add(s.trim());
            }
        } catch (IOException e){
            e.printStackTrace();
        }



        try(PrintWriter write=new PrintWriter(new FileWriter("output.txt"))){

            for(String temp:unique){
                write.println(temp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
