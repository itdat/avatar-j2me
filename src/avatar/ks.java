package avatar;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ks extends cc {

    private Image a;

    public ks(int var1, int var2, int var3, int var4) {
        super(var1, var2, var3, 0);
        ImageModel.b(StringEntity.at);
        this.a = ImageModel.getImageFromIndex("" + var1);
        if (this.a != null) {
            this.a.getWidth();
        }
        ImageModel.cleanUp();
    }

    public final void b() {
    }

    public final void a(Graphics var1) {
        if (this.a == null) {
            super.g = fxClass.c((short) super.f).b;
            fxClass.a(var1, super.f, super.aw * js.ay, super.ax * js.ay, 33);
        } else {
            var1.drawImage(this.a, super.aw * js.ay, super.ax * js.ay, 33);
        }

        if (super.f == 846) {
            main.GameGraphic.N.a(var1, String.valueOf(aeClass.c), super.aw * js.ay, super.ax * js.ay - 30 * js.ay, 2);
        } else {
            if (super.f == 1029 && go.V != 0) {
                az var2 = go.b(gb.b(go.V).b);
                String var3 = "";
                int var4;
                if ((var4 = go.U / 3600) > 0) {
                    var3 = var4 + ":";
                }

                int var5;
                if ((var5 = (go.U - var4 * 3600) / 60) > 0 || var4 > 0) {
                    var3 = var3 + var5 + ":";
                }

                var4 = go.U - var4 * 3600 - var5 * 60;
                var3 = var3 + var4;
                if (go.U == 0) {
                    var3 = "hoan thanh";
                }

                go.W = super.aw - main.GameGraphic.Q.a(var3) / 2 / js.ay;
                go.X = super.ax - fxClass.c((short) super.f).c / js.ay - 10;
                gb.a(var1, var2.b, super.aw * js.ay - main.GameGraphic.Q.a(var3) / 2, super.ax * js.ay - fxClass.c((short) super.f).c - 10 * js.ay, 3);
                main.GameGraphic.Q.a(var1, var3, super.aw * js.ay - main.GameGraphic.Q.a(var3) / 2 + 10 * js.ay, super.ax * js.ay - fxClass.c((short) super.f).c - 10 * js.ay - gy.ai / 2 + 2, 0);
            }

        }
    }
}
