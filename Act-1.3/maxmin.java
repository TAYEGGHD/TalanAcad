import java.util.Scanner;
public class maxmin{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int x;
int n1;
System.out.println("Entrez la longueur de tableau1 : " );
n1 = scanner.nextInt();
String []tab1;
tab1 = new int[n1];
for( i=0 ; i < tab1.length ; i++ ) {

    System.out.println("Entrer l'élément" + i);
    tab1[i]=Lire.i();
}
int n2;
System.out.println("Entrez la longueur de tableau2 : " );
n2 = scanner.nextInt();
String []tab2;
tab2 = new int[n2];
for( j=0 ; j < tab1.length ; j++ ) {

    System.out.println("Entrer l'élément" + j);
    tab1[j]=Lire.j();
}
int i;
max1 = tab1[0];
for (int i = 1; i<table.length; i++){
  if (tab1[i] > max1){
    max = tab1[i];
  }
}
Terminal.ecrireStringln("max1: " + max1);
int j;
max2 = tab2[0];
for (int j = 1; j<table.length; j++){
  if (tab1[j] > max2){
    max = tab2[j];
  }
}
Terminal.ecrireStringln("max2: " + max2);

boolean estLa = false;
System.out.println("Entrez x : " );
n = Terminal.lireInt();
for (int i = 0; i<tab.length; i++){
if (tab[i] == n){
estLa = true;
}
}
if (estLa) {
 Terminal.ecrireStringln("True");
}else{
 Terminal.ecrireStringln("False");
}
}
}


