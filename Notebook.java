import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notebook {

    File file = new File("notebook.txt");

    public void writeToFile(String text) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write(text);
        }
    }



    public String readFromFile() throws IOException {
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            StringBuilder content = new StringBuilder();
            while (sc.hasNextLine()) {
                content.append(sc.nextLine()).append(System.lineSeparator());
            }
            if(content.length() > 0){
                content.setLength(content.length() - System.lineSeparator().length());
            }
            sc.close();
            return content.toString();
        }else return null;
    }

    public boolean deleteFile() {
        return file.delete();
    }

}