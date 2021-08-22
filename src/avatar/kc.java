package avatar;

import javax.microedition.lcdui.Graphics;

public final class kc extends cc {

    public short a;
    public short b;
    public short c;
    public short d;
    public int e;
    private int k = 0;
    private int l = 0;
    public long h;
    public byte[] i;
    public byte[] j;

    public final void b() {
        if (System.currentTimeMillis() - this.h >= 1000L) {
            if (this.e > 0) {
                --this.e;
                if (this.e == 0) {
                    it var1;
                    (var1 = it.a()).e((byte) 83);
                    var1.k();
                }
            }

            this.h = System.currentTimeMillis();
            f var4 = gb.a(this.b);
            if (var4.b > 0 && this.k == 0) {
                this.k = var4.b / 3 << 1;
                this.l = var4.c / 2;
                kc var5 = this;
                if (this.d > 0) {
                    int var2 = awClass.e(3) + 3;
                    this.i = new byte[var2];
                    this.j = new byte[var2];

                    for (int var3 = 0; var3 < var2; ++var3) {
                        var5.i[var3] = (byte) (awClass.e(var5.k - 10) - (var5.k - 10) / 2);
                        var5.j[var3] = (byte) (awClass.e(var5.l - 10) - (var5.l - 10) / 2);
                    }
                }
            }
        }
    }

    public final void a(Graphics var1) {
        if (super.f >= 0 || super.aw * js.ay + this.k / 2 >= do1.a().a && super.aw * js.ay - this.k / 2 <= do1.a().a + main.GameGraphic.width) {
            gb.a(var1, this.b, super.aw * js.ay, super.ax * js.ay, 33);
            int var2;
            if (this.d > 0 && this.i != null) {
                for (var2 = 0; var2 < this.i.length; ++var2) {
                    gb.a(var1, this.c, super.aw * js.ay + this.i[var2], super.ax * js.ay - (gb.a(this.b).c / 2 + 5) + this.j[var2], 3);
                }
            }

            var2 = gb.a(this.b).c + gy.ag;
            if (this.e > 0) {
                var2 += gy.ai;
            }

            gb.a(var1, this.c, (super.aw - 8) * js.ay, super.ax * js.ay - var2, 3);
            main.GameGraphic.L.a(var1, "Lv" + this.a, super.aw * js.ay, super.ax * js.ay - var2 - gy.ag / 2, 0);
            if (this.e > 0) {
                int var3 = this.e / 3600;
                int var4 = (this.e - var3 * 3600) / 60;
                int var5 = this.e - var3 * 3600 - var4 * 60;
                main.GameGraphic.Q.a(var1, var3 + ":" + var4 + ":" + var5, (super.aw + 3) * js.ay, super.ax * js.ay - var2 + main.GameGraphic.L.getLastByte() / 2 + 2 * js.ay, 2);
            }
        }
    }
}
