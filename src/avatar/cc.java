package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public class cc extends js {

    public int f;
    public short g;

    public cc() {
        super.az = 1;
    }

    public cc(int var1, int var2, int var3, int var4) {
        super.az = 1;
        this.f = var1;
        super.aw = var2;
        super.ax = var3;
        this.g = (short) var4;
    }

    public void a(Graphics var1) {
        if (this.f >= 0 || super.aw * js.ay + this.g / 2 >= do1.a().a && super.aw * js.ay - this.g / 2 <= do1.a().a + main.GameGraphic.width) {
            int var2 = super.aw * js.ay;
            int var3 = super.ax * js.ay;
            switch (this.f) {
                case -10:
                case -3:
                    var1.drawImage(go.m, var2, var3, 40);
                    return;
                case -9:
                    if (main.GameGraphic.D != null) {
                        var1.drawImage(ir.r, var2, var3, 3);
                        fxClass.a(var1, 900, var2, var3 + main.GameGraphic.D.a - 10, 33);
                    }
                case -4:
                case -1:
                default:
                    return;
                case -8:
                    a(var1, var2, var3, go.g);
                    return;
                case -7:
                    a(var1, var2, var3, go.h);
                    return;
                case -6:
                    go.s.a(0, var2, var3, 0, 3, var1);
                    if (dz.u != -1) {
                        go.s.a(1, var2, var3, 0, 3, var1);
                    }

                    return;
                case -5:
                    go.r.a(0, var2, var3, 0, 3, var1);
                    if (dt.v != -1) {
                        go.r.a(2, var2, var3, 0, 3, var1);
                    }

                    return;
                case -2:
                    if (go.E != -1) {
                        go.t.a(go.F, var2, var3, GameMidlet.i.K == gx.J ? 2 : 0, 3, var1);
                    }

                    return;
                case 0:
                    fxClass.a(var1, 243, var2, var3, 33);
            }
        }
    }

    private static void a(Graphics var0, int var1, int var2, Vector var3) {
        for (int var4 = 0; var4 < var3.size(); ++var4) {
            dr var5 = (dr) var3.elementAt(var4);
            if (var5.a * js.ay == var1 && var5.b * js.ay == var2) {
                ad var6;
                if ((var6 = gb.c(var5.c)).i != -1) {
                    fxClass.a(var0, var6.i, var1, var2, 3);
                }

                for (int var7 = 0; var7 < go.i.size(); ++var7) {
                    ai var8 = (ai) go.i.elementAt(var7);
                    if (var8.k == var5.c && var8.o > 0) {
                        fxClass.a(var0, var6.h, var1, var2, 3);
                        return;
                    }
                }
            }
        }

    }
}
