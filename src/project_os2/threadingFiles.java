package project_os2;

import java.util.ArrayList;

public class threadingFiles implements Runnable{
    public String shrt;
    public String lng;
    public int is;
    public int are;
    public int you;
    public int wrdnum;

    ArrayList<String> filesearch;



    threadingFiles (ArrayList<String> filesearch){
        this.filesearch=filesearch;
    }

    @Override
    public void run() {
        shrt=SearchClasss.searchShortest(filesearch);
        lng=SearchClasss.searchlongest(filesearch);
        is=SearchClasss.searchIs(filesearch);
        are=SearchClasss.searchAre(filesearch);
        you=SearchClasss.searchYou(filesearch);
        wrdnum=SearchClasss.numbrOfWord(filesearch);
    }
}
