public class Bateau {

 public String coque;
 public String cabine;
 public static final int identifiant=1;
public Bateau()
{
 this.coque="";
 this.cabine="";
}
public Bateau(String coque, String cabine,int identifiant)
{
 this.coque=coque;
 this.cabine=cabine;
}
public String getCoque() {
return coque;
} 
public void setCoque(String coque) {
 this.coque=coque;
}
public String getCabine() {
 return cabine;
}
public void setCabine(String cabine) {
 this.cabine=cabine;
}
}
