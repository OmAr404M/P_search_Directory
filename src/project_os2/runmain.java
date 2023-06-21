package project_os2;

import java.io.IOException;

public class runmain {
    public static void runMethod() throws IOException, InterruptedException {
        FileManager.file_to_array();
        Rmethod.searchineachfile();
    }
    public static void runall(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simpe_JFrame().setVisible(true);
            }
        });
    }

}
