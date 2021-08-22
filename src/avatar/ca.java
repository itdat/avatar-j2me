package avatar;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameGraphic;
import main.GameMidlet;

public final class ca {

    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private static byte h;
    private static byte i;
    public static dr a;
    public static boolean b = false;
    private static boolean j = false;
    private Image k;

    public final void a(byte var1) {
        if (!b && GameMidlet.i.H != -1) {
            ImageModel.b(StringEntity.at);
            this.k = ImageModel.getImageFromIndex("839");
            ImageModel.cleanUp();
            i = var1;
            if (var1 == 1) {
                do1.a().a = do1.a().c = a.a * gy.Y - main.GameGraphic.o - 300;
            }
            this.d = ir.f * ir.i + (main.GameGraphic.Z != 0 ? main.GameGraphic.T : 0) / gy.Y + 20 * gy.Y;
            this.c = a.a + 300;
            this.e = this.f = 15;
            this.g = 0;
            h = 1;
            b = true;
            GameMidlet.i.b((byte) -1);
            do1.f = true;
            j = false;
            if (i == 1) {
                GameMidlet.i.L = true;
            }
        }
    }

    public final void a() {
        if ((h == 1 && i == 1 || h == -1 && i == -1) && i == -1 && !j) {
            cx.getInstance().d((int) 8);
            GameMidlet.i.L = true;
            j = true;
        }
        this.c -= this.e;
        this.g += awClass.f(this.f - this.e / 2);
        if (this.g >= 20) {
            this.g = 0;
            this.e -= h;
            if (this.e == 0) {
                h = -1;
                this.f = 8;
                GameMidlet.i.a(this.c, a.b);
                GameMidlet.i.b((byte) 0);
                do1.f = false;
                GameMidlet.i.L = false;
                if (GameGraphic.I && kt.getInstance().b()) {
                    GameGraphic.D = new bb();
                    if (ir.a == 9) {
                        GameGraphic.D.b();
                    } else if (i == 1 && ir.a == 25) {
                        GameGraphic.D.a((hj) aeClass.INST);
                    } else if (ir.a == 13 && bb.c < 8) {
                        GameGraphic.D.f();
                    } else if (i == 1 && ir.a == 23) {
                        GameGraphic.D.d();
                    }
                }
            }
        }
        if ((this.c + 58) * gy.Y < do1.a().a) {
            b = false;
            if (i == -1) {
                main.GameGraphic.i();
            }
        }
    }

    public final void a(Graphics var1) {
        int var2 = 0;
        if (this.e > 1) {
            var2 = main.GameGraphic.l % 6 < 3 ? 1 : 0;
        }
        var1.drawImage(this.k, this.c * gy.Y, (this.d + var2) * gy.Y - this.k.getHeight(), 17);
    }
}
