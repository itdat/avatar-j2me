package avatar;

import javax.microedition.lcdui.Graphics;

public final class bb extends gy {

    private int h;
    private int i;
    private int j;
    private int k;
    private String[][] l;
    public byte a = 0;
    public static hj b;
    public static int c = 0;
    private String[][] m;
    private static int n = 0;
    private String[][] o;
    public static boolean d = false;
    private static int p = 0;
    private String[][] q;
    public static int e = 0;
    private static short[] r;
    private static short[] s;
    private String[][] t;
    private String[][] u;
    private static int v = 0;
    public static int f = 0;
    private static int w = 0;
    private String[][] x;
    private String[][] y;
    private static byte[] z;
    private static int A = 0;
    private String[][] B;
    public static boolean g = false;
    private static byte[] C = new byte[]{3, 7, 4, 1, 5};

    public bb() {
        g = false;
        d = true;
        this.h = 10;
        this.k = 0;
        super.ad = new Button("", new dk(this));
        super.ac = new Button(StringEntity.STOP, new dj(this));
    }

    public final void k() {
    }

    public final void l() {
        if (d) {
            super.l();
        }

        if (d && b == main.GameGraphic.r && main.GameGraphic.t == null && main.GameGraphic.v == null) {
            if (this.l != null) {
                main.GameGraphic.d[2] = main.GameGraphic.d[4] = main.GameGraphic.d[6] = main.GameGraphic.d[8] = false;
            }

            if (this.l != null && this.k < this.l.length - 1 && main.GameGraphic.r != dp.b()) {
                main.GameGraphic.f = false;
                main.GameGraphic.e = false;
                main.GameGraphic.g = false;
            }
        }

    }

    private void i() {
        this.j = this.l[this.k].length * gy.af + (gy.Z << 1);
        if (this.j < (gy.af << 1) + (gy.Z << 1)) {
            this.j = (gy.af << 1) + (gy.Z << 1);
        }

        this.i = 5;
    }

    public final void a(Graphics var1) {
        if (b == main.GameGraphic.r && main.GameGraphic.t == null && main.GameGraphic.v == null) {
            main.GameGraphic.c(var1);
            var1.translate(0, main.GameGraphic.ab);
            if (d || main.GameGraphic.l % 20 > 2) {
                fh.a(var1, this.h, this.i, main.GameGraphic.width - (this.h << 1), this.j, 16777215, 1, (byte) 0);
                if (this.l != null && this.l[this.k] != null) {
                    byte var2 = 0;
                    if (this.l[this.k].length == 1) {
                        var2 = 2;
                    }

                    for (int var3 = 0; var3 < this.l[this.k].length; ++var3) {
                        main.GameGraphic.N.a(var1, this.l[this.k][var3], this.h + (main.GameGraphic.width - (this.h << 1)) / 2, this.i + this.j / 2 - this.l[this.k].length * gy.af / 2 + var3 * gy.af - var2, 2);
                    }

                    ++this.a;
                    if (this.a >= 8) {
                        this.a = 0;
                    }

                    if (main.GameGraphic.r == ea.a) {
                        var1.translate(-ea.f + ea.b().c, -ea.g + ea.b().d);
                    } else {
                        var1.translate(-do1.a().a, -do1.a().b);
                    }
                }
            }

            if (d) {
                super.a(var1);
                if (main.GameGraphic.l % 10 > 5 || main.GameGraphic.Z > 0) {
                    CsInterface var4 = main.GameGraphic.L;
                    if (main.GameGraphic.Z > 0) {
                        var4 = main.GameGraphic.M;
                    }

                    var4.a(var1, StringEntity.w, main.GameGraphic.ae[1].a + hj.au / 2, main.GameGraphic.ae[1].b + main.GameGraphic.T / 2 - gy.ag / 2, 2);
                }
            }
        }

    }

    public final void a() {
        if (p == C.length + 1) {
            main.GameGraphic.D = null;
            main.GameGraphic.I = false;
        } else {
            if (this.q == null) {
                this.q = StringEntity.b();
            }

            b = ea.a;
            d = true;
            if (p < C.length) {
                ea.b().e = C[p];
            }

            main.GameGraphic.D.a(this.q[p]);
            ++p;
        }
    }

