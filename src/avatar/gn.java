package avatar;

import java.util.Vector;

public final class gn extends kj implements kk {

    private static gn a = new gn();

    public static void a() {
        kx.H = 2;
        jp.e = 0;
        el.a(2, ek.b());
        kn.a.c = a;
    }

    public final void a(IOStream iOStream) {
        try {
            byte var2 = iOStream.getDataInputStream().readByte();
            byte var3 = iOStream.getDataInputStream().readByte();
            if (kx.a(var2, var3)) {
                Vector var4;
                int var11;
                int var12;
                int var19;
                switch (iOStream.a) {
                    case 20:
                        var2 = iOStream.getDataInputStream().readByte();
                        var12 = iOStream.getDataInputStream().readInt();
                        byte[][] var17 = new byte[8][8];

                        for (var19 = 0; var19 < 8; ++var19) {
                            for (int var22 = 0; var22 < 8; ++var22) {
                                var17[var19][var22] = iOStream.getDataInputStream().readByte();
                            }
                        }

                        for (var19 = 0; var19 < 2; ++var19) {
                            hn var21;
                            (var21 = kx.h(iOStream.getDataInputStream().readInt())).an = iOStream.getDataInputStream().readShort();
                            var21.aj = var21.ak = 0;
                            var21.ah = var21.al = iOStream.getDataInputStream().readShort();
                            var21.ai = iOStream.getDataInputStream().readShort();
                            var21.am = iOStream.getDataInputStream().readShort();
                            var21.G <<= 1;
                            var21.e(4);
                        }

                        ek.b().a(var12, var2, var17);
                        return;
                    case 21:
                        var19 = iOStream.getDataInputStream().readInt();
                        byte var23 = iOStream.getDataInputStream().readByte();
                        var3 = iOStream.getDataInputStream().readByte();
                        ek.b().a(var19, var23, var3);
                        return;
                    case 24:
                        var11 = iOStream.getDataInputStream().readInt();
                        byte[][] var15 = new byte[8][8];

                        for (int var14 = 0; var14 < 8; ++var14) {
                            for (var19 = 0; var19 < 8; ++var19) {
                                var15[var14][var19] = iOStream.getDataInputStream().readByte();
                            }
                        }

                        ek.b().a(var11, var15);
                        return;
                    case 49:
                        int var10 = iOStream.getDataInputStream().readInt();
                        ek.b().b(var10);
                        return;
                    case 51:
                        var4 = new Vector();

                        for (var19 = 0; var19 < 2; ++var19) {
                            var11 = iOStream.getDataInputStream().readInt();
                            var12 = iOStream.getDataInputStream().readInt();
                            hn var16;
                            hn var10000 = var16 = kx.h(var11);
                            var10000.G /= 2;
                            var16.H = 0;
                            var16.b(var16.c() + var12);
                            if (var12 != 0) {
                                main.GameGraphic.a(var12, var16.aw, var16.ax, -1, 30);
                                String var20 = var16.x + ": ";
                                if (var12 > 0) {
                                    ek.b().b = var16.w;
                                    var20 = var20 + StringEntity.aP + "   +" + var12 + StringEntity.COIN;
                                } else {
                                    var20 = var20 + StringEntity.aQ + "  " + var12 + StringEntity.COIN;
                                }

                                var4.addElement("  ");
                                var4.addElement(var20);
                            }
                        }

                        ek.b().a(var4);
                        return;
                    case 64:
                        byte var18;
                        byte[] var6 = new byte[var18 = iOStream.getDataInputStream().readByte()];
                        dr[] var7 = new dr[var18];

                        for (var11 = 0; var11 < var18; ++var11) {
                            var7[var11] = new dr();
                            var6[var11] = iOStream.getDataInputStream().readByte();
                            var7[var11].c = iOStream.getDataInputStream().readByte();
                            var7[var11].d = iOStream.getDataInputStream().readByte();
                        }

                        var2 = iOStream.getDataInputStream().readByte();
                        var3 = iOStream.getDataInputStream().readByte();
                        var4 = new Vector();

                        for (var19 = 0; var19 < var3; ++var19) {
                            String var8 = iOStream.getDataInputStream().readUTF();
                            var4.addElement(var8);
                        }

                        for (var19 = 0; var19 < 2; ++var19) {
                            hn var13;
                            (var13 = kx.h(iOStream.getDataInputStream().readInt())).af = iOStream.getDataInputStream().readByte();
                            var13.an = iOStream.getDataInputStream().readShort();
                            var13.aj = (short) (iOStream.getDataInputStream().readShort() - var13.ah);
                            var13.ak = (short) (iOStream.getDataInputStream().readShort() - var13.ai);
                            var13.ad = iOStream.getDataInputStream().readBoolean();
                            if (var13.ad) {
                                ek.b().c = true;
                            }
                        }

                        ek.b().a(var6, var7, var2, var4);
                        return;
                    case 71:
                        byte[][] var5 = new byte[8][];

                        for (var11 = 0; var11 < 8; ++var11) {
                            var5[var11] = new byte[8];
                        }

                        for (var11 = 0; var11 < 8; ++var11) {
                            for (var12 = 0; var12 < 8; ++var12) {
                                var5[var11][var12] = iOStream.getDataInputStream().readByte();
                            }
                        }

                        ek.b().a(var5);
                        return;
                    default:
                }
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }
}
