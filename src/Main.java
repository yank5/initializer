import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("/usr/bin/java", "-classpath", "/home/aru/IdeaProjects/backgroundtask/out/production/backgroundtask/", "Main");
        processBuilder.inheritIO();
        var proc = processBuilder.start();

//        Scanner scanner=new Scanner(System.in);
//        if(scanner.nextInt()==1){
//            proc.destroy();
//        }
    }
}