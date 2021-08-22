package avatar;

import javax.microedition.lcdui.Graphics;

public final class lb extends ld {

    public short a;

    public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
        fa var6 = (fa) fxClass.a(super.f);
        if (super.h == var6.c[0]) {
            ke var7 = fxClass.a[var6.c[0]];
            int var10002 = var7.c * gy.Y;
            int var10003 = var7.d * gy.Y;
            int var10004 = var7.e * gy.Y;
            int var10005 = var7.f * gy.Y;
            var1.drawRegion(fxClass.a((int) this.a).e, var10002, var10003, var10004, var10005, 0, var2, var3, var5);
        } else {
            var6.a(var1, var2, var3, var5);
        }
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
        fa var6 = (fa) fxClass.a(super.f);
        ke var7 = fxClass.a[var6.c[var2]];
        fxClass.a(var1, this.a, var7.c, var7.d, var7.e, var7.f, var3 + var6.d[var2] * gy.Y - (var5 == gx.J ? (var6.d[var2] * gy.Y << 1) + var7.e * gy.Y : 0), var4 + var6.e[var2] * gy.Y, var5, 0);
    }
}
