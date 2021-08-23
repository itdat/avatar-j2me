package avatar;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class jp extends hj {

    public static jp a;
    public static byte b = 0;
    public static byte c = 1;
    public static byte d = 2;
    public static byte e;
    public static ht f;
    private static Image k;
    private static Image l;
    private static Image m;
    private static Image n;
    private int o;
    Vector g;
    private int p;
    private int q;
    public byte h;
    private short r;
    private Button s;
    public static Image i;
    int j;

    static {
        e = c;
    }

    public static jp b() {
        return a == null ? (a = new jp()) : a;
    }

    public final void a() {
        jy.f();
        hj.z();
        super.ar = 0;
        main.GameGraphic.S.b(e);
        if (k == null) {
            try {
                k = Image.createImage(StringEntity.a() + "/on/imgkhungsoban.on");
                l = Image.createImage(StringEntity.a() + "/on/imgNumPlayer.on");
                m = Image.createImage(StringEntity.a() + "/on/imgPlay.on");
                n = Image.createImage(StringEntity.a() + "/on/imgLock.on");
            } catch (IOException var2) {
                var2.printStackTrace();
            }
        }

        main.GameGraphic.J = 1;
        super.aj = true;
        GameMidlet.i.L = false;
        super.a();
    }

    public jp() {
        this.s = new Button(StringEntity.CHOOSE, 1);
        super.ae = new Button(StringEntity.CLOSE, 2);
        if (main.GameGraphic.Z != 0) {
            super.ad = new Button(StringEntity.i, 5);
        } else {
            super.ad = this.s;
        }

        super.ac = new Button(StringEntity.MENU, 6);
        this.r = (short) (110 * gy.Y);
        if (main.GameGraphic.Z == 1) {
            this.r = 95;
        } else if (main.GameGraphic.Z == 0) {
            this.r = (short) (main.GameGraphic.width / 4);
            if (this.r < 70) {
                this.r = (short) (main.GameGraphic.width / 3);
            }

            if (main.GameGraphic.width < 180) {
                this.r = (short) (main.GameGraphic.width / 2);
            }
        }

        this.o = main.GameGraphic.width / this.r + 1;
        if (this.o * this.r > main.GameGraphic.width - this.r / 2) {
            --this.o;
        }

        this.p = this.r / 2;
        this.q = this.r / 2;
        this.q += 10;
        if (main.GameGraphic.width > this.o * this.r) {
            this.p = (main.GameGraphic.width - this.o * this.r) / 2 + this.r / 2;
        }

    }

    public final void d() {
        main.GameGraphic.i();
        i();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 1:
                dl var4 = (dl) this.g.elementAt(super.ar);
                if (aeClass.u && var4.f > GameMidlet.i.a[3]) {
                    b().f();
                } else {
                    if (!var4.d) {
                        ie.a().a(this.h, var4.a, "");
                        main.GameGraphic.i();
                        return;
                    }

                    main.GameGraphic.u.a(StringEntity.X, new cn(this), 2);
                }
                break;
            case 2:
                i();
                return;
            case 3:
                this.d(1, -1);
                return;
            case 4:
                this.h();
                return;
            case 5:
                main.GameGraphic.i();
                ie.a().c();
                return;
            case 6:
                Vector var3;
                (var3 = new Vector()).addElement(new Button(StringEntity.i, 5));
                var3.addElement(new Button("Đến bàn", 6));
                var3.addElement(aeClass.getInstance().f);
                var3.addElement(new Button(StringEntity.am, 7));
                le.getInstance().a(var3, 0);
        }

    }

    public final void d(int var1, int var2) {
        switch (var1) {
            case 1:
                main.GameGraphic.c(StringEntity.PLEASE_WAIT);
                ie.a().a(this.h);
                return;
            case 3:
                main.GameGraphic.i();
                cx.getInstance().a(GameMidlet.i.w);
                return;
            case 4:
                i();
                return;
            case 5:
                main.GameGraphic.i();
                ie.a().c();
                return;
            case 6:
                this.h();
                return;
            case 7:
                main.GameGraphic.i();
                cx.getInstance().a(GameMidlet.i.w);
            case 2:
            default:
        }
    }

    private void h() {
        main.GameGraphic.u.a(StringEntity.an, new ck(this), 3);
    }

    protected final void e() {
        main.GameGraphic.u.a(StringEntity.ap, new cj(this), 0);
    }

    public final void f() {
        main.GameGraphic.a("Hiện tại bạn không đủ Xèng để tham gia màn chơi, bạn có muốn nạp thêm Xèng không?", (Intent) (new cl(this)));
    }

    private static void i() {
        main.GameGraphic.y.m = false;
        ie.a().b();
        main.GameGraphic.i();
    }

    public final void a(Graphics var1) {
        main.GameGraphic.c(var1);
        el.a(var1, "Phòng " + el.c + " " + this.h);
        this.c(var1);
        jy.a(var1, super.ac, super.ad, super.ae);
        main.GameGraphic.b(var1);
    }

    private void c(Graphics var1) {
        var1.translate(this.p, this.q);
        var1.translate(0, -ho.i);
        int var2;
        if ((var2 = ho.i / this.r * this.o - this.o) < 0) {
            var2 = 0;
        }

        int var3;
        if ((var3 = var2 + main.GameGraphic.height / this.r * this.o + (this.o << 1) + this.o) > this.g.size()) {
            var3 = this.g.size();
        }

        for (var2 = var2; var2 < var3; ++var2) {
            int var4 = var2 % this.o * this.r;
            int var5 = var2 / this.o * this.r;
            dl var6 = (dl) this.g.elementAt(var2);
            if ((!main.GameGraphic.H || !super.aj) && var2 == super.ar) {
                var1.drawImage(i, var4, var5, 3);
            }

            f.a(var6.b, var4, var5, 0, 3, var1);
            var1.drawImage(k, var4 - this.r / 4, var5 - 30 * gy.Y, 3);
            main.GameGraphic.Q.a(var1, "" + var6.a, var4 - this.r / 4, var5 - 30 * gy.Y - gy.ai / 2, 2);
            if (var6.f > 0) {
                main.GameGraphic.Q.a(var1, var6.g, var4, var5 - 30 * gy.Y - gy.ai / 2, 2);
            }

            if (e == c && var6.c < 4) {
                var1.drawImage(l, var4 + this.r / 4, var5 - 30 * gy.Y, 3);
                main.GameGraphic.P.a(var1, "" + var6.c, var4 + this.r / 4, var5 - 30 * gy.Y - gy.ai / 2, 2);
            }

            if (var6.e) {
                var1.drawImage(l, var4 - this.r / 4, var5 + this.r / 3, 3);
                var1.drawImage(m, var4 - this.r / 4, var5 + this.r / 3, 3);
            }

            if (var6.d) {
                var1.drawImage(l, var4 + this.r / 4, var5 + this.r / 3, 3);
                var1.drawImage(n, var4 + this.r / 4, var5 + this.r / 3, 3);
            }
        }

    }

    public final void l() {
        if (jy.b && main.GameGraphic.Z != 0) {
            main.GameGraphic.S.a(super.ac, super.ad, super.ae);
        } else {
            super.l();
        }
    }

    public final void a(Vector var1) {
        this.g = var1;
    }

    public final void g() {
        int var1 = this.g.size() / this.o;
        if (this.g.size() % this.o != 0) {
            ++var1;
        }

        this.q = 100 * gy.Y;
        if (main.GameGraphic.width < 200) {
            this.q = 50;
        }

        main.GameGraphic.y.a(this.p - this.r / 2, this.q - this.r / 2, this.r, this.r, this.o * this.r, var1 * this.r + 10, this.o * this.r, main.GameGraphic.height - (this.q - this.r / 2) - 4, this.g.size());
    }

    public final void a(int var1, boolean var2) {
        if (var2 && super.ar == var1 && this.s != null) {
            this.s.b();
        }

        if (var1 >= 0 && var1 < this.g.size()) {
            super.a(var1, var2);
        }

    }

    public final void k() {
    }
}
