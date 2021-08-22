package avatar;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class kg extends kx {

    public static kg a;
    private int[] e = new int[4];
    private ax[][] f = new ax[4][4];
    private dr g;
    private dr h;
    public static dr[] b;
    public static dr[] c;
    public static dr[] d;
    private dr K;
    private int[] L = new int[10];
    private boolean M;
    private ax N;
    private ax[] O = new ax[10];
    private ax[] P = new ax[3];
    private int[][] Q = new int[4][12];
    private int[][] R = new int[4][3];
    private int[] S = new int[4];
    private int[] T = new int[4];
    private int[][] U = new int[4][11];
    private byte[] V = new byte[4];
    private byte[] W = new byte[4];
    private int X;
    private int ay;
    private int az;
    private int aA;
    private int aB;
    private int aC;
    private ax aD;
    private int aE;
    private boolean aF;
    private int aG;
    private boolean aH;
    private boolean aI;
    private int[] aJ = new int[4];
    private int aK;
    private boolean aL;
    private boolean aM;
    private boolean aN;
    private dr aO;
    private ax aP;
    private ax aQ;
    private int aR = 473848;
    private int aS = 517368;
    private int aT = 522270;
    private static int aU = 12;
    private static int aV = 12;
    private Button aW;
    private Button aX;
    private Button aY;
    private int aZ;
    private int ba = 0;
    private boolean bb = false;
    private int bc = -2;
    private int bd;
    private ax be = null;
    private int[] bf = new int[5];
    private int bg = 0;

    public static kg b() {
        if (a == null) {
            a = new kg();
        }

        return a;
    }

    public final void a_() {
        this.t();
        super.a_();
    }

    private void t() {
        int var1;
        for (var1 = 0; var1 < 10; ++var1) {
            this.O[var1] = new ax((byte) -1, true);
            this.L[var1] = -1;
            if (var1 < 3) {
                this.P[var1] = new ax((byte) -1, true);
            }
        }

        this.f = new ax[4][4];
        super.o = 0;
        this.aB = -1;
        this.h = new dr();
        this.h.a = this.g.a;
        this.h.b = this.g.b;
        this.M = false;

        for (var1 = 0; var1 < 4; ++var1) {
            int var2;
            for (var2 = 0; var2 < 4; ++var2) {
                if (var2 < 3) {
                    this.R[var1][var2] = -1;
                }
            }

            for (var2 = 0; var2 < 12; ++var2) {
                this.Q[var1][var2] = -1;
                if (var2 < 11) {
                    this.U[var1][var2] = -1;
                }
            }

            this.aJ[var1] = -1;
            this.e[var1] = 0;
            this.S[var1] = 0;
            this.T[var1] = 0;
            this.V[var1] = 0;
            this.W[var1] = 0;
        }

        this.X = 0;
        this.ay = 3;
        this.az = 0;
        this.aD = new ax((byte) -1, true);
        this.aE = -1;
        this.aK = 1;
        this.aF = false;
        this.aG = -1;
        this.aH = false;
        this.aI = false;
        this.bc = -2;
        this.aL = false;
        this.aC = -1;
        this.aM = false;
        this.aN = false;
        this.aO = new dr(main.GameGraphic.o, main.GameGraphic.p, 3);
        this.aP = new ax((byte) -1, true);
        this.aQ = new ax((byte) -1, true);
    }

    public final void e() {
        super.e();
        this.u();
        if (kx.j) {
            this.b(false);
        }

        this.aO = new dr(main.GameGraphic.o, main.GameGraphic.p, 3);
        if (kx.G == null) {
            try {
                kx.G = Image.createImage(StringEntity.a() + "/on/star.on");
                return;
            } catch (IOException var2) {
                var2.printStackTrace();
            }
        }

    }

    private void u() {
        this.g = new dr();
        this.K = new dr();
        this.g.a = main.GameGraphic.o - 27;
        this.g.b = main.GameGraphic.height - main.GameGraphic.T;
        if (main.GameGraphic.width < 200) {
            dr var10000 = this.g;
            var10000.b += 10;
        }

        this.K.a = this.g.a - 24;
        this.K.b = this.g.b - kx.A / 2 - 4;
        main.GameGraphic.S.e();
    }

    public final void a(int var1, int var2) {
        kg var3;
        int var6;
        label115:
        switch (var1) {
            case 30:
                var3 = this;
                this.C();
                this.B();

                int var8;
                for (var8 = 0; var8 < var3.bf.length; ++var8) {
                    var3.bf[var8] = -1;
                }

                var8 = 0;

                for (int var9 = 0; var9 < 10; ++var9) {
                    if (var3.L[var9] == 0) {
                        if (var8 == 5) {
                            main.GameGraphic.showAlert(StringEntity.ak);
                            break label115;
                        }

                        var3.bf[var8] = var3.O[var9].b;
                        ++var8;
                    }
                }

                if (var8 < 2) {
                    main.GameGraphic.showAlert(StringEntity.aZ);
                } else {
                    int[] var10 = new int[6];

                    for (var6 = 0; var6 < 5; ++var6) {
                        if (var3.bf[var6] != -1) {
                            var10[var6] = var3.bf[var6];
                        } else {
                            var10[var6] = -1;
                        }
                    }

                    var10[5] = var3.aB;
                    byte var11 = -1;
                    if (var3.c(var10)) {
                        var11 = 1;
                    }

                    if (var3.d(var10)) {
                        var11 = 0;
                    }

                    if (var11 == -1) {
                        main.GameGraphic.showAlert(StringEntity.al);
                    } else {
                        for (var8 = 0; var8 < var10.length; ++var8) {
                            if (var10[var8] != -1) {
                                for (int var7 = 0; var7 < 10; ++var7) {
                                    if (var10[var8] == var3.O[var7].b) {
                                        if (!var3.n(var7)) {
                                            main.GameGraphic.showAlert(StringEntity.al);
                                            break label115;
                                        }
                                        break;
                                    }
                                }
                            }
                        }

                        var3.x();
                        kx.o();
                        ie.a().a(var3.bf, var11);
                    }
                }
                break;
            case 31:
                this.I();
                break;
            case 32:
                var3 = this;
                this.C();
                if (GameMidlet.i.w != super.n) {
                    main.GameGraphic.showAlert(StringEntity.ai);
                } else {
                    this.B();
                    int[] var4 = new int[12];
                    byte var5 = -1;

                    for (var6 = 0; var6 < 10; ++var6) {
                        if (var3.O[var6].a == 0 || var5 != -1 && var5 != var3.O[var6].a) {
                            var4[var6] = -1;
                        } else {
                            var5 = var3.O[var6].a;
                            var4[var6] = var3.O[var6].b;
                        }
                    }

                    var3.x();
                    kx.o();
                    ie.a().a(var3.O);
                }
        }

        super.a(var1, var2);
    }

    public kg() {
        this.t();
        this.aW = new Button(StringEntity.ac, 30);
        this.aX = new Button(StringEntity.ad, 31);
        this.aY = new Button(StringEntity.ae, 32);
        main.GameGraphic.S.e();
    }

    private void v() {
        super.ad = this.aW;
        super.ae = this.aX;
    }

    private void w() {
        super.ad = kx.D;
        super.ae = null;
    }

    private void x() {
        super.ad = null;
        super.ae = null;
    }

    private void y() {
        super.ad = this.aY;
        super.ae = null;
    }

    private void A() {
        super.ad = kx.C;
        super.ae = null;
    }

    public final void g() {
        this.aF = false;
        this.a_();
        super.g();
    }

    private void B() {
        if (this.aE != -1 && this.aD.b != -1) {
            if (main.GameGraphic.H) {
                this.l(super.o);
                this.k(this.aE);
                this.O[this.aE] = this.aD;
                this.aD = new ax((byte) -1, true);
            } else {
                this.l(super.o);
                this.k(this.aE);
                this.O[this.aE] = this.aD;
                this.aD = new ax((byte) -1, true);
            }
        }
    }

    private void j(int var1) {
        this.O[var1] = new ax((byte) -1, true);
    }

    private void C() {
        if (this.bb && this.ba == 2) {
            this.ba = 0;
            this.bb = false;
            if (this.aD.b != -1) {
                this.E();
            }

            this.L[super.o] = -1;
            main.GameGraphic.e = false;
        }

    }

    private void D() {
        for (int var1 = 0; var1 < 3; ++var1) {
            if (this.P[var1].b == this.O[super.o].b && this.P[var1].b != -1) {
                return;
            }
        }

        if (this.aK < 2) {
            ++this.aK;
        }

        if (this.aK > 0 && this.aD.b != -1) {
            this.E();
        }

        if (this.aK == 2) {
            this.L[super.o] = 0;
        }

    }

    public final void l() {
        super.l();
        if (!this.aL && !kx.k && kx.j && super.ad != kx.E && !this.M) {
            int var1;
            if ((var1 = this.J()) == -1) {
                var1 = 10;
            }

            if (main.GameGraphic.g && this.aD.b != -1) {
                main.GameGraphic.g = false;
                this.bb = true;
            }

            int var2;
            if (main.GameGraphic.g && main.GameGraphic.a(this.aZ - kx.z / 2, this.g.b - kx.A / 2 - 20, var1 * aU, kx.A)) {
                main.GameGraphic.g = false;
                if (this.aD.b != -1) {
                    this.D();
                    this.bb = false;
                    return;
                }

                if ((var1 = this.J()) == -1) {
                    var1 = 9;
                } else {
                    --var1;
                }

                var2 = (main.GameGraphic.h - (this.aZ - kx.z / 2)) / aU;
                this.bb = true;
                if (var2 <= var1) {
                    super.o = var2;
                }
            }

            if (this.bb) {
                var1 = main.GameGraphic.k();
                var2 = main.GameGraphic.l();
                if (main.GameGraphic.e) {
                    int var3 = (main.GameGraphic.h - (this.aZ - kx.z / 2)) / aU;
                    if (this.ba != 2 && var2 > 10) {
                        main.GameGraphic.b[2] = true;
                        if (this.L[super.o] != -1) {
                            this.ba = 1;
                        }
                    } else if (this.ba != 2 && var2 < -10) {
                        if (this.ba == 1) {
                            this.bb = false;
                            this.ba = 0;
                            main.GameGraphic.b[8] = true;
                        }
                    } else if (awClass.f(var1) > 10) {
                        int var4;
                        if (this.ba != 2) {
                            for (var4 = 0; var4 < 3; ++var4) {
                                if (this.P[var4].b == this.O[super.o].b) {
                                    return;
                                }
                            }

                            this.aD = this.O[super.o];
                            this.j(super.o);
                            this.aE = super.o;
                        }

                        this.ba = 2;
                        if (super.o - var3 > 0) {
                            if (this.aD.b != -1 && var3 >= 0) {
                                this.O[super.o] = this.O[var3];
                                this.j(var3);
                                super.o = var3;
                            }
                        } else {
                            if ((var4 = this.J()) == -1) {
                                var4 = 9;
                            } else {
                                --var4;
                            }

                            if (this.aD.b != -1 && var3 <= var4) {
                                this.O[super.o] = this.O[var3];
                                this.j(var3);
                                super.o = var3;
                            }
                        }
                    }

                    this.b(true);
                }

                if (main.GameGraphic.f) {
                    if (this.aD.b != -1) {
                        this.C();
                    } else if (awClass.f(var1) <= 10 && awClass.f(var2) <= 10) {
                        if (this.aK == 1) {
                            this.aK = 2;
                            this.L[super.o] = -1;
                        } else if (this.aK == 2) {
                            this.aK = 1;
                            this.L[super.o] = 0;
                        }
                    }

                    this.b(false);
                }
            }

            if (main.GameGraphic.a(2)) {
                this.D();
            } else {
                if (main.GameGraphic.a(8)) {
                    if (this.aK > 0) {
                        --this.aK;
                    }

                    if (this.aK < 2) {
                        this.L[super.o] = -1;
                    }

                    if (this.aK == 0 && this.aD.b == -1) {
                        for (var1 = 0; var1 < 3; ++var1) {
                            if (this.P[var1].b == this.O[super.o].b) {
                                return;
                            }
                        }

                        this.aD = this.O[super.o];
                        this.j(super.o);
                        this.aE = super.o;
                    }

                    this.b(false);
                    return;
                }

                if (main.GameGraphic.a(4)) {
                    if ((var1 = this.J()) == -1) {
                        var1 = 9;
                    } else {
                        --var1;
                    }

                    if (this.aD.b != -1) {
                        if (super.o > 0) {
                            this.O[super.o] = this.O[super.o - 1];
                            this.j(super.o - 1);
                        } else {
                            this.l(0);
                        }
                    }

                    if (super.o > 0) {
                        --super.o;
                    } else {
                        super.o = var1;
                    }

                    this.b(false);
                    return;
                }

                if (!main.GameGraphic.a(6)) {
                    return;
                }

                if ((var1 = this.J()) == -1) {
                    var1 = 9;
                } else {
                    --var1;
                }

                if (this.aD.b != -1) {
                    if (super.o < var1) {
                        this.O[super.o] = this.O[super.o + 1];
                        this.j(super.o + 1);
                    } else {
                        this.k(0);
                    }
                }

                if (super.o < var1) {
                    ++super.o;
                } else {
                    super.o = 0;
                }
            }

            this.b(false);
        }
    }

    public final void k() {
        super.k();
        if (!kx.j && !kx.k) {
            this.q();
        } else {
            if (kx.j && kx.j && this.O != null) {
                for (int var1 = this.O.length - 1; var1 >= 0; --var1) {
                    if (this.O[var1].a() == -1) {
                        this.O[var1].g = false;
                    }
                }
            }

            kg var8 = this;
            int var2;
            int var3;
            dr var10000;
            if (this.M && (var2 = kx.i(this.aA)) != -1) {
                var2 = kx.x[var2];
                var3 = c[var2].a;
                var2 = c[var2].b;
                var10000 = this.h;
                var10000.a += (var3 - this.h.a) / 2;
                var10000 = this.h;
                var10000.b += (var2 - this.h.b) / 2;
                if (Math.abs(var3 - this.h.a) <= 1 && Math.abs(var2 - this.h.b) <= 1) {
                    var3 = kx.i(this.aA);
                    this.f[var3][this.W[var3]] = new ax((byte) this.aB, true);
                    if (this.aA == GameMidlet.i.w) {
                        for (int var4 = 0; var4 < 10; ++var4) {
                            if (var8.O[var4].b == var8.aB) {
                                var8.l(var4);
                                break;
                            }
                        }

                        if (var8.O[var8.o].b == -1) {
                            var8.o = var8.J() - 1;
                        }
                    }

                    var8.M = false;
                    var8.H();
                }

                var8.b(false);
            }

            if (this.aM) {
                var2 = this.g.a + this.bg * aU;
                var3 = this.g.b;
                var10000 = this.aO;
                var10000.a += (var2 - this.aO.a) / 2;
                var10000 = this.aO;
                var10000.b += (var3 - this.aO.b) / 2;
                if (Math.abs((var2 - this.aO.a) / 2) <= 1 && Math.abs((var3 - this.aO.b) / 2) <= 1) {
                    this.O[this.bg] = this.aP;
                    if (a(this.f[kx.s]) == 3) {
                        if (GameMidlet.i.w == super.n) {
                            this.y();
                        }
                    } else if (GameMidlet.i.w == super.n) {
                        this.w();
                    }

                    if (!this.aI) {
                        this.G();
                        this.F();
                    } else {
                        byte var10 = this.O[this.bg].b;
                        kg var9 = this;
                        int[] var11 = new int[6];

                        int var5;
                        for (var5 = 0; var5 < 5; ++var5) {
                            var11[var5] = -1;
                        }

                        var5 = 0;

                        for (int var6 = 0; var6 < 12; ++var6) {
                            if (var9.Q[kx.s][var6] != -1) {
                                var11[var5] = var9.Q[kx.s][var6];
                                ++var5;
                            } else {
                                var5 = 0;
                                var11[5] = var10;
                                b(var11);
                                if (var9.c(var11) || var9.d(var11)) {
                                    var9.C();
                                    ie.a().a(var11);
                                    break;
                                }

                                for (int var7 = 0; var7 < 6; ++var7) {
                                    var11[var7] = -1;
                                }
                            }
                        }
                    }

                    this.bg = 0;
                    this.aM = false;
                    this.aO = new dr(main.GameGraphic.o, main.GameGraphic.p, 3);
                    this.b(false);
                }
            }

            if (this.aN) {
                var2 = kx.i(super.n);
                var3 = (kx.F[kx.x[var2]].a - this.aQ.c) / 2;
                var2 = (kx.F[kx.x[var2]].b - this.aQ.d) / 2;
                ax var12 = this.aQ;
                var12.c += var3;
                var12 = this.aQ;
                var12.d += var2;
                if (Math.abs(var3) <= 1 && Math.abs(var2) <= 1) {
                    this.aN = false;
                }
            }

            var8 = this;
            kx.t = (long) ((int) ((long) main.GameGraphic.j() - kx.u));
            if ((long) kx.v - kx.t >= 0L) {
                return;
            }

            if (super.ad == this.aW && super.ae == this.aX) {
                this.I();
                this.x();
            } else {
                if (super.ad != kx.D) {
                    if (super.ad == this.aY) {
                        this.B();
                        this.aY.b();
                    }

                    return;
                }

                var2 = 0;

                for (var3 = 1; var3 < 10; ++var3) {
                    if (var8.O[var3].a == 0 && var8.O[var3].b > var8.O[var2].b) {
                        var2 = var3;
                    }
                }

                var8.B();
                ie.a().c(var8.O[var2].b);
            }
        }

    }

    private void b(boolean var1) {
        int var2;
        if (!var1) {
            if ((var2 = this.J()) == -1) {
                var2 = 10;
            }

            if (main.GameGraphic.H && kx.j && var2 != 0 && (aU = (main.GameGraphic.width - kx.z / 2) / var2) > kx.z / 3 << 1) {
                aU = kx.z / 3 << 1;
            }

            if ((aV = aU) > kx.z / 4) {
                aV = kx.z / 4;
            }

            if (main.GameGraphic.width < 160) {
                aV = 10;
            }

            this.aZ = (main.GameGraphic.width - (aU * var2 + (kx.z - aU)) >> 1) + kx.z / 2;
            if (this.aZ < kx.z / 2) {
                this.aZ = kx.z / 2;
            }
        }

        for (var2 = 0; var2 < 10; ++var2) {
            int var3 = 0;
            if (this.L[var2] == 0) {
                var3 = 10 * (main.GameGraphic.Z + 1);
            }

            this.O[var2].m = this.aZ + var2 * aU;
            this.O[var2].l = this.g.b - var3;
            if (var1) {
                this.O[var2].c = this.O[var2].m;
                this.O[var2].d = this.O[var2].l;
            }
        }

    }

    private void E() {
        byte var1 = -1;

        int var2;
        for (var2 = 0; var2 < 3; ++var2) {
            if (this.aD.a == this.P[var2].a) {
                var1 = this.P[var2].b;
            }
        }

        this.O[super.o] = this.aD;
        if (var1 != -1) {
            if (!this.n(super.o)) {
                this.aD = this.O[super.o];
                this.j(super.o);
                this.B();
                return;
            }

            this.j(super.o);
        }

        if (this.aD.a != 0 && (super.o > 0 && this.O[super.o - 1].a == this.aD.a || super.o < 9 && this.O[super.o + 1].a == this.aD.a)) {
            this.O[super.o] = this.aD;
            this.aD = new ax((byte) -1, true);
        } else if (var1 != -1 && this.aD.a != 0) {
            if (var1 != -1) {
                this.bc = -1;
                if (this.aE != super.o) {
                    this.a(this.aD, var1);
                }
            }

        } else {
            if (super.o < 9) {
                for (var2 = 0; var2 < 3; ++var2) {
                    if (this.P[var2].a != 0 && this.O[super.o + 1].a == this.P[var2].a) {
                        int[] var5 = new int[10];
                        boolean var3 = false;

                        for (int var4 = 0; var4 < 10; ++var4) {
                            if (this.O[var4].a == this.P[var2].a) {
                                var5[var4] = this.O[var4].b;
                            } else {
                                var5[var4] = -1;
                                if (!var3) {
                                    var3 = true;
                                    var5[var4] = this.aD.b;
                                }
                            }
                        }

                        var5 = b(var5);
                        if (!this.d(var5) && !this.c(var5)) {
                            this.B();
                            return;
                        }

                        this.bc = this.aD.a;
                        this.aD.a = this.P[var2].a;
                        this.O[super.o] = this.aD;
                        if (this.aE != super.o) {
                            this.a(this.P[var2], this.P[var2].b);
                        }

                        return;
                    }
                }
            }

            kg var6 = this;
            var2 = 0;

            int var10000;
            while (true) {
                if (var2 >= 10) {
                    var10000 = -1;
                    break;
                }

                if (var6.O[var2].b == -1) {
                    var10000 = var2;
                    break;
                }

                if (var6.m(var6.O[var2].a)) {
                    var10000 = var2;
                    break;
                }

                ++var2;
            }

            var2 = var10000;
            if (super.o >= var2 && var2 != -1) {
                this.B();
            } else {
                this.O[super.o] = this.aD;
                this.aD = new ax((byte) -1, true);
                if (this.aE != super.o) {
                    this.O[super.o].a = 0;
                    this.G();
                    this.F();
                }

            }
        }
    }

    private void a(ax var1, int var2) {
        this.C();
        this.aL = true;
        int[] var3 = new int[5];

        for (int var4 = 0; var4 < 5; ++var4) {
            var3[var4] = -1;
        }

        int[] var9 = new int[6];

        int var5;
        for (var5 = 0; var5 < 6; ++var5) {
            var9[var5] = -1;
        }

        var5 = 0;

        int var6;
        for (var6 = 0; var6 < 10; ++var6) {
            if (this.O[var6].a == var1.a) {
                var9[var5] = this.O[var6].b;
                ++var5;
            }
        }

        if (var9[5] != -1) {
            b(var9);
            var6 = 0;

            for (var5 = 0; var5 < var9.length; ++var5) {
                if (var9[var5] == var2) {
                    var6 = var5;
                }
            }

            var5 = 0;
            ax var7;
            int var8;
            if (var6 < 3) {
                for (var8 = 0; var8 < var9.length; ++var8) {
                    if (var8 > 2) {
                        for (var6 = 0; var6 < 10; ++var6) {
                            if (var9[var8] == this.O[var6].b) {
                                this.O[var6].a = 0;
                            }
                        }
                    } else {
                        var3[var5] = var9[var8];
                        ++var5;

                        for (var6 = 0; var6 < 10; ++var6) {
                            if (var9[var8] == this.O[var6].b) {
                                var7 = this.O[var6];
                                this.l(var6);
                                this.O[this.J()] = var7;
                            }
                        }
                    }
                }
            } else {
                for (var8 = 0; var8 < var9.length; ++var8) {
                    if (var8 < 3) {
                        for (var6 = 0; var6 < 10; ++var6) {
                            if (var9[var8] == this.O[var6].b) {
                                this.O[var6].a = 0;
                            }
                        }
                    } else {
                        var3[var5] = var9[var8];
                        ++var5;

                        for (var6 = 0; var6 < 10; ++var6) {
                            if (var9[var8] == this.O[var6].b) {
                                var7 = this.O[var6];
                                this.l(var6);
                                this.O[this.J()] = var7;
                            }
                        }
                    }
                }
            }
        } else {
            var6 = 0;

            for (var5 = 0; var5 < 10; ++var5) {
                if (this.O[var5].a == var1.a) {
                    var3[var6] = this.O[var5].b;
                    ++var6;
                }
            }
        }

        b(var3);
        ie.a().a(var3, var2);
    }

    public final void a(byte var1) {
        this.C();
        this.aL = false;
        if (var1 == 0) {
            if (this.bc == -1) {
                this.O[super.o] = this.aD;
                this.O[super.o].a = 0;
                this.aD = new ax((byte) -1, true);
                if (this.aE != super.o) {
                    this.G();
                    this.F();
                }

                this.aE = -1;
            } else if (this.bc >= 0) {
                this.aD = new ax((byte) -1, true);
                if (this.aE != super.o) {
                    this.O[super.o].a = 0;
                    this.G();
                    this.F();
                }
            }
        } else if (this.bc == -1) {
            this.j(super.o);
            this.B();
        } else if (this.bc >= 0) {
            this.j(super.o);
            this.B();
            this.O[this.aE].a = (byte) this.bc;
        }

        this.bc = -2;
        this.b(false);
    }

    private void k(int var1) {
        for (int var2 = 9; var2 > var1; --var2) {
            this.O[var2] = this.O[var2 - 1];
        }

        this.j(var1);
    }

    private void l(int var1) {
        for (int var2 = var1; var2 < 9; ++var2) {
            this.O[var2] = this.O[var2 + 1];
        }

        this.j(9);
        this.L[var1] = -1;
    }

    public final void a(Graphics var1) {
        this.b(var1);
        super.a(var1);
    }

    public final void a_(Graphics var1) {
        int var2 = gy.Y;
        if (kx.j || kx.k) {
            var2 = 1;
        }

        for (int var3 = 0; var3 < kx.H; ++var3) {
            hn var4;
            if ((var4 = (hn) kx.m.elementAt(var3)).w != -1) {
                if (var4.w != GameMidlet.i.w || !kx.j) {
                    var4.a(var1, var4.aw * var2, var4.ax * var2, false);
                }

                var4.a(var1, var4.aw * var2, var4.ax * var2);
                kx.a(var1, var4.aw * var2, (var4.ax - 50) * var2 - 10 * (var2 - 1), 3, var4);
            }
        }

    }

    public final void b(Graphics var1) {
        super.b(var1);
        this.a_(var1);
        long var5;
        if (kx.j && !kx.l && (var5 = (long) kx.v - kx.t) > 0L && b != null && b[0] != null) {
            main.GameGraphic.O.a(var1, String.valueOf(var5), main.GameGraphic.o, b[0].b + gy.ai + 10, 2);
        }

        if (kx.j) {
            this.e(var1);
            this.f(var1);
            if (this.aM) {
                this.aP.c = this.aO.a;
                this.aP.d = this.aO.b;
                if (main.GameGraphic.width > 176) {
                    this.aP.c(var1);
                } else {
                    this.aP.a(var1, false);
                }
            }

            if (this.aN) {
                if (main.GameGraphic.width > 176) {
                    this.aQ.c(var1);
                } else {
                    this.aQ.a(var1, false);
                }
            }

            if (this.M) {
                ax var7;
                (var7 = new ax((byte) this.aB, true)).c = this.h.a;
                var7.d = this.h.b;
                if (main.GameGraphic.width > 176) {
                    var7.c(var1);
                } else {
                    var7.a(var1, false);
                }
            }

            if (main.GameGraphic.Z == 0 && super.o != -1 && !kx.k && !this.aF) {
                dr var10000;
                if (this.bd == 4) {
                    var10000 = this.K;
                    var10000.b += 2;
                }

                if (this.bd == 8) {
                    var10000 = this.K;
                    var10000.b -= 2;
                    this.bd = 0;
                }

                ++this.bd;
                int var8 = 0;
                if (this.L[super.o] == 0) {
                    var8 = 10 * (main.GameGraphic.Z + 1);
                }

                if (this.aD.b != -1) {
                    var8 = -10;
                }

                if (this.O[super.o] != null) {
                    ea.b().b.a(0, this.aZ - kx.z / 2 + super.o * aU + ea.b().b.a / 2, this.g.b - kx.A / 2 - 4 - var8, 0, 33, var1);
                }
            }

            if (!this.aF) {
                int var2 = kx.i(this.aC);
                var1.drawImage(kx.G, b[kx.x[var2]].a, b[kx.x[var2]].b - 8, 3);
            }
        }
        kx.d(var1);
    }

    private void e(Graphics var1) {
        for (int var2 = 0; var2 < 4; ++var2) {
            hn var3;
            if ((var3 = (hn) kx.m.elementAt(var2)).w != -1 && (main.GameGraphic.width >= 160 || var3.w == super.n)) {
                int var4 = kx.i(super.n);
                if (var2 != var4 || main.GameGraphic.l % 20 > 5 && var2 == var4 || this.aF) {
                    main.GameGraphic.Q.a(var1, var3.c() + " " + StringEntity.k(), b[kx.x[var2]].a, b[kx.x[var2]].b, b[kx.x[var2]].c);
                }
            }
        }

    }

    private void f(Graphics var1) {
        this.N = new ax((byte) -1, true);
        int var2;
        if ((var2 = aV) <= 12 && main.GameGraphic.width > 200) {
            var2 = 20;
        }

        byte var3 = 2;
        if (main.GameGraphic.Z == 0 && main.GameGraphic.width > 200) {
            var3 = 1;
        }

        Graphics var5 = var1;
        kg var4 = this;
        int var6;
        if ((var6 = aV) <= 12 && main.GameGraphic.width > 200) {
            var6 = 20;
        }

        if (!this.aF) {
            for (int var7 = 0; var7 < 4; ++var7) {
                hn var8;
                if ((var8 = (hn) kx.m.elementAt(var7)) != null && var8.w != -1) {
                    int var9 = 3;
                    int var15;
                    if (var4.f[var7] != null) {
                        for (var15 = 0; var15 < 4; ++var15) {
                            if (var4.f[var7][var15] == null) {
                                var9 = var15;
                                break;
                            }
                        }
                    }

                    if (kx.x[var7] != 0 && kx.x[var7] != 2) {
                        for (var15 = 0; var15 < 4 && var4.f[var7][var15] != null; ++var15) {
                            var4.f[var7][var15].c = c[kx.x[var7]].a;
                            var4.f[var7][var15].d = c[kx.x[var7]].b + (var15 * var6 << 1) - (var9 * var6 << 1) / 2;
                            if (main.GameGraphic.width > 176) {
                                var4.f[var7][var15].c(var5);
                            } else {
                                var4.f[var7][var15].a(var5, true);
                            }
                        }
                    } else {
                        for (var15 = 0; var15 < 4 && var4.f[var7] != null && var4.f[var7][var15] != null; ++var15) {
                            var4.f[var7][var15].c = c[kx.x[var7]].a + var15 * aV - (var9 * aV + (kx.z - aV)) / 2 + kx.z / 2;
                            var4.f[var7][var15].d = c[kx.x[var7]].b;
                            if (kx.x[var7] == 2) {
                                if (main.GameGraphic.width > 176) {
                                    if (var15 < 3 && var4.f[var7][var15 + 1] != null) {
                                        if (aU > 13) {
                                            var4.f[var7][var15].c(var5);
                                        } else {
                                            var4.f[var7][var15].c(var5);
                                        }
                                    } else {
                                        var4.f[var7][var15].c(var5);
                                    }
                                } else {
                                    var4.f[var7][var15].a(var5, false);
                                }
                            } else if (main.GameGraphic.width > 176) {
                                var4.f[var7][var15].c = c[kx.x[var7]].a - var15 * aV + (var4.e[var7] * aV + (kx.z - aV)) / 2 - kx.z / 2;
                                var4.f[var7][var15].c(var5);
                            } else {
                                var4.f[var7][var15].a(var5, false);
                            }
                        }
                    }
                }
            }
        }

        int var10;
        hn var11;
        int var12;
        for (var10 = 0; var10 < 4; ++var10) {
            if ((var11 = (hn) kx.m.elementAt(var10)) != null && var11.w != -1) {
                if (kx.x[var10] == 1 || kx.x[var10] == 3) {
                    for (var12 = 0; var12 < 11 && this.U[var10][var12] != -1; ++var12) {
                        this.N = new ax((byte) this.U[var10][var12], true);
                        this.N.c = c[kx.x[var10]].a;
                        this.N.d = c[kx.x[var10]].b + var12 * (var2 << 1) - this.V[var10] * (var2 << 1) / 2;
                        if (main.GameGraphic.width > 176) {
                            this.N.c(var1);
                        } else {
                            this.N.a(var1, true);
                        }
                    }
                }

                if (kx.x[var10] == 0) {
                    for (var12 = 0; var12 < 11 && this.U[var10][var12] != -1; ++var12) {
                        this.N = new ax((byte) this.U[var10][var12], true);
                        this.N.c = c[kx.x[var10]].a - var12 * aV + (this.V[var10] * aV + (kx.z - aV)) / 2 - kx.z / 2;
                        this.N.d = c[kx.x[var10]].b;
                        if (main.GameGraphic.width > 176) {
                            this.N.c(var1);
                        } else {
                            this.N.c = c[kx.x[var10]].a + var12 * aV - (this.V[var10] * aV + (kx.z - aV)) / 2 + kx.z / 2;
                            this.N.a(var1, false);
                        }
                    }
                }
            }
        }

        ax var13;
        for (var10 = 0; var10 < 4; ++var10) {
            if ((var11 = (hn) kx.m.elementAt(var10)) != null && var11.w != -1) {
                if (kx.x[var10] == 1) {
                    for (var12 = 0; var12 < 3 && this.R[var10][var12] != -1; ++var12) {
                        (var13 = new ax((byte) this.R[var10][var12], true)).c = d[kx.x[var10]].a;
                        var13.d = d[kx.x[var10]].b + var12 * (var2 << 1) - this.S[var10] * (var2 << 1) / 2;
                        var13.a = 1;
                        if (main.GameGraphic.width > 176) {
                            var13.c(var1);
                        } else {
                            var13.a(var1, true);
                        }

                        this.a(1, var13.c, var13.d, var1);
                    }
                } else if (kx.x[var10] == 0) {
                    for (var12 = 0; var12 < 3 && this.R[var10][var12] != -1; ++var12) {
                        (var13 = new ax((byte) this.R[var10][var12], true)).d = d[kx.x[var10]].b;
                        var13.c = d[kx.x[var10]].a + var12 * aV - (this.S[var10] * aV + (kx.z - aV)) / 2 + kx.z / 2;
                        var13.a = 1;
                        if (main.GameGraphic.width > 176) {
                            var13.c(var1);
                        } else {
                            var13.a(var1, false);
                        }
                        this.a(1, var13.c, var13.d, var1);
                    }
                }
            }
        }

        for (var10 = 0; var10 < 4; ++var10) {
            if (kx.x[var10] == 1) {
                for (var12 = 0; var12 < 12 && this.Q[var10][0] != -1; ++var12) {
                    if (this.Q[var10][var12] != -1) {
                        this.N = new ax((byte) this.Q[var10][var12], true);
                        this.N.c = d[kx.x[var10]].a;
                        if (main.GameGraphic.width > 176) {
                            this.N.d = d[kx.x[var10]].b + var12 * var2 * var3 - this.T[var10] * var2 * var3 / 2;
                            this.N.c(var1);
                        } else {
                            this.N.d = d[kx.x[var10]].b + var12 * var2 - this.T[var10] * var2 / 2;
                            this.N.a(var1, true);
                        }
                    }
                }
            } else if (kx.x[var10] == 0) {
                if (this.Q[var10][0] == -1) {
                    break;
                }

                for (var12 = 0; var12 < 12; ++var12) {
                    if (this.Q[var10][var12] != -1) {
                        this.N = new ax((byte) this.Q[var10][var12], true);
                        this.N.c = d[kx.x[var10]].a - var12 * aV + (this.T[var10] * aV + (kx.z - aV)) / 2 - kx.z / 2;
                        this.N.d = d[kx.x[var10]].b;
                        if (main.GameGraphic.width > 176) {
                            this.N.c(var1);
                        }
                    }
                }
            }
        }

        for (var10 = 0; var10 < 4; ++var10) {
            if ((var11 = (hn) kx.m.elementAt(var10)) != null && var11.w != -1 && kx.x[var10] == 3) {
                for (var12 = 0; var12 < 3 && this.R[var10][var12] != -1; ++var12) {
                    (var13 = new ax((byte) this.R[var10][var12], true)).a = 1;
                    var13.c = d[kx.x[var10]].a;
                    var13.d = d[kx.x[var10]].b + var12 * (var2 << 1) - this.S[var10] * (var2 << 1) / 2;
                    if (main.GameGraphic.width > 176) {
                        var13.c(var1);
                    } else {
                        var13.a(var1, true);
                    }

                    this.a(1, var13.c, var13.d, var1);
                }
            }
        }

        for (var10 = 0; var10 < 4; ++var10) {
            if ((var11 = (hn) kx.m.elementAt(var10)) != null && var11.w != -1 && kx.x[var10] == 3) {
                for (var12 = 0; var12 < 12 && this.Q[var10][0] != -1; ++var12) {
                    if (this.Q[var10][var12] != -1) {
                        this.N = new ax((byte) this.Q[var10][var12], true);
                        this.N.c = d[kx.x[var10]].a;
                        if (main.GameGraphic.width > 176) {
                            this.N.d = d[kx.x[var10]].b + var12 * var2 * var3 - this.T[var10] * var2 * var3 / 2;
                            this.N.c(var1);
                        } else {
                            this.N.d = d[kx.x[var10]].b + var12 * var2 - this.T[var10] * var2 / 2;
                            this.N.a(var1, true);
                        }
                    }
                }
            }
        }

        for (var10 = 0; var10 < 4; ++var10) {
            if (kx.x[var10] == 2) {
                for (var12 = 0; var12 < 12 && this.Q[var10][0] != -1; ++var12) {
                    if (this.Q[var10][var12] != -1) {
                        this.N = new ax((byte) this.Q[var10][var12], true);
                        this.N.c = d[kx.x[var10]].a + var12 * aV - (this.T[var10] * aV + (kx.z - aV)) / 2 + kx.z / 2;
                        this.N.d = d[kx.x[var10]].b;
                        if (main.GameGraphic.width > 176) {
                            if (var12 < 11 && this.Q[var10][var12 + 1] != -1) {
                                if (aU > 13) {
                                    this.N.c(var1);
                                } else {
                                    this.N.c(var1);
                                }
                            } else {
                                this.N.c(var1);
                            }
                        } else {
                            this.N.a(var1, false);
                        }
                    }
                }
            }
        }

        var5 = var1;
        var4 = this;

        for (var6 = 0; var6 < 10; ++var6) {
            byte var14 = 0;
            if (var4.O[var6] != null && var4.O[var6].b != -1) {
                if (var4.L[var6] == 0) {
                    var14 = 5;
                }

                var4.be = new ax((byte) -1, true);
                var4.be.c = var4.O[var6].c;
                var4.be.d = var4.O[var6].d;
                if (!var4.O[var6].g) {
                    var4.be = var4.O[var6];
                }

                if (main.GameGraphic.width <= 176) {
                    var4.be.a(var5, false);
                    if (var4.O[var6].a != 0) {
                        var4.a(var4.O[var6].a, var4.O[var6].c, var4.O[var6].d, var5);
                    }
                } else if (var14 == 0 && var6 < 9 && var4.O[var6 + 1].b != -1 && var6 != var4.o) {
                    if (aU <= 14 && var4.O[var6 + 1].c == var4.O[var6 + 1].m) {
                        var4.be.a(var5);
                    } else {
                        var4.be.b(var5);
                    }

                    if (var4.O[var6].a != 0) {
                        var4.a(var4.O[var6].a, var4.O[var6].c, var4.O[var6].d, var5);
                    }
                } else {
                    var4.be.c(var5);
                    if (var4.O[var6].a != 0) {
                        var4.a(var4.O[var6].a, var4.O[var6].c, var4.O[var6].d, var5);
                    }
                }
            }

            if (var6 == var4.o && var4.aD.b != -1) {
                var4.aD.c = var4.aZ + var4.o * aU;
                var4.aD.d = var4.g.b + (var4.bb ? -5 : 10);
                if (main.GameGraphic.width > 176) {
                    if (var4.o < 9) {
                        if (var4.O[var4.o + 1].b != -1 && !main.GameGraphic.H) {
                            var4.aD.a(var5);
                        } else {
                            var4.aD.c(var5);
                        }
                    } else {
                        var4.aD.c(var5);
                    }
                } else {
                    var4.aD.a(var5, false);
                }

                if (main.GameGraphic.l % 10 > 6 && gy.Y == 1 && main.GameGraphic.Z == 0) {
                    je.b.a(0, var4.aD.c - 40, var4.aD.d - 30, 0, var5);
                    je.b.a(0, var4.aD.c - 10, var4.aD.d - 30, 3, var5);
                }
            }
        }

    }

    private void a(int var1, int var2, int var3, Graphics var4) {
        int var5 = 0;
        switch (var1) {
            case 1:
            case 4:
                var5 = this.aR;
                break;
            case 2:
            case 5:
                var5 = this.aS;
                break;
            case 3:
            case 6:
                var5 = this.aT;
        }

        var4.setColor(var5);
        var4.fillRect(var2 - kx.z / 2 + 2, var3 - kx.A / 2 + 22, 7, 2);
    }

    private void F() {
        this.ay = 3;
        kg var2 = this;

        int var4;
        label148:
        for (var4 = 0; var4 < 8 && !var2.m(var2.O[var4].a); ++var4) {
            int[] var5 = new int[6];

            int var6;
            for (var6 = 0; var6 < 6; ++var6) {
                var5[var6] = -1;
            }

            for (var6 = 0; var6 < 3; ++var6) {
                if (var2.O[var4 + var6].a != 0) {
                    break label148;
                }

                var5[var6] = var2.O[var4 + var6].b;
            }

            if (var2.c(var5) || var2.d(var5)) {
                ++var2.ay;

                for (var6 = 0; var6 < 3; ++var6) {
                    var2.O[var4 + var6].a = (byte) var2.ay;
                }

                var4 += 2;
            }
        }

        for (int var1 = 0; var1 < 10; ++var1) {
            if (!this.m(this.O[var1].a) && this.O[var1].a == 0 && this.O[var1].b != -1) {
                int var3 = var1;
                var2 = this;
                if (this.O[var1].a == 0 && this.O[var1].b != -1) {
                    var4 = 0;
                    int var8 = 0;
                    int var7;
                    int[] var9;
                    if (var1 > 0 && this.O[var1 - 1].a != 0 && this.O[var1 - 1].b != -1) {
                        var9 = new int[10];

                        for (var7 = 0; var7 < 10; ++var7) {
                            if (var2.O[var7].a == var2.O[var3 - 1].a) {
                                var9[var7] = var2.O[var7].b;
                                var4 += var9[var7] / 4 + 1;
                            } else {
                                var9[var7] = -1;
                            }
                        }

                        (var9 = b(var9))[9] = var2.O[var3].b;
                        var9 = b(var9);
                        if (!var2.c(var9) && !var2.d(var9)) {
                            var4 = 0;
                        }
                    }

                    if (var3 < 9 && (var3 == 0 || var3 != 0 && var2.O[var3 + 1].a != var2.O[var3 - 1].a) && var2.O[var3 + 1].a != 0 && var2.O[var3 + 1].b != -1) {
                        var9 = new int[10];

                        for (var7 = 0; var7 < 10; ++var7) {
                            if (var2.O[var7].a == var2.O[var3 + 1].a) {
                                var9[var7] = var2.O[var7].b;
                                var8 += var9[var7] / 4 + 1;
                            } else {
                                var9[var7] = -1;
                            }
                        }

                        (var9 = b(var9))[9] = var2.O[var3].b;
                        var9 = b(var9);
                        if (!var2.c(var9) && !var2.d(var9)) {
                            var8 = 0;
                        }
                    }

                    if (var4 < var8) {
                        var2.O[var3].a = var2.O[var3 + 1].a;
                    } else if (var4 > 0) {
                        var2.O[var3].a = var2.O[var3 - 1].a;
                    }
                }
            }
        }

        if (this.X + (this.ay - 3) == 3) {
            super.ad = this.aY;
        }

    }

    private void G() {
        byte var1 = 0;

        for (int var2 = 0; var2 < 10; ++var2) {
            if (this.m(this.O[var2].a)) {
                return;
            }

            if (this.O[var2].a != 0 && var1 != this.O[var2].a) {
                var1 = this.O[var2].a;
                --this.ay;
            }

            this.O[var2].a = 0;
        }

    }

    private boolean m(int var1) {
        for (int var2 = 0; var2 < 3; ++var2) {
            if (this.P[var2].a == 0) {
                return false;
            }

            if (this.P[var2].a == var1) {
                return true;
            }
        }

        return false;
    }

    public final void a(byte var1, Vector var2, int var3, int var4) {
        super.s();
        this.u();
        this.t();
        kx.u = (long) main.GameGraphic.j();
        super.n = var3;
        this.aA = super.n;
        kx.v = var1;
        this.aC = var4;
        kx.j = true;
        int var5 = var2.size();

        for (var3 = 0; var3 < var5; ++var3) {
            ax var6 = (ax) var2.elementAt(var3);
            this.O[var3] = new ax(var6.b, true);
            this.O[var3].c = main.GameGraphic.o;
            this.O[var3].d = main.GameGraphic.p;
            this.O[var3].g = true;
        }

        b(this.O);
        this.F();
        if (super.n != GameMidlet.i.w) {
            this.x();
        }

        this.f();
        this.b(false);
    }

    public final void j() {
        this.C();
        super.j();
        this.B();
        int var1 = 0;
        int var2 = -1;

        for (int var3 = 0; var3 < 10; ++var3) {
            if (this.L[var3] == 0) {
                ++var1;
                var2 = var3;
            }
        }

        if (var1 > 1) {
            main.GameGraphic.showAlert(StringEntity.af);
        } else if (var2 == -1) {
            main.GameGraphic.showAlert(StringEntity.ag);
        } else {
            boolean var10000;
            if (this.O[var2].a != 0 && !this.n(var2)) {
                main.GameGraphic.showAlert(StringEntity.ah);
                var10000 = false;
            } else {
                var10000 = true;
            }

            if (var10000) {
                this.x();
                kx.o();
                ie.a().c(this.O[var2].b);
            }
        }
    }

    public final void a(int var1, int var2, int var3, byte var4) {
        if (var3 == -1) {
            this.w();
            main.GameGraphic.showAlert(StringEntity.aY);
        } else {
            if (var1 == GameMidlet.i.w) {
                this.C();
            }

            this.x();
            kx.u = (long) main.GameGraphic.j();
            int var5;
            if ((var5 = kx.i(var2)) != -1) {
                this.h.a = kx.F[kx.x[var5]].a;
                if (var2 == GameMidlet.i.w) {
                    this.h.a = this.g.a + super.o * aU;
                }

                if (var1 == GameMidlet.i.w) {
                    if (a(this.f[kx.s]) != -1 && a(this.f[kx.s]) <= 3) {
                        this.v();
                    }

                    this.G();
                    this.F();
                }

                this.h.b = kx.F[kx.x[var5]].b;
                this.aB = var3;
                super.n = var1;
                this.aA = var2;
                this.W[var5] = var4;
                this.M = true;
                int var10002 = this.e[var5]++;
            }
        }
    }

    public final void b(int var1, int var2) {
        if (kx.i(var1) != -1) {
            this.aC = var2;
            if (var1 == GameMidlet.i.w && super.n != var1) {
                this.v();
                this.b(false);
            }

            super.n = var1;
            kx.u = (long) main.GameGraphic.j();
        }
    }

    private void H() {
        for (int var1 = 0; var1 < this.L.length; ++var1) {
            this.L[var1] = -1;
        }

    }

    public final void a(boolean var1, int[] var2, boolean var3, int var4) {
        int var5 = kx.i(var4);
        if (!var1) {
            main.GameGraphic.showAlert(StringEntity.aj);
        } else {
            if (var4 == GameMidlet.i.w) {
                this.C();
            }

            this.H();
            this.aH = var3;
            int var6 = 1;

            int var7;
            for (var7 = 0; var7 < this.Q[var5].length; ++var7) {
                if (this.Q[var5][var7] == -1) {
                    if (var6 == 1) {
                        var6 = var7;
                        break;
                    }

                    var6 = 1;
                } else {
                    var6 = 0;
                }
            }

            for (var7 = var6; var7 < var2.length; ++var7) {
                if (var2[var7 - var6] != -1) {
                    this.Q[var5][var7] = var2[var7 - var6];
                }
            }

            if (GameMidlet.i.w == var4) {
                this.aI = true;

                for (var7 = 0; var7 < 10; ++var7) {
                    for (var6 = 0; var6 < var2.length; ++var6) {
                        if (this.O[var7].b == var2[var6]) {
                            this.j(var7);
                            break;
                        }
                    }
                }

                this.w();
                this.O = b(this.O);
                if (this.O[super.o].b == -1) {
                    super.o = this.J() - 1;
                }

                this.b(false);
            }

            if (this.aH) {
                this.aF = true;
                this.A();
            }

            this.T[var5] = 0;

            for (var7 = 0; var7 < this.Q[var5].length; ++var7) {
                if (this.Q[var5][var7] != -1) {
                    int var10002 = this.T[var5]++;
                }
            }

        }
    }

    public final void a(int[] var1, int[][] var2) {
        this.C();
        int var3 = 1000;

        int var4;
        for (var4 = 0; var4 < 4; ++var4) {
            if (var1[var4] >= 0 && var1[var4] < var3) {
                var3 = var1[var4];
                this.aG = var4;
            }

            this.aJ[var4] = var1[var4];
        }

        this.U = var2;

        for (var4 = 0; var4 < 4; ++var4) {
            this.V[var4] = (byte) a(var2[var4]);
        }

        this.aF = true;
        this.A();

        for (var4 = 0; var4 < 4; ++var4) {
            hn var5;
            if ((var5 = (hn) kx.m.elementAt(var4)) != null && var5.w != -1 && this.aJ[var4] != -1) {
                if (this.aJ[var4] == -2) {
                    kx.a(var5.w, StringEntity.dm);
                } else if (var4 == this.aG) {
                    kx.a(var5.w, StringEntity.aP);
                } else {
                    kx.a(var5.w, StringEntity.aQ);
                }

                var5.o = false;
            }
        }

        GameMidlet.i.o = false;
        this.b(false);
    }

    public final void m() {
        this.aF = true;
        this.A();
        if (!kx.k) {
            this.aG = kx.s;
            kx.a(((hn) kx.m.elementAt(this.aG)).w, StringEntity.aP);
        }

        kx.j = true;
    }

    public final void b(int var1) {
        this.aF = true;
        this.A();
        this.aG = var1;
        this.aH = true;
        kx.a(this.aG, StringEntity.dn);
        kx.a(this.aA, StringEntity.do1);
    }

    private boolean n(int var1) {
        int var2 = -1;

        for (int var3 = 0; var3 < 3; ++var3) {
            if (this.P[var3].a != 0 && this.P[var3].a == this.O[var1].a) {
                var2 = var3;
                break;
            }
        }

        int var4;
        int[] var6;
        if (var2 == -1) {
            if (this.O[var1].a != 0) {
                var6 = new int[10];

                for (var4 = 0; var4 < 10; ++var4) {
                    if (this.O[var4].a == this.O[var1].a && this.L[var4] == -1 && var4 != var1) {
                        var6[var4] = this.O[var4].b;
                    } else {
                        var6[var4] = -1;
                    }
                }

                var6 = b(var6);
                if (!this.c(var6) && !this.d(var6)) {
                    for (var4 = 0; var4 < 10; ++var4) {
                        if (var4 != var1 && this.O[var4].a == this.O[var1].a) {
                            this.O[var4].a = 0;
                        }
                    }

                    this.O[var1].a = 0;
                }
            }

            return true;
        } else {
            var6 = new int[10];

            for (var4 = 0; var4 < 10; ++var4) {
                if (this.O[var4].a == this.P[var2].a && this.L[var4] == -1 && var4 != var1) {
                    var6[var4] = this.O[var4].b;
                } else {
                    var6[var4] = -1;
                }
            }

            var6 = b(var6);
            var4 = -1;
            var1 = 0;

            int var5;
            for (var5 = 0; var5 < 10; ++var5) {
                if (var6[var5] == this.P[var2].b) {
                    var4 = var5;
                }
            }

            for (var5 = 0; var5 < 9 && var6[var5 + 1] != -1 && (var6[var5 + 1] / 4 == var6[var5] / 4 || var6[var5 + 1] / 4 - var6[var5] / 4 == 1 && var6[var5] % 4 == var6[var5 + 1] % 4); ++var5) {
                var1 = var5 + 1;
            }

            if (var4 > var1 && var1 > 1) {
                return false;
            } else if (var1 > 1) {
                for (var5 = var1 + 1; var5 < 10; ++var5) {
                    for (var2 = 0; var2 < 10; ++var2) {
                        if (var6[var5] == this.O[var2].b) {
                            this.O[var2].a = 0;
                        }
                    }
                }

                return true;
            } else {
                int[] var7 = new int[3];

                for (var2 = 0; var2 < 3; ++var2) {
                    var7[var2] = -1;
                }

                for (var2 = 0; var2 <= var1; ++var2) {
                    var7[var2] = var6[var2];
                    var6[var2] = -1;
                }

                var6 = b(var6);
                if (!this.c(var6) && !this.d(var6)) {
                    return false;
                } else {
                    for (var2 = 0; var2 < 3; ++var2) {
                        for (var1 = 0; var1 < 10; ++var1) {
                            if (var7[var2] == this.O[var1].b) {
                                this.O[var1].a = 0;
                            }
                        }
                    }

                    return true;
                }
            }
        }
    }

    public final void a(boolean var1, int var2, int var3, byte var4) {
        int var5;
        if ((var5 = kx.i(super.n)) != -1) {
            if (super.n == GameMidlet.i.w) {
                this.C();
            }

            if (var1) {
                this.aN = true;
                this.aQ = new ax((byte) this.aB, true);
                int var6 = kx.i(this.aA);
                this.aQ.c = kx.F[kx.x[var6]].a;
                this.aQ.d = kx.F[kx.x[var6]].b;
                int var7;
                if ((var7 = kx.i(this.aA)) != -1) {
                    var6 = kx.i(this.aC);
                    if (var7 != var6) {
                        this.f[var7][this.W[var7]] = this.f[var6][this.W[var6]];
                    }

                    this.f[var6][this.W[var6]] = null;
                    this.aC = var3;
                    this.W[var6] = var4;
                    this.e[var5] = this.W[var5];
                    this.e[var6] = this.W[var6];
                }

                int var10002 = this.S[var5]++;
                if (super.n == GameMidlet.i.w) {
                    ++this.X;
                    if (a(this.f[kx.s]) == 3) {
                        this.y();
                    } else {
                        this.w();
                    }

                    var6 = var2 - 1;

                    while (true) {
                        if (var6 < 0) {
                            var6 = this.J();
                            this.O[var6] = new ax((byte) this.aB, true);
                            this.O[var6].a = (byte) this.X;

                            for (var7 = 0; var7 < 3; ++var7) {
                                if (this.P[var7].b == -1) {
                                    this.P[var7] = this.O[var6];
                                    break;
                                }
                            }

                            this.G();
                            this.F();
                            break;
                        }

                        for (var7 = 0; var7 < 10; ++var7) {
                            if (this.O[var7].b == this.bf[var6]) {
                                this.O[var7].a = (byte) this.X;
                                this.O[this.J()] = this.O[var7];
                                this.l(var7);
                            }
                        }

                        --var6;
                    }
                }

                this.R[var5][a(this.R[var5])] = this.aB;
                this.H();
            } else if (super.n == GameMidlet.i.w) {
                main.GameGraphic.showAlert(StringEntity.al);
                this.v();
            }

            if (GameMidlet.i.w == super.n || GameMidlet.i.w == this.aA) {
                this.b(false);
            }

        }
    }

    private void I() {
        this.C();
        this.B();
        this.x();
        kx.o();
        ie.a().f();
    }

    public final void c(int var1) {
        this.C();
        kg var2 = this;
        int var3 = 0;

        int var10000;
        while (true) {
            if (var3 >= 10) {
                var10000 = -1;
                break;
            }

            if (var2.O[var3].b == -1) {
                var10000 = var3;
                break;
            }

            if (var2.m(var2.O[var3].a)) {
                for (int var4 = 9; var4 > var3; --var4) {
                    var2.O[var4] = var2.O[var4 - 1];
                }

                var10000 = var3;
                break;
            }

            ++var3;
        }

        int var5 = var10000;
        this.bg = var5;
        this.aM = true;
        this.aP = new ax((byte) var1, true);
    }

    public final void a(boolean var1, byte var2) {
        int var3;
        if ((var3 = kx.i(super.n)) != -1) {
            if (super.n == GameMidlet.i.w) {
                this.C();
            }

            if (var1) {
                int var7;
                if (GameMidlet.i.w == super.n) {
                    for (var7 = 0; var7 < 10 && this.O[var7].b != -1; ++var7) {
                        if (var2 == this.O[var7].b) {
                            this.j(var7);
                            break;
                        }
                    }

                    this.b(false);
                }

                var7 = 0;
                int[] var4 = new int[6];

                int var5;
                for (var5 = 0; var5 < 6; ++var5) {
                    var4[var5] = -1;
                }

                for (var5 = 0; var5 < this.Q[var3].length; ++var5) {
                    if (this.Q[var3][var5] != -1) {
                        var4[var7] = this.Q[var3][var5];
                        ++var7;
                    } else {
                        var7 = 0;
                        var4[5] = var2;
                        b(var4);
                        int var6;
                        if (this.c(var4) || this.d(var4)) {
                            for (var6 = 11; var6 > var5; --var6) {
                                if (var6 - 1 >= 0) {
                                    this.Q[var3][var6] = this.Q[var3][var6 - 1];
                                }
                            }

                            this.Q[var3][var5] = var2;
                        }

                        for (var6 = 0; var6 < 6; ++var6) {
                            var4[var6] = -1;
                        }
                    }
                }
            }

        }
    }

    private int J() {
        for (int var1 = 0; var1 < 10; ++var1) {
            if ((this.aD.b == -1 || var1 != super.o) && this.O[var1].b == -1) {
                return var1;
            }
        }

        return -1;
    }

    private static int a(ax[] var0) {
        for (int var1 = 0; var1 < var0.length; ++var1) {
            if (var0[var1] == null) {
                return var1;
            }
        }

        return -1;
    }

    private static int a(int[] var0) {
        for (int var1 = 0; var1 < var0.length; ++var1) {
            if (var0[var1] == -1) {
                return var1;
            }
        }

        return -1;
    }

    public final void a(byte var1, byte var2, int var3, int var4, Vector var5) {
        super.a(var1, var2, var3, var4, var5);
        GameMidlet.i.o = false;
        kx.w = 0;
    }

    private static int[] b(int[] var0) {
        for (int var1 = 0; var1 < var0.length - 1; ++var1) {
            for (int var2 = var1 + 1; var2 < var0.length; ++var2) {
                int var3;
                if (var0[var2] != -1 && ((var3 = var0[var1]) > var0[var2] || var3 == -1)) {
                    var0[var1] = var0[var2];
                    var0[var2] = var3;
                }
            }
        }

        return var0;
    }

    private static ax[] b(ax[] var0) {
        for (int var1 = 0; var1 < var0.length - 1; ++var1) {
            for (int var2 = var1 + 1; var2 < var0.length; ++var2) {
                ax var3;
                if (var0[var2].b != -1 && ((var3 = var0[var1]).b > var0[var2].b || var3.b == -1)) {
                    var0[var1] = var0[var2];
                    var0[var2] = var3;
                }
            }
        }

        return var0;
    }

    private boolean c(int[] var1) {
        var1 = b(var1);
        int var2 = 0;
        int var3 = 0;

        while (true) {
            if (var3 < var1.length - 1 && var1[var3 + 1] != -1) {
                if (var1[var3] - var1[var3 + 1] != 0 && var1[var3 + 1] / 4 - var1[var3] / 4 == 1 && var1[var3] % 4 - var1[var3 + 1] % 4 == 0) {
                    ++var2;
                    ++var3;
                    continue;
                }

                return false;
            }

            if (var2 > 1) {
                return true;
            }

            return false;
        }
    }

    private boolean d(int[] var1) {
        var1 = b(var1);
        int var2 = 0;
        int var3 = 0;

        while (true) {
            if (var3 < var1.length - 1 && var1[var3 + 1] != -1) {
                if (var1[var3] / 4 - var1[var3 + 1] / 4 == 0 && var1[var3] - var1[var3 + 1] != 0) {
                    ++var2;
                    ++var3;
                    continue;
                }

                return false;
            }

            if (var2 > 1) {
                return true;
            }

            return false;
        }
    }

    public final void a(int var1, int var2, int var3, int[][] var4, int[][] var5, int var6) {
        this.t();
        kx.k = true;
        kx.u = (long) main.GameGraphic.j();

        int var7;
        for (var7 = 0; var7 < var4.length; ++var7) {
            for (int var8 = 0; var8 < var5[var7].length; ++var8) {
                if (var4[var7][var8] != -1) {
                    this.f[var7][var8] = new ax((byte) var4[var7][var8], true);
                }
            }
        }

        this.R = var5;
        kx.v = var1;
        super.n = var2;
        this.aA = var3;
        this.aC = var6;
        kx.j = true;

        for (var7 = 0; var7 < 4; ++var7) {
            this.f[kx.s][var7] = null;
        }

        for (var7 = 0; var7 < 3; ++var7) {
            this.R[kx.s][var7] = -1;
        }

        for (var7 = 0; var7 < this.Q.length; ++var7) {
            this.Q[kx.s][var7] = -1;
        }

        for (var7 = 0; var7 < this.U.length; ++var7) {
            this.U[kx.s][var7] = -1;
        }

        this.f();
        hj.z();
        if (main.GameGraphic.H && (aU = (main.GameGraphic.width - kx.z / 2) / 10) > kx.z / 3 << 1) {
            aU = kx.z / 3 << 1;
        }

    }
}
