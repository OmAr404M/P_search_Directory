package project_os2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class FileManager {
    public static int file_number;
    public static ArrayList<String>[] arrayOfArraylist;
    public static String[] files_name;
    public static String filepath;

    public static void file_to_array() throws IOException {

        File folder = new File(filepath);
        file_number=0;
        if(simpe_JFrame.incDir==0){
            for (File file : folder.listFiles()) {
                if (!file.isDirectory()) {
                    file_number++;
                }
            }
            files_name=new String[file_number];
            int ind=0;
            for (File file : folder.listFiles()) {
                if (!file.isDirectory()) {
                    files_name[ind]=file.getName();
                    ind++;
                }
            }

            arrayOfArraylist = new ArrayList[file_number];

            for (int i = 0; i < file_number; i++) {
                arrayOfArraylist[i] = new ArrayList<>();

            }

            int cnt=0;

            for (File file : folder.listFiles()) {

                if (!file.isDirectory()) {

                    BufferedReader reader =new BufferedReader(new FileReader(file));
                    String line;

                    while ((line= reader.readLine())!=null){
                        arrayOfArraylist[cnt].add(line);
                    }

                    cnt++;
                }
            }

        }
        else if (simpe_JFrame.incDir==1){



            for (File file : folder.listFiles()) {
                if (!file.isDirectory()) {
                    file_number++;
                }
                if (file.isDirectory()){
                    for (File subfile : file.listFiles()){
                        if (!subfile.isDirectory()) {
                            file_number++;
                        }
                    }
                }
            }
            files_name=new String[file_number];
            int ind=0;
            for (File file : folder.listFiles()) {
                if (!file.isDirectory()) {
                    files_name[ind]=file.getName();
                    ind++;
                }
                if (file.isDirectory()){
                    for (File subfile : file.listFiles()){
                        if (!subfile.isDirectory()) {
                            files_name[ind]=subfile.getName();
                            ind++;
                        }
                    }
                }
            }

            arrayOfArraylist = new ArrayList[file_number];

            for (int i = 0; i < file_number; i++) {
                arrayOfArraylist[i] = new ArrayList<>();

            }

            int cnt=0;

            for (File file : folder.listFiles()) {

                if (!file.isDirectory()) {

                    BufferedReader reader =new BufferedReader(new FileReader(file));
                    String line;

                    while ((line= reader.readLine())!=null){
                        arrayOfArraylist[cnt].add(line);
                    }

                    cnt++;
                }

                if (file.isDirectory()){
                    for (File subfile : file.listFiles()){
                        if (!subfile.isDirectory()) {
                            BufferedReader reader =new BufferedReader(new FileReader(subfile));
                            String line;

                            while ((line= reader.readLine())!=null){
                                arrayOfArraylist[cnt].add(line);
                            }

                            cnt++;
                        }
                    }
                }






            }

        }
    }
}
