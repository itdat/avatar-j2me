package avatar;

public final class do1 {

    private static do1 i;
    public int a;
    public int b;
    public int c;
    public int d;
    private int j;
    private int k;
    public long e;
    private int l;
    private int m;
    private int n;
    private int o;
    private static int p;
    private static int q;
    public static boolean f = false;
    public static boolean g;
    public gx h;

    public static do1 a() {
        if (i == null) {
            i = new do1();
        }

        return i;
    }

    public static void a(int var0) {
        p = var0;
    }

    public final void b(int var1) {
        if (this.h != null) {
            label56:
            {
                g = false;
                q = ir.i * gy.Y;
                p = main.GameGraphic.width / 10;
                if (this.h.aw * gy.Y > main.GameGraphic.o) {
                    if (this.h.aw * gy.Y < ir.e * q - main.GameGraphic.o - q) {
                        this.c = this.h.aw * gy.Y - main.GameGraphic.o;
                        break label56;
                    }

                    this.c = ir.e * q - main.GameGraphic.width;
                    if (this.c >= 0) {
                        break label56;
                    }
                }

                this.c = 0;
            }

            if (main.GameGraphic.width > ir.e * q) {
                this.c = -(main.GameGraphic.width - ir.e * q) / 2;
            }

            if (main.GameGraphic.height > ir.f * q && (var1 - 1 == 57 || var1 - 1 == 58 || var1 - 1 == 59 || var1 - 1 == 108)) {
                this.d = -(main.GameGraphic.height - ir.f * q) / 2;
            } else {
                this.d = ir.f * q - main.GameGraphic.height;
            }

            this.j = ir.e * q - main.GameGraphic.width;
            this.k = ir.f * q - main.GameGraphic.height;
            this.a = this.c;
            if (this.a < 0) {
                this.a = 0;
            }

            if (this.a > this.j) {
                this.a = this.j;
            }

            if (this.b > this.k) {
                this.b = this.k;
            }

            if (this.d > this.k) {
                this.d = this.k;
            }

        }
    }

    public final void b() {
        this.a = this.c;
        this.b = this.d;
    }

    public final void c() {
        if (!f) {
            if (this.a != this.c) {
                this.l = this.c - this.a << 1;
                this.m += this.l;
                this.a += this.m >> 4;
                this.m &= 15;
                if (this.a < 0) {
                    this.a = 0;
                }

                if (this.a > this.j) {
                    this.a = this.j;
                }
            }
        } else {
            if (this.a < 0) {
                this.a = 0;
            }

            if (this.a > ir.e * ir.i * gy.Y - main.GameGraphic.width) {
                this.a = ir.e * ir.i * gy.Y - main.GameGraphic.width;
            }
        }

        if (this.b != this.d) {
            this.n = this.d - this.b << 1;
            this.o += this.n;
            this.b += this.o >> 4;
            this.o &= 15;
            if (this.b > this.k) {
                this.b = this.k;
            }
        }

    }

    public final void a(int var1, int var2) {
        this.e = 0L;
        this.c = var1 - main.GameGraphic.o;
        this.d = var2 - main.GameGraphic.p;
        if (this.c < 0) {
            this.c = 0;
        }

        if (this.c > ir.e * q - main.GameGraphic.width) {
            this.c = ir.e * q - main.GameGraphic.width;
        }

        if (this.d > ir.f * q - main.GameGraphic.height) {
            this.d = ir.f * q - main.GameGraphic.height;
        }

        this.e();
    }

    public final void b(int var1, int var2) {
        this.a = this.c = 0;
        this.b = this.d = 0;
    }

    public final void d() {
        this.c();
        if (System.currentTimeMillis() / 100L - this.e >= 20L && !g) {
            int var1;
            if (this.h.K == 0) {
                var1 = this.h.aw * gy.Y + p;
            } else {
                var1 = this.h.aw * gy.Y - p;
            }

            this.c = var1 - main.GameGraphic.o;
            this.d = (this.h.ax + this.h.N) * gy.Y - (main.GameGraphic.height - (main.GameGraphic.p - q));
            if (this.h.K == gx.J) {
                if (this.h.aw * gy.Y < main.GameGraphic.o) {
                    this.c = 0;
                }
            } else if (this.h.aw * gy.Y > ir.e * q - main.GameGraphic.o) {
                this.c = ir.e * q - main.GameGraphic.width;
            }

            this.e();
        }
    }

    private void e() {
        if (ir.a >= 0 && ir.a < ir.h.length && ir.h[ir.a] == -1 && ir.b == null && main.GameGraphic.height > ir.f * q) {
            this.b = this.d = -(main.GameGraphic.height - ir.f * q) / 2;
        }

        if (main.GameGraphic.width > ir.e * q) {
            this.a = this.c = -(main.GameGraphic.width - ir.e * q) / 2;
        }

    }
}
