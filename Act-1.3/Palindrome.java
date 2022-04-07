import java.util.Scanner;
public class Palindrome {
public static void main(String args[]) {
  System.out.print("Entrez un mot : ");
       String original = scanner.nextLine();

       String test = original.toLowerCase();
       String allowedList = "abcdefghijklmnopqrstuvwxyz";
       String temp = "";
        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (allowedList.indexOf(c) != -1) {
                temp += c;
            }
        }
        test = temp;
        int x = 0;
        int y = test.length()-1;
        while (y>x && tab[x]==tab[y]){
            x++;
            y--;
        }
        if (y<=x)
        System.out.println("votre chaine est palindrome");
        else
        System.out.println("votre chaine n'est pas palindrome");
    }
        
}

