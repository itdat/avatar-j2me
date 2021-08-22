package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameGraphic;

public final class ax {

    public byte a;
    public byte b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public int[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public ax(byte var1, boolean var2) {
        this(var1);
        if (var2) {
            this.h = new int[]{11, 12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        }

    }

    public ax(byte var1) {
        this.b = var1;
        this.a = 0;
        this.i = this.b % 4;
        this.j = this.b / 4;
        this.k = this.i < 2 ? 0 : 1;
        this.h = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    }

    public final void a(Graphics var1) {
        main.GameGraphic.S.a(var1, this);
    }

    public final void b(Graphics var1) {
        GameGraphic.S.b(var1, this);
    }

    public final void c(Graphics var1) {
        main.GameGraphic.S.c(var1, this);
    }

    public final void a(Graphics var1, boolean var2) {
        main.GameGraphic.S.a(var1, this, var2);
    }

    public final int a() {
        if (this.c == this.m && this.d == this.l) {
            return -1;
        } else if (Math.abs((this.m - this.c) / 2) <= 1 && Math.abs((this.l - this.d) / 2) <= 1) {
            this.c = this.m;
            this.d = this.l;
            return 0;
        } else {
            if (this.c != this.m) {
                this.c += (this.m - this.c) / 2;
            }

            if (this.d != this.l) {
                this.d += (this.l - this.d) / 2;
            }

            return awClass.a(this.c, this.d, this.m, this.l) <= this.e / 5 ? 2 : 1;
        }
    }
}
