package avatar;

import javax.microedition.lcdui.Graphics;

final class jq extends Button {

    private final hn f;
    private final byte g;
    private final byte h;
    private final int i;
    private final short j;

    jq(kv var1, String var2, int var3, hn var4, byte var5, byte var6, int var7, short var8) {
        super((String) null, 0);
        this.f = var4;
        this.g = var5;
        this.h = var6;
        this.i = var7;
        this.j = var8;
    }

    public final void a(Graphics var1, int var2, int var3) {
        main.GameGraphic.c(var1);
        var2 = je.o + (gy.Z << 1) + 10 * gy.Y + 30 * (gy.Y - 1) + dp.b;
        byte var5 = gy.ah;
        this.f.a(var1, main.GameGraphic.width / 2, var2, false);
        main.GameGraphic.K.a(var1, StringEntity.aA + this.f.x, main.GameGraphic.width / 2, var2 + var5, 2);
        main.GameGraphic.K.a(var1, StringEntity.em[3] + this.g + " (" + this.h + "%)", main.GameGraphic.width / 2, var2 + (var5 << 1), 2);
        main.GameGraphic.K.a(var1, StringEntity.cC + this.i, main.GameGraphic.width / 2, var2 + var5 * 3, 2);
        main.GameGraphic.K.a(var1, StringEntity.cD + ": ", main.GameGraphic.width / 2, var2 + (var5 << 2), 2);
        if (this.j != -1) {
            ((iw) fxClass.a(this.j)).a(var1, main.GameGraphic.width / 2, var2 + var5 * 6, 3);
        }
    }
}
