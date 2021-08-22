package avatar;



import javax.microedition.lcdui.Image;

public final class f {
   public Image a;
   public short b;
   public short c;
   public int d = -1;

   public f() {
   }

   public f(Image var1) {
      this.a = var1;
      this.d = 0;
      this.b = (short)var1.getWidth();
      this.c = (short)var1.getHeight();
   }
}
