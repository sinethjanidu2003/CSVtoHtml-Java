import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Table {

    private FileWriter fileWriter;
    private Scanner scanner;
    private StringBuilder stringBuilder;

    public Table(FileWriter fileWriter) throws IOException {
        this.fileWriter = fileWriter;
        stringBuilder = new StringBuilder();
    }

    public void writeHead() throws IOException {
        stringBuilder.append("<html><head>" +
                "<link href='style.css' rel='stylesheet'/>" +
                "</head><body>\n");
    }

    public void writeFooter() throws IOException {
        stringBuilder.append("</body></html>\n");
        this.fileWriter.write(stringBuilder.toString());
    }

    public void createTable(int Coloums) throws IOException {
        stringBuilder.append("<h2>Sample Table</h2></br>");
        stringBuilder.append("<table>\n");
        stringBuilder.append("<tr>\n");
        //Heading
        stringBuilder.append("<th>\n");
        stringBuilder.append("Id\n");
        stringBuilder.append("</th>\n");
        stringBuilder.append("<th>\n");
        stringBuilder.append("Heading\n");
        stringBuilder.append("</th>\n");
        stringBuilder.append("</tr>\n");


        for (int i = 1;i <= Coloums; i++){
            stringBuilder.append("<tr>\n");
            stringBuilder.append("<td>\n");
            stringBuilder.append(i).append("\n");
            stringBuilder.append("</td>\n");
            stringBuilder.append("<th>\n");
            stringBuilder.append("Heading\n");
            stringBuilder.append("</th>\n");
            stringBuilder.append("</tr>\n");

        }
        stringBuilder.append("</table>\n");


    }



    public void createTableFromCSV(String fileName,String Title) throws IOException {
        //Convert into File
        File file = new File(fileName);
        scanner = new Scanner(file);
        stringBuilder.append("<h2>" + Title +"</h2></br>");
        stringBuilder.append("<table>\n");



        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            String[] data = line.split(",");
            stringBuilder.append("<tr>\n");
            for (String element : data) {
                stringBuilder.append("<th>\n");
                stringBuilder.append(element);
                stringBuilder.append("</th>\n");
            }
            stringBuilder.append("</tr>\n");
        }
        stringBuilder.append("</table>\n");

    }


    @Override
    protected void finalize() throws Throwable {
        scanner.close();
        super.finalize();
    }
}
