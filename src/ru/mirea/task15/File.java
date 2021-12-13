package ru.mirea.task15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = in.nextLine();
        try(FileWriter writer = new FileWriter("C:\\Users\\Руслан\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt", false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Your text: ");
        try(FileReader reader = new FileReader("C:\\Users\\Руслан\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
            System.out.print("\n");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Input text: ");
        text = in.nextLine();
        try(FileWriter writer = new FileWriter("C:\\Users\\Руслан\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt", false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Append text: ");
        text = in.nextLine();
        try(FileWriter writer = new FileWriter("C:\\Users\\Руслан\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt", true))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
