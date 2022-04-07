import java.util.Scanner;
public class Calcul{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a,b;
double f = 1;
System.out.println("Veuillez saisir la valeur de a : ");
a = scanner.nextInt();
System.out.println("Veuillez saisir la valeur de b : ");
b = scanner.nextInt();
int somme = a+b;
if (a < b) {
if (b!=0 & b!=1) {
for (int i =1 ; i<b+1 ; i++) {
f=f*i; }
} else
{f=1 ;}
} else { for (int i =2 ; i<a+1 ; i++) {
f=f*i; }
}
System.out.println("la Somme des deux entiers est : " + somme);
System.out.println("la factorielle est : " + f);
}
}