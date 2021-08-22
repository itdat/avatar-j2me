package avatar;

import javax.microedition.lcdui.Graphics;

public final class kq extends cc {

    public short a;
    public short b;
    public byte c;
    public boolean d = false;

    public kq() {
    }

    public kq(int var1, int var2, int var3, int var4, short var5) {
        super.f = (byte) var1;
        super.aw = var2;
        super.ax = var3;
        this.a = (short) var4;
        this.b = var5;
    }

    public final void a(Graphics var1) {
        ag var2;
        if (this.d) {
            var2 = ir.f(this.b);
        } else {
            var2 = fxClass.b((int) this.b);
        }

        int var4;
        boolean var6;
        Graphics var8;
        Graphics var10001;
        int var10003;
        int var10004;
        if (!this.d && ir.a != 68 && ir.a != 69 && ir.a != 70 && ir.a != 110) {
            ke var10 = fxClass.a[var2.b];
            if ((super.aw + var2.e + var10.e) * js.ay >= do1.a().a && (super.aw + var2.e - var10.e) * js.ay <= do1.a().a + main.GameGraphic.width && (super.ax + var10.f) * js.ay >= do1.a().b && (super.ax + var2.f - var10.f) * js.ay <= do1.a().b + main.GameGraphic.height) {
                ke var10000 = var10;
                var10001 = var1;
                int var10002 = (super.aw + var2.e) * js.ay;
                var10003 = (super.ax + var2.f) * js.ay;
                var6 = false;
                byte var12 = this.c;
                var4 = var10003;
                int var11 = var10002;
                var8 = var10001;
                ke var7 = var10000;
                var10002 = var7.c * gy.Y;
                var10003 = var7.d * gy.Y;
                var10004 = var7.e * gy.Y;
                int var10005 = var7.f * gy.Y;
                var8.drawRegion(fxClass.a((int) var7.b).e, var10002, var10003, var10004, var10005, var12, var11, var4, 0);
            }
        } else {
            var10001 = var1;
            var10003 = (super.aw + var2.e) * js.ay;
            var10004 = (super.ax + var2.f) * js.ay;
            var6 = false;
            int var5 = var10004;
            var4 = var10003;
            short var3 = var2.b;
            var8 = var10001;
            f var9 = fxClass.c(var3);
            if (var4 + var9.b >= do1.a().a && var4 <= do1.a().a + main.GameGraphic.width && var5 + var9.c >= do1.a().b && var5 <= do1.a().b + main.GameGraphic.height) {
                if (var9.d != -1) {
                    var8.drawRegion(var9.a, 0, 0, var9.b, var9.c, this.c, var4, var5, 0);
                }

            }
        }
    }

    public final void b() {
    }
}
