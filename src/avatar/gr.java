package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class gr extends ai {

    public hn r;
    private Vector t = new Vector();
    private int u;
    private int v;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    public static Image[] s = new Image[2];
    private static final byte[][] U = new byte[][]{
        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
        {0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1},
        {2, 2, 2, 3, 3, 3, 2, 2, 2, 3, 3, 3}
    };

    public gr(hn var1) {
        super.az = 4;
        this.r = var1;
        super.n = new dr();
        super.n.a = this.r.aw - 40 + awClass.e(80);
        super.n.b = this.r.ax - 20 + awClass.e(40);
        super.C = super.aw = super.n.a;
        super.D = super.ax = super.n.b;
        fa var2 = (fa) fxClass.a(this.r.V);
        this.Q = var2.a;
    }

    public final void g() {
        if (this.t.size() > 0) {
            dr var1 = (dr) this.t.elementAt(0);
            super.n.a = var1.a;
            super.n.b = var1.b;
            this.t.removeElementAt(0);
        } else {
            int var2 = awClass.e(20) - 10;
            if (awClass.f(super.n.a + var2 - GameMidlet.i.aw) >= 35) {
                var2 = 0;
            }
            dr var10000 = super.n;
            var10000.a += var2;
            super.n.b = super.ax;
        }

        if (super.n.a < 0) {
            super.n.a = 5;
        } else if (super.n.a > ir.e * 24) {
            super.n.a = ir.e * 24 - 5;
        } else if (super.n.b < 0) {
            super.n.b = 5;
        } else {
            if (super.n.b > ir.f * 24 - 24) {
                super.n.b = ir.f * 24 - 30;
            }
        }
    }

    public final void c() {
        this.g();
    }

    public final void b() {
        if (main.GameGraphic.l % (3 - this.Q) == 0) {
            ++super.y;
        }

        int var10000 = main.GameGraphic.l;
        if (true && super.H == 1 && super.ax == super.D && this.T) {
            if (this.S == 1) {
                ++this.R;
                if (this.R > 3) {
                    this.S = -1;
                }
            } else {
                --this.R;
                if (this.R < -3) {
                    this.S = 1;
                }
            }
        }

        if (super.y >= 12) {
            super.y = 0;
        }

        if ((this.u != this.r.aw || this.v != this.r.ax) && awClass.a(this.u, this.v, this.r.aw, this.r.ax) > 40) {
            int var2 = 10 + awClass.e(20);
            if (this.r.K == 0) {
                var2 = -(10 + awClass.e(20));
            }

            if (ir.c(this.r.aw + var2, this.r.ax) != 80) {
                var2 = 0;
            }

            this.t.addElement(new dr(this.r.aw + var2, this.r.ax));
            this.u = this.r.aw + var2;
            this.v = this.r.ax;
        }

        if (super.H != 1) {
            if (super.e > 0) {
                if (super.y == 0) {
                    super.H = (byte) awClass.e(3 + (this.Q << 1));
                    if (super.H != 2) {
                        super.H = 0;
                    } else {
                        super.K = (byte) awClass.b(0, gx.J);
                    }

                    if (this.T) {
                        super.H = 2;
                    }
                }

                --super.e;
                if (awClass.a(super.aw, super.ax, this.r.aw, this.r.ax) > 35) {
                    super.h();
                    super.e = 0;
                    super.G = 4;
                }

            } else {
                this.g();
                if (super.n.a > super.aw) {
                    super.K = 0;
                } else {
                    super.K = gx.J;
                }

                this.f();
                super.H = 1;
            }
        } else {
            this.e();
        }
    }

    public final void h() {
        super.h();
        super.e = 50 + awClass.e(100);
        if (this.t.size() > 0) {
            this.g();
            if (super.n.a > super.aw) {
                super.K = 0;
            } else {
                super.K = gx.J;
            }

            this.f();
            super.H = 1;
            super.e = 0;
            super.a = 1;
            super.G = 2 + this.Q;
        } else {
            super.G = 1 + awClass.e(this.Q);
        }
    }

    public final void a(Graphics var1) {
        if ((super.aw + 15) * js.ay >= do1.a().a && (super.aw - 15) * js.ay <= do1.a().a + main.GameGraphic.width && !this.r.L && (main.GameGraphic.Z <= 0 || main.GameGraphic.r != cd.b())) {
            fa var2;
            if ((var2 = (fa) fxClass.a(this.r.V)).g != -1) {
                if (var2.g >= 2000) {
                    f var3;
                    if ((var3 = fxClass.b(var2.c[U[super.H][super.y]])).d != -1) {
                        if (!this.T && var2.e[0] + var3.c < -10 && var3.c > 0) {
                            this.T = true;
                            this.S = 1;
                        }
                        var1.drawImage(s[this.T ? 0 : 1], super.aw * js.ay, (super.ax - 1) * js.ay, 3);
                        var1.drawRegion(var3.a, 0, 0, var3.b, var3.c, super.K, super.aw * js.ay + var2.d[U[super.H][super.y]] * js.ay - (super.K == gx.J ? (var2.d[U[super.H][super.y]] * gy.Y << 1) + var3.b * gy.Y : 0), (super.ax + this.R) * js.ay + var2.e[U[super.H][super.y]] * js.ay, 0);
                    }
                } else {
                    ke var4 = fxClass.a[var2.c[U[super.H][super.y]]];
                    if (!this.T && var2.e[0] + var4.f < -10 && var4.f > 0) {
                        this.T = true;
                        this.S = 1;
                    }

                    var1.drawImage(s[this.T ? 0 : 1], super.aw * js.ay, (super.ax - 1) * js.ay, 3);
                    int var10002 = var4.c * js.ay;
                    int var10003 = var4.d * js.ay;
                    int var10004 = var4.e * js.ay;
                    int var10005 = var4.f * js.ay;
                    int var10007 = super.aw * js.ay + var2.d[U[super.H][super.y]] * js.ay - (super.K == gx.J ? (var2.d[U[super.H][super.y]] * gy.Y << 1) + var4.e * gy.Y : 0);
                    var1.drawRegion(fxClass.a((int) var4.b).e, var10002, var10003, var10004, var10005, super.K, var10007, (super.ax + this.R) * js.ay + var2.e[U[super.H][super.y]] * js.ay, 0);
                }
            }

        }
    }

    public final void a(Graphics var1, int var2, int var3, int var4) {
        fa var5;
        if ((var5 = (fa) fxClass.a(this.r.V)).g != -1) {
            int var6 = var3 + var5.e[U[super.H][super.y]];
            je.a(var2 - 10, var6 - 10, 20, 3, 11381824, var1);
            var1.setColor(11072024);
            var1.drawRect(var2 - 10, var6 - 10, 20, 3);
            je.a(var2 - 9, var6 - 9, var4 * 20 / 100, 2, 16644608, var1);
            if (var5.g >= 2000) {
                f var7;
                if ((var7 = fxClass.b(var5.c[U[super.H][super.y]])).d != -1) {
                    var1.drawImage(s[this.T ? 0 : 1], var2, var3 - 1, 3);
                    var1.drawRegion(var7.a, 0, 0, var7.b, var7.c, super.K, var2 + var5.d[U[super.H][super.y]] * js.ay - (super.K == gx.J ? (var5.d[U[super.H][super.y]] * gy.Y << 1) + var7.b * gy.Y : 0), var6 + this.R, 0);
                }
            } else {
                ke var8 = fxClass.a[var5.c[U[super.H][super.y]]];
                var1.drawImage(s[this.T ? 0 : 1], var2, var3 - 1, 3);
                int var10002 = var8.c * js.ay;
                int var10003 = var8.d * js.ay;
                int var10004 = var8.e * js.ay;
                int var10005 = var8.f * js.ay;
                int var10007 = var2 + var5.d[U[super.H][super.y]] * js.ay;
                var1.drawRegion(fxClass.a((int) var8.b).e, var10002, var10003, var10004, var10005, super.K, var10007 - (super.K == gx.J ? (var5.d[U[super.H][super.y]] * gy.Y << 1) + var8.e * gy.Y : 0), var6 + this.R, 0);
            }
        }

    }

    public final void e() {
        int var1 = super.G * this.r.W / 100;
        if (this.r.W >= 70) {
            var1 = super.G;
        }

        if (var1 <= 0) {
            var1 = 1;
        }

        int var2 = var1 * (super.a * awClass.b(awClass.c(super.b)) >> 10);
        var1 = -var1 * super.a * awClass.a(awClass.c(super.b)) >> 10;
        super.aw = super.C + var2;
        super.ax = super.D + var1;
        var1 = awClass.a(super.C, super.D, super.aw, super.ax);
        ++super.a;
        if (var1 > super.c) {
            this.h();
        }

    }
}
