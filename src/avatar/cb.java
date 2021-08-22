package avatar;

import javax.microedition.lcdui.Graphics;

public final class cb {

    public String a;
    public short b;
    public short[] c;
    public byte[] d;
    public short e;
    public short f = -1;
    public short[] g = new short[2];
    public short h;
    public short i;
    public short j;
    public String k;
    public boolean l = false;
    public byte m = 1;

    public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
        if (this.l) {
            gb.a(var1, this.c[var2], var3, var4, var5);
        } else {
            ke var10000 = gb.a[this.c[var2]];
            Graphics var7 = var1;
            ke var6 = var10000;
            var7.drawRegion(gb.images[var6.b], var6.c * gy.Y, var6.d * gy.Y, var6.e * gy.Y, var6.f * gy.Y, 0, var3, var4, var5);
        }
    }
}
