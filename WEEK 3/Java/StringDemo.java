import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the paragraph");
        str=obj.nextLine();
        //System.out.println("you entered "+str);
        String str1[]=str.split(" ");
        for (int i=0;i<str1.length;i++){
            System.out.println("This is the string "+str1[i]+" and length of it is"+" "+str1[i].length());
            StringBuffer strBuf=new StringBuffer(str);
            String str2=strBuf.reverse().toString();

        }
        System.out.println("Total number of words in para is "+str1.length);
        StringBuffer strBuf=new StringBuffer(str);
        String str2=strBuf.reverse().toString();
        for (int j=0;j<str2.length();j++) {
            if (str.equals(str2)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }
}
