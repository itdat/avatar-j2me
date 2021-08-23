package avatar;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hy extends gs {

    private ht b;
    public static hy a;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int[] j;

    public static hy a() {
        return a == null ? (a = new hy()) : a;
    }

    public final void b() {
        hy var1 = this;
        if (this.b == null) {
            try {
                var1.b = new ht(Image.createImage(StringEntity.a() + "/button.png"), gy.Y == 2 ? 112 : 52, 16 * gy.Y);
            } catch (IOException var3) {
                var3.printStackTrace();
            }

            this.e = this.b.a * 3 + 30 * gy.Y;
            this.f = this.b.b * 3 + 60 * gy.Y;
            this.c = (main.GameGraphic.width - this.e) / 2;
            this.d = (main.GameGraphic.height - this.f) / 2;
            this.g = this.f / 3;
            this.h = this.e / 3;
            this.j = new int[]{100, 1000, 10000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
            super.ad = new Button(StringEntity.CHOOSE, 0, this);
            super.ae = new Button(StringEntity.CLOSE, 1, this);
        }

        main.GameGraphic.v = this;
    }

    public final void a(int var1) {
        switch (var1) {
            case 0:
                main.GameGraphic.a("Bạn có chắc muốn chuyển tiền không ?", (Intent) (new jm(this)));
                return;
            case 1:
                main.GameGraphic.v = null;
            default:
        }
    }

    public final void k() {
    }

    public final void l() {
        super.l();
        if (main.GameGraphic.a(2)) {
            if (this.i / 3 > 0) {
                this.i -= 3;
            }
        } else if (main.GameGraphic.a(4)) {
            if (this.i % 3 > 0) {
                --this.i;
            }
        } else if (main.GameGraphic.a(6)) {
            if (this.i % 3 < 2) {
                ++this.i;
            }
        } else if (main.GameGraphic.a(8) && this.i / 3 < 2) {
            this.i += 3;
        }

        if (main.GameGraphic.g) {
            for (int var1 = 0; var1 < this.j.length; ++var1) {
                if (main.GameGraphic.b(this.c + var1 % 3 * this.h, this.d + var1 / 3 * this.g, this.h, this.g)) {
                    main.GameGraphic.g = false;
                    this.i = var1;
                    return;
                }
            }
        }

    }

    public final void a(Graphics var1) {
        main.GameGraphic.r.b(var1);
        main.GameGraphic.c(var1);
        main.GameGraphic.S.h(var1, this.c, this.d, this.e, this.f);
        var1.translate(this.c, this.d);

        for (int var2 = 0; var2 < this.j.length; ++var2) {
            this.b.a(this.i == var2 ? 1 : 0, this.h / 2 + var2 % 3 * this.h, this.g / 2 + var2 / 3 * this.g, 0, 3, var1);
            main.GameGraphic.Q.a(var1, String.valueOf(this.j[var2]), this.h / 2 + var2 % 3 * this.h, this.g / 2 + var2 / 3 * this.g - gy.ai / 2, 2);
        }

        main.GameGraphic.c(var1);
        jy.a(var1, super.ac, super.ad, super.ae);
    }

    static int[] a(hy var0) {
        return var0.j;
    }

    static int b(hy var0) {
        return var0.i;
    }
}
