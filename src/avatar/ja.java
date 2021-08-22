package avatar;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class ja extends kx {

    public static ja a;
    private Vector K = new Vector();
    private Vector L = new Vector();
    private Vector M = new Vector();
    private Vector N = new Vector();
    private Vector O = new Vector();
    private Button P;
    private Button Q;
    private int R;
    private int S;
    private byte T = -1;
    private byte U = -1;
    private byte V;
    private byte W;
    private byte X;
    private byte ay;
    private byte az;
    public static int b;
    public static int c;
    private boolean[] aA = new boolean[6];
    public byte[][] d = new byte[5][6];
    private byte[] aB = new byte[3];
    public byte e;
    private byte aC = 0;
    private byte aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    public boolean f;
    private int[] aI;
    private Image aJ;
    public static int g;
    public static int h;
    private static dr[] aK;
    private Vector aL = new Vector();
    private Button aM;

    public static kx b() {
        return a == null ? (a = new ja()) : a;
    }

    public final void a() {
        this.e();
        super.a();
    }

    private void t() {
        int var1;
        for (var1 = 0; var1 < this.aB.length; ++var1) {
            this.aB[var1] = -1;
        }

        for (var1 = 0; var1 < this.aA.length; ++var1) {
            this.aA[var1] = false;
        }

        for (var1 = 0; var1 < this.d.length; ++var1) {
            for (int var2 = 0; var2 < this.d[var1].length; ++var2) {
                this.d[var1][var2] = 0;
            }
        }

    }

    public ja() {
        try {
            this.aJ = Image.createImage(StringEntity.a() + "/on/p.on");
        } catch (IOException var2) {
            var2.printStackTrace();
        }

        this.t();
        this.aI = null;
        this.P = new Button(StringEntity.B, 7);
        this.Q = new Button(StringEntity.w, 8);
        this.aM = new Button(StringEntity.B, 9);
        if (main.GameGraphic.width > 200) {
            c = 23;
            b = 23;
            h = 48;
            g = 48;
            if (gy.Y == 2) {
                h = 96;
                g = 96;
            }
        } else {
            c = 12;
            b = 12;
            h = 32;
            g = 32;
        }

        this.v();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 7:
                this.y();
                break;
            case 8:
                this.g();
                this.aL.removeAllElements();
                kx.l = false;
                kx.j = false;
                kx.k = false;
                super.n = -1;
                this.aI = null;
                this.K.removeAllElements();
                this.L.removeAllElements();
                this.T = -1;
                this.U = -1;
                break;
            case 9:
                if (!this.aE) {
                    if (!this.aA[kx.i(GameMidlet.i.w)]) {
                        this.aD = 1;
                        this.C();
                    }
                } else if (this.T != -1) {
                    this.T = -1;
                    super.ad.text = "Chọn";
                    super.ae = this.P;
                }
        }

        super.a(var1, var2);
    }

    public final void e() {
        super.e();
        if (main.GameGraphic.width > 150) {
            aK = new dr[]{
                new dr(20 * gy.Y, 50 + 30 * gy.Y, 6),
                new dr(20 * gy.Y, main.GameGraphic.p + 60, 6),
                new dr(main.GameGraphic.o, main.GameGraphic.height2 - main.GameGraphic.T - 10, 33),
                new dr(main.GameGraphic.width - 14 * gy.Y, main.GameGraphic.p + 60, 10),
                new dr(main.GameGraphic.width - 14 * gy.Y, 50 + 30 * gy.Y, 10)
            };
        } else {
            aK = new dr[]{
                new dr(20, 13, 6),
                new dr(20, main.GameGraphic.p - 5, 6),
                new dr(main.GameGraphic.o, main.GameGraphic.height2 - main.GameGraphic.T - 10, 33),
                new dr(main.GameGraphic.width - 14, main.GameGraphic.p - 5, 10),
                new dr(main.GameGraphic.width - 14, 13, 10)};
        }
    }

    public final void a(byte var1, byte var2, int var3) {
        int var4 = var3;
        byte var8 = var2;
        if (var4 != 0) {
            hn var6 = (hn) kx.m.elementAt(var1);
            hn var9 = (hn) kx.m.elementAt(var8);
            dn var5;
            (var5 = new dn(var6.aw, var6.ax)).o = (short) var4;
            var5.f = awClass.e(3);
            int var7 = awClass.a(var9.aw - var6.aw, -(var9.aw - var6.ax));
            var5.b = var7;
            var5.az = (byte) awClass.b(-1, 1);
            var5.e = awClass.c(var5.b + var5.az * 90);
            var7 = 10 * awClass.b(var5.e) >> 10;
            var4 = -(10 * awClass.a(var5.e)) >> 10;
            var5.n = (short) var9.aw;
            var5.m = (short) var9.ax;
            var5.aw += var7;
            var5.ax += var4;
            var5.f = 0;
            var5.i = (byte) (awClass.e(4) + 2);
            var5.aA = (short) (8 + awClass.e(5));
            this.aL.addElement(var5);
        }

    }

    private void u() {
        this.T = -1;
        this.U = -1;
        this.W = 0;
        this.X = 0;
        this.ay = 0;
        this.aE = false;
        this.aF = false;
        this.aG = false;
        this.aC = 0;
        this.f = false;
        this.K.removeAllElements();
        this.L.removeAllElements();
        this.N.removeAllElements();
        this.az = 0;
        this.aH = false;
        kx.j = false;
        super.n = -1;
        this.aD = 0;
        kx.k = false;
        this.t();

        for (int var1 = 0; var1 < this.O.size(); ++var1) {
            ((kl) this.O.elementAt(var1)).b = 0;
        }

    }

    private void v() {
        this.O.removeAllElements();
        this.R = main.GameGraphic.width / 2 - g - g / 2 - 10;
        this.S = main.GameGraphic.height / 2 - h - 12;

        for (int var1 = 0; var1 < 6; ++var1) {
            kl var2;
            (var2 = new kl()).a = var1;
            var2.c = this.R + var1 % 3 * (g + 10);
            var2.d = this.S + var1 / 3 * (h + 8);
            this.O.addElement(var2);
        }

    }

    private void w() {
        if (this.N.size() <= 0) {
            int var1;
            int var2;
            if (main.GameGraphic.width > 200) {
                var1 = main.GameGraphic.width / 2 - 64 * gy.Y;

                for (var2 = 0; var2 < 3; ++var2) {
                    this.a(var1 + (var2 << 6) * gy.Y, 10, var2, var2, false);
                }

                return;
            }

            var1 = main.GameGraphic.width / 2 - 49;

            for (var2 = 0; var2 < 3; ++var2) {
                this.a(var1 + var2 * 49, 0, var2, var2, false);
            }
        }

    }

    private void x() {
        if (!this.aF) {
            kx.o();
            this.f = true;
            ie.a().a(this.T, this.U);
            kx.k = true;
            super.n = -1;
        }

    }

    private void y() {
        kx.o();
        kx.k = true;
        ie.a().j();
    }

    private void A() {
        ++((kl) this.O.elementAt(this.V)).b;
        ja var1 = this;

        for (int var2 = 0; var2 < 6; ++var2) {
            kl var3 = (kl) var1.O.elementAt(var2);
            int var4 = a(var1.M, kx.i(GameMidlet.i.w));
            int var10001 = var3.c + g / 2;
            int var10002 = var3.d + h / 2;
            int var10003 = var3.b;
            int var7 = b(var4);
            int var6 = var10003;
            int var5 = var10002;
            var4 = var10001;
            ef var8 = new ef(var4, var5, var6, var7);
            var1.K.addElement(var8);
        }

    }

    private void B() {
        for (int var1 = 0; var1 < 6; ++var1) {
            kl var2 = (kl) this.O.elementAt(var1);
            int var3 = a(this.M, this.ay);
            this.a(var2.c, var2.d, var2.c, var2.d, this.d[this.ay][var1], b(var3), var1, var1, false);
        }

    }

    private void e(Graphics var1) {
        if (this.N.size() > 0) {
            for (int var2 = 0; var2 < this.N.size(); ++var2) {
                ((ev) this.N.elementAt(var2)).a(var1);
            }
        }

    }

    private static int b(int var0) {
        switch (var0) {
            case 0:
                return 3;
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return -1;
        }
    }

    private void a(int var1, int var2, int var3, int var4, boolean var5) {
        ev var6 = new ev(var1, var2, var3, var4, false);
        this.N.addElement(var6);
    }

    private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
        ky var10 = new ky(var1, var2, var3, var4, var5, var6, var7, var8, false);
        this.L.addElement(var10);
    }

    public final void a(byte var1) {
        int var2 = kx.i(GameMidlet.i.w);
        hn var3 = (hn) kx.m.elementAt(var1);
        if (var2 == var1) {
            this.aA[var2] = false;
            this.aE = true;
            super.ae = null;
            this.aD = 2;
            this.f = false;
        }

        super.n = var3.w;
        kx.v = this.e;
        kx.u = (long) main.GameGraphic.j();
        if (!this.aG) {
            this.aG = true;
        }

        if (GameMidlet.i.w != kx.r && var2 == var1) {
            super.ad = kx.D;
            super.ad.text = "Chọn";
            super.ae = this.P;
        }

    }

    public final void a(Graphics var1) {
        this.b(var1);
        main.GameGraphic.c(var1);
        Graphics var3 = var1;
        ja var2 = this;

        for (int var4 = 0; var4 < var2.aL.size(); ++var4) {
            dn var5;
            if ((var5 = (dn) var2.aL.elementAt(var4)).i >= 0) {
                main.GameGraphic.O.a(var3, "+" + var5.o, var5.aw, var5.ax, 2);
            }
        }

        super.a(var1);
    }

    public final void b(Graphics var1) {
        super.b(var1);
        ja var3;
        Graphics var4;
        int var5;
        int var10003;
        if (kx.j || kx.k) {
            main.GameGraphic.c(var1);
            var4 = var1;
            var3 = this;
            if (this.O.size() > 0) {
                if (this.T != -1) {
                    var1.setColor(16777215);
                    if (main.GameGraphic.l % 20 > 10) {
                        var1.fillRect(this.R + this.T % 3 * (g + 10), this.S + this.T / 3 * (h + 8), g, h);
                    }
                }

                if (this.U != -1) {
                    var1.setColor(1112500);
                    if (main.GameGraphic.l % 20 > 10) {
                        var1.fillRect(this.R + this.U % 3 * (g + 10), this.S + this.U / 3 * (h + 8), g, h);
                    }
                }

                for (var5 = 0; var5 < var3.O.size(); ++var5) {
                    kl var6 = (kl) var3.O.elementAt(var5);
                    if (fxClass.c((short) (main.GameGraphic.width > 200 ? 872 : 873)).d != -1) {
                        var10003 = var6.a * h;
                        int var10007 = var3.R + var5 % 3 * (g + 10);
                        int var10008 = var3.S + var5 / 3 * (h + 8);
                        var4.drawRegion(fxClass.c((short) (main.GameGraphic.width > 200 ? 872 : 873)).a, 0, var10003, g, h, 0, var10007, var10008, 0);
                    }
                }
            }
        }

        this.a_(var1);
        if (kx.j || kx.k) {
            main.GameGraphic.c(var1);
            var4 = var1;
            var3 = this;

            int var7;
            for (var5 = 0; var5 < kx.m.size(); ++var5) {
                hn var10;
                if ((var10 = (hn) kx.m.elementAt(var5)).w == kx.r || var10.w != -1) {
                    if (var3.n != var10.w || main.GameGraphic.l % 10 >= 5) {
                        main.GameGraphic.Q.a(var4, var10.c() + StringEntity.k(), var10.aw, var10.ax + 5, 2);
                    }

                    if ((var7 = a(var3.M, kx.i(var10.w))) != -1 && fxClass.c((short) 871).d != -1) {
                        var4.drawRegion(fxClass.c((short) 871).a, 0, b(var7) * 12, 12, 12, 0, var10.aw, var10.ax + 5 + gy.ai, 17);
                    }
                }
            }

            int var2;
            if (kx.j || kx.k) {
                if ((var2 = (int) ((long) kx.v - kx.t)) > 0 && !kx.l && this.N.size() <= 0) {
                    main.GameGraphic.O.a(var1, String.valueOf(var2), main.GameGraphic.o, 10, 2);
                }

                if (this.aG) {
                    if (this.aC < 100) {
                        ++this.aC;
                    } else {
                        this.aC = 100;
                    }

                    if (this.aC < 50) {
                        main.GameGraphic.L.a(var1, "Bắt đầu tả", main.GameGraphic.o, this.S - 40, 2);
                    }
                }
            }

            if (this.K.size() > 0) {
                for (var2 = 0; var2 < this.K.size(); ++var2) {
                    ef var8;
                    if ((var8 = (ef) this.K.elementAt(var2)).a > 0) {
                        var8.a(var1);
                    }
                }
            }

            if (this.L.size() > 0) {
                for (var2 = 0; var2 < this.L.size(); ++var2) {
                    ky var9;
                    if ((var9 = (ky) this.L.elementAt(var2)).c > 0 && !(var9 = var9).h) {
                        CsInterface var11 = main.GameGraphic.O;
                        if (main.GameGraphic.width <= 200) {
                            var11 = main.GameGraphic.Q;
                        }

                        if (main.GameGraphic.Z > 0) {
                            var11 = main.GameGraphic.K;
                        }

                        int var12 = var9.a + g / 4 + var9.d % 2 * g / 2;
                        var7 = var9.b + h / 4 + var9.d / 2 * h / 2;
                        if (fxClass.c((short) (main.GameGraphic.width > 200 ? 870 : 871)).d != -1) {
                            var10003 = var9.d * c;
                            var1.drawRegion(fxClass.c((short) (main.GameGraphic.width > 200 ? 870 : 871)).a, 0, var10003, b, c, 0, var12, var7, 3);
                        }

                        var11.a(var1, String.valueOf(var9.c), var12, var7 - var11.getLastByte() / 2, 2);
                    }
                }
            }

            if (GameMidlet.i.w != kx.r && kx.j && this.N.size() == 0) {
                var1.drawImage(this.aJ, this.R + g / 2 + this.V % 3 * (g + 10), this.S + h / 2 + this.V / 3 * (h + 8) + main.GameGraphic.l % 4 + 5, 3);
            }

            this.e(var1);
        }

    }

    private void C() {
        kx.o();
        this.f = true;
        ie.a().a(this.O);
        this.K.removeAllElements();
    }

    public final void l() {
        super.l();
        if (!this.aA[kx.i(GameMidlet.i.w)] && GameMidlet.i.w != kx.r) {
            ja var2 = this;
            if (!this.f && kx.j && !kx.l && this.O.size() > 0 && main.GameGraphic.g) {
                main.GameGraphic.g = false;

                for (int var3 = 0; var3 < var2.O.size(); ++var3) {
                    kl var4 = (kl) var2.O.elementAt(var3);
                    if (main.GameGraphic.h >= var4.c && main.GameGraphic.h <= var4.c + g && main.GameGraphic.i >= var4.d && main.GameGraphic.i <= var4.d + h) {
                        var2.V = (byte) var3;
                        if (!var2.aE) {
                            if (!var2.aA[kx.i(GameMidlet.i.w)]) {
                                if (var2.az < 6) {
                                    var2.A();
                                }

                                ++var2.az;
                            }
                        } else if (var2.U == -1) {
                            if (var2.T == -1) {
                                var2.T = var2.V;
                                var2.ad.text = "Tả";
                                var2.D();
                            } else {
                                var2.U = var2.V;
                                var2.x();
                            }
                        }
                        break;
                    }
                }
            }

            if (main.GameGraphic.a(6)) {
                ++this.V;
                if (this.V > 5) {
                    this.V = 0;
                }

                return;
            }

            if (main.GameGraphic.a(4)) {
                --this.V;
                if (this.V < 0) {
                    this.V = 5;
                }

                return;
            }

            if (main.GameGraphic.a(8)) {
                if (this.V / 3 <= 0) {
                    this.V = (byte) (this.V + 3);
                    return;
                }
            } else if (main.GameGraphic.a(2) && this.V > 2) {
                this.V = (byte) (this.V - 3);
            }
        }

    }

    protected final void h() {
        super.h();
        if (!kx.j && !kx.k) {
            this.u();
        }

    }

    public final void k() {
        super.k();
        if (!kx.j && !kx.k) {
            this.q();
        } else {
            kx.t = (long) ((int) (System.currentTimeMillis() / 1000L - kx.u));
            if (kx.j && !kx.l && !kx.k && (long) kx.v - kx.t < 0L) {
                this.f = true;
                if (GameMidlet.i.w != kx.r) {
                    if (this.aD == 0) {
                        this.aD = 1;
                        this.C();
                    }

                    if (this.aD == 2) {
                        this.aD = 3;
                        this.y();
                    }
                }
            }

            ja var1 = this;
            int var11;
            if (this.L.size() > 0 && this.O.size() > 0) {
                ky var4;
                for (int var2 = 0; var2 < var1.L.size(); ++var2) {
                    ky var3;
                    if ((var4 = var3 = (ky) var1.L.elementAt(var2)).a != var4.f) {
                        if (var4.f - var4.a >> 1 == 0) {
                            var4.a = var4.f;
                        } else {
                            var4.a += var4.f - var4.a >> 1;
                        }
                    }

                    if (var4.b != var4.g) {
                        if (var4.g - var4.b >> 1 == 0) {
                            var4.b = var4.g;
                        } else {
                            var4.b += var4.g - var4.b >> 1;
                        }
                    }

                    if (var4.i && var4.a == var4.f && var4.b == var4.g) {
                        var4.h = true;
                    }

                    if (var3.h) {
                        var1.L.removeElement(var3);
                        if (var1.aF) {
                            kl var10 = (kl) var1.O.elementAt(var1.X);
                            int var5 = a(var1.M, var1.ay);
                            var1.a(var10.c, var10.d, var10.c, var10.d, var1.d[var1.ay][var1.X], b(var5), var1.X, var1.X, false);
                            var1.aF = false;
                        }
                    }
                }

                kl var7 = (kl) var1.O.elementAt(var1.X);
                if (var1.aF) {
                    for (var11 = 0; var11 < var1.L.size(); ++var11) {
                        if ((var4 = (ky) var1.L.elementAt(var11)).e == var1.W) {
                            var4.f = var7.c;
                            var4.g = var7.d;
                            var4.i = true;
                        }
                    }
                }
            }

            int var6;
            if (this.N.size() > 0) {
                for (var6 = 0; var6 < this.N.size(); ++var6) {
                    ev var8;
                    (var8 = (ev) this.N.elementAt(var6)).a();
                    if (this.aH) {
                        var8.a = this.aB[var6];
                        var8.b = true;
                    }
                }
            }

            for (var6 = 0; var6 < this.aL.size(); ++var6) {
                dn var9;
                if (awClass.f((var11 = awClass.a((var9 = (dn) this.aL.elementAt(var6)).n - var9.aw, -(var9.m - var9.ax))) - var9.e) > 10) {
                    var9.e -= var9.aA * var9.az;
                    var9.e = awClass.c(var9.e);
                } else {
                    var9.e = var11;
                    var9.i = (byte) (var9.i + 2);
                }

                if (var9.f >= 4) {
                    var9.f = 0;
                }

                ++var9.f;
                var11 = var9.i * awClass.b(var9.e) >> 10;
                int var12 = -(var9.i * awClass.a(var9.e)) >> 10;
                if (awClass.a(var9.aw, var9.ax, var9.n, var9.m) >= var9.i) {
                    var9.aw += var11;
                    var9.ax += var12;
                } else {
                    this.aL.removeElement(var9);
                }
            }
        }
    }

    public final void a(int[] var1) {
        this.aI = var1;
        this.aH = true;
        kx.l = true;
        super.ae = null;
        this.aG = false;
        this.aC = 0;
        super.ad = this.Q;
        ja var4 = this;

        for (byte var2 = 0; var2 < 5; ++var2) {
            hn var3;
            if ((var3 = (hn) kx.m.elementAt(var2)).w != -1) {
                kx.a(var3.w, String.valueOf(var4.aI[var2]));
                var3.b(var3.c() + var4.aI[var2]);
            }
        }

    }

    public final void i() {
        kx.j = false;
        kx.k = true;
        this.M.removeAllElements();
        this.f();

        for (int var1 = 0; var1 < kx.m.size(); ++var1) {
            if (((hn) kx.m.elementAt(var1)).w != kx.r) {
                this.M.addElement(String.valueOf(var1));
            }
        }

        this.B();
        super.ad = kx.E;
    }

    public final void j() {
        if (!this.aE) {
            if (!this.aA[kx.i(GameMidlet.i.w)]) {
                if (this.az < 6) {
                    this.A();
                }

                ++this.az;
                return;
            }
        } else if (this.U == -1) {
            if (this.T == -1) {
                this.T = this.V;
                super.ad.text = "Tả";
                this.D();
                return;
            }

            this.U = this.V;
            this.x();
        }

    }

    public final void m() {
        super.ad = kx.D;
        super.ae = this.aM;
        super.ad.text = "Đặt";
        super.ae.text = "Xong";
    }

    private void D() {
        super.ae = this.aM;
        super.ae.text = "Chọn lại";
    }

    private static int a(Vector var0, int var1) {
        for (int var2 = 0; var2 < var0.size(); ++var2) {
            if (((String) var0.elementAt(var2)).equals(String.valueOf(var1))) {
                return var2;
            }
        }

        return -1;
    }

    public final void n() {
        super.n();
        this.M.removeAllElements();

        for (int var1 = 0; var1 < kx.m.size(); ++var1) {
            if (((hn) kx.m.elementAt(var1)).w != kx.r) {
                this.M.addElement(String.valueOf(var1));
            }
        }

    }

    public final void b(byte var1) {
        super.s();
        main.GameGraphic.h();
        this.u();
        kx.r();
        this.M.removeAllElements();
        this.f();

        for (int var2 = 0; var2 < kx.m.size(); ++var2) {
            if (((hn) kx.m.elementAt(var2)).w != kx.r) {
                this.M.addElement(String.valueOf(var2));
            }
        }

        if (GameMidlet.i.w != kx.r) {
            this.m();
        } else {
            super.ad = null;
            super.ae = null;
        }

        kx.l = false;
        kx.j = true;
        kx.v = var1;
        kx.u = (long) main.GameGraphic.j();
    }

    public final void c(byte var1) {
        this.ay = var1;
        this.aA[this.ay] = true;
        this.B();
    }

    public final void a(byte var1, byte var2, byte var3) {
        if (var2 != var3) {
            this.ay = var1;
            this.W = var2;
            this.X = var3;
            this.aF = true;
            this.aD = 3;
        }

    }

    public final void a(byte[] var1) {
        this.aB = var1;
        Vector var4 = new Vector();

        for (int var2 = 0; var2 < 6; ++var2) {
            kl var3 = new kl();
            if (var2 == this.aB[0]) {
                var3.b = 6;
            }

            var4.addElement(var3);
        }

        ie.a().a(var4);
        this.w();
    }

    public final void f() {
        for (int var1 = 0; var1 < kx.H; ++var1) {
            hn var2;
            if ((var2 = (hn) kx.m.elementAt(var1)).w != -1) {
                var2.h = 0;
                var2.b((byte) 0);
                var2.f(var2.H);
                var2.a(aK[kx.x[var1]].a, aK[kx.x[var1]].b);
                if (kx.x[var1] != 2 && kx.x[var1] != 3 && kx.x[var1] != 4) {
                    var2.K = var2.t = 0;
                } else {
                    var2.K = var2.t = gx.J;
                }
            }
        }
    }
}
