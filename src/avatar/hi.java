package avatar;

import javax.microedition.lcdui.Graphics;

public final class hi extends ha {

    public static hi a;
    private KeyboardManager[] b;
    private String c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private String[][] j;

    public static hi b() {
        return a == null ? (a = new hi()) : a;
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                main.GameGraphic.A = null;
                return;
            default:
                main.GameGraphic.r.a(var1, var2);
        }
    }

    public hi() {
        this.f = 200 + main.GameGraphic.Z * 88;
        this.d = (main.GameGraphic.width - this.f) / 2;
    }

    public final void a(KeyboardManager[] var1, String var2, String[][] var3, Button var4) {
        super.ac = new Button(StringEntity.CLOSE, 0);
        super.ad = var4;
        this.c = var2;
        this.b = var1;
        this.j = var3;
        this.g = hj.at + gy.Z + gy.ah + (var1[0].d << 1) * var1.length + main.GameGraphic.Z * 12;
        this.e = (main.GameGraphic.height - main.GameGraphic.T - this.g) / 2;
        for (int var5 = 0; var5 < var1.length; ++var5) {
            var1[var5].c = this.f - 50 * (main.GameGraphic.Z + 1) - main.GameGraphic.K.a(var3[0][0]);
            var1[var5].a = this.d + this.f - var1[var5].c - 10 * (main.GameGraphic.Z + 1);
            var1[var5].b = this.e + je.o + gy.Z + gy.ah + (var1[0].d * var5 << 1);
        }

        this.i = main.GameGraphic.K.a(var2) + 20 * gy.Y;
        if (this.i < 50 + 20 * gy.Y) {
            this.i = 50 + 20 * gy.Y;
        }
        this.d();
    }

    public final void l() {
        for (int var1 = 0; var1 < this.b.length; ++var1) {
            this.b[var1].e();
        }

        boolean var2 = false;
        if (main.GameGraphic.a(2)) {
            --this.h;
            if (this.h < 0) {
                this.h = this.b.length - 1;
            }

            var2 = true;
        } else if (main.GameGraphic.a(8)) {
            ++this.h;
            if (this.h > this.b.length - 1) {
                this.h = 0;
            }

            var2 = true;
        }
        if (var2) {
            this.d();
        }
        super.l();
    }

    private void d() {
        for (int var1 = 0; var1 < this.b.length; ++var1) {
            this.b[var1].a(false);
        }
        this.b[this.h].a(true);
        super.ae = this.b[this.h].a();
    }

    public final void d(int var1) {
        for (int var2 = 0; var2 < this.b.length; ++var2) {
            if (this.b[var2].d()) {
                this.b[var2].b(var1);
            }
        }
        super.d(var1);
    }

    public final void a(Graphics var1) {
        main.GameGraphic.c(var1);
        main.GameGraphic.S.a(var1, this.d, this.e, this.g, this.f, 0, 0, je.a().j, this.i, je.o, 1, 1, je.a().n, je.a().m, this.c);

        for (int var2 = 0; var2 < this.b.length; ++var2) {
            var1.setClip(this.d + 4 * gy.Y, this.e, this.f - 8 * gy.Y, this.g);
            int var3;
            if ((var3 = this.b[var2].a - main.GameGraphic.K.a(this.j[var2][0]) - 5) > this.d + 4 * gy.Y + 5) {
                var3 = this.d + 4 * gy.Y + 5;
            }

            byte var4 = 2;
            if (this.j[var2][1].equals("")) {
                var4 = 1;
            }

            for (int var5 = 0; var5 < var4; ++var5) {
                main.GameGraphic.K.a(var1, this.j[var2][var5], var3, this.b[var2].b + this.b[var2].d / 2 - gy.ah * var4 / 2 + gy.ah * var5, 0);
            }
            this.b[var2].a(var1);
        }
        super.a(var1);
    }
}
