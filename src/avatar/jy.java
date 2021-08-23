package avatar;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jy extends hj {

    public static jy a;
    private Button d;
    private int e = 0;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private static ht l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    public static boolean b = true;
    private static boolean r;
    private static Image s;
    public static int c = 0;
    private int t = 0;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private boolean A = false;
    private int B;
    private int C = 2;
    private int D = 0;
    private int E = -40;
    private int F = 1;

    public static void b() {
        l = null;
        s = null;
        la.c = null;
    }

    public static jy e() {
        if (a == null) {
            a = new jy();
        }

        return a;
    }

    public final void a() {
        super.ar = 2;
        main.GameGraphic.t = null;
        main.GameGraphic.h();
        if (l == null) {
            ImageModel.b(StringEntity.MAIN_AV);
            ht.a("up", 13 * gy.Y, 11 * gy.Y);
            ImageModel.cleanUp();

            try {
                int var1 = 70 * gy.Y;
                if (main.GameGraphic.Z == 0) {
                    var1 = 40;
                }

                l = new ht(Image.createImage(StringEntity.a() + "/on/iconGame0.on"), var1, var1);
                s = Image.createImage(StringEntity.a() + "/on/select.on");
                if (la.c == null) {
                    la.c = Image.createImage(StringEntity.a() + "/on/logo.on");
                }
            } catch (IOException var2) {
                var2.printStackTrace();
            }
        }

        super.a();
        this.g = main.GameGraphic.height / 2 - gy.ah;
        this.j = 4;
        this.k = 70 * gy.Y;
        if (main.GameGraphic.Z == 0) {
            this.k = 40;
        }

        this.h = main.GameGraphic.width / this.j;
        if (this.h > 100 * gy.Y) {
            this.h = 100 * gy.Y;
        }

        this.i = l.b + gy.ah + 5 * gy.Y;
        this.f = (main.GameGraphic.width - this.j * this.h) / 2 + this.h / 2;
        if ((q = this.j * this.h - main.GameGraphic.width) < 0) {
            q = 0;
        }

        g();
        if (main.GameGraphic.J == 0) {
            main.GameGraphic.J = 1;
        }

        r = true;
        b = true;
    }

    private static void g() {
        main.GameGraphic.T = hj.av;
        if (main.GameGraphic.Z == 0) {
            main.GameGraphic.T = gy.ag + 5;
        }

        main.GameGraphic.height = main.GameGraphic.INST.getHeight() - main.GameGraphic.T;

        for (int var0 = 0; var0 < 3; ++var0) {
            main.GameGraphic.ae[var0].b = main.GameGraphic.height2 - main.GameGraphic.T;
        }

    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                switch (this.e) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        var1 = this.e;
                        main.GameGraphic.i();
                        cx.getInstance().d((int) 3);
                        aeClass.i = (byte) var1;
                        return;
                    case 4:
                        hy.a().b();
                    default:
                        return;
                }
            case 1:
                c = 1;
                main.GameGraphic.y.m = false;
                cx var3;
                (var3 = cx.getInstance()).e((byte) -96);
                var3.k();
                main.GameGraphic.i();
                return;
            case 2:
                cx.getInstance().doCommunicate(1);
                main.GameGraphic.i();
                return;
            case 3:
                this.h();
            default:
        }
    }

    public jy() {
        this.d = new Button(StringEntity.CHOOSE, 0);
        super.ae = new Button(StringEntity.EXIT, 1);
        super.ac = new Button("Top", 2);
        if (main.GameGraphic.Z == 0) {
            super.ad = new Button(StringEntity.CHOOSE, 3);
        }

    }

    public final void d() {
        this.a(1, -1);
    }

    private void h() {
        r = true;
        this.d.b();
    }

    public final void k() {
        if (this.w > 0) {
            --this.w;
            if (this.w == 0 && main.GameGraphic.r != dp.a) {
                this.h();
            }
        }

        if (this.u != 0) {
            if (n < 0 || n > q) {
                if (this.u > 500) {
                    this.u = 500;
                } else if (this.u < -500) {
                    this.u = -500;
                }

                this.u -= this.u / 5;
                if (awClass.f(this.u / 10) <= 10) {
                    this.u = 0;
                }
            }

            m = n += this.u / 15;
            this.u -= this.u / 20;
        } else if (n < 0) {
            m = 0;
        } else if (n > q) {
            m = q;
        }

        if (n != m) {
            p = m - n << 2;
            o += p;
            n += o >> 4;
            o &= 15;
        }

        if (this.D >= 0) {
            this.E += this.F * this.D;
            this.D += this.F * this.C;
            if (this.D <= 0) {
                this.F = -this.F;
            }

            if (this.E > 0) {
                this.F = -this.F;
                this.D -= 2 * this.C;
            }
        }

    }

    public final void l() {
        ++this.x;
        if (main.GameGraphic.a(4)) {
            if (this.e % this.j > 0) {
                --this.e;
            }
        } else if (main.GameGraphic.a(6)) {
            if (this.e < l.c - 1 && this.e % this.j < this.j - 1) {
                ++this.e;
            }
        } else if (main.GameGraphic.a(2)) {
            if (this.e / this.j > 0) {
                this.e -= this.j;
            }
        } else if (main.GameGraphic.a(8) && this.e / this.j < l.c / this.j && this.e + this.j < l.c) {
            this.e += this.j;
        }

        int var1;
        if (main.GameGraphic.g) {
            for (var1 = 0; var1 < StringEntity.eA.length; ++var1) {
                if (main.GameGraphic.b(this.f + var1 % this.j * this.h - this.k / 2, this.g + var1 / this.j * this.i - this.k / 2, this.k, this.k + gy.ah + 10)) {
                    this.B = main.GameGraphic.j;
                    this.y = this.x;
                    this.t = n;
                    this.u = 0;
                    main.GameGraphic.g = false;
                    this.A = true;
                    break;
                }
            }
        }

        if (this.A) {
            var1 = this.x - this.y;
            int var2 = this.B - main.GameGraphic.h;
            this.B = main.GameGraphic.h;
            int var3;
            if (main.GameGraphic.e) {
                if (this.x % 2 == 0) {
                    this.v = main.GameGraphic.h;
                    this.z = this.x;
                }

                this.u = 0;
                if (m > 0 && m < q) {
                    m = this.t + var2;
                    this.t = m;
                } else {
                    m = this.t + main.GameGraphic.k() / 2;
                }

                n = m;
                if (var1 < 20) {
                    var2 = (m + main.GameGraphic.h - (this.f - this.h / 2)) / this.h;
                    var3 = (main.GameGraphic.i - (this.g - this.h / 2)) / this.i;
                    this.e = var3 * this.j + var2;
                    if (this.e < 0) {
                        this.e = 0;
                    }

                    if (this.e >= StringEntity.eA.length) {
                        this.e = StringEntity.eA.length - 1;
                    }
                }

                if (awClass.f(main.GameGraphic.l()) < 10 * gy.Y && awClass.f(main.GameGraphic.k()) < 10 * gy.Y) {
                    if (var1 > 3 && var1 < 8) {
                        r = false;
                    }
                } else {
                    r = true;
                }
            }

            if (main.GameGraphic.f) {
                var2 = this.v - main.GameGraphic.h;
                var3 = this.x - this.z;
                if (awClass.f(var2) > 40 && var3 < 20 && m > 0 && m < q) {
                    this.u = var2 / var3 * 10;
                }

                this.z = -1;
                if (awClass.f(main.GameGraphic.l()) < 10 * gy.Y && awClass.f(main.GameGraphic.k()) < 10 * gy.Y) {
                    if (var1 <= 4) {
                        this.w = 5;
                        r = false;
                    } else if (!r) {
                        this.h();
                    }
                }

                this.A = false;
                main.GameGraphic.f = false;
            }
        }

        if (main.GameGraphic.Z != 0) {
            main.GameGraphic.S.a(super.ac, super.ad, super.ae);
        } else {
            super.l();
        }
    }

    public final void b(Graphics var1) {
        main.GameGraphic.S.b(var1);
        if (main.GameGraphic.W != 2) {
            main.GameGraphic.S.a(var1, main.GameGraphic.o, (this.g - l.b / 2) / 2);
        }

        var1.translate(this.f, this.g);
        var1.translate(-n, 0);

        for (int var2 = 0; var2 < StringEntity.eA.length; ++var2) {
            l.a(var2, var2 % this.j * this.h, var2 / this.j * this.i, 0, 3, var1);
            main.GameGraphic.M.a(var1, StringEntity.eA[var2], var2 % this.j * this.h, var2 / this.j * this.i + l.b / 2 + 5, 2);
            if (this.e == var2 && (!main.GameGraphic.H || !r)) {
                var1.drawImage(s, var2 % this.j * this.h, var2 / this.j * this.i, 3);
            }
        }

    }

    public final void a(Graphics var1) {
        main.GameGraphic.c(var1);
        this.b(var1);
        a(var1, super.ac, super.ad, super.ae);
        main.GameGraphic.c(var1);
        main.GameGraphic.b(var1);
    }

    public static void a(Graphics var0, Button var1, Button var2, Button var3) {
        main.GameGraphic.c(var0);
        main.GameGraphic.S.c(var0);
        if (main.GameGraphic.t == null && (main.GameGraphic.v == null || main.GameGraphic.v == hy.a)) {
            main.GameGraphic.S.b(var0, var1, var2, var3);
        }
    }

    public static void f() {
        if (b && dm.d) {
            dm.d = false;
            dm.INST.b[4] = 0;
            main.GameGraphic.INST.b();
            g();
        }
    }
}
