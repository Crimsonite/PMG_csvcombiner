import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class csv_combiner {
    public static void main(String[] args) throws IOException
    {
      for (int i = 0; i < args.length; i++) {
        File f = new File(args[i]);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String row = br.readLine();
        if (i == 0) //Columns to be Added
          System.out.println(row + ',' + "\"" + "filename" + "\"");
        row = br.readLine();
        while (row != null) {
          System.out.println(row + ',' + "\"" + f.getName() + "\"");
          row = br.readLine();
        }
        br.close();
      }
    }
}