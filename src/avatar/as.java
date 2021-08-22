package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameGraphic;

final class as extends Button {

    as(go var1, String var2, int var3, gy var4) {
        super(var2, 2, var4);
    }

    public final void a(Graphics var1, int var2, int var3) {
        hf var7 = gb.b(go.V);
        az var9 = go.b(var7.b);
        gb.a(var1, var9.b, GameGraphic.y.d / 2, dp.d / 2 - 30, 3);
        GameGraphic.N.a(var1, var7.d, GameGraphic.y.d / 2, dp.d / 2 - 30 + 5 + gb.a(var9.b).c / 2 + gy.ai + 2, 2);
        String var8 = "";
        int var4 = go.U / 3600;
        CsInterface var5 = GameGraphic.M;
        if (var4 > 0) {
            var8 = var4 + ":";
        }

        int var6;
        if ((var6 = (go.U - var4 * 3600) / 60) > 0 || var4 > 0) {
            var8 = var8 + var6 + ":";
        }

        var4 = go.U - var4 * 3600 - var6 * 60;
        var8 = var8 + var4;
        if (go.U == 0) {
            var8 = StringEntity.eL;
            var5 = main.GameGraphic.N;
        }

        var5.a(var1, var8, GameGraphic.y.d / 2, dp.d / 2 - 30 + 5 + gb.a(var9.b).c / 2, 2);
    }
}
