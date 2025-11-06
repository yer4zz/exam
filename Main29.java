//Практика: написать программу, которая открывает файл и корректно закрывает его в finally.


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main29 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            File file = new File("example.txt");
            fileReader = new FileReader(file);
            
        } catch (IOException e) {
            System.out.println("Ошибка при открытии файла: " + e.getMessage());
        } finally {

            if (fileReader != null) {
                try {
                    fileReader.close();
                    System.out.println("Файл успешно закрыт.");
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }
    }
}
