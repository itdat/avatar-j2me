package avatar;

import javax.microedition.lcdui.Graphics;

final class hg extends Button {
   private az f;

   public hg(go var1, String var2, ii var3, az var4) {
      super(var2, var3);
      this.f = var4;
   }

   public hg(go var1, String var2, int var3, int var4, az var5) {
      super(var2, 6, var4);
      this.f = var5;
   }

   public final void a(Graphics var1, int var2, int var3) {
      this.f.a(var1, var2, var3, 0, 3);
   }
}
