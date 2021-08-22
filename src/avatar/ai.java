package avatar;

import javax.microedition.lcdui.Graphics;

public class ai extends gx {

    public int a;
    public int b;
    public int c;
    public int d = 0;
    public int e;
    public boolean f = false;
    public int g;
    public int h;
    public boolean i;
    public boolean[] j = new boolean[2];
    public byte k;
    public byte l;
    public byte m;
    public dr n;
    public int o = 0;
    public boolean p = false;
    public int q = 0;

    public ai() {
        super.az = 2;
    }

    public void a() {
    }

    public ai(int var1, int var2, int var3, byte var4) {
        ad var5 = gb.c(var4);
        super.x = var5.l;
        super.az = 2;
        this.a(var1, var2);
        super.K = 0;
        super.H = 0;
        super.w = var3;
        this.d = 0;
        super.z = 4;
        super.F = super.z;
        super.G = 1;
        this.k = var4;
        super.y = awClass.e(12);
    }

    public void a(Graphics var1) {
        if (super.aw * js.ay + 30 >= do1.a().a && super.aw * js.ay - 30 <= do1.a().a + main.GameGraphic.width && main.GameGraphic.r != cd.b()) {
            ad var2 = gb.c(this.k);
            f var3 = fxClass.c(var2.j[this.d]);
            if (var3.d != -1) {
                if (super.aA == 0) {
                    super.aA = (short) (var3.c / var2.b);
                }
                if (super.az != 7) {
                    this.m = var2.k[super.H][super.y];
                }

                var1.drawRegion(var3.a, 0, this.m * super.aA, var3.b, super.aA, super.K, super.aw * js.ay, super.ax * js.ay + this.l - (var2.c == 4 ? super.aA / 3 << 1 : 0), var2.c != 4 ? 33 : 17);
                super.a(var1);
                this.a(var1, super.aA + 2, super.aw * js.ay, super.ax * js.ay, ir.p);
            }
        }
    }

    public final void a(Graphics var1, int var2, int var3, boolean var4) {
        ad var6 = gb.c(this.k);
        f var5 = fxClass.c(var6.j[this.d]);
        if (var5.d != -1) {
            if (super.aA == 0) {
                super.aA = (short) (var5.c / var6.b);
            }
            if (super.az != 7) {
                this.m = var6.k[super.H][super.y];
            }
            var1.drawRegion(var5.a, 0, this.m * super.aA, var5.b, super.aA, super.K, var2, var3 + this.l, var6.c != 4 ? 33 : 17);
            this.a(var1, super.aA + 2, var2, var3, this);
        }
    }

    private void a(Graphics var1, int var2, int var3, int var4, js var5) {
        if (var5 == this) {
            int var7 = gb.c(this.k).d * 60 - this.g;
            int var6 = this.d * 5;
            if (this.g > gb.c(this.k).d * 60) {
                je.a(var3 - (var6 + 22) * js.ay / 2, var4 - (18 + this.l) * js.ay - var2, (var6 + 22) * js.ay, 4 * js.ay, 1, var1);
                je.a(var3 - (var6 + 20) * js.ay / 2, var4 - (17 + this.l) * js.ay - var2, this.h * (var6 + 20) / 100 * js.ay, 2 * js.ay, 65280, var1);
            } else {
                je.a(var3 - (var6 + 22) * js.ay / 2, var4 - (18 + this.l) * js.ay - var2, (var6 + 22) * js.ay, 4 * js.ay, 1, var1);
                je.a(var3 - (var6 + 20) * js.ay / 2, var4 - (17 + this.l) * js.ay - var2, this.h * (var6 + 20) / 100 * js.ay, 2 * js.ay, 65280, var1);
                main.GameGraphic.Q.a(var1, var7 / 60 + ":" + (var7 - var7 / 60 * 60), var3, var4 - (13 + this.l) * js.ay - var2, 2);
            }

            if (super.az == 7) {
                var2 = 10;
            }

            if (this.j[0]) {
                go.u.a(0, var3 - 10 * js.ay, var4 - (22 + this.l) * js.ay - var2, 0, 3, var1);
            }

            if (this.j[1]) {
                go.u.a(1, var3 + 10 * js.ay, var4 - (22 + this.l) * js.ay - var2, 0, 3, var1);
            }
        }

    }

    public void b() {
        if (this.p) {
            if (main.GameGraphic.j() - this.q > 10) {
                this.p = false;
            }

        } else {
            ++super.y;
            if (super.y >= 12) {
                super.y = 0;
            }

            this.d();
            if (super.H != 1) {
                if (super.y == 0) {
                    super.H = (byte) awClass.e(5 + (this.k - 50) * 5);
                    if (super.H != 2) {
                        super.H = 0;
                    } else {
                        super.K = (byte) awClass.b(0, gx.J);
                    }
                }
                if (this.e > 0) {
                    --this.e;
                    return;
                }
                this.c();
                if (this.n.a > super.aw) {
                    super.K = 0;
                } else {
                    super.K = gx.J;
                }

                this.f();
                super.H = 1;
            } else {
                this.e();
            }

            super.b();
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
        int var1 = super.G * (this.a * awClass.b(awClass.c(this.b)) >> 10);
        int var2 = -super.G * this.a * awClass.a(awClass.c(this.b)) >> 10;
        if (this.b(var1, var2)) {
            if (this.c(var1, var2)) {
                super.aw += super.E;
                super.ax += super.F;
            }
            this.h();
        } else {
            super.aw = super.C + var1;
            super.ax = super.D + var2;
            var1 = awClass.a(super.C, super.D, super.aw, super.ax);
            ++this.a;
            if (var1 > this.c) {
                this.h();
            }
        }
    }

    public void f() {
        this.c = awClass.a(super.aw, super.ax, this.n.a, this.n.b);
        this.b = awClass.a(this.n.a - super.aw, -(this.n.b - super.ax));
    }

    public void g() {
        dr var2 = new dr(awClass.e(ir.e * 6) << 2, awClass.e(ir.f * 6) << 2);
        this.n = var2;
    }

    public void h() {
        super.H = 0;
        super.C = super.aw;
        super.D = super.ax;
        super.E = 0;
        super.F = 0;
        this.a = 0;
    }
}
