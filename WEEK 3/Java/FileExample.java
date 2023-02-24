import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class SmapleFile {
    public static void main(String[] args) {
        File obj=new File("D:\\royal.txt");
        FileOutputStream objFileOutputStream=null;
        FileInputStream objFileInputStream=null;
        int ch;
        byte cities[]={'a','h','d','m','u','m'};
        try{
            objFileOutputStream=new FileOutputStream(obj);
            objFileOutputStream.write(cities);
            objFileOutputStream.close();
            objFileInputStream=new FileInputStream(obj);
            while ((ch=objFileInputStream.read())!=-1){
                System.out.println((char)ch);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                objFileOutputStream.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
