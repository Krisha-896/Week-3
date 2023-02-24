import java.util.Locale;
import java.util.Scanner;

public class SampleString {
    public static void main(String[] args) {
        StringBuffer strBuf1=new StringBuffer("royal");
        Scanner obj=new Scanner(System.in);
        System.out.println(strBuf1.capacity());//16
        strBuf1.append('t');
        String str="patel-@-gmail-com";
        String str3="royal";
        String str4="ROYAL";
        String str2[]=str.split("-");
        for (int i=0;i<str2.length;i++){
            System.out.println("This is the string "+str2[i]+" and length of it is"+str2[i].length());

        }
        String str1=new String("krisha");
        System.out.println("Enter the string");
        str1=obj.next();
        System.out.println("str3.equals(str4);"+str3.equals(str4));
        System.out.println("str3.equalsIgnoreCase(str4)"+str3.equalsIgnoreCase(str4));
        System.out.println("str3.compareTo(str4)"+str3.compareTo(str4));
        System.out.println("str3.compareToIgnoreCase(str4)"+str3.compareToIgnoreCase(str4));
        System.out.println("str3.charAt(0)"+str3.charAt(0));
        System.out.println("str4.indexOf(\"R\")"+str4.indexOf("R"));
        System.out.println("str3.toUpperCase()"+str3.toUpperCase());
        System.out.println("str3.toLowerCase()"+str3.toLowerCase());
        System.out.println("str3.substring(2)"+str3.substring(2));
        System.out.println("str3.substring(1,4)"+str3.substring(1,4));
        str3=str3.concat(str4);
        StringBuffer strBuf=new StringBuffer(str3);
        String str5=strBuf.reverse().toString();
        if (str3.equals(str5)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
