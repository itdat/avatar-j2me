package avatar;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gp extends kr {

    private static gp b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    public static ht a;
    private Vector n = new Vector();
    private String o;
    private String[] p;
    private boolean[] q;
    private int r = 0;
    private int s;
    private int t;
    private int u;
    private boolean v = false;
    private boolean w = false;
    private long x;
    private long y;
    private long z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;

    static {
        try {
            a = new ht(Image.createImage(StringEntity.a() + "/race/popup/tile0.png"), 20 * gy.Y, 20 * gy.Y);
        } catch (IOException var1) {
            var1.printStackTrace();
        }
    }

    public static gp a() {
        return b == null ? (b = new gp()) : b;
    }

    public gp() {
        this.f = 200 * gy.Y;
        this.g = 190 * gy.Y;
        this.d = (main.GameGraphic.width - this.f) / 2;
        this.e = (main.GameGraphic.height - this.g) / 2;
        this.i = 70 * gy.Y;
        this.j = 120 * gy.Y;
        this.h = this.f - this.j - 12 * gy.Y;
        this.l = 30 * gy.Y;
        this.k = this.l * 3 + 20 * gy.Y;
        super.ad = new Button(StringEntity.CHOOSE, 0, this);
        super.ae = new Button(StringEntity.CLOSE, 1, this);
    }

    public final void a(int var1) {
        switch (var1) {
            case 0:
                this.b();
                return;
            case 1:
                main.GameGraphic.t = null;
            default:
        }
    }

    public final void a(Vector var1, int var2, String var3, String var4, boolean[] var5) {
        this.n = var1;
        this.q = var5;
        this.c = var2;
        this.F = var1.size() * this.l - (this.k - 20 * gy.Y);
        if (this.F < 0) {
            this.F = 0;
        }
        this.o = var3;
        this.p = main.GameGraphic.M.a(var4, this.f - 50 * gy.Y);
        main.GameGraphic.t = this;
    }

    public final void k() {
        if (this.t > 0) {
            --this.t;
            if (this.t == 0) {
                this.b();
            }
        }
        if (this.A != 0) {
            if (this.C < 0 || this.C > this.F) {
                this.A -= this.A / 4;
                this.C += this.A / 20;
                if (this.A / 10 <= 1) {
                    this.A = 0;
                }
            }
            if (this.C < 0) {
                if (this.C < -this.k / 2) {
                    this.C = -this.k / 2;
                    this.B = 0;
                    this.A = 0;
                }
            } else if (this.C > this.F) {
                if (this.C < this.F + this.k / 2) {
                    this.C = this.F + this.k / 2;
                    this.B = this.F;
                    this.A = 0;
                }
            } else {
                this.C += this.A / 10;
            }
            this.B = this.C;
            this.A -= this.A / 10;
            if (this.A / 10 == 0) {
                this.A = 0;
            }
        } else if (this.C < 0) {
            this.B = 0;
        } else if (this.C > this.F) {
            this.B = this.F;
        }
        if (this.C != this.B) {
            this.E = this.B - this.C << 2;
            this.D += this.E;
            this.C += this.D >> 4;
            this.D &= 15;
        }
    }

    public final void l() {
        super.l();
        ++this.y;
        boolean var1 = false;
        if (main.GameGraphic.a(2)) {
            --this.m;
            if (this.m < 0) {
                this.m = this.n.size() - 1;
            }
            var1 = true;
        } else if (main.GameGraphic.a(8)) {
            ++this.m;
            if (this.m >= this.n.size()) {
                this.m = 0;
            }
            var1 = true;
        }

        if (main.GameGraphic.g) {
            this.u = main.GameGraphic.k;
            this.w = false;
            if (main.GameGraphic.b(this.d + this.h, this.e + this.i, this.j, this.k)) {
                if (this.A != 0) {
                    this.w = true;
                }
                main.GameGraphic.g = false;
                this.r = this.B;
                this.x = this.y;
                this.v = true;
            }
        }

        if (this.v) {
            int var2 = this.u - main.GameGraphic.i;
            this.u = main.GameGraphic.i;
            long var3 = this.y - this.x;
            int var5;
            int var6;
            if (main.GameGraphic.e) {
                if (this.y % 2L == 0L) {
                    this.s = main.GameGraphic.i;
                    this.z = this.y;
                }

                this.A = 0;
                if (Math.abs(var2) < 10 * gy.Y) {
                    var5 = this.e + this.i + 10 * gy.Y;
                    var6 = this.l;
                    if ((var5 = (this.B + main.GameGraphic.i - var5) / var6) >= 0 && var5 < this.n.size()) {
                        this.m = var5;
                    }
                }

                if (awClass.f(main.GameGraphic.l()) >= 10 * gy.Y) {
                    super.aj = true;
                } else if (var3 > 3L && var3 < 8L) {
                    var5 = this.e + this.i + 10 * gy.Y;
                    var6 = this.l;
                    if ((var5 = (this.B + main.GameGraphic.i - var5) / var6) >= 0 && var5 < this.n.size() && !this.w) {
                        super.aj = false;
                    }
                }
                if (this.B < 0 || this.B > this.F) {
                    this.B = this.r + var2 / 2;
                    this.r = this.B;
                }
                this.C = this.B;
            }

            if (main.GameGraphic.f && main.GameGraphic.b(this.d, this.e, this.f, this.g)) {
                this.w = false;
                var5 = (int) (this.y - this.z);
                if (awClass.f(var6 = this.s - main.GameGraphic.i) > 40 && var5 < 10 && this.B > 0 && this.B < this.F) {
                    this.A = var6 / var5 * 10;
                }

                this.z = -1L;
                if (Math.abs(var2) < 10 * gy.Y) {
                    if (var3 <= 4L) {
                        super.aj = false;
                        this.t = 5;
                    } else if (!super.aj) {
                        this.b();
                    }
                }
                this.v = false;
                main.GameGraphic.f = false;
            }
        } else if (main.GameGraphic.f && !main.GameGraphic.b(this.d, this.e, this.f, this.g)) {
            main.GameGraphic.f = false;
            main.GameGraphic.t = null;
        }

        if (var1) {
            this.B = this.m * this.l - this.k / 2 + this.l / 2;
            if (this.B > this.F) {
                this.B = this.F;
                return;
            }

            if (this.B < 0) {
                this.B = 0;
            }
        }
    }

    private void b() {
        if (!this.q[this.m]) {
            main.GameGraphic.t = null;
        } else {
            main.GameGraphic.i();
        }
        ((Button) this.n.elementAt(this.m)).b();
    }

    public final void a(Graphics var1) {
        main.GameGraphic.c(var1);
        main.GameGraphic.S.a(var1, this.d, this.e, this.f, this.g, 0);
        var1.translate(this.d, this.e);
        var1.setColor(695195);
        var1.fillRect(12 * gy.Y, 12 * gy.Y, this.f - 24 * gy.Y, 50 * gy.Y);
        var1.setColor(12648440);
        var1.fillRect(15 * gy.Y, 15 * gy.Y, this.f - 30 * gy.Y, 44 * gy.Y);

        int var2;
        for (var2 = 0; var2 < this.p.length; ++var2) {
            main.GameGraphic.N.a(var1, this.p[var2], 20 * gy.Y, 12 * gy.Y + 25 * gy.Y - this.p.length * gy.af / 2 + var2 * gy.af, 0);
        }

        hn var9 = ir.g(this.c);
        main.GameGraphic.K.a(var1, this.o, this.h / 2, this.i + this.k / 2 - gy.ah - 20 * gy.Y, 2);
        var9.a(var1, this.h / 2, this.i + this.k / 2 + var9.aA, true);
        var2 = 4441283;
        ht var7 = a;
        int var6 = this.k;
        int var5 = this.j;
        int var4 = this.i;
        int var3 = this.h;
        Graphics var10 = var1;
        var7.a(0, var3, var4, 0, var1);
        var7.a(2, var3 + var5 - var7.a, var4, 0, var1);
        var7.a(5, var3, var4 + var6 - var7.b, 0, var1);
        var7.a(7, var3 + var5 - var7.a, var4 + var6 - var7.b, 0, var1);

        int var8;
        for (var8 = 0; var8 < (var5 - (var7.a << 1)) / var7.a; ++var8) {
            var7.a(1, var3 + (var8 + 1) * var7.a, var4, 0, var10);
            var7.a(6, var3 + (var8 + 1) * var7.a, var4 + var6 - var7.b, 0, var10);
        }

        var7.a(1, var3 + var5 - (var7.a << 1), var4, 0, var10);
        var7.a(6, var3 + var5 - (var7.a << 1), var4 + var6 - var7.b, 0, var10);

        for (var8 = 0; var8 < (var6 - (var7.b << 1)) / var7.b; ++var8) {
            var7.a(3, var3, var4 + (var8 + 1) * var7.b, 0, var10);
            var7.a(4, var3 + var5 - var7.a, var4 + (var8 + 1) * var7.b, 0, var10);
        }

        var7.a(3, var3, var4 + var6 - (var7.b << 1), 0, var10);
        var7.a(4, var3 + var5 - var7.a, var4 + var6 - (var7.b << 1), 0, var10);
        var10.setColor(4441283);
        var10.fillRect(var3 + var7.a, var4 + var7.b, var5 - (var7.a << 1), var6 - (var7.b << 1));
        var1.translate(this.h, this.i);
        var1.setClip(0, 0, this.j, this.k);
        var1.translate(0, -this.C);

        for (var2 = 0; var2 < this.n.size(); ++var2) {
            Button var11 = (Button) this.n.elementAt(var2);
            if (var2 == this.m && !super.aj) {
                var1.setColor(10543802);
                var1.fillRect(4 * gy.Y, 10 * gy.Y + var2 * this.l, this.j - 8 * gy.Y, this.l);
            }
            main.GameGraphic.K.a(var1, var11.text, 10 * gy.Y, 10 * gy.Y + var2 * this.l + this.l / 2 - gy.ah / 2, 0);
        }
        super.a(var1);
    }
}
