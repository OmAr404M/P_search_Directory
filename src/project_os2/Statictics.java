package project_os2;

public class Statictics implements Runnable {
    String[] text;

    Statictics(String text_file){
        text = text_file.toLowerCase().split(" ");
    }

    @Override
    public void run() {
        String longestWord = "";
        String shortestWord = "klfsnvxnfvnzx";
        int no_of_is = 0;
        int no_of_are = 0;
        int no_of_you = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i].length() > longestWord.length()) {
                longestWord = text[i];
            }
            if (text[i].length() < shortestWord.length()) {
                shortestWord = text[i];
            }
            if (text[i].equals("is")) {
                no_of_is++;
            }
            if (text[i].equals("are")) {
                no_of_are++;
            }
            if (text[i].equals("you")) {
                no_of_you++;
            }
            System.out.println(longestWord);
            System.out.println(shortestWord);
            System.out.println(no_of_is);
            System.out.println(no_of_are);
            System.out.println(no_of_you + "\n\n");

        }
    }

    public static void main(String[] args){
        String s = "iam redwan. i am is you you is are";//hyb2a el text file makanha

        Statictics w = new Statictics(s);

        Thread t1 = new Thread(w);

        t1.start();
    }
}
