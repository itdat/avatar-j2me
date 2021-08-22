package avatar;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class la extends hj {

    public static la a;
    public int b = 0;
    public static Image c;
    public static boolean d = false;

    public static la b() {
        return a == null ? (a = new la()) : a;
    }

    public final void a() {
        main.GameGraphic.C.removeAllElements();
        main.GameGraphic.U = 0;
        main.GameGraphic.INST.b();
        jy.b = true;

        try {
            c = Image.createImage(StringEntity.a() + "/on/logo.on");
        } catch (IOException var2) {
            var2.printStackTrace();
        }
        super.a();
    }

    public final void k() {
        if (this.b > 21) {
            ir.B = GameMidlet.i.aw;
            ir.C = GameMidlet.i.ax;
            jy.e().a();
        } else if (this.b == 0) {
            main.GameGraphic.S.f();
        }
        ++this.b;
    }

    public final void a(Graphics var1) {
        main.GameGraphic.S.b(var1);
        if (this.b > 1) {
            var1.drawImage(c, main.GameGraphic.o, main.GameGraphic.height2 / 2, 3);
        }
        main.GameGraphic.a(var1);
    }
}
