package project_os2;

import java.io.IOException;
import java.util.ArrayList;

public class Rmethod {

    public static threadingFiles[] fileindex;
    public static ArrayList<Thread> arrTHreads = new ArrayList();



    public static void searchineachfile() throws InterruptedException {
        fileindex = new threadingFiles[FileManager.file_number];

        for (int i=0;i<FileManager.file_number;i++)
        {
            fileindex[i]=new threadingFiles(FileManager.arrayOfArraylist[i]);
        }

        for (int i=0;i<FileManager.file_number;i++)
        {
            Thread t=new Thread(fileindex[i]);
            t.start();
            arrTHreads.add(t);
        }

        for (int i = 0; i < arrTHreads.size(); i++)
        {
            arrTHreads.get(i).join();
        }


    }




}
