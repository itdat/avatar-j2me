package avatar;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cp {

    private String a = "";
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f = false;
    private Image g;
    private byte h;
    private byte i = -1;
    private short j = -1;
    private short k = -1;

    public cp(int var1, int var2, int var3, int var4, Image var5, int var6, int var7, int var8) {
        this.e = var6;
        this.h = (byte) var4;
        this.b = var1;
        this.c = var2;
        if (var3 > 0) {
            this.a = "+";
        }

        this.a = this.a + var3;
        if (var3 == 0) {
            this.a = "";
        }

        this.g = var5;
        this.f = false;
        this.i = -1;
        this.j = (short) var7;
        this.k = (short) var8;
    }

    public cp(int var1, int var2, String var3, int var4, int var5, int var6) {
        this.e = var6;
        this.h = (byte) var4;
        this.b = var1;
        this.c = var2;
        this.a = var3;
        this.d = 0;
        this.f = true;
        this.i = (byte) var5;
        this.j = -1;
        this.k = -1;
    }

    public final void a() {
        if (this.e > 0) {
            --this.e;
        } else {
            ++this.d;
            if (this.d > 40) {
                this.g = null;
                main.GameGraphic.ac.removeElement(this);
            }

            if (this.d < 3) {
                this.c += -2 * this.h;
            } else {
                this.c += this.h;
            }
        }
    }

    public final void a(Graphics var1) {
        if (main.GameGraphic.r == cz.a) {
            main.GameGraphic.c(var1);
        }

        if (this.e <= 0) {
            int var2 = gy.Y;
            if (main.GameGraphic.r == kx.i && (kx.j || kx.k) || main.GameGraphic.r == cz.a) {
                var2 = 1;
            }

            CsInterface var3 = main.GameGraphic.O;
            if (this.f) {
                if (this.i == 0) {
                    var3 = main.GameGraphic.P;
                } else {
                    byte var10000 = this.i;
                    boolean var10001 = true;
                    var3 = main.GameGraphic.L;
                }
            }

            var3.a(var1, this.a, this.b * var2, this.c * var2, 2);
            if (this.g == null) {
                if (this.j != -1) {
                    gb.a(var1, this.j, this.b * var2, (this.c - 5) * var2, 33);
                    return;
                }

                if (this.k != -1) {
                    fxClass.a(var1, this.k, this.b * var2, (this.c - 5) * var2, 33);
                    return;
                }
            } else if (!this.f) {
                var1.drawImage(this.g, this.b * var2, this.c * var2, 33);
            }

        }
    }
}