    private void a(String[] var1) {
        this.l = new String[var1.length][];

        for (int var2 = 0; var2 < this.l.length; ++var2) {
            this.l[var2] = main.GameGraphic.N.a(var1[var2], main.GameGraphic.width - (this.h << 1) - 35 * gy.Y);
        }

        this.i();
        d = true;
    }

    public final void b() {
        if (this.t == null) {
            this.t = StringEntity.c();
        }

        b = aeClass.INST;
        (r = new short[3])[0] = 180;
        r[1] = 312;
        r[2] = 720;
        z = new byte[]{108, 100, 107};
        if (e != 0) {
            if (e == r.length) {
                this.b(288, 150);
                return;
            }

            do1.a().a(r[e] * gy.Y, 20 * gy.Y);
            do1.g = true;
        }

        if (e != 0) {
            cc var1 = new cc(-9, r[e], 50, 20);
            ir.l.addElement(var1);
            ir.a(ir.l);
        }

        main.GameGraphic.D.a(this.t[e]);
        ++e;
    }

    public final void d() {
        if (this.u == null) {
            this.u = StringEntity.d();
        }

        b = aeClass.INST;
        (r = new short[3])[0] = 865;
        r[1] = 445;
        r[2] = 95;
        z = new byte[]{57, 104, 58, 100, 107};
        if (v != 0) {
            if (v == r.length) {
                this.b(640, 150);
                return;
            }

            do1.a().a(r[v] * gy.Y, 20 * gy.Y);
            do1.g = true;
            cc var1 = new cc(-9, r[v], 50, 20);
            ir.l.addElement(var1);
            ir.a(ir.l);
        }

        main.GameGraphic.D.a(this.u[v]);
        ++v;
    }

    public static boolean b(int var0) {
        if (g) {
            return true;
        } else {
            switch (ir.a) {
                case 9:
                    if (e - 1 < z.length && var0 == z[e - 1]) {
                        return true;
                    }
                    break;
                case 23:
                    if (v - 1 < z.length && var0 == z[v - 1]) {
                        return true;
                    }
                    break;
                case 25:
                    if (f <= z.length && var0 == z[f - 1]) {
                        return true;
                    }
                    break;
                case 57:
                    if (n <= z.length && var0 == z[n - 1]) {
                        return true;
                    }
            }

            return false;
        }
    }

    public final void a(hj var1) {
        if (this.x == null) {
            this.x = StringEntity.f();
        }

        b = var1;
        if (f == 0) {
            r = new short[]{372, -1, -1, 220};
            s = new short[]{25, -1, -1, 25};
            z = new byte[]{52, -1, -1, 24};
        } else if (f == this.x.length) {
            this.b(170, 150);
            return;
        }

        if (f == 1) {
            m();
        }

        cc var2 = new cc(-9, r[f], s[f], 20);
        ir.l.addElement(var2);
        ir.a(ir.l);
        do1.a().a(r[f] * gy.Y, 20 * gy.Y);
        do1.g = true;
        main.GameGraphic.D.a(this.x[f]);
        ++f;
    }

    public final void e() {
        if (this.y == null) {
            this.y = StringEntity.e();
        }

        main.GameGraphic.D.a(this.y[w]);
        ++w;
    }

    private void j() {
        if (this.B == null) {
            this.B = StringEntity.g();
        }

        b = go.INST;
        if (A == 0) {
            r = new short[]{
                (short) (go.getInstance().v[0].a * ir.i + 12),
                (short) (go.C.a + 12),
                (short) go.W,
                (short) go.J.aw,
                (short) (go.D.a + 12)
            };
            s = new short[]{36, 36, (short) (go.X + 15), 36, 36};
        }

        int var1;
        if ((var1 = A) < 3) {
            var1 = 0;
        } else if (var1 == 3) {
            var1 = 1;
        } else if (var1 == 4) {
            var1 = 2;
        } else if (var1 == 5) {
            var1 = 3;
        } else if (var1 == 6) {
            var1 = 4;
        }

        if (A < 3 || A == 4 || A == 5) {
            cc var2 = new cc(-9, r[var1], s[var1], 20);
            ir.l.addElement(var2);
            ir.a(ir.l);
        }

        do1.a().a(r[var1] * gy.Y, 36 * gy.Y);
        do1.g = true;
        main.GameGraphic.D.a(this.B[A]);
        ++A;
        go.getInstance().ac = null;
    }

