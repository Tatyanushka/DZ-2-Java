
public class Homework2 {

    
    public static void main(String[] args) {
        String str1 = "mom was washing the frame";
        String str2 = "washing the frame";
        System.out.println(str1);
        System.out.println(str2);
        // System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));

        System.out.println(str1.contains(str2));

        //проверить, являются ли две данные строки вращением друг друга.
        if(checkForRotation(str1, str2)) {
            System.out.println("Строка "+str2+" существует в новой строке");
            System.out.println("\nСтроки являются вращением друг друга");
        }
        else
        {
            System.out.println("Строка "+str2+" не существует в новой строке");
            System.out.printf("\nСтроки не являются вращением друг друга\n");

        }
        
        //переворот строк
        System.out.println(reverseString(str1, str1.length()-1));
        System.out.printf(reverseString(str2, str2.length()-1));
    }

    
    static boolean checkForRotation (String str1, String str2)
    {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
    

    public static String reverseString(String str, int index) {
        if(index == 0){
            return str.charAt(0) + "";
        }
  
        char letter = str.charAt(index);
        return letter + reverseString(str, index-1);
    }

}