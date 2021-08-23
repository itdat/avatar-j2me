package avatar;

import javax.microedition.lcdui.Graphics;

final class fm extends Button {

    private final String f;
    private final hn g;
    private final hn h;
    private final short i;
    private final byte level;
    private final byte percent;
    private final String l;

    fm(aeClass var1, String var2, Intent var3, String var4, hn var5, hn var6, short var7, byte var8, byte var9, String var10) {
        super(var2, (Intent) null);
        this.f = var4;
        this.g = var5;
        this.h = var6;
        this.i = var7;
        this.level = var8;
        this.percent = var9;
        this.l = var10;
    }

    public final void a(Graphics var1, int var2, int var3) {
        var2 = 15 * gy.Y;
        main.GameGraphic.K.a(var1, this.f, dp.c / 2 - 7, var2, 2);
        var2 += this.g.aA + main.GameGraphic.K.getLastByte() + 15 * gy.Y;
        this.g.a(var1, dp.c / 4 - 7, var2, true);
        this.h.a(var1, dp.c / 4 * 3 - 7, var2, true);
        f var4;
        if ((var4 = fxClass.c(this.i)).d != -1) {
            var1.drawImage(var4.a, dp.c / 2 - 7, var2 - this.g.aA / 2, 3);
            if (this.level > 0) {
                main.GameGraphic.N.a(var1, "lv" + this.level + "+" + this.percent + "%", dp.c / 2 - 7, var2, 2);
                var2 += main.GameGraphic.N.getLastByte();
                aeClass.a(var1, "", dp.c / 2 - 8, var2, this.percent);
            }
        }
        var2 += main.GameGraphic.N.getLastByte() << 1;
        main.GameGraphic.K.a(var1, this.l, dp.c / 2 - 7, var2 - 5, 2);
    }

    public final void a() {
        this.h.b();
    }
}
