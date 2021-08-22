package avatar;

import javax.microedition.lcdui.Graphics;

public final class ke {

    public short a;
    public short b;
    public short c;
    public short d;
    public short e;
    public short f;

    public final void a(Graphics var1, int var2, int var3, int var4) {
        int var10002 = this.c * gy.Y;
        int var10003 = this.d * gy.Y;
        int var10004 = this.e * gy.Y;
        int var10005 = this.f * gy.Y;
        var1.drawRegion(fxClass.a((int) this.b).e, var10002, var10003, var10004, var10005, 0, var2, var3, var4);
    }
}
