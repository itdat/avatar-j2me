package avatar;

import javax.microedition.lcdui.Graphics;

final class bz extends Button {
   private final dc f;

   bz(go var1, String var2, int var3, int var4, dc var5) {
      super(var2, 7, var4);
      this.f = var5;
   }

   public final void a(Graphics var1, int var2, int var3) {
      gb.b((int)this.f.a).a(var1, 7, var2, var3, 3);
   }
}
