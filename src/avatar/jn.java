package avatar;

import java.util.Hashtable;
import java.util.Vector;
import main.GameMidlet;

public final class jn {

    public static boolean a;

    public static void a(String var0) {
        main.GameGraphic.showAlert(var0);
    }

    public static void a() {
        lf.a();
        if (fxClass.d == -1) {
            iy.a().b();
        } else {
            aeClass.getInstance().t();
        }

        iy.a().e(GameMidlet.i.w);
        fxClass.h = new Hashtable();
        fxClass.i = new Hashtable();
    }

    public final void a(String var1, String var2) {
        dv var4 = new dv(this, var2);
        Vector var3;
        (var3 = new Vector()).addElement(new Button(StringEntity.OK, var4));
        var3.addElement(new Button(StringEntity.CLOSE, new dw(this)));
        main.GameGraphic.s.a(false);
        main.GameGraphic.a(var1, var3);
        a = true;
    }

    public final void a(String var1, boolean var2) {
        if (var2) {
            main.GameGraphic.b(var1, new dq(this));
        } else {
            main.GameGraphic.showAlert(var1);
        }
    }

    public static void a(byte var0) {
        if (GameMidlet.e == 9) {
            a = false;
        }

        System.out.println("doGetHandler: " + var0 + "    " + aeClass.g);
        if (ce.a().a != null) {
            switch (var0) {
                case 3:
                    kn.a();
                    aeClass.getInstance();
                    aeClass.m();
                case 4:
                case 5:
                case 6:
                case 7:
                default:
                    break;
                case 8:
                    aeClass.getInstance().y = true;
                    lf.a();
                    if (aeClass.D != -1) {
                        cx.getInstance().j(aeClass.D);
                        aeClass.D = -1;
                    } else if (aeClass.g != -1) {
                        main.GameGraphic.x.e(57 + aeClass.g);
                        if (main.GameGraphic.I && ir.a == 57) {
                            (main.GameGraphic.D = new bb()).b(aeClass.INST);
                        }

                        GameMidlet.i.e(4);
                        main.GameGraphic.h();
                    } else {
                        aeClass.getInstance().t();
                        main.GameGraphic.h();
                    }
                    break;
                case 9:
                    eo.a();
                    if (ir.H == -1) {
                        if (!jy.b) {
                            if (GameMidlet.e == 12) {
                                ir.i = 24;
                                ir.t = -1;
                                bf.a().doJoinPark(aeClass.m, -1);
                            } else if (GameMidlet.e == 3) {
                                main.GameGraphic.S.i();
                                bf.a().doJoinPark(aeClass.m, -1);
                            } else if (aeClass.g != -1) {
                                aeClass.getInstance();
                                aeClass.x();
                            } else if (aeClass.G != -1) {
                                main.GameGraphic.i();
                                bf.a().doJoinPark(aeClass.G, -1);
                                aeClass.G = -1;
                            } else {
                                aeClass.getInstance().s();
                            }
                        } else {
                            main.GameGraphic.S.i();
                            jy.e().a();
                            main.GameGraphic.h();
                        }
                    } else {
                        ir.y = -1;
                    }
                    break;
                case 10:
                    if (kz.a == null) {
                        kz.a = new kz();
                    }

                    ce.a().a = kz.a;
                    if (gb.h == -1) {
                        Farm var2;
                        (var2 = Farm.getInstance()).e((byte) 51);
                        var2.c(fxClass.l);
                        var2.k();
                    } else if (go.f == null) {
                        Farm.getInstance().d();
                    } else {
                        bf.a().doJoinPark(25, 0);
                        go.e();
                        go.getInstance().b(GameMidlet.i.w, false);
                    }
                    break;
                case 11:
                    df.a();
                    ir.a = -1;
                    bf.a().doJoinPark(21, 0);
                    if (aeClass.v != -1) {
                        main.GameGraphic.i();
                        iy.a().c((int) 0);
                    }
                    break;
                case 12:
                    if (jz.a == null) {
                        jz.a = new jz();
                    }

                    ce.a().a = jz.a;
                    cx var1 = cx.getInstance();
                    main.GameGraphic.i();
                    var1.e((byte) 1);
                    var1.k();
            }
        }

        GameMidlet.e = var0;
    }

    public final void a(int var1, byte var2, String[] var3, String var4, String var5, boolean[] var6) {
        if (main.GameGraphic.t != null) {
            main.GameGraphic.t = null;
        }

        main.GameGraphic.h();
        Vector var7 = new Vector();

        for (int var8 = 0; var8 < var3.length; ++var8) {
            var7.addElement(new Button(var3[var8], new hh(this, var8, var1, var2)));
        }

        if (var4 != null) {
            gp.a().a(var7, var1, var4, var5, var6);
        } else {
            le.getInstance().a(var7, 0);
        }
    }

    public final void a(byte var1, byte var2, String var3) {
        if (var2 == 0) {
            main.GameGraphic.a(var3, (Intent) (new ds(this, var1)));
        } else {
            main.GameGraphic.showAlert(var3);
        }
    }
}
