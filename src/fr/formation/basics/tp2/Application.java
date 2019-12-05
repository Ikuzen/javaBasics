package fr.formation.basics.tp2;

public class Application {
    public static void main(String[] args) {
        String Java = "blablabla";
        System.out.println(countChars(Java,'a'));
    }
    public static int countChars(String src, char value){
        int occurence = 0;
        for(int i=0; i< src.length(); i++){
            if(src.charAt(i) == value){
                occurence++;
            }
        }

        return occurence;
    }
}
