package avatar;

import javax.microedition.lcdui.Graphics;

final class jl extends Button {

    private final byte[] f;
    private final int g;

    jl(cd var1, String var2, int var3, int var4, byte[] var5, int var6) {
        super(var2, 19, var4);
        this.f = var5;
        this.g = var6;
    }

    public final void a(Graphics var1, int var2, int var3) {
        fa var4;
        (var4 = (fa) fxClass.a((short) 0)).a(var1, var2 + 2 + var4.d[0] * gy.Y, var3 + 21 + 20 * (gy.Y - 1) + var4.e[0] * gy.Y, 0);
        (var4 = (fa) fxClass.a((short) this.f[this.g])).a(var1, var2 + 2 + var4.d[0] * gy.Y, var3 + 21 + 20 * (gy.Y - 1) + var4.e[0] * gy.Y, 0);
    }
}
