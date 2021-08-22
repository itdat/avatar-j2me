package avatar;



import avatar.ce;
import avatar.fxClass;
import javax.microedition.lcdui.Graphics;

final class bu extends Button {
   private final short f;

   bu(ce var1, String var2, ii var3, short var4) {
      super(var2, var3);
      this.f = var4;
   }

   public final void a(Graphics var1, int var2, int var3) {
      fxClass.a(var1, this.f, var2, var3, 3);
   }
}
