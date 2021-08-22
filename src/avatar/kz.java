package avatar;

import java.io.IOException;
import java.util.Vector;
import main.GameMidlet;

public final class kz extends kj implements kk {

    public static kz a;

    public final void a(IOStream iOStream) {
        try {
            byte var2;
            int var4;
            int var6;
            dc var10;
            int[] var10000;
            int var70;
            short var72;
            int var79;
            int var80;
            short var83;
            int var84;
            int var86;
            int var89;
            dc var90;
            int var95;
            int var113;
            int var114;
            switch (iOStream.a) {
                case 51:
                    short[] var97 = new short[var2 = iOStream.getDataInputStream().readByte()];
                    short[] var98 = new short[var2];

                    for (var95 = 0; var95 < var2; ++var95) {
                        var97[var95] = iOStream.getDataInputStream().readShort();
                        var98[var95] = iOStream.getDataInputStream().readShort();
                    }

                    var95 = iOStream.getDataInputStream().readInt();
                    var84 = iOStream.getDataInputStream().readInt();
                    gb.a(var2, var98, var95, var84);
                    return;
                case 52:
                case 53:
                case 57:
                case 58:
                case 59:
                case 68:
                case 87:
                case 88:
                case 89:
                default:
                    return;
                case 54:
                    short var108 = iOStream.getDataInputStream().readShort();
                    short var96 = iOStream.getDataInputStream().readShort();
                    byte[] var105 = new byte[var4 = iOStream.getDataInputStream().readUnsignedShort()];

                    for (var6 = 0; var6 < var4; ++var6) {
                        var105[var6] = iOStream.getDataInputStream().readByte();
                    }

                    gb.a(var108, var96, var105);
                    return;
                case 55:
                    byte[] var102 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var102);
                    gb.b(var102);
                    return;
                case 56:
                    byte[] var107 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var107);
                    gb.a(var107);
                    return;
                case 60:
                    var2 = iOStream.getDataInputStream().readByte();
                    Vector var94 = new Vector();
                    Vector var92 = new Vector();

                    for (var95 = 0; var95 < var2; ++var95) {
                        dc var100;
                        (var100 = new dc()).a = iOStream.getDataInputStream().readByte();
                        var100.e = iOStream.getDataInputStream().readShort();
                        if (var100.a > 100) {
                            var92.addElement(var100);
                        } else {
                            var94.addElement(var100);
                        }
                    }

                    byte var99 = iOStream.getDataInputStream().readByte();
                    Vector var101 = new Vector();

                    for (var86 = 0; var86 < var99; ++var86) {
                        dc var93;
                        (var93 = new dc()).a = iOStream.getDataInputStream().readByte();
                        var93.e = iOStream.getDataInputStream().readShort();
                        var101.addElement(var93);
                    }

                    GameMidlet.i.a[0] = iOStream.getDataInputStream().readInt();
                    GameMidlet.i.u = iOStream.getDataInputStream().readByte();
                    GameMidlet.i.s = iOStream.getDataInputStream().readByte();
                    var2 = iOStream.getDataInputStream().readByte();
                    var92 = new Vector();

                    for (var95 = 0; var95 < var2; ++var95) {
                        dc var103;
                        (var103 = new dc()).a = iOStream.getDataInputStream().readShort();
                        var103.e = iOStream.getDataInputStream().readShort();
                        var92.addElement(var103);
                    }

                    var99 = iOStream.getDataInputStream().readByte();
                    Vector var104 = new Vector();

                    for (var86 = 0; var86 < var99; ++var86) {
                        dc var8;
                        (var8 = new dc()).a = iOStream.getDataInputStream().readShort();
                        var8.e = iOStream.getDataInputStream().readShort();
                        var104.addElement(var8);
                    }

                    var2 = iOStream.getDataInputStream().readByte();
                    int var106 = iOStream.getDataInputStream().readInt();
                    boolean var9 = iOStream.getDataInputStream().readBoolean();
                    GameMidlet.i.u = iOStream.getDataInputStream().readShort();
                    GameMidlet.i.s = iOStream.getDataInputStream().readByte();
                    var99 = iOStream.getDataInputStream().readByte();
                    var101.removeAllElements();

                    dc var11;
                    int var109;
                    for (var109 = 0; var109 < var99; ++var109) {
                        (var11 = new dc()).a = iOStream.getDataInputStream().readShort();
                        var11.e = iOStream.getDataInputStream().readInt();
                        var101.addElement(var11);
                    }

                    var104.removeAllElements();
                    var99 = iOStream.getDataInputStream().readByte();

                    for (var109 = 0; var109 < var99; ++var109) {
                        (var11 = new dc()).a = iOStream.getDataInputStream().readShort();
                        System.out.println("pppppppp: " + var11.a + "    " + var11.e);
                        var11.e = iOStream.getDataInputStream().readInt();
                        var104.addElement(var11);
                    }

                    go.getInstance().a(var94, var101, var92, var104, var2, var106, var9);
                    if (gb.h == 0 && a() && ir.a != 25) {
                        gb.b();
                        bf.a().doJoinPark(25, 0);
                        go.e();
                        go.getInstance().b(GameMidlet.i.w, false);
                    }
                    break;
                case 61:
                    b(iOStream);
                    return;
                case 62:
                    (var10 = new dc()).a = iOStream.getDataInputStream().readShort();
                    var10.e = iOStream.getDataInputStream().readByte();
                    iOStream.getDataInputStream().readInt();
                    iOStream.getDataInputStream().readByte();
                    var86 = iOStream.getDataInputStream().readInt();
                    var89 = iOStream.getDataInputStream().readInt();
                    var84 = iOStream.getDataInputStream().readInt();
                    go.getInstance().a(var10, var86, var89, var84);
                    return;
                case 63:
                    var86 = iOStream.getDataInputStream().readInt();
                    var89 = iOStream.getDataInputStream().readInt();
                    var83 = iOStream.getDataInputStream().readShort();
                    go.getInstance().a(var86, var89, var83);
                    return;
                case 64:
                    iOStream.getDataInputStream().readInt();
                    var2 = iOStream.getDataInputStream().readByte();
                    byte var88 = iOStream.getDataInputStream().readByte();
                    go.getInstance().b(var2, var88);
                    return;
                case 65:
                    iOStream.getDataInputStream().readByte();
                    if (go.b(var83 = iOStream.getDataInputStream().readShort()) != null && (var90 = dc.a(go.d, var83)) != null) {
                        --var90.e;
                        if (var90.e <= 0) {
                            go.d.removeElement(var90);
                            return;
                        }
                    }
                    break;
                case 66:
                    var2 = iOStream.getDataInputStream().readByte();
                    var83 = iOStream.getDataInputStream().readShort();
                    go.getInstance().c(var2, var83);
                    return;
                case 67:
                    go.getInstance();
                    iOStream.getDataInputStream().readInt();
                    go.i();
                    return;
                case 69:
                    go.getInstance();
                    go.a(iOStream.getDataInputStream().readUTF());
                    return;
                case 70:
                    var86 = iOStream.getDataInputStream().readInt();
                    var89 = iOStream.getDataInputStream().readInt();
                    byte var91 = iOStream.getDataInputStream().readByte();
                    String var5 = iOStream.getDataInputStream().readUTF();
                    var6 = iOStream.getDataInputStream().readInt();
                    int var7 = iOStream.getDataInputStream().readInt();
                    var84 = iOStream.getDataInputStream().readInt();
                    go.getInstance().a(var86, var89, var91, var5, var6, var7, var84);
                    return;
                case 71:
                    (var90 = new dc()).a = iOStream.getDataInputStream().readByte();
                    iOStream.getDataInputStream().readInt();
                    iOStream.getDataInputStream().readByte();
                    var89 = iOStream.getDataInputStream().readInt();
                    var4 = iOStream.getDataInputStream().readInt();
                    var84 = iOStream.getDataInputStream().readInt();
                    go.getInstance().a(var90, var89, var4, var84);
                    return;
                case 72:
                    var2 = iOStream.getDataInputStream().readByte();
                    String var85 = iOStream.getDataInputStream().readUTF();
                    go.getInstance().a(var2, var85);
                    return;
                case 73:
                    iOStream.getDataInputStream().readInt();
                    var2 = iOStream.getDataInputStream().readByte();
                    var84 = iOStream.getDataInputStream().readInt();
                    go.getInstance().g(var2, var84);
                    return;
                case 74:
                    var2 = iOStream.getDataInputStream().readByte();
                    var83 = iOStream.getDataInputStream().readShort();
                    go.getInstance().e(var2, var83);
                    return;
                case 75:
                    var86 = iOStream.getDataInputStream().readInt();
                    var89 = iOStream.getDataInputStream().readInt();
                    GameMidlet.i.a(var86);
                    GameMidlet.i.a[1] = var89;
                    main.GameGraphic.showAlert(iOStream.getDataInputStream().readUTF());
                    return;
                case 76:
                    ce.c(iOStream);
                    return;
                case 77:
                    ce.d(iOStream);
                    return;
                case 78:
                    if (a()) {
                        return;
                    }

                    var2 = iOStream.getDataInputStream().readByte();
                    cf var87;
                    (var87 = (cf) go.c.elementAt(var2)).c = iOStream.getDataInputStream().readByte();
                    a(var87, iOStream);
                    go.getInstance().c(var2);
                    return;
                case 79:
                    if (a()) {
                        return;
                    }

                    var2 = iOStream.getDataInputStream().readByte();
                    byte var3;
                    if ((var3 = iOStream.getDataInputStream().readByte()) == -1) {
                        return;
                    }

                    ai var64 = go.e(var2);
                    var64.k = var3;
                    a(var64, iOStream);
                    go.getInstance();
                    go.f();
                    return;
                case 80:
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        String var66 = iOStream.getDataInputStream().readUTF();
                        Vector var111;
                        (var111 = new Vector()).addElement(new Button(StringEntity.COIN, 3, go.INST));
                        var111.addElement(new Button(StringEntity.TAEL, 4, go.INST));
                        var111.addElement(main.GameGraphic.ad);
                        main.GameGraphic.a(var66, var111);
                        return;
                    }

