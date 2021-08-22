package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public final class kd extends kx {

    public static kd a;
    private Vector c;
    private byte[] d;
    private byte e;
    private Vector f;
    private byte[] g;
    private byte h;
    private Vector K;
    private Button L;
    private Button M;
    private boolean N = false;
    private static int O;
    private static int P;
    private int Q = -1;
    private int R;
    private int S;
    private boolean T = false;
    private boolean U = false;
    private int V = 0;
    private boolean W = false;
    public boolean b = true;

    static {
        awClass.a.setSeed(System.currentTimeMillis());
    }

    public static kd b() {
        return a == null ? (a = new kd()) : a;
    }

    public final void a_() {
        System.out.println("resetCard");
        this.c = new Vector();
        this.e = -1;
        this.d = new byte[0];
        super.o = -1;
        this.g = new byte[0];
        this.h = -1;
        super.n = -1;
        this.f = new Vector();
        super.a_();
    }

    private static void a(Vector var0) {
        int var1 = var0.size();

        for (int var2 = 0; var2 < var1 - 1; ++var2) {
            for (int var3 = var2 + 1; var3 < var1; ++var3) {
                ax var4 = (ax) var0.elementAt(var2);
                ax var5 = (ax) var0.elementAt(var3);
                if (var4.b > var5.b) {
                    Object var7 = var0.elementAt(var3);
                    var0.setElementAt(var0.elementAt(var2), var3);
                    var0.setElementAt(var7, var2);
                }
            }
        }

    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 20:
                this.Q = -1;
                break;
            case 21:
                main.GameGraphic.b(StringEntity.Q, 70);
                break;
            case 70:
                super.n = -1;
                this.W = false;
                ie.a().e();
                main.GameGraphic.h();
        }

        super.a(var1, var2);
    }

    public kd() {
        this.M = new Button(StringEntity.F, 20);
        this.L = new Button(StringEntity.B, 21);
        this.t();
    }

    private void t() {
        this.S = main.GameGraphic.height - main.GameGraphic.T;
        if (main.GameGraphic.width < 150) {
            O = 26;
            P = 32;
            this.S = main.GameGraphic.height2 - main.GameGraphic.T - 10;
        } else {
            O = 54;
            P = 72;
        }

        if (gy.Y == 2) {
            O = 144;
            P = 194;
        }

        String[] var10000 = new String[]{"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "Heo"};
    }

    public final void e() {
        super.e();
        this.t();
        if (kx.j) {
            this.d(false);
        }

        this.c = null;
    }

    public final void g() {
        this.a_();
        super.g();
    }

    private void u() {
        ((ax) this.K.elementAt(super.o)).f = !((ax) this.K.elementAt(super.o)).f;
        this.g = this.v();
        this.h = cv.b(this.g);
        if (this.h != -1) {
            kx.a(StringEntity.eE[this.h], 10, -1);
        }

        this.d(false);
    }

    protected final void j() {
        super.j();
        if (this.W) {
            boolean var1 = false;

            for (int var2 = 0; var2 < this.g.length; ++var2) {
                if (this.g[var2] == 0) {
                    var1 = true;
                }
            }

            if (!var1) {
                kx.a(GameMidlet.i.w, StringEntity.R);
                return;
            }

            this.W = false;
        }

        if (this.c != null && this.c.size() != 0) {
            boolean var10000;
            label129:
            {
                byte var4 = this.e;
                byte[] var3 = this.d;
                byte var6 = this.h;
                byte[] var5 = this.g;
                switch (var4) {
                    case -1:
                        if (var6 != -1) {
                            var10000 = true;
                            break label129;
                        }
                    case 0:
                        if (var6 == 0 && var5[0] > var3[0]) {
                            var10000 = true;
                            break label129;
                        }

                        if (var3[0] / 4 != 12 || var6 != 4 && var6 != 5 && var6 != 6) {
                            break;
                        }

                        var10000 = true;
                        break label129;
                    case 1:
                        if (var6 == 1 && var5.length == var3.length && var5[var5.length - 1] > var3[var3.length - 1]) {
                            var10000 = true;
                            break label129;
                        }
                        break;
                    case 2:
                        if (var6 == 2 && var5[1] > var3[1]) {
                            var10000 = true;
                            break label129;
                        }

                        if (var3[0] / 4 != 12 || var6 != 6 && var6 != 5) {
                            break;
                        }

                        var10000 = true;
                        break label129;
                    case 3:
                        if (var6 == 3 && var5[2] > var3[2]) {
                            var10000 = true;
                            break label129;
                        }
                        break;
                    case 4:
                        if (var6 == 4 && var5[5] > var3[5] || var6 == 6 || var6 == 5) {
                            var10000 = true;
                            break label129;
                        }
                        break;
                    case 5:
                        if (var6 == 5 && var5[7] > var3[7]) {
                            var10000 = true;
                            break label129;
                        }
                        break;
                    case 6:
                        if (var6 == 6 && var5[3] > var3[3] || var6 == 5) {
                            var10000 = true;
                            break label129;
                        }
                }

                var10000 = false;
            }

            if (!var10000) {
                kx.a(GameMidlet.i.w, StringEntity.S);
                return;
            }
        }

        ie.a().a(this.g);
        super.n = -1;
        super.ae = null;
    }

    private void c(boolean var1) {
        ((ax) this.K.elementAt(super.o)).f = var1;
        this.g = this.v();
        this.h = cv.b(this.g);
        this.d(false);
    }

    private void b(int var1) {
        if (this.Q == -1) {
            super.o += var1;
            if (super.o >= this.K.size()) {
                super.o = 0;
            }

            if (super.o < 0) {
                super.o = this.K.size() - 1;
                return;
            }
        } else {
            if (this.Q > 0 || this.Q < this.K.size() - 1) {
                ax var2 = (ax) this.K.elementAt(this.Q + var1);
                this.K.setElementAt(this.K.elementAt(this.Q), this.Q + var1);
                this.K.setElementAt(var2, this.Q);
                this.Q += var1;
                super.o = this.Q;
            }

            this.d(true);
        }

    }

    public final void l() {
        super.l();
        if (kx.j) {
            int var1 = this.K.size();
            if (this.K != null && var1 > 0) {
                if (main.GameGraphic.g && main.GameGraphic.a(this.R - O / 2, this.S - P / 2 - 30, super.y * (var1 - 1) + O, P + 15)) {
                    this.U = true;
                    main.GameGraphic.g = false;
                    this.V = (main.GameGraphic.j - (this.R - O / 2)) / super.y;
                    this.T = true;
                    super.o = this.V;
                }

                if (this.U) {
                    var1 = main.GameGraphic.k();
                    int var2 = main.GameGraphic.l();
                    if (main.GameGraphic.e) {
                        if (var2 > 10) {
                            this.c(true);
                        } else if (var2 < -10) {
                            this.c(false);
                        } else if (awClass.f(var1) > 10) {
                            if (this.T) {
                                this.Q = super.o;
                            }

                            this.T = false;
                            int var3 = (main.GameGraphic.h - (this.R - O / 2)) / super.y;
                            if (super.o != var3) {
                                if (this.Q != -1) {
                                    if (var3 < this.Q) {
                                        this.b(-1);
                                    } else if (var3 > this.Q) {
                                        this.b(1);
                                    }

                                    super.o = this.Q;
                                    this.T = true;
                                    return;
                                }

                                this.T = false;
                            }

                            super.o = var3;
                            if (super.o < 0) {
                                super.o = 0;
                            }

                            if (super.o >= this.K.size()) {
                                super.o = this.K.size() - 1;
                            }

                            this.d(true);
                        }
                    }

                    if (main.GameGraphic.f) {
                        this.U = false;
                        this.Q = -1;
                        if (awClass.f(var1) <= 10 && awClass.f(var2) <= 10) {
                            this.c(!((ax) this.K.elementAt(super.o)).f);
                        }
                    }
                }
            }

            if (main.GameGraphic.a(6)) {
                this.b(1);
            } else if (main.GameGraphic.a(4)) {
                this.b(-1);
            }

            if (main.GameGraphic.a(2)) {
                if (this.Q != -1) {
                    this.Q = -1;
                    this.d(true);
                    return;
                }

                this.u();
                this.d(true);
            }

            if (main.GameGraphic.a(8)) {
                if (((ax) this.K.elementAt(super.o)).f) {
                    this.u();
                    this.d(true);
                    return;
                }

                this.Q = super.o;
                this.d(true);
            }
        }

    }

    public final void k() {
        super.k();
        ax var2;
        int var3;
        if (kx.j && this.K != null && this.K.size() > 0) {
            for (int var1 = this.K.size() - 1; var1 >= 0 && (var3 = (var2 = (ax) this.K.elementAt(var1)).a()) != 1; --var1) {
                if (var3 == -1) {
                    var2.g = false;
                }
            }
        }

        if (kx.t != 0L && (kx.u = System.currentTimeMillis()) > kx.t) {
            if (super.n == GameMidlet.i.w) {
                ie.a().e();
                super.n = -1;
            }

            kx.t = 0L;
        }

        if (!kx.j && !kx.k) {
            this.q();
            super.ae = null;
        } else if (this.Q != -1) {
            super.ac = null;
            super.ae = null;
            if (main.GameGraphic.Z == 0) {
                super.ad = this.M;
            }

        } else {
            if (kx.l) {
                super.ac = null;
                super.ad = kx.C;
                super.ae = null;
            } else if (super.n == GameMidlet.i.w) {
                super.ae = this.L;
                if (this.v().length > 0) {
                    if (this.h != -1) {
                        super.ad = kx.D;
                    } else {
                        super.ad = null;
                    }
                } else {
                    super.ad = null;
                }
            } else {
                super.ae = null;
                super.ad = null;
            }

            kd var4 = this;
            if (this.c != null && this.N) {
                for (int var5 = 0; var5 < var4.c.size(); ++var5) {
                    ax var6;
                    if ((var6 = (ax) var4.c.elementAt(var5)) != null) {
                        var3 = var6.a();
                        if (var5 == var4.c.size() - 1 && var3 == 0) {
                            var4.N = false;
                        }
                    }
                }
            }

        }
    }

    private void d(boolean var1) {
        int var2;
        if (this.K.size() > 0 && !var1) {
            var2 = 12;
            if (main.GameGraphic.H && (var2 = (main.GameGraphic.width - O / 2) / this.K.size()) > O / 3 << 1) {
                var2 = O / 3 << 1;
            }

            super.y = (main.GameGraphic.width - 60) / this.K.size() + 1;
            if (super.y > var2) {
                super.y = var2;
            }

            if (super.y < 9) {
                super.y = 9;
            }

            if (main.GameGraphic.H) {
                super.y = var2;
            }

            this.R = (main.GameGraphic.width - (super.y * this.K.size() + (O - super.y)) >> 1) + O / 2;
            if (this.R < O / 2) {
                this.R = O / 2;
            }
        }

        var2 = this.K.size();
        int var3 = this.R;

        for (int var4 = 0; var4 < var2; ++var4) {
            ax var5 = (ax) this.K.elementAt(var4);
            int var6 = 0;
            if (var5.f) {
                var6 = -8 * (main.GameGraphic.Z + 1);
            }

            int var8 = this.S + var6;
            var5.m = var3;
            var5.l = var8;
            var5.e = awClass.a(var5.c, var5.d, var5.m, var5.l);
            if (var4 == this.Q && !main.GameGraphic.H) {
                var5.l += 8 * (main.GameGraphic.Z + 1);
            }

            var3 += super.y;
            if (var1) {
                var5.c = var5.m;
                var5.d = var5.l;
            }
        }

    }

    public final void a(Graphics var1) {
        this.b(var1);
        super.a(var1);
    }

    public final void a_(Graphics var1) {
        for (int var2 = 0; var2 < kx.H; ++var2) {
            hn var3;
            if ((var3 = (hn) kx.m.elementAt(var2)).w != -1) {
                if (var3.w != GameMidlet.i.w || !kx.j) {
                    var3.a(var1, var3.aw, var3.ax, false);
                }

                var3.a(var1, var3.aw, var3.ax);
                kx.a(var1, var3.aw, var3.ax - 50, 3, var3);
            }
        }

    }

    public final void b(Graphics var1) {
        super.b(var1);
        this.a_(var1);
        if ((kx.j || kx.k) && this.c != null && this.c.size() != 0) {
            Graphics var5 = var1;
            kd var4 = this;
            int var6 = this.c.size();

            for (int var7 = 0; var7 < var6; ++var7) {
                ax var8 = (ax) var4.c.elementAt(var7);
                if (main.GameGraphic.width < 150) {
                    var8.a(var5, false);
                } else if (var7 == var6 - 1) {
                    var8.c(var5);
                } else {
                    var8.a(var5);
                }
            }

            if (!this.N) {
                this.N = true;
            }
        }

        if (kx.j || kx.k) {
            Graphics var3 = var1;
            kd var2 = this;

            for (int var11 = 0; var11 < 4; ++var11) {
                hn var12;
                if ((var12 = (hn) kx.m.elementAt(var11)).w != -1) {
                    byte var13 = 0;
                    byte var14 = 0;
                    if (kx.x[var11] == 2) {
                        var13 = -80;
                    }

                    if (kx.x[var11] == 1) {
                        var14 = -10;
                    } else if (kx.x[var11] == 3) {
                        var14 = 10;
                    }

                    if (main.GameGraphic.width > 160) {
                        main.GameGraphic.Q.a(var3, var12.c() + " " + StringEntity.k(), kx.F[kx.x[var11]].a + var14, kx.F[kx.x[var11]].b + 5 + var13, kx.F[kx.x[var11]].c);
                    }

                    if (var12.w == var2.n && var2.ad != kx.C) {
                        String var15 = "";
                        if (kx.t != 0L) {
                            long var9 = (kx.u - kx.t) / 1000L;
                            var15 = var15 + -var9;
                        }

                        int var16 = kx.F[kx.x[var11]].a;
                        int var10 = kx.F[kx.x[var11]].b + 13 * gy.Y;
                        if (kx.x[var11] == 2) {
                            var10 = var2.S - P / 2 - 20 * gy.Y;
                        }

                        je.a(var16 - 10 * gy.Y, var10, 20 * gy.Y, gy.af, 16776365, var3);
                        var3.setColor(332544);
                        var3.drawRect(var16 - 10 * gy.Y, var10, 20 * gy.Y, gy.af);
                        main.GameGraphic.N.a(var3, var15, var16, var10 + 1, 2);
                    }
                }
            }
        }

        if (kx.j) {
            this.e(var1);
        }

        if (kx.j || kx.k) {
            this.f(var1);
        }

        kx.d(var1);
        main.GameGraphic.c(var1);
    }

    private void e(Graphics var1) {
        if (kx.j && this.K != null && this.K.size() > 0) {
            int var2 = this.K.size();
            int var3 = 0;
            int var4 = 0;

            for (int var5 = 0; var5 < var2; ++var5) {
                ax var6 = (ax) this.K.elementAt(var5);
                ax var7;
                (var7 = new ax((byte) -1, false)).c = var6.c;
                var7.d = var6.d;
                if (!var6.g) {
                    var7 = (ax) this.K.elementAt(var5);
                }

                if (main.GameGraphic.width < 150) {
                    var7.a(var1, false);
                } else if (var5 == var2 - 1 || var5 == this.Q || var6.f || var5 == this.Q - 1 || var7 != null && var7.f) {
                    var7.c(var1);
                } else if (super.y <= 14 && var7.c == var7.m && var7.d == var7.l) {
                    var7.a(var1);
                } else {
                    var7.b(var1);
                }

                if (var5 == super.o) {
                    var4 = var7.d - P / 2 - 2 + (main.GameGraphic.l % 10 > 4 ? 2 : 0);
                    var3 = var7.c - O / 2 + 5 * gy.Y;
                }

                if (main.GameGraphic.Z == 0 && var5 == this.Q && main.GameGraphic.l % 10 > 6 && gy.Y == 1) {
                    je.b.a(0, var6.c - 40, var6.d - 30, 0, var1);
                    je.b.a(0, var6.c - 10, var6.d - 30, 3, var1);
                }
            }

            if (main.GameGraphic.Z == 0) {
                ea.b().b.a(0, var3, var4, 0, 33, var1);
            }
        }

    }

    private void f(Graphics var1) {
        if (this.f != null && this.f.size() != 0) {
            int var2 = this.f.size();
            int var3;
            if ((var3 = (main.GameGraphic.width - 60) / var2 + 1) > 12) {
                var3 = 12;
            }

            int var4 = main.GameGraphic.o - (var3 * var2 >> 1) + 6;
            int var5 = (main.GameGraphic.height + main.GameGraphic.T) / 2;

            for (int var6 = 0; var6 < var2; ++var6) {
                ax var7;
                (var7 = (ax) this.f.elementAt(var6)).c = var4;
                var7.d = var5;
                var4 += var3 * gy.Y;
                if (main.GameGraphic.width < 150) {
                    var7.a(var1, false);
                } else if (var6 == var2 - 1) {
                    var7.c(var1);
                } else {
                    var7.a(var1);
                }
            }

        }
    }

    public final void a(int var1, byte var2, Vector var3) {
        hj.z();
        this.t();
        super.s();
        kx.j = true;
        this.W = false;
        int var4;
        if (this.b && var1 == GameMidlet.i.w) {
            for (var4 = 0; var4 < var3.size(); ++var4) {
                if (((ax) var3.elementAt(var4)).b == 0) {
                    this.W = true;
                    break;
                }
            }
        }

        this.f = null;
        this.c = new Vector();
        this.e = -1;
        this.d = new byte[0];
        kx.l = false;
        this.K = var3;
        a(var3);

        for (var4 = 0; var4 < this.K.size(); ++var4) {
            ax var5;
            (var5 = (ax) this.K.elementAt(var4)).c = main.GameGraphic.o;
            var5.d = (main.GameGraphic.height + main.GameGraphic.T) / 2;
            var5.g = true;
        }

        for (int var6 = 0; var6 < kx.H; ++var6) {
            kx.m.elementAt(var6);
        }

        kx.v = var2;
        kx.t = System.currentTimeMillis() + (long) (var2 * 1000);
        if (var1 == GameMidlet.i.w) {
            super.ae = this.L;
        }

        hn var7 = kx.h(var1);
        kx.a(var7.x + StringEntity.U, 20, var7.w);
        this.e = -1;
        this.d = new byte[0];
        super.o = 2;
        super.n = var1;
        this.f();
        this.d(false);
    }

    public final void a(int var1, byte[] var2, int var3) {
        this.W = false;
        if (var1 != -1) {
            int var4 = kx.i(var1);
            int var6 = kx.x[var4];
            byte[] var5 = var2;
            kd var15 = this;
            int var7 = 0;
            int var8 = 0;
            int var10;
            switch (var6) {
                case 0:
                    var7 = main.GameGraphic.o;
                    var8 = -27;
                    break;
                case 1:
                    var7 = -10;
                    var8 = (main.GameGraphic.height + main.GameGraphic.T) / 2 - 20;
                    break;
                case 2:
                    var7 = main.GameGraphic.o;
                    var8 = main.GameGraphic.height + main.GameGraphic.T - 20;
                    var6 = this.K.size() - 1;

                    for (; var6 >= 0; --var6) {
                        ax var9 = (ax) var15.K.elementAt(var6);

                        for (var10 = 0; var10 < var5.length; ++var10) {
                            if (var9.b == var5[var10]) {
                                var7 = var9.c;
                                var8 = var9.d;
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    var7 = main.GameGraphic.width + 10;
                    var8 = (main.GameGraphic.height + main.GameGraphic.T) / 2 - 20;
            }

            var6 = main.GameGraphic.o + awClass.a.nextInt(20);
            int var16 = main.GameGraphic.height / 2 - 20 * gy.Y + awClass.a.nextInt(25);
            var10 = var5.length;
            int var11;
            if ((var11 = (main.GameGraphic.width - 60) / var10 + 1) > 12) {
                var11 = 12;
            }

            int var12 = (var11 * var10 >> 1) + 6;
            var15.N = true;
            var15.c = new Vector();
            var15.d = var5;

            for (int var13 = 0; var13 < var10; ++var13) {
                ax var14;
                (var14 = new ax(var5[var13])).c = var7 + var13 * var15.y;
                var14.d = var8;
                var14.m = var6 - var12;
                var14.l = var16;
                var12 -= var11 * gy.Y;
                var15.c.addElement(var14);
            }

            var15.e = cv.b(var15.d);
        }

        if (var1 == GameMidlet.i.w) {
            this.a(var2);
            super.o = 0;
            this.d(false);
        }

        super.n = var3;
        if (super.n == GameMidlet.i.w) {
            if (this.v().length == 0) {
                super.ae = this.L;
            } else {
                super.ae = kx.D;
            }
        } else {
            super.ae = null;
        }

        if (kx.v == 0) {
            kx.v = 30;
        }

        kx.t = System.currentTimeMillis() + (long) (kx.v * 1000);
    }

    public final void a(int var1, int var2, boolean var3) {
        if (var3) {
            hj.z();
        }

        String var4;
        hn var5;
        if ((var5 = kx.h(var1)).x.equals("")) {
            var4 = StringEntity.u;
        } else {
            var4 = StringEntity.B;
        }

        kx.a(var4, 60, var5.w);
        super.n = var2;
        if (var3) {
            this.c = new Vector();
            this.e = -1;
            this.d = new byte[0];
        }

        if (super.n == GameMidlet.i.w) {
            if (this.v().length == 0) {
                super.ae = this.L;
            } else {
                super.ae = kx.D;
            }
        } else {
            super.ae = null;
        }

        kx.t = System.currentTimeMillis() + (long) (kx.v * 1000);
    }

    public final void a(int var1, byte[] var2) {
        hn var3 = kx.h(var1);
        cv.a(var2);
        this.f = new Vector();

        for (int var4 = 0; var4 < var2.length; ++var4) {
            this.f.addElement(new ax(var2[var4]));
        }

        if (var3 != null && var3.w == var1 && this.K != null) {
            this.K.removeAllElements();
        }

    }

    public static void a(int var0, byte var1, int var2, int var3) {
        hn var4;
        if ((var4 = kx.h(var0)) != null) {
            var4.o = false;
            if ((var3 += var4.n) < 0) {
                var3 = 0;
            }

            var4.d(var3);
            var4.b(var4.c() + var2);
            if (var4.w == GameMidlet.i.w) {
                GameMidlet.i.b(var4.c());
            }
        }

        kx.a(var0, StringEntity.W + (var1 + 1));
    }

    public static void m() {
        kx.l = true;
    }

    public final void b(String var1) {
        kx.a(var1, 100, GameMidlet.i.w);
        super.n = GameMidlet.i.w;
    }

    public static void b(boolean var0) {
        hj.z();
        kx.j = false;
    }

    private void a(byte[] var1) {
        for (int var2 = this.K.size() - 1; var2 >= 0; --var2) {
            ax var3 = (ax) this.K.elementAt(var2);

            for (int var4 = 0; var4 < var1.length; ++var4) {
                if (var3.b == var1[var4]) {
                    this.K.removeElementAt(var2);
                }
            }
        }

    }

    private byte[] v() {
        Vector var1 = new Vector();
        int var2 = this.K.size();

        int var3;
        for (var3 = 0; var3 < var2; ++var3) {
            ax var4;
            if ((var4 = (ax) this.K.elementAt(var3)).f) {
                var1.addElement(var4);
            }
        }

        byte[] var5 = new byte[var3 = var1.size()];

        for (var2 = 0; var2 < var3; ++var2) {
            var5[var2] = ((ax) var1.elementAt(var2)).b;
        }

        cv.a(var5);
        return var5;
    }
}
