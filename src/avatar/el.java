package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public final class el extends hj {

    public static el a;
    public static ht b;
    private Vector d;
    public static String c;
    private int e;
    private int f;
    private Button g;
    private Button h;
    private int i = 0;

    public static el b() {
        if (a == null) {
            a = new el();
        }
        return a;
    }

    public final void a() {
        main.GameGraphic.S.h();
        super.a();
        super.ae = this.h;
        if (main.GameGraphic.Z == 0) {
            super.ad = new Button(StringEntity.CHOOSE, 3);
        } else {
            super.ad = new Button(StringEntity.i, 1);
        }

        super.aj = true;
        this.e();
        jy.b();
        this.e = this.i;
        main.GameGraphic.y.a(this.e);
    }

    public el() {
        this.e();
        this.c();
    }

    public final void d(int var1, int var2) {
        switch (var1) {
            case 1:
                main.GameGraphic.i();
                ie.a().c();
                return;
            case 2:
                main.GameGraphic.i();
                ie.a().b();
                return;
            case 3:
                main.GameGraphic.i();
                cx.getInstance().a(GameMidlet.i.w);
            default:
        }
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                Vector var3;
                (var3 = new Vector()).addElement(new Button(StringEntity.i, 1));
                var3.addElement(new Button(StringEntity.f, 2));
                if (main.GameGraphic.Z == 0) {
                    var3.addElement(aeClass.getInstance().f);
                }

                var3.addElement(new Button(StringEntity.am, 3));
                le.getInstance().a(var3, 0);
                return;
            case 1:
                this.f();
                return;
            case 2:
                cx.getInstance().d((int) 9);
                main.GameGraphic.i();
                return;
            case 3:
                this.f();
            default:
        }
    }

    public final void c() {
        this.g = new Button(StringEntity.MENU, 0);
        new Button(StringEntity.CHOOSE, 1);
        this.h = new Button(StringEntity.CLOSE, 2);
        super.ac = this.g;
        super.ae = this.h;
    }

    public static void a(int var0, kx var1) {
        if (!jy.b) {
            c = StringEntity.ek[var0];
        } else {
            c = StringEntity.eA[var0];
        }

        kn.d = var1;
    }

    public final void e() {
        if (main.GameGraphic.Z == 0) {
            this.f = 50;
            this.i = 1;
        } else {
            if (main.GameGraphic.Z == 1) {
                this.f = 80;
            } else if (main.GameGraphic.Z == 2) {
                this.f = 150;
            }

            this.i = main.GameGraphic.width / this.f;
        }

        if (this.d != null) {
            if (this.f != 0) {
                if (main.GameGraphic.Z == 0) {
                    main.GameGraphic.y.a(0, main.GameGraphic.width < 200 ? this.f / 2 : 50, main.GameGraphic.width, this.f, main.GameGraphic.width, this.d.size() * this.f, main.GameGraphic.width, main.GameGraphic.height - (main.GameGraphic.width < 200 ? this.f / 2 : 50) - 4, this.d.size());
                } else {
                    main.GameGraphic.y.a((main.GameGraphic.width - this.f * this.i) / 2, 50 * gy.Y, this.f, this.f, main.GameGraphic.width, (this.d.size() / this.i + 2) * this.f, main.GameGraphic.width, main.GameGraphic.height - 50 * gy.Y - 4, this.d.size());
                }

                main.GameGraphic.y.a(this.e);
            }

        }
    }

    private void f() {
        byte var1;
        if ((var1 = ((be) this.d.elementAt(this.e)).a) != -1) {
            ie.a().a(var1);
            main.GameGraphic.i();
        }
    }

    public final void a(Graphics var1) {
        this.b(var1);
        jy.a(var1, super.ac, super.ad, super.ae);
        main.GameGraphic.b(var1);
    }

    public final void b(Graphics var1) {
        main.GameGraphic.S.b(var1);
        a(var1, "Phòng " + c);
        main.GameGraphic.S.a(var1, this.d, this.f, this.e);
    }

    public static void a(Graphics var0, String var1) {
        main.GameGraphic.S.b(var0);
        if (main.GameGraphic.width > 200) {
            main.GameGraphic.S.e(var0, main.GameGraphic.o - 100 * gy.Y, 5 * gy.Y - ho.i, 200 * gy.Y, 44 * gy.Y);
            CsInterface var2 = main.GameGraphic.O;
            if (main.GameGraphic.Z == 0) {
                var2 = main.GameGraphic.L;
            }
            var2.a(var0, var1, main.GameGraphic.o, 5 * gy.Y - ho.i + 22 * gy.Y - var2.getLastByte() / 2, 2);
        }
    }

    public final void a(Vector var1) {
        for (int var2 = 0; var2 < var1.size(); ++var2) {
            be var3 = (be) var1.elementAt(var2);
            for (int var4 = var2; var4 < var1.size(); ++var4) {
                be var5;
                if ((var5 = (be) var1.elementAt(var4)).c < var3.c) {
                    var1.setElementAt(var3, var4);
                    var1.setElementAt(var5, var2);
                    var3 = var5;
                }
            }
        }

        this.d = new Vector();
        byte var6 = -1;

        for (int var7 = 0; var7 < var1.size(); ++var7) {
            be var8 = (be) var1.elementAt(var7);
            if (var6 == -1 || var8.c != var6) {
                this.d.addElement(new be((byte) -1, (byte) 0, (byte) 0, var8.c));
            }
            this.d.addElement(var8);
            var6 = var8.c;
        }

        if (main.GameGraphic.Z != 0) {
            this.g();
        }
        this.e = 1;
        this.e();
    }

    private boolean g() {
        for (int var1 = 0; var1 < this.d.size(); ++var1) {
            be var2;
            if ((var2 = (be) this.d.elementAt(var1)).a == -1) {
                int var3;
                int var4;
                if ((var3 = this.i - var1 % this.i) != this.i) {
                    for (var4 = 0; var4 < var3; ++var4) {
                        this.d.insertElementAt(new be((byte) -2, (byte) 0, (byte) 0, var2.c), var1);
                    }
                    var1 += var3;
                }

                for (var4 = 0; var4 < this.i - 1; ++var4) {
                    this.d.insertElementAt(new be((byte) -2, (byte) 0, (byte) 0, var2.c), var1 + 1);
                }
                var1 += this.i;
            }
        }

        return false;
    }

    public final void a(int var1, boolean var2) {
        if (var2 && this.e == var1) {
            this.f();
        }

        if (main.GameGraphic.Z == 0) {
            if (this.e > 0 && this.e < this.d.size()) {
                be var3;
                if ((var3 = (be) this.d.elementAt(var1)).a != -1 && var3.a != -1) {
                    if (var1 >= 0 && var1 < this.d.size()) {
                        this.e = var1;
                    }
                } else if (var1 > this.e) {
                    this.e = var1 + this.i;
                } else {
                    this.e = var1 - this.i;
                }

                main.GameGraphic.y.a(this.e);
                if (this.e <= 0) {
                    this.e = this.d.size() - 1;
                    main.GameGraphic.y.a(this.e);
                }
            }
        } else {
            this.e = var1;
        }

    }

    public final void l() {
        if (main.GameGraphic.Z != 0) {
            main.GameGraphic.S.a(super.ac, super.ad, super.ae);
        } else {
            super.l();
        }
    }

    public final void k() {
    }
}
