//Praktikum 10

package Praktikum.Praktikum10.bin;

public class Kopi extends Minuman
{
private boolean berKafein;
public Kopi()
{
super.setNama("Kopi");
super.setRasa("Pahit");
super.setWarna("Hitam");
super.setBersoda(false);
this.berKafein = true;
}
public boolean isBerkafein()
{
return berKafein;
}
public void setBerkafein(boolean berKafein)
{
this.berKafein = berKafein;
}
}