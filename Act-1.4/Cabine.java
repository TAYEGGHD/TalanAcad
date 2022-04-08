public class Cabine {

 public int surface;
 public int numero;
 public static final int identifiant=4;
public Cabine()
{
 this.surface="";
 this.numero="";
}
public Bateau(int surface, int numero,int identifiant)
{
 this.surface=surface;
 this.numero=numero;
}
public int getSurface() {
return surface;
} 
public void setSurface(int surface) {
 this.surface=surface;
}
public int getNumero() {
 return numero;
}
public void setNumero(int numero) {
 this.numero=numero;
}
}