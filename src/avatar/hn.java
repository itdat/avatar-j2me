package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;
import main.GameGraphic;

public final class hn extends gx {

    private byte aB;
    public int[] a = new int[]{0, -1, 0, 0};
    public int b;
    public String c = "";
    public byte d;
    public Vector e;
    public Vector f;
    public Vector g = new Vector();
    public byte h;
    public int i;
    public int j;
    public int k;
    public String l;
    public String m;
    public int n;
    public boolean o;
    public boolean p = false;
    public byte q = -1;
    private byte aC;
    public byte r;
    public byte s;
    public byte t;
    public short u;
    public short v;
    private boolean aD = false;
    private boolean aE = false;
    public int Q = 0;
    public int R = -1;
    private int aF = 0;
    public short S = 4;
    public short T = 0;
    public short U;
    private short aG;
    private short aH;
    public short V = -1;
    public short W;
    public short X = -1;
    public short Y;
    public short Z = 0;
    public short aa = -1;
    public short ab = -1;
    private int aI = 0;
    public byte ac = -1;
    public boolean ad;
    public static ht ae;
    public byte af = 0;
    public byte ag = -1;
    public short ah = 1000;
    public short ai = 300;
    public short aj = 0;
    public short ak = 0;
    public short al = 1000;
    public short am = 1000;
    public short an;
    private short aJ;
    public hn ao;
    public static ht ap;
    public static ht aq;
    private byte aK = 0;
    private ju aL;
    public String[] ar;
    private int aM;
    private static byte[][] aN = new byte[][]{{0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 2, 2, 2, 2, 2}, {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, {6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, {7, 7, 7, 7, 7, 7, 7, 7, 7, 7}, {8, 8, 8, 8, 8, 8, 8, 8, 8, 8}, {9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {11, 11, 11, 11, 11, 11, 11, 11, 11, 11}, {12, 12, 12, 12, 12, 12, 12, 12, 12, 12}, {13, 13, 13, 13, 13, 13, 13, 13, -2, 13}, {14, 14, 14, 14, 14, 14, 14, 14, 14, 14}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}};
    private static byte[] aO = new byte[]{-3, 0, 1};
    public short as = 0;
    public boolean[][] at;
    private short[] aP;
    private short[] aQ;
    private short[] aR;
    public int au = 0;
    public dr av;

    public hn() {
        super.az = 0;
        super.aA = 42;
        this.aB = (byte) awClass.e(9);
        this.aC = (byte) (awClass.e(30) + 10);
    }

    public final int a() {
        return this.a[0];
    }

    public final void a(int var1) {
        this.a[0] = var1;
        this.c = GameGraphic.b(this.a[0]) + StringEntity.DOLLAR;
    }

    public final int c() {
        return aeClass.u ? this.a[3] : this.a[0];
    }

    public final void b(int var1) {
        if (aeClass.u) {
            this.a[3] = var1;
        } else {
            this.a[0] = var1;
        }
    }

    public final void c(int var1) {
        this.a[2] = var1;
    }

    public final void a(Graphics var1) {
        if ((super.aw + 15) * js.ay >= do1.a().a && (super.aw - 15) * js.ay <= do1.a().a + main.GameGraphic.width && !super.L && (main.GameGraphic.Z <= 0 || main.GameGraphic.r != cd.b())) {
            if (super.H != 14) {
                var1.drawImage(ir.r, (super.aw + (super.K == gx.J ? 2 : -2)) * js.ay, (super.ax - 1) * js.ay, 3);
            }

            int var2 = this.e.size();
            boolean var3 = false;

            int var4;
            for (var4 = 0; var4 < var2; ++var4) {
                ld var5;
                if ((var5 = fxClass.a(((hx) this.e.elementAt(var4)).a)) != null && (super.H != 14 || var5.j == 30 || var5.j == 40 || var5.j == 50)) {
                    if (var5.j == 40) {
                        if (this.S != 4) {
                            var5 = fxClass.a(this.S);
                        } else if ((this.S == 4 || this.S == 6) && this.aH < 1 + this.d) {
                            var3 = true;
                        }
                    }

                    if (ir.a != 24 && ir.a != 53 || fxClass.c((int) var5.j) || var5.j == 52) {
                        var5.a(var1, super.y, super.aw * js.ay, (super.ax + super.B + this.h + super.N) * js.ay, super.K);
                        if (var3) {
                            var3 = false;
                            var5 = fxClass.a((short) 606);
                            if (ir.a != 24 && ir.a != 53 || fxClass.c((int) var5.j) || var5.j == 52) {
                                var5.a(var1, super.y, super.aw * js.ay, (super.ax + super.B + this.h + super.N) * js.ay, super.K);
                            }
                        }
                    }
                }
            }

            if ((dm.getInstance().b[0] == 0 || this == ir.p) && ir.a != 24) {
                this.a(var1, super.aw * js.ay, (super.ax + super.N) * js.ay - gy.ai);
            }

            if (this.aL != null) {
                Graphics var7 = var1;
                ju var6 = this.aL;

                for (var4 = 0; var4 < 3; ++var4) {
                    aq.a(var6.e[var4] / 3, (var6.a + var6.c[var4]) * gy.Y, (var6.b + var6.d[var4]) * gy.Y, 0, 3, var7);
                }
            }
            if (this.aK > 0 && this.Q == -2) {
                ap.a(main.GameGraphic.l % 6 >= 3 ? 0 : 1, super.aw * js.ay, super.ax * js.ay - super.aA / 2, 0, 3, var1);
            }
            super.a(var1);
        }
    }

    public final void a(Graphics var1, int var2, int var3, boolean var4) {
        var1.drawImage(ir.r, var2 + (super.K == gx.J ? 2 : -2), var3 - 1, 3);
        if (this.e != null) {
            int var5 = this.e.size();

            for (int var6 = 0; var6 < var5; ++var6) {
                ld var7;
                if ((var7 = fxClass.a(((hx) this.e.elementAt(var6)).a)) != null) {
                    if (var7.j == 40 && this.S != 4) {
                        var7 = fxClass.a(this.S);
                    }

                    var7.a(var1, super.y, var2, var3, super.K);
                }
            }
        }

        if (var4) {
            this.a(var1, var2, var3 - gy.ai);
        }

        super.a(var1);
    }

    public final void a(Graphics var1, int var2, int var3) {
        byte var4 = 0;
        var3 = var3 - super.aA * js.ay + (super.B + this.h) * js.ay;
        if (this.X != -1) {
            var4 = 7;
            fxClass.a(var1, this.X, var2 + aO[super.K] * js.ay - this.aG / 2, var3 + gy.ai / 2, 3);
        }

        var2 += (aO[super.K] + var4) * js.ay;
        if (this.aa != -1) {
            fxClass.a(var1, this.aa, var2 + this.aG / 2 + 6 * js.ay, var3 + gy.ai / 2, 3);
        }

        if (this.ac != -1) {
            ae.a(this.ac, var2 + this.aG / 2 + 7 * js.ay, var3 + 3, 0, 3, var1);
        }

        if (super.w == GameMidlet.i.w) {
            main.GameGraphic.P.a(var1, super.x, var2, var3, 2);
        } else {
            main.GameGraphic.Q.a(var1, super.x, var2, var3, 2);
        }
    }

    public final void d(int var1) {
        this.n = var1;
        int var2 = 1;

        while (true) {
            int var4 = var2 * 100;
            int var3 = var1;
            if ((var1 -= var4) < 0) {
                this.v = (byte) var2;
                this.r = (byte) (var3 * 100 / (var2 * 100));
                return;
            }

            ++var2;
            var1 = var1;
        }
    }

    public final void a(hx var1) {
        if (this.e == null) {
            this.e = new Vector();
        }

        this.e.addElement(var1);
    }

    public final void a(String var1) {
        super.x = var1;
        if (var1.length() > 7) {
            this.l = var1.substring(0, 6) + "..";
        } else {
            this.l = var1;
        }

        this.aG = (short) main.GameGraphic.P.a(var1);
    }

    public final void e(int var1) {
        this.S = (short) var1;
    }

    public final void b() {
        int var2;
        if (this.aL != null) {
            ju var1 = this.aL;

            for (var2 = 0; var2 < 3; ++var2) {
                int var10002 = var1.d[var2]--;
                if (var1.d[var2] < -60) {
                    var1.d[var2] = 0;
                    var1.g[var2] = 6;
                }

                ++var1.e[var2];
                if (var1.e[var2] == 6) {
                    var1.e[var2] = 0;
                }

                int[] var6 = var1.c;
                var6[var2] += var1.f[var2] << 1;
                if (var1.f[var2] == 1) {
                    if (var1.c[var2] > 10 - awClass.f(var1.d[var2] / 10)) {
                        var1.f[var2] = -1;
                        if (var1.g[var2] > 0) {
                            --var1.g[var2];
                        }
                    }
                } else {
                    if (var1.c[var2] < -(10 - awClass.f(var1.d[var2] / 10))) {
                        var1.f[var2] = 1;
                    }

                    if (var1.g[var2] > 0) {
                        --var1.g[var2];
                    }
                }
            }
        }

        if (this.aD && main.GameGraphic.l % 20 == 10) {
            this.h();
        }

        if (this.p && (!aeClass.t || super.w != aeClass.E && super.w != aeClass.F) && this.g.size() == 0 && super.aw == super.C && super.ax == super.D) {
            ir.c(this);
            if (aeClass.h != null && aeClass.h.w == super.w) {
                aeClass.h = null;
                ir.p = null;
            }
        }

        if (super.C == super.aw && super.D == super.ax && this.au >= 0) {
            --this.au;
            if (this.au < 0) {
                this.au = -1;
                this.aE = false;
                this.Q = 0;
                if (this == GameMidlet.i) {
                    ir.A = -1;
                }
            } else {
                var2 = (this.aR[this.au] & 255) * ir.i + ir.i / 2;
                int var3 = (this.aR[this.au] >> 8) * ir.i + ir.i / 2;
                if (this.au == 1) {
                    GameMidlet.i.aE = true;
                    var2 = this.av.a / gy.Y;
                    var3 = this.av.b / gy.Y;
                    this.au = 0;
                }

                if (this != GameMidlet.i) {
                    super.H = 1;
                    this.d(var2, var3);
                } else if (!this.h(var2 - super.aw, var3 - super.ax) && !this.i(var2 - super.aw, var3 - super.ax)) {
                    if (!ir.c(ir.c(var2, var3))) {
                        super.H = 1;
                        this.d(var2, var3);
                    }
                } else {
                    this.au = 0;
                    this.p();
                    this.aE = false;
                }
            }
        }

        this.d();
        if (this.f != null) {
            for (int var4 = 0; var4 < this.f.size(); ++var4) {
                bd var5 = (bd) this.f.elementAt(var4);
                if (var5.b == this.as) {
                    this.as = 0;
                    this.S = var5.a;
                    this.f.removeElement(var5);
                    break;
                }
            }
            ++this.as;
        }

    }

    public final void f(int var1) {
        if (var1 < 0) {
            super.y = aN[0][this.aB];
        } else {
            super.y = aN[var1][this.aB];
        }
    }

    public final void d() {
        if (this.aH <= 0) {
            this.aH = (short) (10 + awClass.e(70) / (this.d + 1));
        }

        --this.aH;
        ++this.aB;
        if (this.aB >= 10) {
            this.aB = 0;
        }

        if (super.H < 0) {
            super.y = aN[0][this.aB];
        } else if (super.H < aN.length) {
            super.y = aN[super.H][this.aB];
        }

        short var6;
        if (this.T != 0 || this.S == 11 || this.S == 7 || this.S == 9) {
            if (this.T == 0) {
                this.U = this.S;
            }

            ++this.T;
            if (this.T % 10 > 5) {
                if (this.T > 45) {
                    this.T = 0;
                }

                byte var3 = 4;
                this.S = (short) var3;
            } else {
                var6 = this.U;
                this.S = (short) var6;
            }
        }

        if ((this != GameMidlet.i || this.Q != 0 || main.GameGraphic.r == kx.i) && super.H != 10) {
            int var7;
            if (awClass.a(super.aw, super.ax + super.N, super.C, super.D) <= super.G) {
                if (super.M && this.aJ == 0) {
                    this.aJ = 0;
                    super.M = false;
                    super.N = 0;
                }

                if (this.ao != null && this.aK == 0) {
                    if (this.Q == -2) {
                        this.aK = 20;
                    } else if (this.Q == 11) {
                        this.aK = 30;
                        this.S = 107;
                        this.ao.S = 107;
                        this.aL = new ju(this, super.aw, super.ax);
                    }
                }

                if (this.Q == -5) {
                    this.t = super.K;
                    super.aw = super.C;
                    super.ax = super.D;
                    if (this.au <= 0) {
                        this.Q = 0;
                    }

                    if (main.GameGraphic.v == null) {
                        aeClass.getInstance();
                        aeClass.a(super.aw, super.ax, super.K, super.N);
                    }

                    if (aeClass.t && GameMidlet.i.w == super.w) {
                        super.K = 0;
                    }
                } else {
                    if (super.w != GameMidlet.i.w) {
                        super.C = super.aw;
                        super.D = super.ax + super.N;
                    }

                    if (this.g.size() == 0) {
                        if (super.H == 1) {
                            super.H = 0;
                        }

                        super.K = this.t;
                    } else {
                        dr var2 = (dr) this.g.elementAt(0);
                        this.d(var2.a, var2.b + var2.d);
                        this.aJ = var2.d;
                        if (var2.d != 0) {
                            super.M = true;
                        }

                        if (super.C == -1 && super.D == -1) {
                            super.C = super.aw;
                            super.D = super.ax + super.N;
                            if (super.H == 14) {
                                ir.g[super.ax / ir.i * ir.e + super.aw / ir.i] = 112;
                            }

                            super.H = (byte) var2.c;
                            if (super.H == 14) {
                                super.ax = super.D;
                                super.aw = super.C;
                                ir.g[super.ax / ir.i * ir.e + super.aw / ir.i] = 90;
                            }

                            if ((super.H == 2 || super.H == 13 || super.H == 4) && (var7 = (super.ax - ir.i) / ir.i * ir.e + super.aw / ir.i) >= 0 && var7 < ir.g.length) {
                                if (super.H == 4 && ir.g[var7] == 67) {
                                    this.h = -10;
                                }

                                int var4 = ir.d(super.aw, super.ax - 10);
                                super.D = super.ax;
                                if (var4 != -1) {
                                    if ((var6 = ir.g[var4]) == 92) {
                                        this.h = -10;
                                    }

                                    if (var6 == 79 || var6 == 92 || var6 == 90 || var6 == 54) {
                                        ir.g[var4] = 90;
                                    }
                                }
                            }
                        } else {
                            this.t = (byte) var2.c;
                            super.K = this.t;
                        }

                        this.g.removeElementAt(0);
                    }
                }

                if (this.Q != 0 && this.Q != -5) {
                    if (super.w == this.j && ir.g(this.i) == null) {
                        this.Q = 0;
                        this.i = -1;
                    } else if (this.i != -1 && this.j != -1) {
                        hn var8 = ir.g(this.i);
                        hn var9;
                        if ((var9 = ir.g(this.j)) != null && var8 != null) {
                            if (var9.aw > var8.aw) {
                                var9.K = var9.t = gx.J;
                                var8.K = var8.t = 0;
                            } else {
                                var9.K = var9.t = 0;
                                var8.K = var8.t = gx.J;
                            }

                            if (super.w == this.i) {
                                if (this.Y > 0) {
                                    --this.Y;
                                } else {
                                    switch (this.Q) {
                                        case -3:
                                            if (ir.k == -1) {
                                                ba var1 = new ba(2, 0);
                                                main.GameGraphic.B.addElement(var1);
                                            }

                                            this.Q = 0;
                                            var9.Q = 0;
                                            break;
                                        case 9:
                                            if (this == GameMidlet.i) {
                                                aeClass.getInstance();
                                                aeClass.a((byte) 9);
                                            } else if (GameMidlet.i.Q == 8 && super.w == GameMidlet.i.i) {
                                                aeClass.getInstance();
                                                aeClass.a((byte) 8);
                                                GameMidlet.i.Q = 0;
                                            }
                                            aeClass.getInstance();
                                            aeClass.b(var9);
                                            this.Q = 0;
                                            var9.Q = 0;
                                            break;
                                        case 12:
                                            boolean var10 = false;
                                            var9.Q = 0;
                                            var10 = false;
                                            this.Q = 0;
                                    }

                                    this.k = -1;
                                    this.i = -1;
                                    this.j = -1;
                                }
                            }
                        } else {
                            if (var8 != null) {
                                var8.Q = 0;
                                var8.L = false;
                            }

                            if (var9 != null) {
                                var9.Q = 0;
                                var9.L = false;
                            }
                        }
                    }
                }
            } else {
                this.aI = awClass.a(super.C - super.aw, -(super.D - (super.ax + super.N)));
                int var5 = super.G * awClass.b(this.aI) >> 10;
                var7 = -(super.G * awClass.a(this.aI)) >> 10;
                if (this.aE && this.Q == -5 && GameMidlet.i.e(super.aw + var5, super.ax + super.N + var7)) {
                    this.p();
                    super.E = super.F = 0;
                } else {
                    super.E = var5;
                    super.F = var7;
                    super.A = 0;
                    super.B = 0;
                    this.h = 0;
                    this.g(super.aw + var5);
                    if (super.aw != super.C) {
                        this.f();
                    }

                    if (super.ax + super.N != super.D) {
                        this.f();
                    }

                    super.H = 1;
                }
            }
        }

        if (super.M) {
            super.aw += super.E;
            super.N = (short) (super.N + super.F);
            if (super.w == GameMidlet.i.w && super.N < -this.Z) {
                super.N = (short) (-this.Z);
            }
        } else {
            super.aw += super.E;
            super.ax += super.F;
        }

        super.B += super.A;
        if (super.H == 10) {
            ++super.A;
        }

        if (Math.abs(super.A) >= super.z || Math.abs(super.B) > 28) {
            super.H = 0;
            super.A = 0;
            super.B = 0;
        }

        if (this.R != -1 && super.H == 0) {
            ++this.R;
            if (this.R > this.aC) {
                this.R = -1;
            } else if (this.R % 6 == 0) {
                this.g();
            }
        }

        if (super.H == 0) {
            this.h = 0;
        }

        if (super.H == 1 && super.E == 0 && super.F == 0) {
            super.H = 0;
        }

        super.E = 0;
        super.F = 0;
        if (this.aK > 0) {
            --this.aK;
            if (this.aK == 0) {
                if (this.Q == -2) {
                    this.ao.H = 4;
                    this.ao.S = 20;
                    super.H = 4;
                    this.S = 20;
                } else if (this.Q == 11) {
                    this.S = 12;
                    this.ao.S = 12;
                }

                this.Q = 0;
                this.ao.Q = 0;
                this.ao = null;
                this.aL = null;
            }
        }

        if (this.ar != null) {
            super.O = new fh(100, this.ar[this.aM / 40], (byte) (this.i >= 2000000000 ? 1 : 0));
            ++this.aM;
            if (this.aM >= this.ar.length * 40) {
                if (super.w >= 2000000000) {
                    this.aM = 0;
                } else {
                    this.ar = null;
                }
            }
        }
        super.b();
    }

    public final void e() {
        if (super.H != -1 && !super.L) {
            if (this.Q == 0 && !aeClass.t) {
                super.E = 0;
                super.F = 0;
                if (main.GameGraphic.d[2]) {
                    do1.a().e = 0L;
                    this.R = -1;
                    this.o();
                    if (super.M) {
                        super.F = -super.G;
                    } else if (this.i(super.E, -(super.G - 1))) {
                        if (!this.h(super.E, -(super.G - 1))) {
                            this.e(super.aw + super.E, super.ax - (super.G - 1));
                        } else {
                            super.E = 0;
                            super.F = 0;
                        }
                    }
                } else if (main.GameGraphic.d[8]) {
                    do1.a().e = 0L;
                    this.R = -1;
                    this.f();
                    this.g(0, 1);
                    if (super.M) {
                        super.F = super.G;
                        if (super.N + super.G >= 0) {
                            super.N = 0;
                            if (ir.c(super.aw, super.ax + ir.i / 2) == 80) {
                                super.M = false;
                            } else {
                                super.F = 0;
                            }
                        }
                    } else if (!this.h(super.E, super.G - 1)) {
                        this.i(super.E, super.G - 1);
                    } else {
                        super.E = 0;
                        super.F = 0;
                    }
                }

                if (main.GameGraphic.d[4]) {
                    do1.a().e = 0L;
                    this.R = -1;
                    if (this.aF == 0 && super.K == gx.J) {
                        this.aF = 3;
                    }

                    super.K = gx.J;
                    if (this.aF > 2) {
                        if (super.M) {
                            super.E = -super.G;
                        } else if (!this.h(-(super.G + 8), super.F)) {
                            this.i(-(super.G + 8), super.F);
                            this.g(-1, 0);
                        } else {
                            super.E = 0;
                            super.F = 0;
                        }
                    }

                    ++this.aF;
                } else if (main.GameGraphic.d[6]) {
                    do1.a().e = 0L;
                    this.R = -1;
                    if (this.aF == 0 && super.K == 0) {
                        this.aF = 3;
                    }

                    super.K = 0;
                    if (this.aF > 2) {
                        if (super.M) {
                            super.E = super.G;
                        } else if (!this.h(super.G + 6, super.F)) {
                            this.i(super.G + 6, super.F);
                            this.g(1, 0);
                        } else {
                            super.E = 0;
                            super.F = 0;
                        }
                    }

                    ++this.aF;
                } else {
                    this.aF = 0;
                }

                boolean var1 = false;
                if (main.GameGraphic.b[2]) {
                    if (main.GameGraphic.d[4] || main.GameGraphic.d[6] || main.GameGraphic.d[8]) {
                        var1 = true;
                    }
                } else if (main.GameGraphic.b[4]) {
                    if (main.GameGraphic.d[2] || main.GameGraphic.d[6] || main.GameGraphic.d[8]) {
                        var1 = true;
                    }
                } else if (main.GameGraphic.b[6]) {
                    if (main.GameGraphic.d[4] || main.GameGraphic.d[2] || main.GameGraphic.d[8]) {
                        var1 = true;
                    }
                } else if (main.GameGraphic.b[8] && (main.GameGraphic.d[4] || main.GameGraphic.d[6] || main.GameGraphic.d[2])) {
                    var1 = true;
                }

                if (main.GameGraphic.c[2] || main.GameGraphic.c[4] || main.GameGraphic.c[6] || main.GameGraphic.c[8]) {
                    var1 = true;
                    main.GameGraphic.g();
                }

                if (var1 && super.H != 2 && super.H != 13 && super.H != 4 && !main.GameGraphic.c[2]) {
                    aeClass.getInstance();
                    aeClass.a(super.aw, super.ax, super.K, super.N);
                }

                if (super.E == 0 && super.F == 0 && super.H == 1) {
                    super.H = 0;
                }
                if (super.M && (super.E != 0 || super.F != 0)) {
                    super.H = 1;
                }
                main.GameGraphic.b[2] = main.GameGraphic.b[4] = main.GameGraphic.b[6] = main.GameGraphic.b[8] = false;
            }
        }
    }

    public final void a(byte var1) {
        if (super.H != 10) {
            if (var1 != 2 && var1 != 13 && var1 != 4) {
                if (super.H != 14) {
                    super.H = 0;
                }
            } else {
                short var2;
                if ((var2 = ir.g[(super.ax - 15) / ir.i * ir.e + super.aw / ir.i]) != 79 && var2 != 81 && var2 != 54) {
                    if (var2 == 92 || var2 == 67) {
                        this.h = -10;
                    }
                } else {
                    this.h = -6;
                    if (var2 == 81) {
                        this.h = (byte) (-6 * js.ay);
                    }
                }

                super.H = var1;
            }

            if (var1 == 10) {
                this.g();
            } else if (super.w != GameMidlet.i.w) {
                this.g.addElement(new dr(-1, -1, var1));
            } else {
                super.H = var1;
            }
        }
    }

    public final void d(int var1, int var2) {
        super.C = var1;
        super.D = var2;
        this.g(var1);
    }

    private void g(int var1) {
        if (var1 > super.aw) {
            super.K = 0;
        } else {
            if (var1 < super.aw) {
                super.K = gx.J;
            }

        }
    }

    public final void f() {
        if (super.H != 2 && super.H != 13) {
            this.o();
        } else {
            int var1;
            if ((var1 = ir.d(super.aw, super.ax - 18)) == -1) {
                return;
            }

            super.H = 0;
            this.h = 0;
            if (ir.g[var1] == 90) {
                if (ir.d[var1] == 80) {
                    ir.g[var1] = 92;
                    return;
                }

                if (ir.d[var1] == 97) {
                    ir.g[var1] = 54;
                    return;
                }

                ir.g[var1] = 79;
                return;
            }
        }

    }

    private void o() {
        if (super.H == 14) {
            super.H = 0;
            this.a(ei.b().f, ei.b().g);
            iy.a().a((int) 0);
            aeClass.getInstance();
            aeClass.a(GameMidlet.i.aw, GameMidlet.i.ax, GameMidlet.i.K, GameMidlet.i.Z);
            main.GameGraphic.d[8] = false;
        }
    }

    private void g(int var1, int var2) {
        if (super.H == 4) {
            if (ir.d(super.aw, super.ax - 18) == -1) {
                return;
            }
            if (ir.c(super.aw + var1 * 12, super.ax + var2 * 12 - 10) == 80) {
                super.H = 0;
                this.h = 0;
            }
        }
    }

    private boolean h(int var1, int var2) {
        if (this != GameMidlet.i) {
            return false;
        } else if (super.H != -1 && main.GameGraphic.v == null) {
            boolean var3;
            if ((var3 = main.GameGraphic.x.a(super.aw + var1, super.ax + var2)) && super.H == 1) {
                super.H = 0;
            }
            return var3;
        } else {
            return false;
        }
    }

    private boolean i(int var1, int var2) {
        boolean var3;
        if (var3 = this.b(var1, var2)) {
            this.c(var1, var2);
        }
        return var3;
    }

    public final boolean e(int var1, int var2) {
        if ((super.H == 0 || super.H == 1) && (this.Q == 0 || this.Q == -5)) {
            short var3;
            if ((var3 = ir.g[var2 / ir.i * ir.e + var1 / ir.i]) != 79 && var3 != 81 && var3 != 54) {
                if (var3 == 92) {
                    super.H = 2;
                    this.h = -10;
                    super.aw = var1 / ir.i * ir.i + ir.i / 2;
                    super.ax = var2 / ir.i * ir.i + ir.i - 1;
                    aeClass.getInstance();
                    aeClass.a(super.aw, var2, super.K, super.N);
                    aeClass.getInstance();
                    aeClass.a((byte) 2);
                    return true;
                } else if (var3 == 67) {
                    super.H = 4;
                    this.h = -10;
                    super.aw = var1 / ir.i * ir.i + ir.i / 2;
                    aeClass.getInstance();
                    aeClass.a(super.aw, var2, super.K, super.N);
                    aeClass.getInstance();
                    aeClass.a((byte) 4);
                    return true;
                } else {
                    return false;
                }
            } else {
                super.H = 2;
                this.h = -6;
                super.aw = var1 / ir.i * ir.i + ir.i / 2;
                super.ax = var2 / ir.i * ir.i + ir.i - 1;
                aeClass.getInstance();
                aeClass.a(super.aw, super.ax, super.K, super.N);
                aeClass.getInstance();
                aeClass.a(super.H);
                return true;
            }
        } else {
            return false;
        }
    }

    public final void g() {
        if (super.H == 0 || super.H == 1) {
            super.H = 10;
            if (this.R == -1) {
                this.R = 0;
            }
            super.A = (byte) (-super.z);
        }

    }

    public final void h() {
        this.aD = false;

        try {
            for (int var1 = 0; var1 < this.e.size() - 1; ++var1) {
                hx var2;
                if (fxClass.a((var2 = (hx) this.e.elementAt(var1)).a) != null) {
                    for (int var3 = var1 + 1; var3 < this.e.size(); ++var3) {
                        hx var4;
                        if (fxClass.a((var4 = (hx) this.e.elementAt(var3)).a).g == -1) {
                            this.aD = true;
                        }

                        if (fxClass.a(var4.a) != null && fxClass.a(var2.a).j > fxClass.a(var4.a).j) {
                            this.e.setElementAt(var2, var3);
                            this.e.setElementAt(var4, var1);
                            var2 = var4;
                        }
                    }
                }
            }

        } catch (Exception var5) {
            this.aD = true;
        }
    }

    public final void f(int var1, int var2) {
        for (int var3 = 0; var3 < this.e.size() - 1; ++var3) {
            hx var4;
            ld var5 = fxClass.a((var4 = (hx) this.e.elementAt(var3)).a);
            if (var2 == var5.j) {
                this.e.removeElement(var4);
                break;
            }
        }

        this.a(new hx((short) var1));
    }

    public final void b(byte var1) {
        super.H = var1;
    }

    public final void b(hx var1) {
        ld var2;
        if ((var2 = fxClass.a(var1.a)) != null && var2.f != -2) {
            hx var3;
            if ((var3 = fxClass.a(var2.j, this.e)) != null) {
                this.e.removeElement(var3);
            }

            this.e.addElement(var1);
        }
    }

    public final void i() {
        for (int var1 = 0; var1 < this.e.size(); ++var1) {
            hx var2;
            if (fxClass.a((var2 = (hx) this.e.elementAt(var1)).a).j == -1) {
                this.e.removeElement(var2);
                this.V = var2.a;
            }
        }

    }

    public final void j() {
        this.i();
        ir.a(this);
    }

    public final void a(short var1) {
        this.V = var1;
        gr var2;
        if ((var2 = ir.h(super.w)) != null) {
            ir.a((js) var2);
            this.V = var1;
        }

        this.j();
    }

    public final void k() {
        super.A = 0;
        super.B = 0;
        super.H = 0;
    }

    private void p() {
        this.au = 0;
        this.aE = false;
        this.Q = 0;
        if (this == GameMidlet.i) {
            ir.A = -1;
        } else {
            this.av = null;
            this.aP = null;
            this.aQ = null;
            this.aR = null;
            this.at = null;
        }
    }

    public final void l() {
        if (this.at == null) {
            this.n();
        }

        short var1 = 88;
        int var2 = ir.i * gy.Y;
        if (this.av.b / var2 * ir.e + this.av.a / var2 > 0 && this.av.b / var2 * ir.e + this.av.a / var2 < ir.g.length) {
            var1 = ir.g[this.av.b / var2 * ir.e + this.av.a / var2];
        }

        if (this != GameMidlet.i || var1 == 80 || ir.a == 24 || ir.a((int) var1) || ir.b(var1)) {
            this.av.c = 0;
            if (this.Q == 0 || this.Q == -5) {
                this.Q = -5;
                this.R = -1;
                super.C = super.aw;
                super.D = super.ax;
                if (this == GameMidlet.i) {
                    if (super.aw > this.av.a / gy.Y) {
                        ir.A = gx.J;
                    } else {
                        ir.A = 0;
                    }
                }

                this.m();
            }

        }
    }

    public final void m() {
        int var1 = ir.i * gy.Y;
        if (super.aw / ir.i == this.av.a / var1 && super.ax / ir.i == this.av.b / var1) {
            this.d(this.av.a / var1 * ir.i + this.av.a % var1 / 2, this.av.b / var1 * ir.i + this.av.b % var1 / 2);
        } else {
            int var10001 = super.aw / ir.i;
            int var10002 = super.ax / ir.i;
            int var10003 = this.av.a / var1;
            int var5 = this.av.b / var1;
            int var4 = var10003;
            int var3 = var10002;
            int var2 = var10001;
            hn var14 = this;
            int var6 = 1;
            int var7 = 0;
            int[] var10 = new int[]{0, -1, 1, 0};
            int[] var11 = new int[]{-1, 0, 0, 1};
            boolean var12 = false;

            int var8;
            for (var8 = 0; var8 < var14.at.length * var14.at[0].length; ++var8) {
                var14.aP[var8] = 0;
                var14.aQ[var8] = 0;
                var14.aR[var8] = 0;
                if (ir.g[var8] != 80 && !ir.a((int) ir.g[var8])) {
                    var14.at[var8 % ir.e][var8 / ir.e] = true;
                } else {
                    var14.at[var8 % ir.e][var8 / ir.e] = false;
                }
            }

            if (ir.b(ir.c(var4 * ir.i, var5 * ir.i))) {
                var14.at[var4][var5] = false;
            }

            int var13;
            for (var14.aP[0] = (short) ((var3 << 8) + var2); !var12 && var7 < var6; ++var7) {
                var2 = var14.aP[var7] & 255;
                var3 = var14.aP[var7] >> 8;

                for (var13 = 0; var13 < 4 && !var12; ++var13) {
                    var8 = var2 + var10[var13];
                    int var9 = var3 + var11[var13];
                    if (var8 >= 0 && var8 < var14.at.length && var9 >= 0 && var9 < var14.at[0].length && !var14.at[var8][var9]) {
                        var14.aQ[var6] = var14.aP[var7];
                        var14.aP[var6++] = (short) ((var9 << 8) + var8);
                        var14.at[var8][var9] = true;
                        if (var4 == var8 && var5 == var9) {
                            var12 = true;
                        }
                    }

                    if (var6 >= var14.at.length * var14.at[0].length) {
                        var12 = true;
                        break;
                    }
                }
            }

            var14.au = 0;
            if (var12) {
                GameMidlet.i.k();
                var13 = var6 - 1;
                var14.aR[var14.au++] = var14.aP[var13];

                label75:
                while (true) {
                    while (true) {
                        if (var13 <= 0) {
                            break label75;
                        }

                        for (var2 = 0; var2 < var6; ++var2) {
                            if (var14.aP[var2] == var14.aQ[var13]) {
                                var13 = var2;
                                var14.aR[var14.au++] = var14.aP[var2];
                                break;
                            }
                        }
                    }
                }
            }

            --var14.au;
            if (!var12) {
                this.au = 0;
                if (this == GameMidlet.i) {
                    ir.A = -1;
                }

            }
        }
    }

    public final void n() {
        short var1 = ir.e;
        short var2 = ir.f;
        this.at = new boolean[var1][var2];
        this.aP = new short[var1 * var2];
        this.aQ = new short[var1 * var2];
        this.aR = new short[var1 * var2];
    }

    // a int int int
    public final void updateMoney(int var1, int var2, int var3) {
        System.out.println("updateMoney: " + var1 + "    " + var2 + "   " + var3);
        if (this.a[0] != var1) {
            GameGraphic.a(var1 - this.a[0] + "xu", super.aw, super.ax - awClass.e(20), -1, 0, -1);
            this.a[0] = var1;
        }
        if (this.a[2] != var2) {
            main.GameGraphic.a(var2 - this.a[2] + "luong", super.aw, super.ax - awClass.e(20), -1, 0, -1);
            this.a[2] = var2;
        }
        if (this.b != var3) {
            main.GameGraphic.a(var3 - this.b + "luong", super.aw, super.ax - awClass.e(20), -1, 0, -1);
            this.b = var3;
        }
    }
}
