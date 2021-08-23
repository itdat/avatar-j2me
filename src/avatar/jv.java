package avatar;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jv extends hj {

    public static jv a;
    private static int b = 20;
    private static Image c;

    static {
        try {
            c = Image.createImage(StringEntity.a() + "/lg.png");
        } catch (IOException var1) {
            var1.printStackTrace();
        }
    }

    public static jv b() {
        return a == null ? (a = new jv()) : a;
    }

    public final void a() {
        jy.b = false;
        b = 0;
        if (jy.c != 0) {
            c = hj.am;
        }

        super.a();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 50:
                b(0);
                return;
            case 51:
                b(1);
            default:
        }
    }

    public final void k() {
        if (b > 51) {
            if (jy.c != 0) {
                if (jy.c == 2) {
                    aeClass.getInstance().a();
                    c = null;
                    jy.c = 0;
                    main.GameGraphic.S.g();
                }
            } else if (b == 52) {
                es.b().h();
                dm.INST.f();
                if (!es.u) {
                    es.u = true;
                    fxClass.b("avatarSV");
                    fxClass.f();
                    b(0);
                } else {
                    fxClass.f();
                    es.b().e();
                    if (ez.b() != main.GameGraphic.r) {
                        ez.b().a();
                    }

                    c = null;
                }
            }
        } else if (jy.c != 0 && b == 0) {
            aeClass.getInstance().a();
            c = null;
            jy.c = 0;
            main.GameGraphic.S.g();
        }

        ++b;
    }

    private static void b(int var0) {
        main.GameGraphic.i();
        dm.INST.b[4] = var0;
        dm.INST.b(0);
        es.b().e();
        es.b().a();
        c = null;
    }

    public final void a(Graphics var1) {
        je.a(0, 0, main.GameGraphic.width, main.GameGraphic.INST.getHeight(), 0, var1);
        if (b > 1 && c != null) {
            var1.drawImage(c, main.GameGraphic.width >> 1, main.GameGraphic.height >> 1, 3);
        }

        main.GameGraphic.a(var1);
    }
}
