package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public final class ek extends kx {

    public static ek a;
    private dn[][] d = new dn[8][8];
    private int e;
    private int f;
    private int g;
    private int h;
    private int K = -1;
    private int L;
    private int M;
    private byte N = -1;
    private Vector O = new Vector();
    private boolean P = false;
    private boolean Q = false;
    private Button R;
    private Button S;
    private ht T;
    private byte U;
    private int V = 0;
    public int b = -1;
    private boolean W = false;
    public boolean c = false;
    private boolean X = false;
    private int[][] ay = new int[][]{{1, -2}, {1, -1}, {1, -1}, {1, 3}, {1, 2}, {1, 2}, new int[2], {0, -1}, {0, 1}, new int[2], {0, -1}, {0, 1}, {-1, 1}, {-1, 1}, {-1, -1}, {1, 1}};
    private int[][] az = new int[][]{new int[2], {0, -1}, {0, 1}, new int[2], {0, -1}, {0, 1}, {1, 3}, {1, 2}, {1, 2}, {1, -2}, {1, -1}, {1, -1}, {-1, -1}, {1, 1}, {-1, 1}, {-1, 1}};
    private int[][] aA = new int[][]{{-1, -2}, new int[2], {1, 2}, new int[2], {-1, 1}, new int[2]};
    private int[][] aB = new int[][]{new int[2], {-1, -2}, new int[2], {1, 2}, new int[2], {-1, 1}};
    private boolean aC = false;
    private int aD;
    private Vector aE = new Vector();
    private boolean aF = false;
    private boolean aG = false;

    public static ek b() {
        return a == null ? (a = new ek()) : a;
    }

    public ek() {
        this.R = new Button(StringEntity.CHOOSE, 20);
        this.S = new Button(StringEntity.B, 21);
        ImageModel.b(StringEntity.ax);
        this.T = ht.a("st", 11 * gy.Y, 11 * gy.Y);
        ImageModel.cleanUp();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 20:
                if (!this.P) {
                    if (this.h == -1 && super.ad == this.R && super.B == GameMidlet.i.w && !this.Q) {
                        this.h = this.V;
                    } else {
                        this.h = -1;
                    }
                }
                break;
            case 21:
                this.m();
        }

        super.a(var1, var2);
    }

    private void m() {
        ie var1 = ie.a();
        var1.b((byte) 49);
        var1.k();
        super.B = -1;
        super.ad = kx.E;
        super.ae = null;
    }

    public final void e() {
        super.e();
        if (main.GameGraphic.height2 > 250) {
            this.g = 24 * gy.Y;
            this.U = (byte) (24 * gy.Y);
        } else {
            this.g = 16;
            this.U = 16;
        }

        this.aD = 40 * gy.Y;
        if (this.N == -1 || !kx.j) {
            this.e = (main.GameGraphic.width - (this.g << 3)) / 2;
        }

        this.f = this.g / 2 + 2;
        if (main.GameGraphic.width < 160) {
            this.f = 0;
        }

    }

    public final void a(int var1, int var2, byte[][] var3) {
        hj.z();
        super.s();
        this.W = false;
        super.B = var1;
        kx.v = var2;
        super.ad = null;
        super.ae = null;
        this.b = -1;
        kx.t = System.currentTimeMillis() + (long) (kx.v * 1000);
        if (GameMidlet.i.w == super.B) {
            this.X = true;
        }

        this.e();
        this.f();
        kx.j = true;
        this.h = -1;
        this.b(var3);
        main.GameGraphic.h();
    }

    public final void f() {
        do1.a().b(0, 0);
        int var1 = this.e;
        int var2 = this.g << 3;
        if (main.GameGraphic.height < 250) {
            var2 = main.GameGraphic.width - 50;
            var1 = 25;
        }

        for (int var3 = 0; var3 < kx.H; ++var3) {
            hn var4;
            if ((var4 = (hn) kx.m.elementAt(var3)).w != -1) {
                if (var4.w != GameMidlet.i.w) {
                    ir.b(var4);
                }

                var4.D = var4.ax = main.GameGraphic.height2 - main.GameGraphic.T - gy.ai / 2;
                if (var4.ax < this.g << 3 && (var1 = this.e - this.aD - 15 * gy.Y) < 0) {
                    var1 = 0;
                }

                if (main.GameGraphic.width < 160) {
                    var4.D = var4.ax = main.GameGraphic.height2 - 10;
                }

                if (main.GameGraphic.Z == 0 && main.GameGraphic.width > 200) {
                    var4.D = var4.ax -= 10;
                }

                if (var4.w == GameMidlet.i.w) {
                    this.L = var1 + 15 * gy.Y + this.aD;
                    var4.C = var4.aw = this.L;
                    var4.K = var4.t = 0;
                } else {
                    this.M = var1 + var2 - 15 * gy.Y - this.aD;
                    var4.C = var4.aw = this.M;
                    var4.K = var4.t = gx.J;
                }

                var4.h = 0;
                var4.b((byte) 0);
                var4.f(var4.H);
            }
        }

    }

    private void b(byte[][] var1) {
        boolean var2 = false;
        this.Q = true;

        for (int var3 = 7; var3 >= 0; --var3) {
            int var5 = 20;

            for (int var4 = 7; var4 >= 0; --var4) {
                this.d[var3][var4] = new dn(var4 * this.g, var3 * this.g, var1[var3][var4]);
                this.d[var3][var4].f = this.d[var3][var4].ax;
                this.d[var3][var4].e = -var5;
                --var5;
                this.d[var3][var4].k = true;
                this.d[var3][var4].ax = -(var4 * this.g + 24);
            }
        }

    }

    public final void k() {
        super.k();
        if (!kx.j && !kx.k) {
            this.q();
        } else {
            if (kx.t != 0L && (kx.u = System.currentTimeMillis()) > kx.t) {
                kx.t = 0L;
                if (super.B == GameMidlet.i.w && super.ad == this.R) {
                    this.m();
                }
            }

            boolean var1 = false;
            boolean var2 = false;

            int var3;
            for (var3 = 63; var3 >= 0; --var3) {
                if (this.d[var3 / 8][var3 % 8] != null && this.d[var3 / 8][var3 % 8].az == 1) {
                    dn var4 = this.d[var3 / 8][var3 % 8];
                    int var10000;
                    if (var4.aw == var4.n && var4.ax == var4.m) {
                        var10000 = -1;
                    } else if (Math.abs((var4.n - var4.aw) / 2) <= 1 && Math.abs((var4.m - var4.ax) / 2) <= 1) {
                        var4.aw = var4.n;
                        var4.ax = var4.m;
                        var10000 = 0;
                    } else {
                        if (var4.aw != var4.n) {
                            var4.aw += (var4.n - var4.aw) / 2;
                        }

                        if (var4.ax != var4.m) {
                            var4.ax += (var4.m - var4.ax) / 2;
                        }

                        var10000 = awClass.a(var4.aw, var4.ax, var4.n, var4.m) <= var4.o / 5 ? 2 : 1;
                    }

                    if (var10000 == -1) {
                        this.d[var3 / 8][var3 % 8].az = 0;
                        var2 = true;
                    } else {
                        var1 = true;
                    }
                }
            }

            if (var2 && this.P) {
                if (!this.c(this.V) && !this.c(this.h)) {
                    var3 = this.V;
                    this.V = this.h;
                    this.h = var3;
                    this.u();
                    super.ad = this.R;
                    super.ae = this.S;
                } else if (super.B == GameMidlet.i.w) {
                    ie.a().a(this.h, this.V);
                }

                this.P = false;
                this.h = -1;
            }

            int var5;
            if (!var1) {
                boolean var9 = false;

                for (var5 = 63; var5 >= 0; --var5) {
                    if (this.d[var5 / 8][var5 % 8] != null && this.d[var5 / 8][var5 % 8].k) {
                        dn var13 = this.d[var5 / 8][var5 % 8];
                        var13.aw += this.d[var5 / 8][var5 % 8].b;
                        if (this.d[var5 / 8][var5 % 8].b > 1 || this.d[var5 / 8][var5 % 8].b < -1) {
                            var13 = this.d[var5 / 8][var5 % 8];
                            var13.b -= this.d[var5 / 8][var5 % 8].b / awClass.f(this.d[var5 / 8][var5 % 8].b);
                        }

                        var13 = this.d[var5 / 8][var5 % 8];
                        var13.ax += this.d[var5 / 8][var5 % 8].e;
                        var13 = this.d[var5 / 8][var5 % 8];
                        var13.e += 2;
                        if (this.d[var5 / 8][var5 % 8].ax >= this.d[var5 / 8][var5 % 8].f) {
                            this.d[var5 / 8][var5 % 8].ax = this.d[var5 / 8][var5 % 8].f;
                            this.d[var5 / 8][var5 % 8].k = false;
                        } else {
                            var9 = true;
                        }
                    }
                }

                if (!var9 && this.Q) {
                    if (super.B == GameMidlet.i.w) {
                        if (!this.X) {
                            if (this.aG) {
                                this.v();
                            }
                        } else if (this.t()) {
                            super.ad = this.R;
                            super.ae = this.S;
                        } else {
                            ie.a().i();
                        }

                        this.X = false;
                    }

                    this.Q = false;
                }
            }

            int var6;
            if (this.K != -1) {
                if (this.K % 10 == 0) {
                    ek var10 = this;

                    for (var5 = 4 - this.K / 10; var5 < 4 + var10.K / 10; ++var5) {
                        for (var6 = 4 - var10.K / 10; var6 < 4 + var10.K / 10; ++var6) {
                            var10.b(var10.d[var5][var6].aw + 12, var10.d[var5][var6].ax + 12, var10.d[var5][var6].j);
                            var10.d[var5][var6].j = -1;
                        }
                    }
                }

                this.K += 2;
                if (this.K >= 50) {
                    this.w();
                    this.K = -1;
                }
            }

            dn var7;
            for (var3 = 0; var3 < this.O.size(); ++var3) {
                if ((var7 = (dn) this.O.elementAt(var3)).g > 0) {
                    ++var7.g;
                    if (var7.g == 3) {
                        this.O.removeElement(var7);
                        continue;
                    }
                }

                if (!var7.k) {
                    if (awClass.f((var6 = awClass.a(var7.n - var7.aw, -(var7.m - var7.ax))) - var7.e) > 10) {
                        var7.e -= var7.aA * var7.az;
                        var7.e = awClass.c(var7.e);
                    } else {
                        var7.e = var6;
                        var7.i = (byte) (var7.i + 2);
                    }

                    if (var7.f >= 4) {
                        var7.f = 0;
                    }

                    ++var7.f;
                    int var11 = var7.i * awClass.b(var7.e) >> 10;
                    var6 = -(var7.i * awClass.a(var7.e)) >> 10;
                    if (awClass.a(var7.aw, var7.ax, var7.n, var7.m) >= var7.i) {
                        var7.aw += var11;
                        var7.ax += var6;
                    } else {
                        this.O.removeElement(var7);
                    }
                } else {
                    var7.aw += var7.b;
                    if (var7.b > 1 || var7.b < -1) {
                        var7.b -= var7.b / awClass.f(var7.b);
                    }

                    var7.ax += var7.e;
                    ++var7.e;
                    if (var7.az == 1 && var7.f < 19) {
                        ++var7.f;
                    }

                    if (var7.ax + this.f > main.GameGraphic.height) {
                        this.O.removeElement(var7);
                    }
                }
            }

            for (var3 = 0; var3 < 2; ++var3) {
                hn var8;
                if ((var8 = (hn) kx.m.elementAt(var3)).Q == -1 && awClass.f(var8.C - var8.aw) < 10) {
                    if (this.N == -2) {
                        this.N = -1;
                        var8.Q = 0;
                        if (var8.w == this.b) {
                            var8.a((byte) 10);
                            var8.e(10);
                        } else {
                            var8.H = 0;
                            if (this.b != -1) {
                                var8.e(9);
                            }
                        }

                        this.c = false;
                        if (var8.w == GameMidlet.i.w) {
                            var8.K = 0;
                        }
                    } else if (var8.Q == -1) {
                        if (var8.ad && main.GameGraphic.l % 6 == 3) {
                            this.c(var8.aw, var8.ax - var8.aA, 0);
                        }

                        if (this.N != -1) {
                            if (this.N >= 0) {
                                --this.N;
                                if (this.N == -1) {
                                    this.N = -2;
                                    if (var8.w == GameMidlet.i.w) {
                                        var8.C = this.L;
                                    } else {
                                        var8.C = this.M;
                                    }
                                }
                            }
                        } else {
                            for (var6 = 0; var6 < 2; ++var6) {
                                hn var12;
                                if ((var12 = (hn) kx.m.elementAt(var6)).w != var8.w) {
                                    var12.e(20);
                                    var12.H = 4;
                                    var12.L = true;
                                    var8.L = true;
                                }
                            }

                            this.N = 20;
                            if (this.c) {
                                this.N = 30;
                            }
                        }
                    }
                }

                if (var8.aj > 0) {
                    var6 = var8.al / 100 + 1;
                    if (var8.aj - var6 < 0) {
                        var6 = var8.aj;
                    }

                    var8.aj = (short) (var8.aj - var6);
                    var8.ah = (short) (var8.ah + var6);
                } else if (var8.aj < 0) {
                    var6 = var8.al / 100 + 1;
                    if (var8.aj + var6 > 0) {
                        var6 = -var8.aj;
                    }

                    var8.ah = (short) (var8.ah - var6);
                    var8.aj = (short) (var8.aj + var6);
                }

                if (var8.ak > 0) {
                    var6 = var8.al / 100 + 1;
                    if (var8.ak - var6 < 0) {
                        var6 = var8.ak;
                    }

                    var8.ak = (short) (var8.ak - var6);
                    var8.ai = (short) (var8.ai + var6);
                } else if (var8.ak < 0) {
                    var6 = var8.al / 100 + 1;
                    if (var8.ak + var6 > 0) {
                        var6 = -var8.ak;
                    }

                    var8.ai = (short) (var8.ai - var6);
                    var8.ak = (short) (var8.ak + var6);
                }
            }

            for (var3 = 0; var3 < this.aE.size(); ++var3) {
                --(var7 = (dn) this.aE.elementAt(var3)).g;
                if (var7.g <= 0) {
                    this.aE.removeElement(var7);
                }
            }

        }
    }

    private boolean t() {
        for (int var1 = 0; var1 < 8; ++var1) {
            for (int var2 = 0; var2 < 8; ++var2) {
                for (int var3 = 0; var3 < this.ay.length; ++var3) {
                    if (var1 + this.az[var3][0] >= 0 && var1 + this.az[var3][0] < 8 && var1 + this.az[var3][1] >= 0 && var1 + this.az[var3][1] < 8 && var2 + this.ay[var3][0] >= 0 && var2 + this.ay[var3][0] < 8 && var2 + this.ay[var3][1] >= 0 && var2 + this.ay[var3][1] < 8 && this.d[var1][var2].j == this.d[var1 + this.az[var3][0]][var2 + this.ay[var3][0]].j && this.d[var1][var2].j == this.d[var1 + this.az[var3][1]][var2 + this.ay[var3][1]].j) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private void b(int var1, int var2, int var3) {
        if (var3 != -1) {
            hn var4;
            if ((var4 = kx.h(super.B)) != null) {
                int var5 = 0;
                int var6 = 0;
                switch (var3) {
                    case 0:
                        this.c(var1 + this.e, var2 + this.f, 0);
                        return;
                    case 1:
                        var5 = var4.aw;
                        var6 = var4.ax - var4.aA / 2;
                        if (var4.an > 0) {
                            if (var4.w == GameMidlet.i.w) {
                                var5 = this.L - 20 - 7;
                            } else {
                                var5 = this.M + 7 + 20;
                            }

                            var6 = var4.ax - 22;
                        }
                        break;
                    case 2:
                        if (var4.w == GameMidlet.i.w) {
                            var5 = this.L - 20 - this.aD + var4.ah * this.aD / var4.al;
                        } else {
                            var5 = this.M + (this.aD - var4.ah * this.aD / var4.al) + 20 - var4.ah * this.aD / var4.al;
                        }

                        var6 = var4.ax - 2 - 10 * gy.Y;
                        break;
                    case 3:
                        if (var4.w == GameMidlet.i.w) {
                            var5 = this.L - 20 - this.aD + var4.ai * this.aD / var4.am;
                        } else {
                            var5 = this.M + (this.aD - var4.ai * this.aD / var4.am) + 20 - var4.ah * this.aD / var4.al;
                        }

                        var6 = var4.ax - 5 * gy.Y;
                        break;
                    case 4:
                        this.c(var1 + this.e, var2 + this.f, 4);
                        return;
                    case 5:
                        return;
                }

                dn var10;
                (var10 = new dn(var1 + this.e, var2 + this.f)).g = 1;
                this.O.addElement(var10);

                for (int var11 = 0; var11 < (var3 != 1 ? 3 : 1); ++var11) {
                    dn var7;
                    (var7 = new dn(var1 + this.e, var2 + this.f)).o = (short) var3;
                    var7.f = awClass.e(3);
                    int var8 = awClass.a(var5 - var1, -(var6 - var2));
                    var7.b = var8;
                    var7.az = (byte) awClass.b(-1, 1);
                    var7.e = awClass.c(var7.b + var7.az * 90);
                    var8 = 10 * awClass.b(var7.e) >> 10;
                    int var9 = -(10 * awClass.a(var7.e)) >> 10;
                    var7.n = (short) var5;
                    var7.m = (short) var6;
                    var7.aw += var8;
                    var7.ax += var9;
                    var7.f = 0;
                    var7.i = (byte) (awClass.e(4) + 4);
                    var7.aA = (short) (10 + awClass.e(5));
                    this.O.addElement(var7);
                }

            }
        }
    }

    private void c(int var1, int var2, int var3) {
        if (var3 != -1) {
            dn var4;
            (var4 = new dn(var1, var2)).g = 1;
            this.O.addElement(var4);

            for (int var7 = 0; var7 < 3; ++var7) {
                int var5 = awClass.b(-1, 1);
                dn var6 = new dn(var1, var2);
                var6.k = true;
                var6.f = awClass.e(3);
                var6.b = var5 * (awClass.e(100) / 10);
                var6.e = -awClass.e(100) / 10;
                var6.i = (byte) var3;
                var6.az = 1;
                var6.g = 0;
                this.O.addElement(var6);
            }

        }
    }

    private boolean c(int var1) {
        if (this.h != -1 && !this.Q) {
            for (int var2 = 0; var2 < this.aA.length; ++var2) {
                if (var1 / 8 + this.aB[var2][0] >= 0 && var1 / 8 + this.aB[var2][0] < 8 && var1 / 8 + this.aB[var2][1] >= 0 && var1 / 8 + this.aB[var2][1] < 8 && var1 % 8 + this.aA[var2][0] >= 0 && var1 % 8 + this.aA[var2][0] < 8 && var1 % 8 + this.aA[var2][1] >= 0 && var1 % 8 + this.aA[var2][1] < 8 && this.d[var1 / 8][var1 % 8].j == this.d[var1 / 8 + this.aB[var2][0]][var1 % 8 + this.aA[var2][0]].j && this.d[var1 / 8][var1 % 8].j == this.d[var1 / 8 + this.aB[var2][1]][var1 % 8 + this.aA[var2][1]].j) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public final void l() {
        super.l();
        int var1;
        int var2;
        if (main.GameGraphic.g && main.GameGraphic.a(this.e, this.f, this.g << 3, this.g << 3) && this.h == -1) {
            main.GameGraphic.g = false;
            this.aC = true;
            var1 = (main.GameGraphic.h - this.e) / this.g;
            var2 = (main.GameGraphic.i - this.f) / this.g;
            this.V = (var2 << 3) + var1;
        }

        if (!this.P && !this.Q && super.ad == this.R && super.ad != kx.E && this.aC) {
            if (main.GameGraphic.e) {
                var1 = main.GameGraphic.k();
                var2 = main.GameGraphic.l();
                if (var1 < -this.g / 2) {
                    if (this.V % 8 < 7) {
                        this.h = this.V++;
                        this.aC = false;
                        this.u();
                    }
                } else if (var1 > this.g / 2) {
                    if (this.V % 8 > 0) {
                        this.h = this.V--;
                        this.aC = false;
                        this.u();
                    }
                } else if (var2 < -this.g / 2) {
                    if (this.V / 8 < 7) {
                        this.h = this.V;
                        this.V += 8;
                        this.aC = false;
                        this.u();
                    }
                } else if (var2 > this.g / 2 && this.V >= 8) {
                    this.h = this.V;
                    this.V -= 8;
                    this.aC = false;
                    this.u();
                }
            }

            if (main.GameGraphic.f) {
                main.GameGraphic.f = false;
                this.aC = false;
            }
        }

        if (kx.j && super.ad != kx.E) {
            if (main.GameGraphic.a(2)) {
                if (!this.P && !this.Q) {
                    if (this.V >= 8) {
                        this.V -= 8;
                    }

                    this.u();
                    return;
                }
            } else if (main.GameGraphic.a(4)) {
                if (!this.P && !this.Q) {
                    if (this.V % 8 > 0) {
                        --this.V;
                    }

                    this.u();
                    return;
                }
            } else if (main.GameGraphic.a(6)) {
                if (!this.P && !this.Q) {
                    if (this.V % 8 < 7) {
                        ++this.V;
                    }

                    this.u();
                    return;
                }
            } else if (main.GameGraphic.a(8) && !this.P && !this.Q) {
                if (this.V / 8 < 7) {
                    this.V += 8;
                }

                this.u();
            }
        }

    }

    private void u() {
        if (this.h != -1 && !this.Q) {
            super.ad = kx.E;
            super.ae = null;
            this.P = true;
            this.aC = false;
            dn var1 = this.d[this.V / 8][this.V % 8];
            dn var2 = this.d[this.h / 8][this.h % 8];
            int var3 = var1.aw;
            int var4 = var1.ax;
            short var5 = var1.j;
            var1.aw = var2.aw;
            var1.ax = var2.ax;
            var1.j = var2.j;
            var2.aw = var3;
            var2.ax = var4;
            var2.j = var5;
            var2.az = 1;
            var1.az = 1;
        }
    }

    private void v() {
        boolean var1 = false;

        for (int var3 = 0; var3 < 64; ++var3) {
            if (this.d[var3 / 8][var3 % 8].j != -2) {
                int var2 = 0;

                int var4;
                for (var4 = var3 + 1; var4 % 8 < 8 && var4 < 64 && var4 / 8 == var3 / 8 && this.d[var3 / 8][var3 % 8].j == this.d[var4 / 8][var4 % 8].j; ++var4) {
                    ++var2;
                }

                if (var2 > 1) {
                    for (var4 = var3; var4 < var3 + var2 + 1; ++var4) {
                        this.d[var4 / 8][var4 % 8].l = true;
                        var1 = true;
                    }
                }

                var2 = 0;

                for (var4 = var3 + 8; var4 < 64 && var4 % 8 == var3 % 8 && this.d[var3 / 8][var3 % 8].j == this.d[var4 / 8][var4 % 8].j; var4 += 8) {
                    ++var2;
                }

                if (var2 > 1) {
                    for (var4 = var3; var4 < var3 + (var2 + 1 << 3); var4 += 8) {
                        this.d[var4 / 8][var4 % 8].l = true;
                        var1 = true;
                    }
                }
            }
        }

        if (var1) {
            ie.a().a(this.d);
        } else {
            if (this.aF) {
                this.aF = false;
                this.m();
            }

        }
    }

    private void w() {
        for (int var1 = 0; var1 < 8; ++var1) {
            for (int var2 = 7; var2 >= 0; --var2) {
                if (this.d[((var2 << 3) + var1) / 8][((var2 << 3) + var1) % 8].j == -1) {
                    int var10001 = (var2 << 3) + var1;
                    boolean var3 = true;
                    int var5 = 4;
                    int var4 = var10001;
                    ek var7 = this;
                    this.Q = true;

                    for (int var6 = var4; var6 / 8 > 0; var6 -= 8) {
                        var7.d[var6 / 8][var6 % 8].j = var7.d[(var6 - 8) / 8][(var6 - 8) % 8].j;
                        var7.d[var6 / 8][var6 % 8].f = var6 / 8 * var7.g;
                        if (!var7.d[var6 / 8][var6 % 8].k) {
                            var7.d[var6 / 8][var6 % 8].e = -var5;
                            ++var5;
                            var7.d[var6 / 8][var6 % 8].k = true;
                        }

                        var7.d[var6 / 8][var6 % 8].ax = var7.d[(var6 - 8) / 8][(var6 - 8) % 8].ax;
                    }

                    var7.d[0][var4 % 8].j = -2;
                    var7.d[0][var4 % 8].f = 0;
                    if (!var7.d[0][var4 % 8].k) {
                        var7.d[0][var4 % 8].e = -var5;
                        ++var5;
                        var7.d[0][var4 % 8].k = true;
                        var7.d[0][var4 % 8].ax = 0;
                    }

                    dn var10000 = var7.d[0][var4 % 8];
                    var10000.ax -= 24;
                    ++var2;
                }
            }
        }

    }

    public final void a(Graphics var1) {
        this.b(var1);
        super.a(var1);
    }

    public final void b(Graphics var1) {
        super.b(var1);
        if (!kx.j) {
            this.a_(var1);
        } else {
            main.GameGraphic.c(var1);
            Graphics var3 = var1;
            ek var2 = this;
            var1.translate(this.e, this.f);
            int var5;
            if (fxClass.c((short) 876).d != -1) {
                for (var5 = 0; var5 < var2.aE.size(); ++var5) {
                    dn var6 = (dn) var2.aE.elementAt(var5);
                    int var4 = var5 * 17 - var2.g / 2 + 8;
                    if (var6.f != GameMidlet.i.w) {
                        var4 = (var2.g << 3) - var5 * 17 + var2.g / 2 - 8;
                    }

                    int var10003 = var6.j << 4;
                    int var10008 = (var2.g << 3) + var2.g;
                    var3.drawRegion(fxClass.c((short) 876).a, 0, var10003, 16, 16, 0, var4, var10008, 3);
                    main.GameGraphic.Q.a(var3, String.valueOf(var6.i), var4, (var2.g << 3) + var2.g - gy.ai / 2, 2);
                }
            }

            var3.setClip(-var2.g / 2, -var2.g / 2, (var2.g << 3) + var2.g, (var2.g << 3) + var2.g);
            f var9;
            if (var2.V >= 0 && var2.d[var2.V / 8][var2.V % 8] != null && (var2.B != GameMidlet.i.w || main.GameGraphic.l % 10 != 5) && (var9 = fxClass.c((short) (main.GameGraphic.height2 > 250 ? 878 : 879))).d != -1) {
                var3.drawRegion(var9.a, 0, (var2.h != -1 && main.GameGraphic.l % 6 < 3 ? 1 : 0) * var2.g, var2.g, var2.g, 0, var2.d[var2.V / 8][var2.V % 8].aw, var2.d[var2.V / 8][var2.V % 8].ax, 0);
            }

            if ((var9 = fxClass.c((short) (main.GameGraphic.height2 > 250 ? 875 : 876))).d != -1) {
                for (var5 = 0; var5 < 8; ++var5) {
                    for (int var10 = 0; var10 < 8; ++var10) {
                        if (var2.d[var5][var10] != null && var2.d[var5][var10].j >= 0) {
                            var3.drawRegion(var9.a, 0, var2.d[var5][var10].j * var2.U, var2.U, var2.U, 0, var2.d[var5][var10].aw, var2.d[var5][var10].ax, 0);
                        }
                    }
                }
            }

            main.GameGraphic.c(var1);
            if (main.GameGraphic.width > 160) {
                this.a_(var1);
            }

            this.e(var1);
            main.GameGraphic.c(var1);
            String var7 = "";
            if (kx.t != 0L) {
                long var8 = (kx.u - kx.t) / 1000L;
                var7 = var7 + -var8;
            }

            main.GameGraphic.O.a(var1, var7, this.e + (this.g << 3) / 2, this.f + (this.g << 3) + main.GameGraphic.O.getLastByte() + 2, 2);
            this.f(var1);
        }
    }

    public final void c(Graphics var1) {
        var1.setClip(this.e - this.g / 2, this.f - this.g / 2, (this.g << 3) + this.g + 1, (this.g << 3) + this.g + 1);

        for (int var2 = 0; var2 < 10; ++var2) {
            for (int var3 = 0; var3 < 10; ++var3) {
                if (var3 % 2 == var2 % 2) {
                    var1.setColor(5197647);
                } else {
                    var1.setColor(2697513);
                }

                var1.fillRect(this.e - this.g + var2 * this.g, this.f + var3 * this.g - this.g, this.g, this.g);
            }
        }

        var1.setColor(0);
        var1.drawRect(this.e - this.g / 2, this.f - this.g / 2, (this.g << 3) + this.g, (this.g << 3) + this.g);
        var1.drawRect(this.e - this.g / 2 + 1, this.f - this.g / 2 + 1, (this.g << 3) + this.g - 2, (this.g << 3) + this.g - 2);
    }

    private void e(Graphics var1) {
        int var3 = 0;
        int var4 = 0;

        for (int var11 = 0; var11 < 2; ++var11) {
            hn var12 = (hn) kx.m.elementAt(var11);
            f var2;
            if (this.N != -1 && var12.Q == -1 && var12.H == 0 && (var2 = fxClass.c((short) (this.c ? 882 : 881))).d != -1) {
                var1.drawRegion(var2.a, 0, 48 * gy.Y * (main.GameGraphic.l % 6 < 3 ? 0 : 1), 48 * gy.Y, 48 * gy.Y, 0, var12.aw, var12.ax - var12.aA / 2, 3);
            }

            byte var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var13;
            if (var12.w == GameMidlet.i.w) {
                var13 = this.L - (10 + 10 * gy.Y + this.aD);
                var3 = 0;
                var9 = 0;
                var10 = 0;
                var4 = 0;
                var6 = -2;
                var5 = 1;
                var7 = this.aD - 7;
                var8 = this.aD - 16 * gy.Y;
                if (main.GameGraphic.width > 160) {
                    main.GameGraphic.Q.a(var1, var12.c() + " " + StringEntity.k(), var13 + this.aD, var12.ax, 1);
                }
            } else {
                var13 = this.M + 10 + 10 * gy.Y;
                var3 += this.aD - var12.ah * this.aD / var12.al;
                var4 += this.aD - var12.ai * this.aD / var12.am;
                var10 = this.aD - (var12.ah + var12.aj) * this.aD / var12.al;
                var9 = this.aD - (var12.ai + var12.ak) * this.aD / var12.am;
                var6 = this.aD + 2;
                var7 = 8;
                var5 = 0;
                var8 = 16 * gy.Y;
                if (main.GameGraphic.width > 160) {
                    main.GameGraphic.Q.a(var1, var12.c() + " " + StringEntity.k(), var13, var12.ax, 0);
                }
            }

            main.GameGraphic.Q.a(var1, String.valueOf(var12.ah), var13 + var6, var12.ax - (gy.ai << 1) + 3 * gy.Y - gy.ai / 2, var5);
            main.GameGraphic.Q.a(var1, String.valueOf(var12.ai), var13 + var6, var12.ax - gy.ai + 3 * gy.Y - gy.ai / 2, var5);
            if (var12.an > 0 && var12.ag <= 0 || var12.ag > 0 && main.GameGraphic.l % 6 < 3) {
                fxClass.a(var1, 880, var13 + var7, var12.ax - gy.ai * 3, 3);
                main.GameGraphic.Q.a(var1, String.valueOf(var12.an), var13 + var8, var12.ax - gy.ai * 3 - gy.ai / 2, var5);
                if (var12.ag > 0) {
                    --var12.ag;
                }
            }

            if (var12.aj != 0 && main.GameGraphic.l % 6 >= 3) {
                var1.setColor(1908254);
            } else {
                var1.setColor(0);
            }

            var1.fillRect(var13, var12.ax - (gy.ai << 1), this.aD, 6 * gy.Y);
            var1.fillRect(var13, var12.ax - gy.ai, this.aD, 6 * gy.Y);
            if (var12.aj > 0) {
                var1.setColor(16583178);
                var1.fillRect(var13 + var10, var12.ax - 4 - 10 * gy.Y, (var12.ah + var12.aj) * this.aD / var12.al, 6 * gy.Y);
            }

            if (var12.aj != 0 && main.GameGraphic.l % 6 >= 3) {
                var1.setColor(16734553);
            } else {
                var1.setColor(16711680);
            }

            var1.fillRect(var13 + var3, var12.ax - (gy.ai << 1), var12.ah * this.aD / var12.al, 6 * gy.Y);
            var1.setColor(14137273);
            var1.drawRect(var13, var12.ax - (gy.ai << 1), this.aD, 6 * gy.Y);
            var1.drawRect(var13, var12.ax - gy.ai, this.aD, 6 * gy.Y);
            if (var12.ak > 0) {
                var1.setColor(3771903);
                var1.fillRect(var13 + var9, var12.ax - gy.ai + 1, (var12.ai + var12.ak) * this.aD / var12.am, 6 * gy.Y - 1);
            }

            if ((var12.ak != 0 || var12.ad) && main.GameGraphic.l % 6 >= 3) {
                var1.setColor(6799871);
            } else {
                var1.setColor(299247);
            }

            var1.fillRect(var13 + var4, var12.ax - gy.ai + 1, var12.ai * this.aD / var12.am, 6 * gy.Y - 1);
        }

    }

    private void f(Graphics var1) {
        for (int var2 = 0; var2 < this.O.size(); ++var2) {
            dn var3;
            if ((var3 = (dn) this.O.elementAt(var2)).g > 0) {
                fxClass.a(var1, 877, var3.aw, var3.ax, 3);
            } else if (var3.k) {
                this.T.a(var3.f / 5, var3.aw, var3.ax, 0, 3, var1);
            } else if (var3.i >= 0) {
                this.T.a(var3.f / 2 + 1, var3.aw, var3.ax, 0, 3, var1);
            }
        }

    }

    public final void a(byte[] var1, dr[] var2, byte var3, Vector var4) {
        int var6;
        int var7;
        for (var6 = 0; var6 < var1.length; ++var6) {
            this.d[var1[var6] / 8][var1[var6] % 8].l = true;
            if (main.GameGraphic.height > 300) {
                boolean var5 = false;

                for (var7 = 0; var7 < this.aE.size(); ++var7) {
                    dn var8;
                    if ((var8 = (dn) this.aE.elementAt(var7)).j == this.d[var1[var6] / 8][var1[var6] % 8].j) {
                        var8.g += 20;
                        var5 = true;
                        ++var8.i;
                        break;
                    }
                }

                if (!var5) {
                    dn var11;
                    (var11 = new dn()).j = this.d[var1[var6] / 8][var1[var6] % 8].j;
                    var11.g = 40;
                    var11.i = 1;
                    var11.f = super.B;
                    this.aE.addElement(var11);
                }
            }
        }

        ek var9 = this;

        for (int var10 = 0; var10 < 8; ++var10) {
            for (var6 = 0; var6 < 8; ++var6) {
                if (var9.d[var10][var6].l) {
                    var9.d[var10][var6].l = false;
                    var9.b(var9.d[var10][var6].aw + 12, var9.d[var10][var6].ax + 12, var9.d[var10][var6].j);
                    var9.d[var10][var6].j = -1;
                }
            }
        }

        var9.w();

        for (var6 = 0; var6 < var2.length; ++var6) {
            var7 = var2[var6].c;
            this.d[var7 / 8][var7 % 8].j = var2[var6].d;
        }

        if (var3 > 1) {
            main.GameGraphic.a("Combo x" + var3, main.GameGraphic.o, main.GameGraphic.p, -1, 1, 20);
        }

        if (var4.size() > 0) {
            for (var6 = 0; var6 < var4.size(); ++var6) {
                main.GameGraphic.a((String) var4.elementAt(var6), main.GameGraphic.o, main.GameGraphic.p + 40, -1, 1, var6 * 30);
            }
        }

        for (var6 = 0; var6 < 2; ++var6) {
            hn var12;
            (var12 = (hn) kx.m.elementAt(var6)).e(4);
            if (var12.w != super.B && var12.af > 0) {
                hn var13;
                if ((var13 = kx.h(super.B)).Q != -1) {
                    var13.d(var12.aw, var12.ax);
                }

                var13.Q = -1;
                if (var12.an > 0) {
                    var12.ag = 20;
                }
            }
        }

        main.GameGraphic.h();
    }

    public final void a(int var1, int var2, int var3) {
        if (!this.W) {
            hn var4;
            if ((var4 = kx.h(var1)) != null && var4.H == 4) {
                var4.H = 0;
            }

            if (var1 == GameMidlet.i.w) {
                this.aF = true;
                this.v();
                this.aG = true;
            } else {
                super.ad = kx.E;
                super.ae = null;
                this.h = var2;
                this.V = var3;
                this.u();
                if (var1 == -1) {
                    this.P = false;
                    this.h = -1;
                }

            }
        }
    }

    public final void b(int var1) {
        if (!this.W) {
            this.h = -1;
            kx.t = System.currentTimeMillis() + (long) (kx.v * 1000);
            super.B = var1;
            this.aG = false;
            if (var1 == GameMidlet.i.w) {
                if (this.t()) {
                    super.ae = this.S;
                    super.ad = this.R;
                } else {
                    ie.a().i();
                }
            } else {
                this.aF = false;
                super.ad = null;
                super.ae = null;
            }
        }
    }

    public final void a(int var1, byte[][] var2) {
        super.B = var1;
        if (var1 == GameMidlet.i.w) {
            this.X = true;
        }
        this.b(var2);
    }

    public final void g() {
        super.g();
        kx.j = false;
        this.W = false;
        gq.a().b();
        this.b = -1;
        for (int var1 = 0; var1 < kx.m.size(); ++var1) {
            hn var2;
            (var2 = (hn) kx.m.elementAt(var1)).k();
            var2.e(4);
        }
    }

    public final void a(Vector var1) {
        gq var10000 = gq.a();
        String var3 = "";
        gq var4 = var10000;
        var10000.g = var3;
        var4.f = main.GameGraphic.K.a(var4.g) + 20 * gy.Y;
        if (var4.f < 50 + 20 * gy.Y) {
            var4.f = 50 + 20 * gy.Y;
        }
        var4.a = var1;
        var4.c = var4.a.size() * gy.af + (gy.Z << 1) + 10 + je.o;
        var4.e = 0;
        for (int var5 = 0; var5 < var4.a.size(); ++var5) {
            var3 = (String) var4.a.elementAt(var5);
            if (main.GameGraphic.K.a(var3) + 20 > var4.e) {
                var4.e = main.GameGraphic.K.a(var3) + 20;
            }
        }
        if (var4.e < 176) {
            var4.e = 176;
        }
        if (main.GameGraphic.width >= 240 && var4.e < 240 * gy.Y) {
            var4.e = 240 * gy.Y;
        }
        var4.d = (main.GameGraphic.width - var4.e) / 2;
        var4.b = main.GameGraphic.height - main.GameGraphic.T - var4.c - 10;
        gq.a().ad = new Button(StringEntity.OK, -1, this);
        super.ad = kx.C;
        super.ae = null;
        super.B = -1;
        kx.r();
        super.ac = null;
        this.W = true;
    }

    public final void a(byte[][] var1) {
        for (int var2 = 7; var2 >= 0; --var2) {
            for (int var3 = 7; var3 >= 0; --var3) {
                this.d[var2][var3].j = var1[var2][var3];
            }
        }
    }
}
