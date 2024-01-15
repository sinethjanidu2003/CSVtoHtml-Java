import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Week 2 - Java Monday Class
 */
public class Main {
    static FileWriter fileWriter;
    public static void main(String[] args) {

        try {
            fileWriter = new FileWriter("assets/index.html");
            Table table = new Table(fileWriter);
            table.writeHead(); //This should always be called
            table.createTableFromCSV("assets/sports.csv","Sports Data");
            table.createTable(15);
            table.writeFooter();
            fileWriter.close();

        } catch (IOException e) {
            //Failed to create the file
            throw new RuntimeException("Failed to create the html File",e);
        }

    }
}