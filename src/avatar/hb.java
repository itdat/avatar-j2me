package avatar;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hb extends gs {

    private String[] a;
    private KeyboardManager b = new KeyboardManager();
    private ii c;
    private Image d;
    private int e;
    private int f;

    public hb() {
        this.b.e = false;
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 120:
                main.GameGraphic.v = null;
                return;
            default:
                main.GameGraphic.r.a(var1, var2);
        }
    }

    public final void a(Image var1) {
        this.d = var1;
        this.f += var1.getHeight();
        this.b();
    }

    public final String a() {
        return this.b.f();
    }

    public final void b() {
        this.b.a = main.GameGraphic.o - this.b.c / 2;
        this.b.b = main.GameGraphic.height - (main.GameGraphic.height - main.GameGraphic.ae[0].b + 5) - this.b.d - 8;
    }

    public final void a(String var1, int var2, int var3) {
        this.a(var1, var3);
        super.ad = new Button(StringEntity.OK, var2);
        main.GameGraphic.v = this;
        this.b.a(true);
    }

    private void a(String var1, int var2) {
        this.d = null;
        this.e = main.GameGraphic.width - 40;
        this.f = 70 * gy.Y;
        if (main.GameGraphic.K.a(var1) + 20 < this.e) {
            this.e = main.GameGraphic.K.a(var1) + 20;
        }

        if (this.e < main.GameGraphic.width / 2) {
            this.e = main.GameGraphic.width / 2;
        }

        this.a = main.GameGraphic.K.a(var1, this.e - 20);
        this.b = new KeyboardManager();
        this.b.e = false;
        this.b.c = this.e - 10;
        this.b();
        this.b.a("");
        this.b.d(var2);
        super.ac = new Button(StringEntity.CLOSE, 120);
        main.GameGraphic.v = this;
    }

    public final void a(String var1, ii var2, int var3) {
        this.a(var1, var3);
        this.c = var2;
        super.ad = new Button(StringEntity.OK, this.c);
        main.GameGraphic.v = this;
    }

    public final void a(Graphics var1) {
        main.GameGraphic.c(var1);
        main.GameGraphic.S.a(var1, main.GameGraphic.o - this.e / 2, main.GameGraphic.height - this.f - (main.GameGraphic.height - main.GameGraphic.ae[0].b + 5), this.e, this.f, 0);
        int var2 = main.GameGraphic.height - this.f - (main.GameGraphic.height - main.GameGraphic.ae[0].b + 5) + (this.f - this.b.d - 8) / 2 - (this.a.length >> 1) * gy.ah - gy.ah / 2;
        if (this.d != null) {
            var1.drawImage(this.d, main.GameGraphic.o, this.b.b - this.d.getHeight() / 2 - 5 * gy.Y, 3);
            var2 -= this.d.getHeight() / 2;
        }

        int var3 = 0;

        for (var2 = var2; var3 < this.a.length; var2 += gy.ah) {
            main.GameGraphic.K.a(var1, this.a[var3], main.GameGraphic.o, var2, 2);
            ++var3;
        }

        this.b.a(var1);
        if (jy.b) {
            main.GameGraphic.c(var1);
            main.GameGraphic.S.c(var1);
            main.GameGraphic.S.b(var1, super.ac, super.ad, super.ae);
        } else {
            super.a(var1);
        }
    }

    public final void d(int var1) {
        this.b.b(var1);
    }

    public final void l() {
        this.b.e();
        if (this.b.d()) {
            super.ae = this.b.a();
        }

        if (jy.b && main.GameGraphic.Z != 0) {
            main.GameGraphic.S.a(super.ac, super.ad, super.ae);
        } else {
            super.l();
        }
    }
}
