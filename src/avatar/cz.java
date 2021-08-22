package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class cz extends hj implements cq {

    public static cz a;
    private Button q;
    private Button r;
    public Button b;
    private Button s;
    private Button t;
    private Button u;
    public hl[] c;
    private short v;
    private boolean w;
    public boolean d;
    private boolean x;
    private long y;
    public byte e = 0;
    public byte f = 1;
    public byte g;
    public static Image h;
    public static Image i;
    public static Image[] j;
    public static Image[] k;
    private fh z;
    public ki l;
    public static byte[][] m;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private ht Q;
    private ht R;
    private ht S;
    private ht T;
    private boolean U = false;
    private byte V = 0;
    private byte W;
    public short n = 0;
    public long o;
    public Vector p = new Vector();
    private int X;
    private int ay;
    private int az = -1;
    private int aA = 0;
    private int aB = 0;
    private byte aC;
    private boolean aD = false;
    private long aE;
    private long aF;
    private int[] aG = new int[]{100, 500, 1000, 2000, 5000, 10000, 20000, 30000, 50000};
    private boolean aH = false;
    private short aI;
    private short aJ;
    private String aK;
    private byte aL;
    private byte aM;
    private byte aN;

    public static cz b() {
        return a == null ? (a = new cz()) : a;
    }

    public cz() {
        (m = new byte[3][])[0] = new byte[]{0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1};
        m[1] = new byte[]{2, 2, 2, 3, 3, 3, 2, 2, 2, 3, 3, 3};
        m[2] = new byte[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        this.q = new Button(StringEntity.NEXT, 3, this);
        this.s = new Button(StringEntity.BET, 1, this);
        this.r = new Button(StringEntity.MENU, 7, this);
        this.t = new Button(StringEntity.OK, 6, this);
        this.u = new Button(StringEntity.CLOSE, 8, this);
        this.b = new Button(StringEntity.EXIT, 2, this);
        this.A = 220 * gy.Y;
        this.B = 240 * gy.Y;
        this.E = 8 * gy.Y;
        this.F = this.J = 23 * gy.Y;
        this.G = 105 * gy.Y;
        this.H = this.L = 211 * gy.Y;
        this.K = 95 * gy.Y;
        this.I = this.A - this.K - 8 * gy.Y;
        this.O = 180 * gy.Y + 10 * gy.Y + 10 * gy.Y;
        this.P = 110 * gy.Y;
        this.M = (main.GameGraphic.width - this.O) / 2;
        this.N = (main.GameGraphic.height - this.P) / 2;
    }

    public final void a() {
        super.a();
    }

    public final void a(hl[] var1, short var2, boolean var3, boolean var4) {
        this.x = false;
        this.f = 1;
        this.X = -1;
        main.GameGraphic.v = null;
        main.GameGraphic.A = null;
        this.U = false;
        int var5;
        if (h == null) {
            try {
                this.Q = new ht(Image.createImage(StringEntity.a() + "/race/popup/tile1.png"), 20 * gy.Y, 20 * gy.Y);
                this.R = new ht(Image.createImage(StringEntity.a() + "/race/popup/bt1.png"), 31 * gy.Y, 31 * gy.Y);
                this.T = new ht(Image.createImage(StringEntity.a() + "/race/popup/bt0.png"), 60 * gy.Y, 24 * gy.Y);
                this.S = new ht(Image.createImage(StringEntity.a() + "/race/popup/time.png"), 14 * gy.Y, 14 * gy.Y);
                h = Image.createImage(StringEntity.a() + "/race/28.png");
                i = Image.createImage(StringEntity.a() + "/race/29.png");
                j = new Image[5];

                for (var5 = 0; var5 < 5; ++var5) {
                    j[var5] = Image.createImage(StringEntity.a() + "/race/bui/d0" + var5 + ".png");
                }

                k = new Image[3];

                for (var5 = 0; var5 < 3; ++var5) {
                    k[var5] = Image.createImage(StringEntity.a() + "/race/bui/w" + var5 + ".png");
                }
            } catch (Exception var7) {
                var7.printStackTrace();
            }
        }

        if (!var3) {
            if (var4) {
                for (var5 = 0; var5 < ir.m.size(); ++var5) {
                    js var6;
                    if ((var6 = (js) ir.m.elementAt(var5)).az == 10) {
                        ir.a(var6);
                    }
                }
            }

            if (a != main.GameGraphic.r) {
                ir.a(ir.m);
                b().a();
                ir.t = -1;
                this.b(1);
                this.b(2);
                main.GameGraphic.x.e(108);
                ir.c(GameMidlet.i);
                cz var10 = b();
                do1.a().b(ir.a);
                var10.C = (main.GameGraphic.width - var10.A) / 2;
                var10.D = (main.GameGraphic.height - var10.B) / 2;
                var10.W = (byte) (35 * gy.Y);
                if (main.GameGraphic.INST.getHeight() <= 240) {
                    var10.W = 30;
                    var10.B = 215;
                    var10.H = var10.L = 185;
                }
                do1.g = false;
            }
            this.c = null;
            this.c = var1;
            if (var1 != null) {
                for (var5 = 0; var5 < 6; ++var5) {
                    this.c[var5].aw = 20;
                    this.c[var5].ax = 80 + var5 * 12;
                    ir.m.addElement(this.c[var5]);
                }
                do1.a().h = this.c[2];
                this.g = 3;
            }

            GameMidlet.i.aw = GameMidlet.i.C = 0;
        }

        GameMidlet.i.ax = GameMidlet.i.D = 96 * gy.Y;
        this.d = var3;
        this.w = var4;
        this.v = var2;
        this.y = System.currentTimeMillis();
        if (var3) {
            this.e = 48;
            super.ad = null;
            super.ae = this.q;
            super.ac = this.r;
        } else {
            super.ac = this.r;
            super.ae = null;
            super.ad = null;
            if (!var4) {
                super.ae = this.q;

                for (var5 = 0; var5 < 6; ++var5) {
                    int var9 = 0;

                    for (int var8 = 0; var8 < this.c[var5].e.length; ++var8) {
                        var9 += this.c[var5].e[var8];
                        hl var10000 = this.c[var5];
                        var10000.aw += this.c[var5].f[var8] * this.c[var5].e[var8];
                        ++this.c[var5].b;
                        if (var9 >= (var2 - 4) * 20) {
                            break;
                        }
                    }
                }
            } else {
                cx.getInstance().k(this.c[0].w);
                super.ad = this.s;
            }
        }
        this.z = new fh();
    }

    private void b(int var1) {
        Vector var2 = new Vector();
        Vector var3 = new Vector();
        Vector var4 = new Vector();
        Vector var5 = new Vector();
        Vector var6 = new Vector();

        int var7;
        for (var7 = 0; var7 < fxClass.b.length; ++var7) {
            ld var8 = fxClass.b[var7];
            fa var9 = (fa) var8;
            if (var8.f == -1 && var8.g < 2000 && var8.k > 0 && (var9.b == var1 || var9.b == 0)) {
                if (var9.j == 10) {
                    var2.addElement(var9);
                } else if (var8.j == 20) {
                    var3.addElement(var9);
                } else if (var8.j == 30) {
                    var4.addElement(var9);
                } else if (var8.j == 40) {
                    var5.addElement(var9);
                } else if (var8.j == 50) {
                    var6.addElement(var9);
                }
            }
        }

        for (var7 = 0; var7 < 10; ++var7) {
            hn var10 = new hn();
            var10.d = (byte) var1;

            hx var11 = new hx();
            var11.a = ((ld) var2.elementAt(awClass.e(var2.size()))).g;
            var10.a(var11);

            var11 = new hx();
            var11.a = ((ld) var3.elementAt(awClass.e(var3.size()))).g;
            var10.a(var11);

            var11 = new hx();
            var11.a = ((ld) var4.elementAt(awClass.e(var4.size()))).g;
            var10.a(var11);

            var11 = new hx();
            var11.a = ((ld) var5.elementAt(awClass.e(var5.size()))).g;
            var10.a(var11);

            var11 = new hx();
            var11.a = ((ld) var6.elementAt(awClass.e(var6.size()))).g;
            var10.a(var11);

            var10.h();
            this.p.addElement(var10);
        }

    }

    public final void a(int var1) {
        switch (var1) {
            case 0:
                cx var4;
                (var4 = cx.getInstance()).e((byte) 8);
                var4.k();
                main.GameGraphic.i();
                return;
            case 1:
                if (this.aA >= 0) {
                    this.U = true;
                    super.ad = this.t;
                    super.ac = null;
                    super.ae = this.u;
                }
                break;
            case 2:
                fl var3 = new fl(this);
                if (this.d) {
                    main.GameGraphic.a(StringEntity.eP, (ii) var3);
                    return;
                }

                main.GameGraphic.a(StringEntity.ee, (ii) var3);
                return;
            case 3:
                do1 var10000 = do1.a();
                hl[] var10001 = this.c;
                byte var10004 = this.g;
                this.g = (byte) (var10004 + 1);
                var10000.h = var10001[var10004];
                if (this.g >= 6) {
                    this.g = 0;
                }
            case 4:
            default:
                break;
            case 5:
                if (this.d || !this.w) {
                    super.ac = this.q;
                }

                super.ae = null;
                return;
            case 6:
                cx.getInstance().c(this.c[this.aA].w, this.aG[this.aB]);
                this.a(8);
                return;
            case 7:
                Vector var2;
                (var2 = new Vector()).addElement(new Button(StringEntity.ed, 0, this));
                var2.addElement(new Button(StringEntity.EXIT, 2, this));
                le.getInstance().a(var2, 0);
                return;
            case 8:
                super.ad = this.s;
                super.ac = this.r;
                super.ae = null;
                this.U = false;
        }

    }

    public final void k() {
        if (this.aC >= 0) {
            --this.aC;
            if (this.aC == 0) {
                this.e();
            }
        }

        if ((this.d || !this.w) && System.currentTimeMillis() - this.o >= 1000L) {
            this.o = System.currentTimeMillis();
            --this.n;
            if (this.n < 0) {
                this.n = 0;
            }
        }

        GameMidlet.i.a(do1.a().a + main.GameGraphic.o, do1.a().b + main.GameGraphic.height - 40 * gy.Y);
        if (System.currentTimeMillis() - this.y >= 1000L) {
            this.y = System.currentTimeMillis();
            --this.v;
            if (this.v < 0) {
                this.v = 0;
            } else {
                ++this.ay;
                if (this.w && !this.d && this.ay > 0) {
                    this.ay = 0;
                    if (this.aA >= 0 && this.c != null && this.aA < 6 && this.c[this.aA] != null && this.c[this.aA].w != this.X) {
                        this.X = this.c[this.aA].w;
                        cx.getInstance().k(this.X);
                    }
                }
            }
        }

        int var1;
        if (this.c != null) {
            var1 = 0;

            int var2;
            for (var2 = 0; var2 < 6; ++var2) {
                if ((this.d || !this.w) && this.c[var2].b >= this.c[var2].f.length) {
                    ++var1;
                }
            }

            if (!this.x && var1 == 6) {
                this.x = true;

                for (var2 = 0; var2 < 6; ++var2) {
                    ir.a((js) this.c[var2]);
                }
            }

            if (this.x && this.l != null) {
                this.x = false;
                main.GameGraphic.A = this.l;
                int[] var10000 = GameMidlet.i.a;
                var10000[0] += this.l.f;
                main.GameGraphic.a(this.l.f, main.GameGraphic.o, main.GameGraphic.height - 30 * gy.Y, -1, -1);
                this.l = null;
            }
        }

        main.GameGraphic.x.b();
        if (this.d && this.e > 0) {
            --this.e;
        }

        if (this.z != null && this.z.a()) {
            this.z.d = null;
        }

        if (this.d || !this.w) {
            for (var1 = 0; var1 < ir.m.size(); ++var1) {
                gx var4 = (gx) ir.m.elementAt(var1);
                if (var4.az == 9) {
                    hn var5 = (hn) var4;
                    if (System.currentTimeMillis() / 1000L - (long) var5.n > (long) var5.an) {
                        var5.n = (int) (System.currentTimeMillis() / 1000L);
                        var5.an = (short) (awClass.e(10) + 6);
                        int var3;
                        if ((var3 = awClass.e(6)) == 1) {
                            var5.b((byte) 0);
                        } else if (var3 == 3) {
                            var5.b((byte) 0);
                            var5.g();
                        } else if (var3 == 2) {
                            var5.b((byte) 7);
                        } else {
                            var5.b((byte) 2);
                        }
                    }
                }
            }
        }

    }

    public final void d(int var1) {
        im.d().a(var1, this);
        super.d(var1);
    }

    public final void l() {
        super.l();
        ++this.aE;
        if (main.GameGraphic.D == null || !bb.d) {
            super.l();
        }

        if (main.GameGraphic.a(2)) {
            if (this.U) {
                if (this.aB / 3 > 0) {
                    this.aB -= 3;
                }
            } else {
                --this.aA;
                if (this.aA < 0) {
                    this.aA = 0;
                }
            }
        } else if (main.GameGraphic.a(8)) {
            if (this.U) {
                if (this.aB / 3 < 2) {
                    this.aB += 3;
                }
            } else {
                ++this.aA;
                if (this.aA > 5) {
                    this.aA = 5;
                }
            }
        } else if (main.GameGraphic.a(4)) {
            if (this.U && this.aB % 3 > 0) {
                --this.aB;
            }
        } else if (main.GameGraphic.a(6) && this.U && this.aB % 3 < 2) {
            ++this.aB;
        }

        if (main.GameGraphic.g && this.c != null && !this.d && this.w) {
            int var1;
            if (this.U) {
                if (main.GameGraphic.b(this.M + this.O - 30 * gy.Y, this.N, 30 * gy.Y, 30 * gy.Y)) {
                    main.GameGraphic.g = false;
                    this.V = 5;
                    this.aD = true;
                    this.aF = this.aE;
                } else {
                    for (var1 = 0; var1 < 9; ++var1) {
                        if (main.GameGraphic.b(this.M + 5 * gy.Y + var1 % 3 * (5 * gy.Y + this.T.a), this.N + (this.P - 29 * gy.Y * 3) + var1 / 3 * 29 * gy.Y - 1 * gy.Y, 60 * gy.Y, 26 * gy.Y)) {
                            this.aB = var1;
                            main.GameGraphic.g = false;
                            this.aD = true;
                            this.aF = this.aE;
                            break;
                        }
                    }
                }
            } else {
                for (var1 = 0; var1 < 6; ++var1) {
                    if (main.GameGraphic.b(this.C + this.I + 32 * gy.Y / 2 - 15 * gy.Y, this.D + this.J + 3 * gy.Y + 35 * gy.Y * var1 + 31 * gy.Y / 2 - 15 * gy.Y, 31 * gy.Y, 31 * gy.Y)) {
                        this.az = var1;
                        this.aD = true;
                        main.GameGraphic.g = false;
                        this.aF = this.aE;
                        break;
                    }

                    if (main.GameGraphic.b(this.C + this.I + this.K - 1 * gy.Y - this.T.a, this.D + this.J + 3 * gy.Y + 35 * gy.Y * var1 + 31 * gy.Y / 2 - 15 * gy.Y, 60 * gy.Y, 31 * gy.Y)) {
                        this.aA = var1;
                        this.aD = true;
                        main.GameGraphic.g = false;
                        this.aF = this.aE;
                        break;
                    }
                }
            }
        }

        if (this.aD) {
            if (main.GameGraphic.e) {
                if (this.aB != -1) {
                    if (!main.GameGraphic.b(this.M + 5 * gy.Y + this.aB % 3 * (5 * gy.Y + this.T.a), this.N + (this.P - 29 * gy.Y * 3) + this.aB / 3 * 29 * gy.Y - 1 * gy.Y, 60 * gy.Y, 26 * gy.Y)) {
                        this.aB = -1;
                    }
                } else if (this.V != 0) {
                    if (!main.GameGraphic.b(this.M + this.O - 30 * gy.Y, this.N, 30 * gy.Y, 30 * gy.Y)) {
                        this.V = 0;
                    }
                } else if (this.az != -1) {
                    if (!main.GameGraphic.b(this.C + this.I + 32 * gy.Y / 2 - 15 * gy.Y, this.D + this.J + 3 * gy.Y + 35 * gy.Y * this.az + 31 * gy.Y / 2 - 15 * gy.Y, 31 * gy.Y, 31 * gy.Y)) {
                        this.az = -1;
                    }
                } else if (this.aA != -1 && !this.U && !main.GameGraphic.b(this.C + this.I + this.K - 1 * gy.Y - this.T.a, this.D + this.J + 3 * gy.Y + 35 * gy.Y * this.aA + 31 * gy.Y / 2 - 15 * gy.Y, 60 * gy.Y, 31 * gy.Y)) {
                    this.aA = -1;
                }
            }

            if (main.GameGraphic.f) {
                if (this.aE - this.aF <= 4L) {
                    this.aC = 5;
                } else {
                    this.e();
                }

                this.aD = false;
                main.GameGraphic.f = false;
            }
        }

        if (this.d || !this.w) {
            main.GameGraphic.x.a();
        }

    }

    private void e() {
        if (this.aB != -1) {
            cx.getInstance().c(this.c[this.aA].w, this.aG[this.aB]);
            this.aB = -1;
            this.aA = -1;
            this.U = false;
            this.a(8);
        } else if (this.V > 0) {
            this.V = 0;
            this.U = false;
            this.aA = -1;
        } else if (this.az != -1) {
            cx.getInstance().k(this.c[this.az].w);
            this.az = -1;
        } else {
            if (this.aA != -1) {
                this.U = true;
                super.ad = this.t;
                super.ac = null;
                super.ae = this.u;
            }

        }
    }

    private static void a(Graphics var0, int var1, int var2, int var3, int var4, ht var5, int var6) {
        var5.a(0, var1, var2, 0, var0);
        var5.a(2, var1 + var3 - var5.a, var2, 0, var0);
        var5.a(5, var1, var2 + var4 - var5.b, 0, var0);
        var5.a(7, var1 + var3 - var5.a, var2 + var4 - var5.b, 0, var0);

        int var7;
        for (var7 = 0; var7 < (var3 - (var5.a << 1)) / var5.a; ++var7) {
            var5.a(1, var1 + (var7 + 1) * var5.a, var2, 0, var0);
            var5.a(6, var1 + (var7 + 1) * var5.a, var2 + var4 - var5.b, 0, var0);
        }

        var5.a(1, var1 + var3 - (var5.a << 1), var2, 0, var0);
        var5.a(6, var1 + var3 - (var5.a << 1), var2 + var4 - var5.b, 0, var0);

        for (var7 = 0; var7 < (var4 - (var5.b << 1)) / var5.b; ++var7) {
            var5.a(3, var1, var2 + (var7 + 1) * var5.b, 0, var0);
            var5.a(4, var1 + var3 - var5.a, var2 + (var7 + 1) * var5.b, 0, var0);
        }

        var5.a(3, var1, var2 + var4 - (var5.b << 1), 0, var0);
        var5.a(4, var1 + var3 - var5.a, var2 + var4 - (var5.b << 1), 0, var0);
        if (var6 != -1) {
            var0.setColor(var6);
            var0.fillRect(var1 + var5.a, var2 + var5.b, var3 - (var5.a << 1), var4 - (var5.b << 1));
        }

    }

    public final void a(Graphics var1) {
        this.b(var1);
        main.GameGraphic.c(var1);
        if (this.w) {
            main.GameGraphic.S.a(var1, this.C, this.D, this.A, this.B, je.d[2], je.d[3], 1);
            var1.translate(this.C, this.D);
            main.GameGraphic.K.a(var1, StringEntity.BET, this.A / 2, 6 * gy.Y, 2);
            a(var1, this.E, this.F, this.G, this.H, this.Q, -1);
            a(var1, this.I, this.J, this.K, this.L, gp.a, -12335933);

            for (int var2 = 0; var2 < 6; ++var2) {
                this.R.a(this.az == var2 ? 1 : 0, this.I + 32 * gy.Y / 2, this.J + 3 * gy.Y + this.W * var2 + 31 * gy.Y / 2, 0, 3, var1);
                fxClass.a(var1, this.c[var2].d, this.I + 32 * gy.Y / 2, this.J + 3 * gy.Y + this.W * var2 + 31 * gy.Y / 2, 3);
                main.GameGraphic.M.a(var1, "x" + this.c[var2].a, this.I + 32 * gy.Y / 2 + this.R.a / 2 - 5 * gy.Y, this.J + 3 * gy.Y + this.W * var2 + 31 * gy.Y / 2 + this.R.b / 2 - gy.af, 2);
                this.T.a(this.aA == var2 ? 1 : 0, this.I + this.K - 1 * gy.Y - this.T.a, this.J + 7 * gy.Y + this.W * var2, 0, var1);
                if (this.c[var2].g > 0) {
                    main.GameGraphic.K.a(var1, "" + this.c[var2].g, this.I + this.K - 1 * gy.Y - this.T.a / 2, this.J + 7 * gy.Y + this.W * var2 + this.T.b / 2 - gy.ah / 2 - gy.Y - 1, 2);
                } else {
                    main.GameGraphic.K.a(var1, StringEntity.BET, this.I + this.K - 1 * gy.Y - this.T.a / 2, this.J + 7 * gy.Y + this.W * var2 + this.T.b / 2 - gy.ah / 2 - gy.Y - 1, 2);
                }
            }

            if (this.aH && this.c != null) {
                main.GameGraphic.K.a(var1, this.aK, this.E + this.G / 2, this.F + 6 * gy.Y, 2);
                fxClass.a(var1, this.aI, this.E + this.G / 2, this.F + 40 * gy.Y, 3);
                int var4 = this.F + 70 * gy.Y;
                main.GameGraphic.K.a(var1, StringEntity.aP, this.E + 5 * gy.Y, var4, 0);
                main.GameGraphic.N.a(var1, this.aJ + "%", this.E + this.G - 8 * gy.Y, var4 + gy.ah / 2 - gy.af / 2, 1);
                var4 += gy.ah;
                main.GameGraphic.K.a(var1, StringEntity.eg, this.E + 5 * gy.Y, var4, 0);
                main.GameGraphic.N.a(var1, "X" + this.aL, this.E + this.G - 8 * gy.Y, var4 + gy.ah / 2 - gy.af / 2, 1);
                var4 += gy.ah;
                main.GameGraphic.K.a(var1, StringEntity.eh, this.E + 5 * gy.Y, var4, 0);
                main.GameGraphic.N.a(var1, StringEntity.eD[this.aM], this.E + this.G - 8 * gy.Y, var4 + gy.ah / 2 - gy.af / 2, 1);
                var4 += gy.ah;
                main.GameGraphic.K.a(var1, StringEntity.eQ, this.E + 5 * gy.Y, var4, 0);
                main.GameGraphic.N.a(var1, StringEntity.eD[this.aN], this.E + this.G - 8 * gy.Y, var4 + gy.ah / 2 - gy.af / 2, 1);
                this.S.a(0, this.E + this.S.a / 2 + 8 * gy.Y, this.F + this.H - gy.ag - this.S.b - 8 * gy.Y, 0, 3, var1);
                main.GameGraphic.K.a(var1, String.valueOf(this.v), this.E + 8 * gy.Y + this.S.a + 2 * gy.Y, this.F + this.H - gy.ag - this.S.b - 8 * gy.Y - main.GameGraphic.K.getLastByte() / 2, 0);
                this.S.a(1, this.E + this.S.a / 2 + 8 * gy.Y, this.F + this.H - gy.ag - gy.Y, 0, 3, var1);
                main.GameGraphic.K.a(var1, String.valueOf(GameMidlet.i.a[0]), this.E + 8 * gy.Y + this.S.a + 2 * gy.Y, this.F + this.H - gy.ag - gy.Y - gy.ah / 2, 0);
            }

            if (this.U) {
                this.c(var1);
            }
        } else {
            f var5 = fxClass.c((short) 1065);
            if (this.d && this.e > 0 && var5.d != -1) {
                int var3 = var5.c / 4;
                var1.drawRegion(var5.a, 0, (3 - this.e / 12) * var3, var5.b, var3, 0, main.GameGraphic.width / 2, main.GameGraphic.height / 2, 3);
            }
        }

        main.GameGraphic.c(var1);
        if (this.z != null && this.z.d != null) {
            this.z.a(var1);
        }

        if (main.GameGraphic.D == null || !bb.d) {
            super.a(var1);
        }

        if ((this.d || !this.w) && main.GameGraphic.v == null && this.x) {
            main.GameGraphic.L.a(var1, String.valueOf(this.n), main.GameGraphic.o, 5, 2);
        }

        main.GameGraphic.a(var1);
    }

    private void c(Graphics var1) {
        main.GameGraphic.c(var1);
        main.GameGraphic.S.a(var1, this.M, this.N, this.O, this.P, je.d[2], je.d[3], 1);
        var1.translate(this.M, this.N);
        main.GameGraphic.K.a(var1, StringEntity.ef, this.O / 2, 10 * gy.Y, 2);

        for (int var2 = 0; var2 < 9; ++var2) {
            this.T.a(this.aB == var2 ? 1 : 0, 5 * gy.Y + var2 % 3 * (5 * gy.Y + this.T.a), this.P - 29 * gy.Y * 3 + var2 / 3 * 29 * gy.Y, 0, var1);
            main.GameGraphic.Q.a(var1, String.valueOf(this.aG[var2]), 5 * gy.Y + var2 % 3 * (5 * gy.Y + this.T.a) + this.T.a / 2, this.P - 29 * gy.Y * 3 + var2 / 3 * 29 * gy.Y + this.T.b / 2 - gy.ai / 2, 2);
        }

    }

    public final void b(Graphics var1) {
        main.GameGraphic.c(var1);
        main.GameGraphic.x.b(var1);

        for (int var2 = 0; var2 < 6; ++var2) {
            if (do1.a().a <= 4 * ir.i * gy.Y) {
                ir.c.b(0, var2 % 2 == 0 ? 2 : 3, 3 * ir.i * gy.Y, (var2 + 6) * ir.i * gy.Y, 0, var1);
            }

            if (do1.a().a + main.GameGraphic.width >= (ir.e - 3) * ir.i * gy.Y) {
                ir.c.b(0, var2 % 2 == 0 ? 2 : 3, (ir.e - 3) * ir.i * gy.Y, (var2 + 6) * ir.i * gy.Y, 0, var1);
            }
        }

        main.GameGraphic.x.d(var1);
        main.GameGraphic.c(var1);
    }

    public final void a(String var1) {
        if (!var1.equals("")) {
            this.z = new fh(50, var1, (byte) 0);
            this.z.a = main.GameGraphic.o;
            this.z.b = main.GameGraphic.height - this.z.c - hj.at - im.d().b.d;
            cx var10000 = cx.getInstance();
            String var2 = var1;
            cx var3 = var10000;
            var10000.e((byte) 9);
            var3.c(var2);
            var3.k();
        }
    }

    public final void a(short var1, String var2, short var3, byte var4, byte var5, byte var6) {
        this.aH = true;
        this.aI = var1;
        this.aK = var2;
        this.aJ = var3;
        this.aL = var4;
        this.aM = var5;
        this.aN = var6;
    }

    public final void b(String var1) {
        Vector var2 = new Vector();
        int var3 = do1.a().c;
        if (this.d || !this.w) {
            var3 += main.GameGraphic.width / 3;
        }

        int var4;
        for (var4 = 0; var4 < ir.m.size(); ++var4) {
            gx var5 = (gx) ir.m.elementAt(var4);
            if (var5.az == 9 && var5.aw * gy.Y > var3 && var5.aw * gy.Y < var3 + main.GameGraphic.width) {
                var2.addElement(var5);
            }
        }

        if (var2.size() > 0) {
            var4 = awClass.e(var2.size());
            ((hn) var2.elementAt(var4)).O = new fh(50, var1, (byte) 0);
        }

    }
}
