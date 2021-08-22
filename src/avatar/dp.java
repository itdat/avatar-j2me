package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public final class dp extends hj {

    public static dp a;
    private static String[] p;
    private static int q;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    private static int r = 5;
    private static int s;
    public static int f = 5;
    private static int t;
    private static int u;
    public static int g;
    private int v;
    public Vector[] h;
    private Vector w;
    private Button[] x;
    private boolean[] y;
    private String[] z;
    public static String i;
    public static int j = 0;
    public static boolean k = false;
    private static int A = 0;
    public static int l = 0;
    private static Vector B = new Vector();
    private static hj C;
    private int D;
    private int E = 0;
    public boolean m = false;
    public static boolean n = false;
    public static boolean o = false;
    private static boolean F = false;
    private static int G = 0;
    private static int H;
    private static String I = "";
    private int J;
    private int K;
    private boolean L = false;
    private int M = 0;
    private int N;

    public static dp b() {
        if (a == null) {
            a = new dp();
        }

        return a;
    }

    public final void a() {
        C = main.GameGraphic.r;
        this.D = main.GameGraphic.height + 50;
        this.E = main.GameGraphic.j();
        n = true;
        G = 86;
        if (main.GameGraphic.Z != 0) {
            G = 86 + 40 * main.GameGraphic.Z;
        }

        o = false;
        super.a();
    }

    public final void a(int var1, int var2) {
        az var4;
        switch (var1) {
            case 0:
                this.d();
                return;
            case 1:
                if (j < this.h[g].size()) {
                    ((Button) this.h[g].elementAt(j)).b.a();
                    this.m();
                }

                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 14:
            default:
                break;
            case 7:
                go.getInstance().f(var2, 0);
                return;
            case 8:
                if (var2 < gb.d.size()) {
                    ad var6 = (ad) gb.d.elementAt(var2);
                    go.getInstance().a(var6);
                }
                break;
            case 9:
                if (var2 < gb.e.size()) {
                    var4 = (az) gb.e.elementAt(var2);
                    go.getInstance().f(var4.a, 4);
                }
                break;
            case 10:
                if (var2 < go.f.size()) {
                    dc var5 = (dc) go.f.elementAt(var2);
                    go.getInstance().a((int) var5.a, var5.f);
                }
                break;
            case 11:
                if (var2 < go.e.size()) {
                    var4 = go.b(((dc) go.e.elementAt(var2)).a);
                    go.getInstance().a((int) var4.a, var4.f);
                }
                break;
            case 12:
            case 13:
                return;
            case 15:
                byte[] var3 = new byte[]{0, 102};
                if (var2 != 0 || ir.k == -1) {
                    aeClass.getInstance();
                    aeClass.f(var3[var2]);
                }

                b().d();
        }

    }

    public final void d(int var1, int var2) {
        C.d(var1, var2);
    }

    public final void d() {
        if (k) {
            k = false;
        } else {
            main.GameGraphic.y.m = false;
            this.m = false;
            C.a();
            if (main.GameGraphic.I) {
                if (ir.a == 25 && bb.f != 0) {
                    main.GameGraphic.D = new bb();
                    if (bb.f == 2) {
                        bb.f = 3;
                    }

                    main.GameGraphic.D.a((hj) aeClass.INST);
                    GameMidlet.i.K = gx.J;
                    return;
                }

                if (ir.a == 57) {
                    (main.GameGraphic.D = new bb()).b(aeClass.INST);
                }
            }

        }
    }

    public final void c() {
        super.ae = new Button(StringEntity.CLOSE, 0);
        super.ad = new Button(StringEntity.CHOOSE, 1);
    }

    public dp() {
        this.N = 80 * gy.Y;
        t = gy.af;
        e = 30 * gy.Y;
        if (main.GameGraphic.width < 150) {
            e = 24;
        }

        if (main.GameGraphic.Z == 1) {
            e = 35;
        }

        e();
        this.c();
        H = 25 * (2 - gy.Y) + 40 * (main.GameGraphic.Z + 1) + 10 * (gy.Y - 1);
    }

    public static void e() {
        c = e * 5 + 11 + gy.Z + 2;
        d = e * 6 + 10 + gy.Z;
        q = main.GameGraphic.o - e * 5 / 2;
        b = (main.GameGraphic.height - hj.at) / 2 - d / 2;
    }

    public static int f() {
        return A;
    }

    public static void g() {
        k = true;
        o();
    }

    public static boolean h() {
        return k;
    }

    public static void a(String var0) {
        if (var0 != null) {
            B.addElement(new bc(var0, main.GameGraphic.K.a(var0)));
        }

    }

    public final void a(String[] var1, Vector[] var2, Vector var3) {
        g = 0;
        this.h = var2;
        this.x = new Button[var2.length];
        this.y = new boolean[var2.length];
        this.z = new String[var2.length];
        this.w = var3;
        p = var1;
        System.out.println("addElement: " + this.h.length);
        this.v = this.h.length;
        k = false;
        je.a().a(p[g], c, d, this.v);
        this.i();
    }

    public final void i() {
        j = 0;
        u = 0;
        if (o || this.y[g]) {
            u = gy.af;
        }

        if (this.h[g] != null) {
            if ((s = this.h[g].size() / 5) >= 3 && !this.m && !o && !this.y[g]) {
                f = 5;
            } else {
                f = 2;
            }

            if (this.h[g].size() % 5 != 0) {
                ++s;
            }

            if (s < f) {
                s = f;
            }
        }

        int var1 = 1;
        if (this.h[g] == null) {
            r = 1;
        } else {
            var1 = this.h[g].size();
            r = 5;
        }

        l = -e / 2;
        if (f > 2 || o || this.y[g]) {
            l = 0;
        }

        main.GameGraphic.y.a(q, je.a().h + je.o + gy.Z + (!o && !this.y[g] ? 0 : u), e, e, e * r, e * s, e * 5, f * e - l, var1);
        this.m();
        je.a().a(p[g], g);
    }

    public final void k() {
        C.k();
        if (this.D != 0) {
            this.D += -this.D >> 1;
        }

        if (this.D == -1) {
            this.D = 0;
        }

        if (this.h[g] != null) {
            int var1 = this.h[g].size();

            for (int var2 = 0; var2 < var1; ++var2) {
                if (n) {
                    ((Button) this.h[g].elementAt(var2)).a();
                }
            }
        }

        if (this.x[g] != null) {
            super.ac = this.x[g];
        } else {
            super.ac = null;
        }
    }

    public static void j() {
        GameMidlet.m = "frp1qr";
        awClass.b = "frp2qr";
        je.k = main.GameGraphic.a(GameMidlet.m, -2);
    }

    public final void a(Button var1, int var2) {
        this.x[var2] = var1;
    }

    public final void l() {
        int var2;
        if (k) {
            if (main.GameGraphic.a(4)) {
                this.c(-1);
                this.J = 5;
            } else if (main.GameGraphic.a(6)) {
                this.c(1);
                this.K = 5;
            }

            if (main.GameGraphic.a(0, 0, main.GameGraphic.width, main.GameGraphic.height - main.GameGraphic.T)) {
                main.GameGraphic.g = false;
            }

            if (main.GameGraphic.f) {
                var2 = j % r * e;
                int var3 = (j / r + 1) * e;
                if (var2 + e / 2 - G / 2 + q + 5 < 0) {
                    var2 = -e / 2 + G / 2 - q - 5;
                } else if (var2 + e / 2 - G / 2 + G > main.GameGraphic.width) {
                    var2 = main.GameGraphic.width - G - e / 2 + G / 2;
                }

                var2 += q;
                var3 += b + je.o + gy.Z;
                int var4 = (H - (gy.Z << 1)) / 4;
                var3 += gy.Z + 8;
                var2 = var2 + e / 2 - 35 * (main.GameGraphic.Z + 1) / 2 - 2 - 10 - 10 * gy.Y;
                var3 = var3 + var4 / 2 + var4 + gy.ah / 2;
                if (main.GameGraphic.a(var2, var3 - 15 * gy.Y - 5, 20 + 20 * gy.Y, 30 * gy.Y)) {
                    this.c(-1);
                    this.J = 5;
                } else if (main.GameGraphic.a(var2 + 35 * (main.GameGraphic.Z + 1), var3 - 15 * gy.Y - 5, 20 + 20 * gy.Y, 30 * gy.Y)) {
                    this.c(1);
                    this.K = 5;
                } else if (main.GameGraphic.a(var2 + 20 + 20 * gy.Y, var3 - 15 * gy.Y - 5, var2 + 35 * (main.GameGraphic.Z + 1) - (var2 + 20 + 20 * gy.Y), 30 * gy.Y)) {
                    super.ad.b();
                }
            }

            if (this.J > 0) {
                --this.J;
            }

            if (this.K > 0) {
                --this.K;
            }
        } else {
            dp var1 = this;
            if (main.GameGraphic.a(6)) {
                if (j % r != r - 1 && r != 1 && !F) {
                    ++j;
                } else {
                    this.b(1);
                }

                main.GameGraphic.y.a(j);
                this.m();
            } else if (main.GameGraphic.a(4)) {
                if (j % r != 0 && r != 1 && !F) {
                    --j;
                } else {
                    this.b(-1);
                }

                main.GameGraphic.y.a(j);
                this.m();
            } else if (main.GameGraphic.a(2)) {
                if (this.h[g] != null && this.h[g].size() > 0 && !F) {
                    if (j / r > 0) {
                        j -= r;
                    } else {
                        for (var2 = 0; var2 < var1.h.length; ++var2) {
                            if (var2 != g) {
                                je.a().a(4, var2);
                            }
                        }

                        F = true;
                    }
                }

                main.GameGraphic.y.a(j);
                var1.m();
            } else if (main.GameGraphic.a(8)) {
                if (F) {
                    F = false;

                    for (var2 = 0; var2 < var1.h.length; ++var2) {
                        if (var2 != g) {
                            je.a().a(0, var2);
                        }
                    }
                } else if (r > 1 && j / r + 1 < s) {
                    j += r;
                }

                main.GameGraphic.y.a(j);
                var1.m();
            }

            if (main.GameGraphic.g && (var2 = je.a().d()) != 0) {
                var1.b(var2);
                main.GameGraphic.g = false;
            }
        }

        super.l();
    }

    private void c(int var1) {
        if ((A += var1) < 0) {
            A = 99;
        }

        if (A > 99) {
            A = 0;
        }

        this.m();
        o();
    }

    public final void a(int var1, boolean var2) {
        if (!k) {
            if (j == var1 && super.ad != null && !var2) {
                super.ad.b();
            }

            j = var1;
            this.m();
        }
    }

    private static void o() {
        if (g == 1) {
            az var0;
            I = main.GameGraphic.a((var0 = (az) gb.e.elementAt(j)).g * A, var0.h * A, true);
        } else {
            I = main.GameGraphic.a(gb.b[j].g[0] * A, gb.b[j].g[1] * A, true);
        }

        if ((G = main.GameGraphic.K.a(I) + 16 + 30 * main.GameGraphic.Z) < 86 * gy.Y) {
            G = 86 * gy.Y;
        }

        if (main.GameGraphic.Z != 0) {
            G = 86 + 40 * main.GameGraphic.Z;
        }

    }

    public final void b(int var1) {
        if ((g += var1) == this.v) {
            g = 0;
        }

        if (g < 0) {
            g = this.v - 1;
        }

        this.i();
    }

    public final void m() {
        if (this.h[g] != null && j < this.h[g].size()) {
            super.ad = (Button) this.h[g].elementAt(j);
        } else if (this.w != null && g < this.w.size()) {
            Button var1;
            if ((var1 = (Button) this.w.elementAt(g)) != null) {
                super.ad = var1;
            }
        } else {
            super.ad = null;
        }

        n = true;
        this.E = main.GameGraphic.j();
    }

    public final void a(boolean var1) {
        this.L = var1;
    }

    public final void a(Graphics var1) {
        C.b(var1);
        main.GameGraphic.c(var1);
        je.a().a(var1);
        var1.setColor(0);
        var1.translate(q, je.a().h + je.o + gy.Z);
        int var3;
        int var4;
        if (o) {
            String var2 = main.GameGraphic.a(GameMidlet.i.a[0], GameMidlet.i.a[2], GameMidlet.i.b, true);
            var3 = main.GameGraphic.N.a(var2);
            if (awClass.f(var4 = this.M) > var3 + 20 - (c - 20)) {
                var4 = 0;
            }

            var1.setClip(0, 0, c - 20, 20);
            main.GameGraphic.N.a(var1, var2, var4, 0, 0);
            if (var3 > c - 20) {
                if (awClass.f(this.M) > var3 + 50 - (c - 20)) {
                    this.M = 0;
                }

                --this.M;
            }

            var1.translate(0, u);
        }

        if (this.h[g] != null) {
            if (this.y[g]) {
                main.GameGraphic.N.a(var1, this.z[g], 0, 0, 0);
                var1.translate(0, u);
            }

            var1.setClip(0, 0, 5 * e, f * e - l);
            var1.translate(0, -ho.i);

            int var9;
            for (var9 = 0; var9 < s * r; ++var9) {
                je.a(var1, e * (var9 % r), e * (var9 / r), e, e);
            }

            if (!this.L && !F) {
                je.a(3 + j % r * e, j / r * e + 3, e - 5, e - 5, 2293623, var1);
            }

            var9 = this.h[g].size();
            if ((var3 = ho.i / e * r) < 0) {
                var3 = 0;
            }

            if ((var4 = ho.i / e * r + (f + 1) * r) > this.h[g].size()) {
                var4 = this.h[g].size();
            }

            for (var3 = var3; var3 < var4 && var3 < var9; ++var3) {
                ((Button) this.h[g].elementAt(var3)).a(var1, e * (var3 % r), e * (var3 / r));
            }

            var1.translate(0, ho.i - l);
            var1.setClip(0, 0, c - 9, d);
            int var5;
            int var7;
            Graphics var11;
            bc var12;
            if (f == 2) {
                if (o && aeClass.C != null) {
                    var1.translate(0, u);
                    var1.setColor(10674392);
                    var1.fillTriangle(30 * gy.Y, f * e - (gy.Y == 2 ? 10 : 0), 8 * gy.Y, f * e + 40 * gy.Y, 30 * gy.Y + 22 * gy.Y, f * e + 40 * gy.Y);
                    var1.setColor(13364969);
                    var1.fillArc(8 * gy.Y, f * e + 40 * gy.Y - 10 * gy.Y, 44 * gy.Y, 20 * gy.Y, 0, 360);
                    aeClass.C.a(var1, 30 * gy.Y, f * e + 45 * gy.Y, false);
                    var1.translate(60 * gy.Y, 0);
                }

                var11 = var1;
                if (B != null && j < this.h[g].size()) {
                    var4 = o ? 80 : 0;
                    var1.setClip(0, f * e, c - var4 + 5, d);

                    for (var5 = 0; var5 < B.size(); ++var5) {
                        var12 = (bc) B.elementAt(var5);
                        var7 = 0;
                        if (var12.c > c + 5 - var4) {
                            var12.a(c + 5 - var4);
                            if (var12.d >= 0) {
                                var7 = var12.d;
                            }
                        }

                        main.GameGraphic.N.a(var11, var12.a, 2 - var7, f * e + var5 * t, 0);
                    }
                }
            } else {
                var11 = var1;
                dp var10 = this;
                if (main.GameGraphic.j() - this.E > 0 && !k && B != null && j < this.h[g].size()) {
                    var4 = j % r * e - this.N / 2 + e / 2;
                    var5 = (j / r + 1) * e - ho.i + 5;
                    int var6 = B.size() * gy.af + (gy.Z << 1) + 8;
                    if (var5 + var6 + b + 12 > main.GameGraphic.height) {
                        var5 -= var6 + e + 10;
                    }

                    if (var5 + b < 0) {
                        var5 = -b;
                    }

                    if (var4 + q + 5 + this.N > main.GameGraphic.width) {
                        var4 = main.GameGraphic.width - (q + 5 + this.N);
                    } else if (var4 + q < 0) {
                        var4 = -q;
                    }

                    var1.setClip(var4, var5, this.N, var6 * gy.Y);
                    main.GameGraphic.S.a(var1, var4, var5, this.N, var6, je.d[2], je.d[3], 1);
                    var4 += gy.Z;
                    var5 += gy.Z - gy.af / 2;

                    for (var7 = 0; var7 < B.size(); ++var7) {
                        var12 = (bc) B.elementAt(var7);
                        int var8 = 0;
                        if (var12.c > var10.N + 5) {
                            var12.a(var10.N);
                            if (var12.d >= 0) {
                                var8 = var12.d;
                            }
                        }

                        main.GameGraphic.N.a(var11, var12.a, var4 - var8, var5 + 5 + var7 * t, 0);
                    }
                }
            }

            if (k) {
                main.GameGraphic.c(var1);
                var1.translate(q, main.GameGraphic.y.e);
                main.GameGraphic.S.a(var1, j, r, e, G, q, H, g, A, I, this.J, this.K);
            }
        } else {
            var1.setClip(-5, 0, c - 10, d);
            ((Button) this.w.elementAt(g)).a(var1, 0, 0);
        }

        if (main.GameGraphic.D == null || bb.g || !bb.d) {
            super.a(var1);
        }

        main.GameGraphic.a(var1);
    }

    public static void n() {
        n = false;
        B.removeAllElements();
        if (k) {
            o();
        }

    }
}