                    iOStream.getDataInputStream().readByte();
                    iOStream.getDataInputStream().readInt();
                    int var112 = iOStream.getDataInputStream().readInt();
                    var113 = iOStream.getDataInputStream().readInt();
                    var70 = iOStream.getDataInputStream().readInt();
                    GameMidlet.i.updateMoney(var112, var113, var70);
                    main.GameGraphic.J = 1;
                    go.getInstance().b(GameMidlet.i.w, true);
                    go.R = true;
                    return;
                case 81:
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        String var110 = iOStream.getDataInputStream().readUTF();
                        Vector var68;
                        (var68 = new Vector()).addElement(new Button(StringEntity.COIN, 5, go.INST));
                        var68.addElement(new Button(StringEntity.TAEL, 6, go.INST));
                        var68.addElement(main.GameGraphic.ad);
                        main.GameGraphic.a(var110, var68);
                        return;
                    }

                    iOStream.getDataInputStream().readByte();
                    iOStream.getDataInputStream().readInt();
                    main.GameGraphic.J = 1;
                    System.out.println("UPDATE_FARM_FISH: " + iOStream.getDataInputStream().available());
                    var113 = iOStream.getDataInputStream().readInt();
                    var70 = iOStream.getDataInputStream().readInt();
                    var114 = iOStream.getDataInputStream().readInt();
                    System.out.println("");
                    GameMidlet.i.updateMoney(var113, var70, var114);
                    go.getInstance().b(GameMidlet.i.w, true);
                    go.R = true;
                    return;
                case 82:
                    short var67 = iOStream.getDataInputStream().readShort();
                    byte[] var69 = new byte[iOStream.getDataInputStream().readShort()];
                    iOStream.getDataInputStream().read(var69);
                    gb.g.put("" + var67, new f(awClass.a(var69)));
                    return;
                case 83:
                    if (iOStream.getDataInputStream().readBoolean()) {
                        go.J.b = iOStream.getDataInputStream().readShort();
                        ++go.J.a;
                        return;
                    }
                    break;
                case 84:
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        main.GameGraphic.a(iOStream.getDataInputStream().readUTF(), 7, go.INST);
                        return;
                    }

                    var114 = iOStream.getDataInputStream().readInt();
                    var72 = iOStream.getDataInputStream().readShort();
                    var10000 = GameMidlet.i.a;
                    var10000[0] -= var114;
                    go.J.e = var72 * 60;
                    go.J.h = System.currentTimeMillis();
                    main.GameGraphic.a(-var114, GameMidlet.i.aw, GameMidlet.i.ax, -1, -1);
                    return;
                case 85:
                    short var71 = iOStream.getDataInputStream().readShort();
                    var72 = iOStream.getDataInputStream().readShort();
                    go.getInstance();
                    go.a(var71, var72);
                    return;
                case 86:
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        main.GameGraphic.a(iOStream.getDataInputStream().readUTF(), 8, go.INST);
                        return;
                    }

                    iOStream.getDataInputStream().readInt();
                    go.J.b = iOStream.getDataInputStream().readShort();
                    go.J.e = 0;
                    ++go.J.a;
                    int var115 = iOStream.getDataInputStream().readInt();
                    int var119 = iOStream.getDataInputStream().readInt();
                    GameMidlet.i.updateMoney(GameMidlet.i.a[0], var115, var119);
                    return;
                case 90:
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        String var75 = iOStream.getDataInputStream().readUTF();
                        Vector var118;
                        (var118 = new Vector()).addElement(new Button(StringEntity.COIN, 9, go.INST));
                        var118.addElement(new Button(StringEntity.TAEL, 10, go.INST));
                        var118.addElement(main.GameGraphic.ad);
                        main.GameGraphic.a(var75, var118);
                        return;
                    }

                    iOStream.getDataInputStream().readByte();
                    iOStream.getDataInputStream().readInt();
                    byte var122 = iOStream.getDataInputStream().readByte();
                    main.GameGraphic.showAlert(iOStream.getDataInputStream().readUTF());
                    ++((cf) go.c.elementAt(var122)).p;
                    go.getInstance().a(go.b, go.c, go.i, go.P, go.Q, go.V, go.U);
                    var79 = iOStream.getDataInputStream().readInt();
                    var80 = iOStream.getDataInputStream().readInt();
                    GameMidlet.i.updateMoney(GameMidlet.i.a[0], var79, var80);
                    return;
                case 91:
                    short var117;
                    if ((var117 = iOStream.getDataInputStream().readShort()) == -1) {
                        go.V = 0;
                    } else {
                        short var121 = iOStream.getDataInputStream().readShort();
                        go.V = var117;
                        go.U = var121 * 60;
                    }

                    main.GameGraphic.h();
                    return;
                case 92:
                    hf var123 = gb.b(go.V);
                    az var124 = go.b(var123.b);
                    dc var125 = go.f(var123.b);
                    if (var125 != null) {
                        ++var125.e;
                    } else {
                        (var10 = new dc()).a = var123.b;
                        var10.e = 1;
                        go.e.addElement(var10);
                    }

                    main.GameGraphic.a(0, go.W, go.X, -1, 0, var124.b, -1);
                    go.V = 0;
                    return;
                case 93:
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        main.GameGraphic.a(iOStream.getDataInputStream().readUTF(), 11, go.INST);
                        return;
                    }

                    int var78 = iOStream.getDataInputStream().readInt();
                    var10000 = GameMidlet.i.a;
                    var10000[2] -= var78;
                    go.U = 0;
                    var79 = iOStream.getDataInputStream().readInt();
                    var80 = iOStream.getDataInputStream().readInt();
                    GameMidlet.i.updateMoney(GameMidlet.i.a[0], var79, var80);
                    return;
                case 94:
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        String var116 = iOStream.getDataInputStream().readUTF();
                        Vector var120;
                        (var120 = new Vector()).addElement(new Button(StringEntity.COIN, 13, go.INST));
                        var120.addElement(new Button(StringEntity.TAEL, 14, go.INST));
                        var120.addElement(main.GameGraphic.ad);
                        main.GameGraphic.a(var116, var120);
                        return;
                    }

                    byte var76 = iOStream.getDataInputStream().readByte();
                    int var77 = iOStream.getDataInputStream().readInt();
                    if (var76 == 1) {
                        var10000 = GameMidlet.i.a;
                        var10000[0] -= var77;
                    } else {
                        var10000 = GameMidlet.i.a;
                        var10000[2] -= var77;
                    }

                    iOStream.getDataInputStream().readInt();
                    ++go.O;
                    main.GameGraphic.showAlert(iOStream.getDataInputStream().readUTF());
                    go.getInstance().a(go.b, go.c, go.i, go.P, go.Q, go.V, go.U);
            }
        } catch (IOException var82) {
            var82.printStackTrace();
        }

    }

    private static boolean a() {
        return ir.a != 24 && ir.a != 53;
    }

    private static void a(cf var0, IOStream iOStream) {
        try {
            short var2 = iOStream.getDataInputStream().readShort();
            go.a(var0.d, var2, var0, (ai) null);
            var0.d = var2;
            var0.h = (long) (var0.d * 60);
            byte var5 = iOStream.getDataInputStream().readByte();
            go.a(var0.n, var5, var0, (ai) null);
            var0.n = var5;
            var0.m = iOStream.getDataInputStream().readByte();
            var0.i = iOStream.getDataInputStream().readBoolean();
            boolean var6 = iOStream.getDataInputStream().readBoolean();
            int var3 = -1;
            if (!var6 && var0.j) {
                var3 = 0;
            }

            var0.j = var6;
            boolean var4;
            if (!(var4 = iOStream.getDataInputStream().readBoolean()) && var0.k) {
                var3 = 9 * gy.Y;
            }

            var0.k = var4;
            if (var3 >= 0) {
                main.GameGraphic.a(0, var0.a * ir.i + 11, var0.b * ir.i, -1, awClass.a(0, var3, 13 * gy.Y, 9 * gy.Y, go.q.d), -1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void a(ai var0, IOStream iOStream) {
        try {
            var0.g = iOStream.getDataInputStream().readInt();
            byte var2 = iOStream.getDataInputStream().readByte();
            go.a(var0.h, var2, (cf) null, var0);
            var0.h = var2;
            iOStream.getDataInputStream().readByte();
            var0.o = iOStream.getDataInputStream().readByte();
            var0.i = iOStream.getDataInputStream().readBoolean();
            boolean var5 = iOStream.getDataInputStream().readBoolean();
            boolean var4 = iOStream.getDataInputStream().readBoolean();
            int var3 = -1;
            if (!var5 && var0.j[0]) {
                var3 = 0;
            }

            if (!var4 && var0.j[1]) {
                var3 = 13 * gy.Y;
            }

            if (var3 >= 0) {
                main.GameGraphic.a(0, var0.aw, var0.ax - var0.aA, -1, awClass.a(0, var3, 9 * gy.Y, 13 * gy.Y, go.u.d), -1);
            }

            var0.j[0] = var5;
            var0.j[1] = var4;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void b(IOStream iOStream) {
        try {
            int var1 = iOStream.getDataInputStream().readInt();
            Vector var2 = new Vector();
            Vector var3 = new Vector();
            byte var4 = 0;
            byte var10;
            if (var1 != -1) {
                var4 = iOStream.getDataInputStream().readByte();

                for (int var5 = 0; var5 < var4; ++var5) {
                    cf var6;
                    (var6 = new cf()).c = iOStream.getDataInputStream().readByte();
                    if (var6.c == -1) {
                        var2.addElement(var6);
                    } else {
                        a(var6, iOStream);
                        var2.addElement(var6);
                    }
                }

                var10 = iOStream.getDataInputStream().readByte();
                if (ir.a != 24 || GameMidlet.i.w != var1) {
                    dt.t = 0;
                    dz.t = 0;
                    ex.r = 0;
                    go.i.removeAllElements();
                }

                for (int var11 = 0; var11 < var10; ++var11) {
                    Object var7 = null;
                    byte var8 = iOStream.getDataInputStream().readByte();
                    int var9 = go.i.size();
                    if (ir.a == 24 && var9 != 0 && var9 == var10) {
                        go.e(var11);
                        var7 = (ai) go.i.elementAt(var11);
                    } else {
                        ad var15 = gb.c(var8);
                        if (var8 != -1) {
                            switch (var15.c) {
                                case 1:
                                    var7 = new ex(var11, var8, (byte) 0);
                                    break;
                                case 2:
                                    var7 = new dt(var11, var8);
                                    break;
                                case 3:
                                    var7 = new dz(var11, var8);
                                    break;
                                case 4:
                                    var7 = new ip(var11, var8, (byte) 0);
                            }
                        }
                    }

                    if (var8 != -1 && var7 != null) {
                        ((ai) var7).k = var8;
                        a((ai) var7, iOStream);
                        var3.addElement(var7);
                    }
                }
            }

            var10 = iOStream.getDataInputStream().readByte();
            byte var12 = iOStream.getDataInputStream().readByte();
            (go.J = new kc()).a = iOStream.getDataInputStream().readShort();
            go.J.b = iOStream.getDataInputStream().readShort();
            go.J.c = iOStream.getDataInputStream().readShort();
            go.J.d = iOStream.getDataInputStream().readShort();
            iOStream.getDataInputStream().readShort();
            iOStream.getDataInputStream().readShort();
            go.J.e = iOStream.getDataInputStream().readShort() * 60;
            go.J.h = System.currentTimeMillis();

            for (int var14 = 0; var14 < var4; ++var14) {
                ((cf) var2.elementAt(var14)).p = iOStream.getDataInputStream().readByte();
            }

            short var16 = 0;
            int var13 = 0;
            if (iOStream.getDataInputStream().available() > 0) {
                var16 = iOStream.getDataInputStream().readShort();
                var13 = iOStream.getDataInputStream().readShort() * 60;
            }

            go.getInstance().a(var1, var2, var3, var10, var12, var16, var13);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
