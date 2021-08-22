package avatar;

import java.util.Vector;

public final class af extends kj implements kk {

    private static af a = new af();

    public static void a() {
        kx.H = 4;
        jp.e = jp.c;
        el.a(1, kg.b());
        kn.a.c = a;
    }

    public final void a(IOStream iOStream) {
        try {
            byte var2 = iOStream.getDataInputStream().readByte();
            byte var3 = iOStream.getDataInputStream().readByte();
            if (kx.a(var2, var3)) {
                int var4;
                byte var14;
                int var16;
                boolean var18;
                int var19;
                byte var21;
                int var22;
                byte var29;
                switch (iOStream.a) {
                    case 20:
                        var2 = iOStream.getDataInputStream().readByte();
                        Vector var25 = new Vector();

                        for (var4 = 0; var4 < 9; ++var4) {
                            var29 = iOStream.getDataInputStream().readByte();
                            var25.addElement(new ax(var29));
                        }
                        var4 = iOStream.getDataInputStream().readInt();
                        var22 = iOStream.getDataInputStream().readInt();
                        main.GameGraphic.h();
                        kx.r();
                        kg.b().a(var2, var25, var4, var22);
                        return;
                    case 21:
                        var16 = iOStream.getDataInputStream().readInt();
                        var19 = iOStream.getDataInputStream().readInt();
                        var21 = iOStream.getDataInputStream().readByte();
                        var29 = 0;
                        if (var21 != -1) {
                            var29 = iOStream.getDataInputStream().readByte();
                        }
                        main.GameGraphic.h();
                        kg.b().a(var16, var19, var21, var29);
                        return;
                    case 49:
                        var16 = iOStream.getDataInputStream().readInt();
                        int var15 = iOStream.getDataInputStream().readInt();
                        kg.b().b(var16, var15);
                        return;
                    case 51:
                        int[] var31 = new int[4];
                        for (var16 = 0; var16 < 4; ++var16) {
                            var31[var16] = iOStream.getDataInputStream().readInt();
                        }
                        int[] var23 = new int[4];
                        for (var19 = 0; var19 < 4; ++var19) {
                            var23[var19] = iOStream.getDataInputStream().readInt();
                        }
                        int[][] var24 = new int[4][11];
                        for (var4 = 0; var4 < 4; ++var4) {
                            for (var22 = 0; var22 < 11; ++var22) {
                                var24[var4][var22] = -1;
                            }
                        }
                        var4 = 0;
                        var22 = 0;
                        while (iOStream.getDataInputStream().available() > 0) {
                            byte var28;
                            if ((var28 = iOStream.getDataInputStream().readByte()) == -1) {
                                if (var4 < 3) {
                                    ++var4;
                                }
                                var22 = 0;
                            } else {
                                var24[var4][var22] = var28;
                                if (var22 < 10) {
                                    ++var22;
                                }
                            }
                        }
                        main.GameGraphic.h();
                        kg.b().a(var23, var24);
                        return;
                    case 62:
                        var21 = iOStream.getDataInputStream().readByte();
                        var16 = iOStream.getDataInputStream().readInt();
                        var19 = iOStream.getDataInputStream().readInt();
                        var22 = iOStream.getDataInputStream().readInt();
                        int[][] var27 = new int[4][4];
                        int[][] var30 = new int[4][3];
                        int var8;
                        int var9;
                        for (var8 = 0; var8 < 4; ++var8) {
                            for (var9 = 0; var9 < 4; ++var9) {
                                var27[var8][var9] = -1;
                                if (var9 < 3) {
                                    var30[var8][var9] = -1;
                                }
                            }
                        }
                        var8 = 0;
                        var9 = 0;
                        byte var12;
                        for (int var10 = 0; var10 < 4; ++var10) {
                            for (int var11 = 0; var11 < 3 && (var12 = iOStream.getDataInputStream().readByte()) != -2 && var12 != -1; ++var11) {
                                var30[var10][var11] = var12;
                            }
                        }

                        while (true) {
                            while (iOStream.getDataInputStream().available() > 0) {
                                byte var32 = iOStream.getDataInputStream().readByte();
                                if (var8 < 3 && var32 == -1) {
                                    ++var8;
                                    var9 = 0;
                                } else {
                                    var27[var8][var9] = var32;
                                    if (var9 < 3) {
                                        ++var9;
                                    }
                                }
                            }

                            kg.b().a(var21, var16, var19, var27, var30, var22);
                            return;
                        }
                    case 63:
                        var14 = iOStream.getDataInputStream().readByte();
                        main.GameGraphic.h();
                        kg.b().c(var14);
                        return;
                    case 64:
                        var16 = iOStream.getDataInputStream().readInt();
                        var18 = iOStream.getDataInputStream().readBoolean();
                        var21 = 0;
                        if (var18) {
                            var21 = iOStream.getDataInputStream().readByte();
                        }

                        var14 = iOStream.getDataInputStream().readByte();
                        main.GameGraphic.h();
                        kg.b().a(var18, var21, var16, var14);
                        return;
                    case 65:
                        var16 = iOStream.getDataInputStream().readInt();
                        var18 = iOStream.getDataInputStream().readBoolean();
                        boolean var20 = iOStream.getDataInputStream().readBoolean();
                        int[] var5 = new int[4];
                        int[] var26 = new int[12];
                        if (var18) {
                            int var7;
                            for (var7 = 0; var7 < 4; ++var7) {
                                var5[var7] = iOStream.getDataInputStream().readInt();
                            }

                            for (var7 = 0; var7 < 12; ++var7) {
                                var26[var7] = -1;
                            }

                            for (var7 = 0; iOStream.getDataInputStream().available() > 0; ++var7) {
                                var26[var7] = iOStream.getDataInputStream().readByte();
                            }
                        }

                        main.GameGraphic.h();
                        kg.b().a(var18, var26, var20, var16);
                        return;
                    case 67:
                        boolean var6 = iOStream.getDataInputStream().readBoolean();
                        var2 = -1;
                        if (var6) {
                            var2 = iOStream.getDataInputStream().readByte();
                        }

                        main.GameGraphic.h();
                        kg.b().a(var6, var2);
                        return;
                    case 68:
                        var14 = iOStream.getDataInputStream().readByte();
                        main.GameGraphic.h();
                        kg.b().a(var14);
                        return;
                    case 69:
                        var16 = iOStream.getDataInputStream().readInt();
                        int[] var17 = new int[4];

                        for (var4 = 0; var4 < 4; ++var4) {
                            var17[var4] = iOStream.getDataInputStream().readInt();
                        }

                        kg.b().b(var16);
                        return;
                    case 70:
                        iOStream.getDataInputStream().readInt();
                        kg.b().m();
                    default:
                }
            }
        } catch (Exception var13) {
            var13.printStackTrace();
        }
    }
}
