package avatar;

import javax.microedition.lcdui.Graphics;

public abstract class ld {

    public short f;
    public short g;
    public short h;
    public int[] i = new int[2];
    public byte j;
    public byte k;
    public String l;

    public final void a(Graphics var1, int var2, int var3, int var4) {
        if (this.g != -1) {
            if (this.g >= 2000) {
                Graphics var10001 = var1;
                int var6 = var4;
                boolean var7 = false;
                int var5 = var3;
                var4 = var2;
                short var9 = this.h;
                Graphics var8 = var10001;
                f var10;
                if ((var10 = fxClass.b(var9)).d != -1 || this.g == -1) {
                    var8.drawRegion(var10.a, 0, 0, var10.b, var10.c, 0, var4, var5, var6);
                }
                return;
            }
            fxClass.a[this.h].a(var1, var2, var3, var4);
        }
    }

    public void b(Graphics var1, int var2, int var3, int var4, int var5) {
        this.a(var1, var2, var3, var5);
    }

    public void a(Graphics var1, int var2, int var3, int var4, int var5) {
    }
}
