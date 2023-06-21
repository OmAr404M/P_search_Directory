package project_os2;

import java.util.ArrayList;

public class SearchClasss {
    public static String longestWord;
    public static String shortestWord;

    public static String searchShortest(ArrayList<String> searchField){
        String shortestWord=searchField.get(0);
        for (int i = 1;i < searchField.size();i++)
        {
            if (searchField.get(i).length() < shortestWord.length()){
                shortestWord = searchField.get(i);
            }
        }
        return shortestWord;
    }


    public static String searchlongest(ArrayList<String> searchField){
        String longestWord = searchField.get(0);
        for (int i = 1;i < searchField.size();i++)
        {
            if (searchField.get(i).length() > longestWord.length()){
                longestWord = searchField.get(i);
            }
        }
        return longestWord;
    }


    public static int searchIs(ArrayList<String> searchField){
        int isNum=0;
        for (int i = 0;i < searchField.size();i++){
            if (searchField.get(i).equals("is")){
                isNum++;
            }
        }
        return isNum;

    }
    public static int searchAre(ArrayList<String> searchField){
        int areNum=0;
        for (int i = 0;i < searchField.size();i++){
            if (searchField.get(i).equals("are")){
                areNum++;
            }
        }
        return areNum;

    }
    public static int searchYou(ArrayList<String> searchField){
        int youNum=0;
        for (int i = 0;i < searchField.size();i++){
            if (searchField.get(i).equals("you")){
                youNum++;
            }
        }
        return youNum;

    }

    public static void longestInDir(){
        longestWord=FileManager.arrayOfArraylist[0].get(0);
        shortestWord=FileManager.arrayOfArraylist[0].get(0);
        for (int i=0;i<FileManager.file_number;i++)
        {
            for (int j=0;j<FileManager.arrayOfArraylist[i].size();j++){
                if (i==0 && j==0){
                    continue;
                }
                if (longestWord.length()<FileManager.arrayOfArraylist[i].get(j).length()){
                    longestWord=FileManager.arrayOfArraylist[i].get(j);
                }
                else if(longestWord.length()==FileManager.arrayOfArraylist[i].get(j).length()){
                    if(longestWord.compareTo(FileManager.arrayOfArraylist[i].get(j))<0)
                    {
                        longestWord=FileManager.arrayOfArraylist[i].get(j);
                    }
                }
                if (shortestWord.length()>FileManager.arrayOfArraylist[i].get(j).length()){
                    shortestWord=FileManager.arrayOfArraylist[i].get(j);
                }
                else if(shortestWord.length()==FileManager.arrayOfArraylist[i].get(j).length()){
                    if(shortestWord.compareTo(FileManager.arrayOfArraylist[i].get(j))>0)
                    {
                        shortestWord=FileManager.arrayOfArraylist[i].get(j);
                    }
                }
            }
        }
    }

    public static int numbrOfWord(ArrayList<String> searchField){
        return searchField.size();
    }
}
