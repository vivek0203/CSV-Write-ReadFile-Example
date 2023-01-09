import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {



    public static void main(String[] args) throws IllegalStateException, FileNotFoundException {
        try {
            Scanner sc = new Scanner(new File("sample.csv"));

            sc.useDelimiter(" ; ");   //sets the delimiter pattern
            while (sc.hasNext())  //returns a boolean value
            {
                System.out.print(sc.next());  //find and returns the next complete token from this scanner
            }
            sc.close();  //closes the scanner
        }finally {

        }
    }
}