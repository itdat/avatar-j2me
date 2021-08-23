package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameGraphic;

public final class im extends gy {

    public static im a;
    public KeyboardManager b;
    public static boolean c = false;
    public cq d;
    private long e;

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                this.b.a("");
                c = false;
                this.b.a(true);
                return;
            case 1:
                long var3;
                if ((var3 = System.currentTimeMillis()) - this.e < 2000L) {
                    return;
                } else if (this.d != null) {
                    this.d.a(this.b.f());
                    this.b.a("");
                    c = false;
                    this.b.a(true);
                    this.e = var3;
                }
            default:
        }
    }

    public final void a() {
        this.b.a("");
        c = false;
        this.b.a(true);
        if (jy.b && dm.d) {
            dm.d = false;
            dm.INST.b[4] = 0;
            GameGraphic.INST.b();
        }
    }

    protected im() {
        super.ac = new Button(StringEntity.CLOSE, 0);
        super.ad = new Button(StringEntity.ba, 1);
        this.b = new KeyboardManager();
        this.b.e = false;
        this.b.a(true);
        this.b();
        this.b.a = (GameGraphic.width - this.b.c) / 2;
        this.b.c(40);
        super.ae = this.b.a();
    }

    public final void b() {
        this.b.b = main.GameGraphic.height2 - main.GameGraphic.T - this.b.d - 5;
        if (jy.b) {
            KeyboardManager var10000 = this.b;
            var10000.b -= 2 * gy.Y;
        }
        this.b.c = GameGraphic.width - 10;
    }

    public final void b(int var1) {
        if (c) {
            this.b.b(var1);
        }
    }

    public static im d() {
        return a == null ? (a = new im()) : a;
    }

    public final void a(int var1, cq var2) {
        if (GameGraphic.A == null) {
            this.b.b(var1);
            if (!this.b.f().equals("")) {
                this.d = var2;
                c = true;
            }
            this.b();
        }
    }

    public final void l() {
        this.b.e();
        if (jy.b && main.GameGraphic.Z != 0) {
            GameGraphic.S.a(super.ac, super.ad, super.ae);
        } else {
            super.l();
        }
    }

    public final void a(Graphics var1) {
        if (jy.b) {
            jy.a(var1, super.ac, super.ad, super.ae);
        } else {
            super.a(var1);
        }
        this.b.a(var1);
    }
}
