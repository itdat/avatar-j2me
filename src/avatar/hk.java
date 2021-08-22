package avatar;

import javax.microedition.lcdui.Graphics;

public final class hk extends hj {

    public static hk a;
    private int[] b;
    private hj c;
    private int d = 5;
    private int e;
    private int f = 7;

    public static hk b() {
        if (a == null) {
            a = new hk();
        }

        return a;
    }

    public final void a(hj var1) {
        super.a();
        this.c = var1;
        super.ar = 0;
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                main.GameGraphic.y.m = false;
                this.c.a();
                return;
            case 1:
                main.GameGraphic.y.m = false;
                this.c.a();
                bf.a().doJoinPark(aeClass.b, super.ar);
            default:
        }
    }

    public hk() {
        super.ae = new Button(StringEntity.CLOSE, 0);
        super.ad = new Button(StringEntity.CHOOSE, 1);
        this.e = 20;
        if (main.GameGraphic.Z > 0) {
            this.e = main.GameGraphic.Z * 30;
        }

        if (main.GameGraphic.width < 176) {
            this.e = 15;
        }

        if (this.f * this.e > main.GameGraphic.height - main.GameGraphic.T) {
            this.f = (main.GameGraphic.height - main.GameGraphic.T) / this.e;
        }

    }

    public final void a(int var1, boolean var2) {
        if (var2 && super.ar == var1 && super.ad != null) {
            super.ad.b();
        }

        super.a(var1, var2);
    }

    public final void a(int[] var1) {
        this.b = var1;
        main.GameGraphic.y.a(main.GameGraphic.o - (this.e * this.d + 10) / 2 + 4, main.GameGraphic.p - this.e * this.f / 2, this.e, this.e, this.d * this.e, this.b.length / this.d * this.e, this.e * this.d, this.e * this.f - (main.GameGraphic.Z == 0 ? 30 : 0), var1.length);
    }

    public final void l() {
        super.l();
    }

    public final void k() {
        this.c.k();
    }

    public final void a(Graphics var1) {
        var1.translate(0, 0);
        var1.setClip(0, 0, main.GameGraphic.width, main.GameGraphic.height);
        this.c.b(var1);
        main.GameGraphic.S.a(var1, main.GameGraphic.o - (this.e * this.d + 10) / 2, main.GameGraphic.p - this.e * this.f / 2, this.e * this.d + 10, this.e * this.f);
        main.GameGraphic.S.a(var1, this.e, this.d, this.f, super.aj, super.ar, this.b);
        super.a(var1);
    }
}
