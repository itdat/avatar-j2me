package avatar;



import javax.microedition.lcdui.Graphics;

public abstract class gz {
   public boolean b = false;
   public short c = -1;

   public abstract void b();

   public abstract void a(Graphics var1);

   public final void c() {
      main.GameGraphic.B.addElement(this);
   }

   public void a() {
      main.GameGraphic.B.removeElement(this);
   }
}
