package avatar;



import avatar.gy;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class al {
   public byte[] a;
   public ke[] b;
   public Image c;
   public jf[] d;
   public short e;

   public final void a(Graphics var1, int var2, int var3, int var4) {
      jf var9 = this.d[this.a[var4]];

      for(int var5 = 0; var5 < var9.b.length; ++var5) {
         byte var7 = var9.a[var5];
         al var6 = this;

         ke var10000;
         label23: {
            for(int var8 = 0; var8 < var6.b.length; ++var8) {
               if (var6.b[var8].a == var7) {
                  var10000 = var6.b[var8];
                  break label23;
               }
            }

            var10000 = null;
         }

         ke var10 = var10000;
         var1.drawRegion(this.c, var10.c * gy.Y, var10.d * gy.Y, var10.e * gy.Y, var10.f * gy.Y, 0, var2 * gy.Y + var9.b[var5] * gy.Y, var3 * gy.Y + var9.c[var5] * gy.Y, 0);
      }

   }
}
