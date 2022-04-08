public class Pont {

 public String voile;
 public String volume;
 public static final int identifiant=3;
public Pont()
{
 this.voile="";
 this.volume="";
}
public Bateau(String voile, int volume,int identifiant)
{
 this.voile=voile;
 this.volume=volume;
}
public String getVoile() {
return voile;
} 
public void setVoile(String voile) {
 this.voile=voile;
}
public String getVolume() {
 return volume;
}
public void setVolume(int volume) {
 this.volume=volume;
}
}