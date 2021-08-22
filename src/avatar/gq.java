package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class gq extends gs {

    public Vector a;
    private static gq h;
    public int b = 0;
    public int c;
    public int d;
    public int e;
    public int f;
    private boolean i = false;
    public String g = "";

    public static gq a() {
        if (h == null) {
            h = new gq();
        }
        return h;
    }

    public final void a(int var1) {
        switch (var1) {
            case 0:
                main.GameGraphic.h();
                h = null;
            default:
        }
    }

    public gq() {
        super.ad = new Button(StringEntity.OK, 0);
    }

    public final void k() {
    }

    public final void b() {
        if (this.a != null && this.a.size() > 0) {
            main.GameGraphic.v = this;
        }
    }

    public final void a(Graphics var1) {
        main.GameGraphic.S.a(var1, this.d, this.b, this.e, this.c, 0);
        int var2 = this.b + je.o + (5 + gy.Z - gy.ah / 2);
        for (int var3 = 0; var3 < this.a.size(); ++var3) {
            String var4;
            if ((var4 = (String) this.a.elementAt(var3)).substring(0, 1).equals("0")) {
                main.GameGraphic.Q.a(var1, var4.substring(1), this.d + this.e / 2, var2 + 3 + gy.ah / 2 - gy.ai / 2, 2);
            } else {
                main.GameGraphic.K.a(var1, var4, this.d + 15, var2 + 3, 0);
            }
            var2 += gy.ah;
        }
        super.a(var1);
    }
}