    public final void b(hj var1) {
        if (this.o == null) {
            this.o = StringEntity.h();
        }

        b = var1;
        if (n == 0) {
            r = new short[]{192};
            z = new byte[]{56};
            cc var2 = new cc(-9, r[n] + 12, 135, 20);
            ir.l.addElement(var2);
            ir.a(ir.l);
            do1.a().a(r[n] + 12, 130 * gy.Y);
        } else {
            if (n == this.o.length) {
                this.b(180, 240);
                return;
            }

            do1.g = true;
        }

        main.GameGraphic.D.a(this.o[n]);
        ++n;
    }

    public final void f() {
        if (this.m == null) {
            this.m = StringEntity.i();
        }

        b = aeClass.INST;
        if (c == 0) {
            z = new byte[]{56};
        } else {
            if (c == this.m.length) {
                this.b(170, 170);
                return;
            }

            if (c < 4) {
                r = new short[]{12, 480, 230};
                s = new short[]{110, 110, 12};
                do1.a().a(r[c - 1] * gy.Y, s[c - 1] * gy.Y);
                do1.g = true;
                cc var1 = new cc(-9, r[c - 1], s[c - 1], 20);
                ir.l.addElement(var1);
                ir.a(ir.l);
            } else {
                do1.g = false;
            }
        }

        main.GameGraphic.D.a(this.m[c]);
        ++c;
    }

    private static void m() {
        for (int var0 = 0; var0 < ir.l.size(); ++var0) {
            js var1;
            if ((var1 = (js) ir.l.elementAt(var0)).az == 1 && ((cc) var1).f == -9) {
                ir.l.removeElement(var1);
                --var0;
            }
        }

    }

    private void b(int var1, int var2) {
        this.k = 0;
        g = true;
        m();
        cc var3 = new cc(-9, var1, var2, 20);
        ir.l.addElement(var3);
        ir.a(ir.l);
        do1.a().a(var1 * gy.Y, var2 * gy.Y);
        do1.g = true;
        String[] var4 = StringEntity.j();
        main.GameGraphic.D.a(var4);
    }

    public static void g() {
        int var0;
        if ((var0 = A) < 3) {
            var0 = 0;
        } else if (var0 == 3) {
            var0 = 1;
        } else if (var0 == 4) {
            var0 = 2;
        }

        if (var0 < r.length) {
            (main.GameGraphic.D = new bb()).j();
        }

    }

    public static void h() {
        main.GameGraphic.I = true;
        A = 0;
        f = 0;
        c = 0;
        e = 0;
        p = 0;
        n = 0;
        g = false;
        d = false;
    }

    static void a(bb var0) {
        if (var0.k < var0.l.length - 1) {
            ++var0.k;
            d = true;
            var0.i();
            if (ir.a == 23) {
                if (v == 1 && var0.k == var0.l.length - 1) {
                    do1.a().a(r[0], 20);
                    do1.g = true;
                    cc var1 = new cc(-9, r[v - 1], 50, 20);
                    ir.l.addElement(var1);
                    ir.a(ir.l);
                    return;
                }
            } else if (ir.a == 9 && e == 1 && var0.k == var0.l.length - 1) {
                var0.b();
                return;
            }
        } else if (var0.k == var0.l.length - 1) {
            do1.g = false;
            if (100 == ir.a) {
                main.GameGraphic.D = null;
                return;
            }

            if (main.GameGraphic.r == ea.a && var0.q != null && p == var0.q.length) {
                var0.a();
                return;
            }

            if (ir.a == 24) {
                if (A == 3 || A == 4 || A == 5 || A == 6) {
                    m();
                    (main.GameGraphic.D = new bb()).j();
                    d = true;
                    return;
                }

                if (A == 7 && d && !g) {
                    var0.b(470, 168);
                    return;
                }
            } else if (ir.a == 25) {
                if (f == var0.x.length - 1) {
                    main.GameGraphic.D = null;
                }
            } else if (ir.a == 13) {
                var0.k = 0;
                if (!g) {
                    var0.f();
                    return;
                }
            }

            var0.i = 5;
            d = false;
        }

    }
}
