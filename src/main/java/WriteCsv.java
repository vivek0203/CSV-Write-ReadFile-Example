
import com.opencsv.CSVWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.StrRegEx;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class WriteCsv {
    private static final String  CSV_file_path = "sample.csv";
    private static Logger logger = LoggerFactory.getLogger(WriteCsv.class);

    public static void main(String[] args) {
        addDataToCSV(CSV_file_path);
    }
    public static void addDataToCSV(String output){
        File file = new File(output);
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter newFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(newFile,'|',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            List<String[]> data = new ArrayList<String[]>();

            logger.info("Enter number of rows ");
            int noOfRow = Integer.parseInt(sc.next());

            logger.info("Enter Data ");
            for (int i =0;i<=noOfRow;i++){
                String row = sc.nextLine();
                String[] rowData = row.split("  ");
                data.add(rowData);

            }
            writer.writeAll(data);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
