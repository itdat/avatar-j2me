package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public final class db {

    private static int m = 10;
    private int n = 1;
    public byte a = 9;
    public hn b;
    dr[] c;
    dr[] d;
    private dr[] o;
    private int p = 0;
    int e;
    private int q;
    int f;
    int g;
    private int r;
    int h;
    private int s;
    boolean i;
    boolean j;
    boolean k;
    private boolean t;
    private dr[] u;
    private dr v;
    private dr w;
    private dr x;
    public static int[] l = new int[]{12577266, 10341591};
    private int y;
    private int z;
    private int A;

    public db() {
        this.e = m;
        this.q = -8;
        this.f = 0;
        this.g = -1;
        this.r = 25;
        this.h = -1;
        this.i = false;
        this.j = false;
        this.k = false;
        this.t = false;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.a = (byte) (7 + awClass.e(4));
        this.u = new dr[2];

        int var1;
        for (var1 = 0; var1 < 2; ++var1) {
            this.u[var1] = new dr(-10, 0, var1 * 15);
        }

        this.o = new dr[2];
        this.o[0] = new dr();
        this.o[1] = new dr();
        this.c = new dr[this.a];
        this.d = new dr[this.a];

        for (var1 = 0; var1 < this.a; ++var1) {
            this.c[var1] = new dr();
            this.d[var1] = new dr();
        }

        this.v = new dr(0, 0, -1);
        this.w = new dr(0, 0, -1);
        this.x = new dr();
    }

    public final void a() {
        this.p = 0;
        this.f = 0;
        this.q = -(10 + awClass.e(4));
        this.g = -1;
        this.i = false;
        this.j = false;
        this.t = false;
    }

    public final void a(hn var1) {
        this.b = var1;
        if (var1.K == 0) {
            this.n = 1;
        } else {
            this.n = -1;
        }

        this.a();
        this.g = 0;
        this.h = 0;
        Object var4 = fxClass.a(var1.e, 70);
        if (((ld) var4).f >= 0) {
            var4 = fxClass.a(((ld) var4).f);
        }

        fa var8 = (fa) var4;
        ke var5 = fxClass.a[var8.c[3]];
        ke var6 = fxClass.a[var8.c[14]];
        int var7 = var1.aw;
        int var3 = var1.ax + var1.h;
        this.o[0].a = var7 + var8.d[3] * gy.Y + var5.e * gy.Y;
        this.o[0].b = var3 + var8.e[3] * gy.Y - 5 * (gy.Y - 1);
        this.o[1].a = var7 + var8.d[14] * gy.Y + var6.e * gy.Y;
        this.o[1].b = var3 + var8.e[14] * gy.Y - 5 * (gy.Y - 1);
        this.v.c = -1;
        if (var1.w == GameMidlet.i.w) {
            aeClass.getInstance();
            aeClass.a((byte) 13);
        }

    }

    public final void b() {
        ++this.p;
        this.e = m;

        for (int var1 = 0; var1 < this.a; ++var1) {
            this.c[var1].a = this.o[1].a;
            this.c[var1].b = this.o[1].b;
        }

    }

    public final void a(int var1) {
        this.c[0].a = this.o[var1].a;
        this.c[0].b = this.o[var1].b;
        if (var1 == 1) {
            this.b.H = 13;
        } else {
            this.b.H = 2;
        }
    }

    public final void c() {
        if (this.b != null) {
            ++this.A;
            if (this.A >= 6) {
                this.A = 0;
            }

            db var1 = this;
            int var2;
            int var3;
            int var5;
            dr var10000;
            if (this.p != 0) {
                if (this.f == 1) {
                    for (var2 = 1; var2 < var1.a - 2; ++var2) {
                        var10000 = var1.c[var2];
                        var10000.b += 6;
                    }

                    label273:
                    {
                        db var10 = var1;
                        if (var1.t && var1.h > 0) {
                            ++var1.y;
                            if (var1.y < 2) {
                                var3 = 1;

                                while (true) {
                                    if (var3 >= var10.a) {
                                        break label273;
                                    }

                                    var10000 = var10.c[var3];
                                    var10000.a -= 6;
                                    ++var3;
                                }
                            }

                            if (var1.y > 4 && var1.y < 8) {
                                var3 = 1;

                                while (true) {
                                    if (var3 >= var10.a) {
                                        break label273;
                                    }

                                    var10000 = var10.c[var3];
                                    var10000.a += 6;
                                    ++var3;
                                }
                            }

                            if (var1.y <= 14) {
                                break label273;
                            }

                            --var1.z;
                            if (var1.z >= 0) {
                                break label273;
                            }

                            var1.y = 0;
                        }

                        var1.z = awClass.e(20);
                    }

                    if (var1.e == m) {
                        var1.e = 7;
                    }
                }

                boolean var11 = false;
                var3 = var1.a - 1;
                byte var4 = 1;
                if (var1.j) {
                    var4 = 0;
                }

                int var6;
                int var7;
                int var8;
                for (var5 = 1; var5 < var1.a - var1.f * var4; ++var5) {
                    if ((var6 = awClass.a(var1.c[var5].a, var1.c[var5].b, var1.c[var5 - 1].a, var1.c[var5 - 1].b)) > var1.e + 1) {
                        var11 = true;
                        var7 = var6 - var1.e;
                        var6 = awClass.a(var1.c[var5 - 1].a - var1.c[var5].a, -(var1.c[var5 - 1].b - var1.c[var5].b));
                        var8 = var7 * awClass.b(awClass.c(var6)) >> 10;
                        var6 = -(var7 * awClass.a(awClass.c(var6))) >> 10;
                        var10000 = var1.c[var5];
                        var10000.a += var8;
                        var10000 = var1.c[var5];
                        var10000.b += var6;
                    }
                }

                if (var1.c[var3].b < var1.b.ax + var1.b.h + 5) {
                    var10000 = var1.c[var3];
                    var10000.a += 10;
                    var10000 = var1.c[var3];
                    var10000.b += var1.q;
                    ++var1.q;
                }

                if (!var1.j) {
                    for (var5 = var3 - 1; var5 > 0; --var5) {
                        if ((var6 = awClass.a(var1.c[var5].a, var1.c[var5].b, var1.c[var5 + 1].a, var1.c[var5 + 1].b)) > var1.e + 1) {
                            var11 = true;
                            var7 = awClass.a(var1.c[var5 + 1].a - var1.c[var5].a, -(var1.c[var5 + 1].b - var1.c[var5].b));
                            var8 = (var6 -= var1.e) * awClass.b(awClass.c(var7)) >> 10;
                            var6 = -(var6 * awClass.a(awClass.c(var7))) >> 10;
                            var10000 = var1.c[var5];
                            var10000.a += var8;
                            var10000 = var1.c[var5];
                            var10000.b += var6;
                        }
                    }
                }

                if (!var11) {
                    var1.f = 1;
                }
            }

            if (this.g != -1) {
                ++this.g;
                if (main.GameGraphic.l % 4 == 2) {
                    if (this.b.H == 2) {
                        this.b.H = 13;
                        if (this.g > 16) {
                            this.b();
                            this.g = -1;
                        }
                    } else {
                        this.b.H = 2;
                    }
                }
            }

            var1 = this;
            if (this.i) {
                if (this.e > 4 && main.GameGraphic.l % 6 == 3) {
                    --this.e;
                }

                if (!this.j && main.GameGraphic.l % 6 == 3 && this.b != GameMidlet.i) {
                    if (this.b.H == 2) {
                        this.a(1);
                    } else {
                        this.a(0);
                    }
                }

                if (this.j && this.e <= 4) {
                    this.e = 2;
                    var2 = 0;
                    if (!this.t) {
                        for (var3 = 0; var3 < var1.a - 1; ++var3) {
                            var10000 = var1.c[var3];
                            boolean var13 = true;
                            var5 = var1.c[var3 + 1].a;
                            dr var12 = var10000;
                            if (awClass.f(var5 - var12.a) > 1) {
                                ++var2;
                            }
                        }
                    }

                    if (var2 == 0 && !var1.t) {
                        var1.v.c = -2;
                        var1.t = true;
                    }
                }
            }

            if (this.k && (this.b.H == 2 || this.b.H == 13)) {
                this.a(this.b);
                this.k = false;
            }

            if (this.f != 0) {
                var1 = this;

                for (var2 = 0; var2 < 2; ++var2) {
                    if (var1.u[var2].c == 0 || var1.u[var2].a == -10) {
                        var1.u[var2].a = var1.d[var1.a - 2].a;
                        var1.u[var2].b = var1.d[var1.a - 2].b;
                    }

                    if (var1.i) {
                        var10000 = var1.u[var2];
                        var10000.c += 2;
                    } else {
                        ++var1.u[var2].c;
                    }

                    if (var1.u[var2].c > var1.r + (var1.i ? 10 : 0)) {
                        var1.u[var2].c = 0;
                    }
                }
            }

            if (!this.j && this.f == 1) {
                if (this.v.c == -1) {
                    this.v.a = this.w.a = this.x.a = this.c[this.a - 1].a;
                    this.v.b = this.w.b = this.x.b = this.c[this.a - 1].b;
                    this.v.c = 0;
                    this.s = -1;
                }

                var2 = this.x.a - this.w.a;
                var3 = this.x.b - this.w.b;
                if (this.s > 0) {
                    --this.s;
                }

                if ((this.s <= 0 || this.i) && main.GameGraphic.l % 2 == 1) {
                    if (awClass.f(var2) > 0) {
                        if (var2 > 0) {
                            --this.x.a;
                        } else {
                            ++this.x.a;
                        }

                        this.c[this.a - 1].a = this.x.a;
                    }
                    if (awClass.f(var3) > 0) {
                        if (var3 > 0) {
                            --this.x.b;
                        } else {
                            ++this.x.b;
                        }
                        this.c[this.a - 1].b = this.x.b;
                    }
                }

                if (awClass.f(var2) <= 0 && awClass.f(var3) <= 0) {
                    this.s = 50 + awClass.e(100);
                    this.w.a = this.v.a + 10 - awClass.e(20);
                    this.w.b = this.v.b + awClass.e(6);
                }
            }

            if (this.b.K == 0) {
                this.n = 1;
            } else {
                this.n = -1;
            }

            for (int var9 = 0; var9 < this.a; ++var9) {
                var2 = this.c[var9].a - this.b.aw;
                if (var9 != this.a - 2 || awClass.f(this.d[var9].a - (this.b.aw + this.n * var2)) > 1) {
                    this.d[var9].a = this.b.aw * gy.Y + this.n * var2;
                }
                this.d[var9].b = this.c[var9].b;
            }

        }
    }

    public final void a(Graphics var1) {
        if (!this.k && this.g == -1) {
            if (gy.Y > 1) {
                var1.translate(0, this.b.ax);
            }

            int var2;
            if (this.f != 0 && !this.j && this.u[0].a > 0 && this.u[0].a > do1.a().a && this.u[0].a < do1.a().a + main.GameGraphic.width) {
                var1.setColor(l[ir.j]);
                for (var2 = 0; var2 < 2; ++var2) {
                    var1.drawRoundRect(this.u[var2].a - this.u[var2].c / 2, this.u[var2].b - this.u[var2].c / 4, this.u[var2].c, this.u[var2].c / 2, this.u[var2].c, this.u[var2].c);
                }
            }

            var1.setColor(8685448);
            if (this.d[0].a > do1.a().a && this.d[0].a < do1.a().a + main.GameGraphic.width
                    || this.d[this.a - 1].a > do1.a().a && this.d[this.a - 1].a < do1.a().a + main.GameGraphic.width) {
                for (var2 = 0; var2 < this.a - 1 - this.f; ++var2) {
                    if (this.d[var2 + 1].b < this.b.ax + this.b.h + 20) {
                        var1.drawLine(this.d[var2].a, this.d[var2].b, this.d[var2 + 1].a, this.d[var2 + 1].b);
                    }
                }

                if (this.f == 0 && this.d[this.a - 1].b < this.b.ax + this.b.h + 10) {
                    je.a(this.d[this.a - 1].a, this.d[this.a - 1].b, 2, 2, 0, var1);
                }

                int var10002 = this.d[this.a - 2].a;
                int var10003 = this.d[this.a - 2].b;
                var1.drawImage(kv.b().a, var10002, var10003, 3);
                if (this.j && this.h > 0) {
                    int var10001 = 0 + this.A / 3;
                    var10002 = this.d[this.a - 2].a + 2;
                    var10003 = this.d[this.a - 2].b + 4;
                    kv.b().b.a(var10001, var10002, var10003, 0, 24, var1);
                    iw var3;
                    if (main.GameGraphic.l % 10 > 5 && (var3 = (iw) fxClass.a((short) this.h)) != null) {
                        var3.a(var1, this.b.aw * gy.Y, this.b.ax - 55 * gy.Y, 3);
                    }
                }
            }

            if (gy.Y > 1) {
                var1.translate(0, -this.b.ax);
            }

        }
    }
}
