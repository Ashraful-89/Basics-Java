public class JavaCommandLine {

    // Here Input take from commond line any String like number , name etc and how to run java proggra in cmd is below
    // javac JavaCommandLine.java
    // java JabaCommandLine 1 3 4
    // output : 1 2 3

    public static void main(String[] args) {
        for(String s : args){
            System.out.println(s);
        }
    }
}
