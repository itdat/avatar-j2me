package avatar;

import javax.microedition.lcdui.Graphics;

public final class fa extends ld {

    public byte a;
    public byte b;
    public short[] c;
    public byte[] d;
    public byte[] e;

    public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
        if (super.g != -1) {
            if (super.g >= 2000) {
                f var6;
                if ((var6 = fxClass.b(this.c[var2])).d != -1) {
                    var1.drawRegion(var6.a, 0, 0, var6.b, var6.c, var5, var3 + this.d[var2] * gy.Y - (var5 == gx.J ? (this.d[var2] * gy.Y << 1) + var6.b : 0), var4 + this.e[var2] * gy.Y, 0);
                }
            } else {
                ke var7 = fxClass.a[this.c[var2]];
                fxClass.a(var1, var7.b, var7.c, var7.d, var7.e, var7.f, var3 + this.d[var2] * gy.Y - (var5 == gx.J ? (this.d[var2] * gy.Y << 1) + var7.e * gy.Y : 0), var4 + this.e[var2] * gy.Y, var5, 0);
            }
        }

    }
}
