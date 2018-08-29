package DefaultSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead{
      static void readNumbersFromFile() {
        try {

            String line = null;
            FileReader fileReader = new FileReader(Data.filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Data.sortChange.add(bufferedReader.readLine());

          while ((line = bufferedReader.readLine()) !=null){
              Data.numberList.add(Integer.parseInt(line));
          }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}