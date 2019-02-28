import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String args[]){
        String s;
        Process p;

        try{
            p = Runtime.getRuntime().exec("hostnamectl");
            p.waitFor();
            BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = " ";
            String output = "";
            while((b.readLine() != null)){
                line = b.readLine();
                output += line + "\n";
            }

            System.out.println(output);
        }catch(Exception e){

        }
    }
}
