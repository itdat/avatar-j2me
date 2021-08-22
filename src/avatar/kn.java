package avatar;

import java.util.Vector;
import main.GameMidlet;

public final class kn extends kj implements kk {

    public static kn a = new kn();
    public kk c;
    public static kx d;

    public static void a() {
        ce.a().a = a;
    }

    public final void a(IOStream var1) {
        try {
            int var2;
            int var5;
            String var12;
            int var13;
            byte var15;
            byte var16;
            int var17;
            switch (var1.a) {
                case 6:
                    Vector var21 = new Vector();

                    while (var1.getDataInputStream().available() > 0) {
                        be var19;
                        (var19 = new be()).a = var1.getDataInputStream().readByte();
                        var19.b = var1.getDataInputStream().readByte();
                        var1.getDataInputStream().readByte();
                        var19.c = var1.getDataInputStream().readByte();
                        var21.addElement(var19);
                    }

                    el.b().a(var21);
                    el.b().a();
                    main.GameGraphic.h();
                    return;
                case 7:
                    Vector var18 = new Vector();
                    var15 = var1.getDataInputStream().readByte();

                    while (var1.getDataInputStream().available() > 0) {
                        dl var20;
                        (var20 = new dl()).a = var1.getDataInputStream().readByte();
                        var5 = var1.getDataInputStream().readUnsignedByte();
                        var20.b = (byte) (var5 % 16);
                        var20.c = (byte) (var5 / 16);
                        int var22 = var1.getDataInputStream().readUnsignedByte();
                        var20.d = (var22 & 1) != 0;
                        var20.e = (var22 & 2) != 0;
                        var20.f = var1.getDataInputStream().readInt();
                        var20.g = main.GameGraphic.b(var20.f) + StringEntity.k();
                        var18.addElement(var20);
                    }

                    jp.b().h = var15;
                    jp.b().a(var18);
                    jp.b().a();
                    jp.b().g();
                    main.GameGraphic.h();
                    return;
                case 8:
                    main.GameGraphic.J = 0;
                    var15 = var1.getDataInputStream().readByte();
                    var16 = var1.getDataInputStream().readByte();
                    var17 = var1.getDataInputStream().readInt();
                    var5 = var1.getDataInputStream().readInt();

                    Vector var6;
                    hn var7;
                    for (var6 = new Vector(); var1.getDataInputStream().available() > 0; var6.addElement(var7)) {
                        (var7 = new hn()).w = var1.getDataInputStream().readInt();
                        if (var7.w == -1) {
                            var7.a("");
                        } else {
                            if (var7.w == GameMidlet.i.w) {
                                var7 = GameMidlet.i;
                            }

                            var7.a(var1.getDataInputStream().readUTF());
                            var7.b(var1.getDataInputStream().readInt());
                            byte var24 = var1.getDataInputStream().readByte();

                            int var26;
                            for (var26 = 0; var26 < var24; ++var26) {
                                hx var28 = new hx(var1.getDataInputStream().readShort());
                                if (var7.w != GameMidlet.i.w) {
                                    var7.a(var28);
                                }
                            }

                            var26 = var1.getDataInputStream().readInt();
                            var7.d(var26);
                            var7.o = var1.getDataInputStream().readBoolean();
                            var7.d(var26);
                            var7.b(var7.c());
                            var7.X = var1.getDataInputStream().readShort();
                        }
                    }

                    d.a(var15, var16, var17, var5, var6);
                    kd.b().b = true;
                    kx.k = false;
                    int var23 = var6.size();

                    for (int var25 = 0; var25 < var23; ++var25) {
                        hn var27;
                        if ((var27 = (hn) var6.elementAt(var25)).w == var17) {
                            var27.o = true;
                        }

                        if (var27.w == GameMidlet.i.w) {
                            GameMidlet.i.b(var27.c());
                        }
                    }

                    if (jp.e != 0) {
                        byte var10000 = jp.e;
                        byte var10001 = jp.c;
                    }

                    d.p();
                    d.a();
                    kd.b();
                    kd.b(false);
                    main.GameGraphic.h();
                    main.GameGraphic.J = 1;
                    return;
                case 9:
                    var15 = var1.getDataInputStream().readByte();
                    var16 = var1.getDataInputStream().readByte();
                    var17 = var1.getDataInputStream().readInt();
                    var12 = var1.getDataInputStream().readUTF();
                    if (kx.a(var15, var16)) {
                        kx.a(var17, var12);
                        return;
                    }
                    break;
                case 11:
                    var15 = var1.getDataInputStream().readByte();
                    var16 = var1.getDataInputStream().readByte();
                    var13 = var1.getDataInputStream().readInt();
                    main.GameGraphic.v = null;
                    if (kx.a(var15, var16)) {
                        if (var13 == GameMidlet.i.w) {
                            main.GameGraphic.b(StringEntity.H, new cu(this));
                            return;
                        }

                        kx.i.e(var13);
                        return;
                    }
                    break;
                case 12:
                    hn var8 = new hn();
                    byte var9 = var1.getDataInputStream().readByte();
                    var8.w = var1.getDataInputStream().readInt();
                    var8.a(var1.getDataInputStream().readUTF());
                    var8.b(var1.getDataInputStream().readInt());
                    byte var10 = var1.getDataInputStream().readByte();

                    for (var2 = 0; var2 < var10; ++var2) {
                        var8.a(new hx(var1.getDataInputStream().readShort()));
                    }

                    var8.K = 0;
                    var8.d(var1.getDataInputStream().readInt());
                    var8.X = var1.getDataInputStream().readShort();
                    var8.o = false;
                    kd.b().b = true;
                    var8.o = false;
                    d.a(var9, (hn) var8);
                    return;
                case 14:
                    var2 = var1.getDataInputStream().readInt();
                    var13 = var1.getDataInputStream().readInt();
                    if (kx.j && kx.H == 2) {
                        d.c(StringEntity.J);
                    }

                    kd.b().b = true;
                    kx.i.e(var2);
                    kx.f(var13);
                    return;
                case 16:
                    var2 = var1.getDataInputStream().readInt();
                    boolean var14 = var1.getDataInputStream().readBoolean();
                    if (var2 == GameMidlet.i.w) {
                        main.GameGraphic.h();
                    }

                    kx.b(var2, var14);
                    return;
                case 19:
                    var15 = var1.getDataInputStream().readByte();
                    var16 = var1.getDataInputStream().readByte();
                    var13 = var1.getDataInputStream().readInt();
                    if (kx.a(var15, var16)) {
                        d.g(var13);
                        return;
                    }
                    break;
                case 52:
                    var1.getDataInputStream().readByte();
                    var1.getDataInputStream().readByte();
                    var2 = var1.getDataInputStream().readInt();
                    int var3 = var1.getDataInputStream().readInt();
                    var12 = var1.getDataInputStream().readUTF();
                    hn var4 = kx.h(var2);
                    if (var3 != 0 && var4 != null) {
                        var4.b(var4.c() + var3);
                        if (GameMidlet.i.w == var2) {
                            GameMidlet.i.b(var4.c());
                        }

                        kx.a(var2, var12);
                        kx.c(var2, var3);
                        return;
                    }

                    return;
                case 61:
                    switch (var1.getDataInputStream().readByte()) {
                        case 3:
                            eb.a();
                            break;
                        case 7:
                            af.a();
                            break;
                        case 21:
                            gn.a();
                            break;
                        case 22:
                            kx.H = 5;
                            jp.e = jp.d;
                            el.a(3, ja.b());
                            if (da.a == null) {
                                da.a = new da();
                            }

                            a.c = da.a;
                            break;
                        default:
                            return;
                    }

                    main.GameGraphic.c(StringEntity.PLEASE_WAIT);
                    ie.a().b();
                    return;
                default:
                    this.c.a(var1);
                    return;
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }
    }
}
