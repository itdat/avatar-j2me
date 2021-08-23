package avatar;



import javax.microedition.lcdui.Graphics;

final class iv extends Button {
   private final int f;

   iv(cd var1, String var2, Intent var3, int var4) {
      super(var2, var3);
      this.f = var4;
   }

   public final void a(Graphics var1, int var2, int var3) {
      le.f.a(this.f, var2, var3, 0, 3, var1);
   }
}
