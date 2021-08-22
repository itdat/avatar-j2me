package avatar;

import javax.microedition.lcdui.Graphics;

public final class hl extends gx {

    public byte a;
    public byte b;
    private byte h = 10;
    private byte i = -1;
    private byte j = -1;
    private byte k;
    private byte l = 6;
    public short c;
    public short d;
    public short[] e;
    public short[] f;
    public int g;
    private int m = 0;

    public hl(jz var1) {
    }

    public final void b() {
        ++this.k;
        if (this.k >= 10) {
            this.k = 0;
        }

        if (this.l < 9) {
            ++this.l;
        }

        ++this.m;
        if (this.m >= 6) {
            this.m = 0;
        }

        ++super.y;
        if (super.y == 12) {
            super.y = 0;
        }

        if (super.aw < (ir.e + 1) * ir.i) {
            if (this.e != null && this.b < this.e.length && cz.b().e <= 0) {
                super.aw += this.f[this.b];
                if (this.f[this.b] == 0) {
                    super.H = 2;
                } else {
                    super.H = 1;
                }

                --this.e[this.b];
                if (this.e[this.b] <= 0) {
                    ++this.b;
                    if (this.b < this.f.length) {
                        if (this.l == 9 && this.f[this.b] == 0) {
                            this.l = 0;
                        } else if (this.i == -1 && this.f[this.b] == 2) {
                            this.i = 20;
                        } else if (this.j == -1 && this.f[this.b] == 5) {
                            this.j = 20;
                        }
                    }
                }
            } else {
                super.H = 0;
                if (this.f != null && cz.b().e <= 0) {
                    super.aw += this.f[this.f.length - 1];
                }

                if (this.h == 10 && this.e != null && this.b >= this.e.length) {
                    cz var10001 = cz.b();
                    byte var10003 = var10001.f;
                    var10001.f = (byte) (var10003 + 1);
                    this.h = var10003;
                }
            }
            if (this.i >= 0) {
                --this.i;
            }
            if (this.j >= 0) {
                --this.j;
            }
        }

    }

    public final void a(Graphics var1) {
        f var2;
        if ((var2 = fxClass.c(this.c)).d != -1) {
            int var3 = var2.c / 5;
            var1.drawRegion(var2.a, 0, cz.m[super.H][super.y] * var3, var2.b, var3, 0, super.aw * js.ay, super.ax * js.ay, 33);
            if (cz.b().d && this.g > 0) {
                main.GameGraphic.M.a(var1, "" + this.g, super.aw * js.ay - var2.b / 2 - 8 * js.ay, super.ax * js.ay - gy.af / 2 - 3 * js.ay, 1);
            }

            if (this.i >= 0) {
                var1.drawImage(cz.h, super.aw * js.ay + var2.b / 2, super.ax * js.ay - var3, 33);
            }

            if (this.l < 9) {
                var1.drawImage(cz.k[this.l / 3], super.aw * js.ay, super.ax * js.ay, 3);
            }

            if (this.j >= 0) {
                var1.drawImage(cz.i, super.aw * js.ay + var2.b / 2, super.ax * js.ay - var3, 33);
                var1.drawImage(cz.j[this.k / 2], super.aw * js.ay - var2.b / 2, super.ax * js.ay, 3);
            }

            if (super.w == do1.a().h.w) {
                var1.drawImage(aeClass.d, super.aw * js.ay, super.ax * js.ay - var3 - this.m / 2 - 10 * js.ay, 3);
            }
        }
    }
}
