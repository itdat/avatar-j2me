package avatar;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameGraphic;

public abstract class hj extends gy {

    public static int al = 20;
    public static Image am;
    public static Image an;
    public static Image ao;
    public static Image ap;
    public static Image aq;
    public int ar = 0;
    public static int as = 0;
    public static int at = 20;
    public static int au;
    public static int av;
    public static final int[] aw = new int[]{4802889, 3092271};
    public static final int[] ax = new int[]{14400144, 12689526};

    public void a(int var1, boolean var2) {
        this.ar = var1;
    }

    public void a(boolean var1) {
        super.aj = var1;
    }

    public void a() {
        GameGraphic.e();
        GameGraphic.r = this;
        GameGraphic.INST.setFullScreenMode(true);
    }

    public void a(Graphics var1) {
        if (main.GameGraphic.t == null && main.GameGraphic.v == null && main.GameGraphic.A == null && !im.c) {
            super.a(var1);
        } else {
            main.GameGraphic.c(var1);
        }

        if (!kt.getInstance().b()) {
            main.GameGraphic.M.a(var1, "2.5.8", main.GameGraphic.af.a, main.GameGraphic.af.b, main.GameGraphic.af.c);
        } else if (main.GameGraphic.r == ez.a || main.GameGraphic.r == ea.a) {
            main.GameGraphic.M.a(var1, kt.getInstance().k, main.GameGraphic.af.a, main.GameGraphic.af.b, main.GameGraphic.af.c);
        }

        main.GameGraphic.S.a(var1);
    }

    public void b(Graphics var1) {
    }

    public abstract void k();

    public void d(int var1) {
    }

    public void d() {
    }

    public static void z() {
        int var0 = main.GameGraphic.height + main.GameGraphic.T;
        if (an == null) {
            an = Image.createImage(main.GameGraphic.width, var0);
        }

        Graphics var1 = an.getGraphics();
        if (main.GameGraphic.r == ek.a) {
            ek.a.c(var1);
        } else {
            if (main.GameGraphic.r == kd.a || main.GameGraphic.r == kg.a) {
                int var2;
                if (main.GameGraphic.width < var0) {
                    var2 = var0 / 10;
                } else {
                    var2 = main.GameGraphic.width / 10;
                }

                for (int var3 = 0; var3 < var2; ++var3) {
                    var1.setColor(6629892);
                    var1.drawRect(main.GameGraphic.o - var3 * var2 - 1, var0 / 2 - var3 * var2, var3 * var2 << 1, var3 * var2 << 1);
                    var1.setColor(13399567);
                    var1.drawRect(main.GameGraphic.o - var3 * var2, var0 / 2 - var3 * var2 + 1, var3 * var2 << 1, var3 * var2 << 1);
                }
            }
        }
    }
}
