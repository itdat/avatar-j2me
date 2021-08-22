package avatar;

import javax.microedition.lcdui.Graphics;

public final class ifClass extends gs {

    private short[] a;
    private String[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = 0;
    private boolean l = false;
    private int m;
    private int n;
    private int o;
    private int p;

    public ifClass(jz var1, short[] var2, String[] var3) {
        this.a = var2;
        this.b = var3;
        super.ad = new Button(StringEntity.OK, null);
        this.d = 150 * gy.Y;
        this.c = 200 * gy.Y;
        this.c = 0;

        for (int var5 = 0; var5 < var3.length; ++var5) {
            int var4;
            if ((var4 = main.GameGraphic.K.a(var3[var5]) + 40 * gy.Y) > this.c) {
                this.c = var4;
            }
        }

        this.e = gy.ag + 5 * gy.Y;
        this.j = var2.length * this.e - (this.d - 10 * gy.Y);
        if (this.j < 0) {
            this.j = 0;
        }

    }

    public final void l() {
        ++this.n;
        boolean var1 = false;
        if (main.GameGraphic.g && main.GameGraphic.a((main.GameGraphic.width - this.c) / 2, (main.GameGraphic.height - this.d) / 2, this.c, this.d) && !this.l) {
            this.k = this.g;
            this.l = true;
            this.m = 0;
        }

        if (this.l) {
            int var2 = main.GameGraphic.l();
            if (main.GameGraphic.e) {
                if (main.GameGraphic.l % 3 == 0) {
                    this.p = main.GameGraphic.i;
                    this.o = this.n;
                }

                this.f = this.k + var2;
                this.m = 0;
                if (this.f < 0 || this.f > this.j) {
                    this.f = this.k + var2 / 2;
                }

                this.g = this.f;
            }

            if (main.GameGraphic.f) {
                this.l = false;
                int var3 = this.n - this.o;
                int var4;
                if (awClass.f(var4 = this.p - main.GameGraphic.i) > 40 && var3 < 10 && this.f > 0 && this.f < this.j) {
                    this.m = var4 / var3 * 10;
                }

                this.o = -1;
                if (Math.abs(var2) < 10) {
                    this.f = this.k + var2;
                }
            }
        }

        if (main.GameGraphic.d[2]) {
            this.f -= gy.ag;
            var1 = true;
        } else if (main.GameGraphic.d[8]) {
            var1 = true;
            this.f += gy.ag;
        }

        if (var1) {
            if (this.f < 0) {
                this.f = 0;
            }

            if (this.f > this.j) {
                this.f = this.j;
            }
        }

        if (this.m != 0) {
            if (this.g < 0 || this.g > this.j) {
                this.m -= this.m / 4;
                this.g += this.m / 20;
                if (this.m / 10 <= 1) {
                    this.m = 0;
                }
            }

            if (this.g < 0) {
                if (this.g < -this.d / 2) {
                    this.g = -this.d / 2;
                    this.f = 0;
                    this.m = 0;
                }
            } else if (this.g > this.j) {
                if (this.g < this.j + this.d / 2) {
                    this.g = this.j + this.d / 2;
                    this.f = this.j;
                    this.m = 0;
                }
            } else {
                this.g += this.m / 10;
            }

            this.f = this.g;
            this.m -= this.m / 10;
            if (this.m / 10 == 0) {
                this.m = 0;
            }
        } else if (this.g < 0) {
            this.f = 0;
        } else if (this.g > this.j) {
            this.f = this.j;
        }

        if (this.g != this.f) {
            this.i = this.f - this.g << 2;
            this.h += this.i;
            this.g += this.h >> 4;
            this.h &= 15;
        }

        super.l();
    }

    public final void a(Graphics var1) {
        main.GameGraphic.S.a(var1, (main.GameGraphic.width - this.c) / 2, (main.GameGraphic.height - this.d) / 2 - (je.o + 3 * gy.Y), this.d + je.o + 3 * gy.Y, this.c, 0, 0, je.a().j, je.a().i, je.o, 1, 1, je.a().n, je.a().m, "Lịch sử");
        main.GameGraphic.c(var1);
        var1.translate((main.GameGraphic.width - this.c) / 2, (main.GameGraphic.height2 - this.d) / 2);
        var1.setClip(0, 5 * gy.Y, this.c, this.d - 10 * gy.Y);
        var1.translate(0, -this.g);

        for (int var2 = 0; var2 < this.a.length; ++var2) {
            fxClass.a(var1, this.a[var2], 15 * gy.Y, 15 * gy.Y + var2 * this.e, 3);
            main.GameGraphic.K.a(var1, this.b[var2], 35 * gy.Y, 15 * gy.Y + var2 * this.e - gy.ag / 2, 0);
        }
        super.a(var1);
    }
}
