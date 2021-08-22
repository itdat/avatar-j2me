package avatar;



import javax.microedition.lcdui.Graphics;

final class gl extends Button {
   private final int f;

   gl(ei var1, String var2, int var3, int var4, int var5) {
      super(var2, 17, var4);
      this.f = var5;
   }

   public final void a(Graphics var1, int var2, int var3) {
      ir.c.a(this.f, var2 + 1, var3 + 1, 0, 3, var1);
   }
}
