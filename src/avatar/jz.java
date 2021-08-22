package avatar;

public final class jz implements kk {

    public static jz a;

    public final void a(IOStream iOStream) {
        try {
            byte var2;
            int var13;
            byte var16;
            switch (iOStream.a) {
                case 1:
                    short var18;
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        hl[] var14 = new hl[6];

                        for (var13 = 0; var13 < 6; ++var13) {
                            var14[var13] = new hl(this);
                            var14[var13].g = 0;
                            var14[var13].w = iOStream.getDataInputStream().readByte();
                            var14[var13].a = iOStream.getDataInputStream().readByte();
                            var14[var13].c = iOStream.getDataInputStream().readShort();
                            var14[var13].d = iOStream.getDataInputStream().readShort();
                        }

                        var18 = iOStream.getDataInputStream().readShort();
                        cz.b().a(var14, var18, false, true);
                        return;
                    } else if (!iOStream.getDataInputStream().readBoolean()) {
                        hl[] var20 = new hl[6];

                        for (int var17 = 0; var17 < 6; ++var17) {
                            var20[var17] = new hl(this);
                            var20[var17].g = 0;
                            var20[var17].w = iOStream.getDataInputStream().readByte();
                            var20[var17].c = iOStream.getDataInputStream().readShort();
                            byte var22 = iOStream.getDataInputStream().readByte();
                            var20[var17].e = new short[var22];
                            var20[var17].f = new short[var22];

                            for (int var23 = 0; var23 < var22; ++var23) {
                                var20[var17].e[var23] = iOStream.getDataInputStream().readShort();
                                var20[var17].f[var23] = iOStream.getDataInputStream().readShort();
                            }
                        }

                        short var21 = iOStream.getDataInputStream().readShort();
                        cz.b().n = iOStream.getDataInputStream().readShort();
                        cz.b().o = System.currentTimeMillis();
                        cz.b().a(var20, var21, false, false);
                        return;
                    } else {
                        for (var13 = 0; var13 < 6; ++var13) {
                            var16 = iOStream.getDataInputStream().readByte();
                            cz.b().c[var13].e = new short[var16];
                            cz.b().c[var13].f = new short[var16];

                            for (int var11 = 0; var11 < var16; ++var11) {
                                cz.b().c[var13].e[var11] = iOStream.getDataInputStream().readShort();
                                cz.b().c[var13].f[var11] = iOStream.getDataInputStream().readShort();
                                cz.b();
                            }
                        }

                        var18 = iOStream.getDataInputStream().readShort();
                        cz.b().n = iOStream.getDataInputStream().readShort();
                        cz.b().o = System.currentTimeMillis();
                        cz.b().a((hl[]) null, var18, true, false);
                        return;
                    }
                case 2:
                    short var19 = iOStream.getDataInputStream().readShort();
                    String var10 = iOStream.getDataInputStream().readUTF();
                    short var6 = iOStream.getDataInputStream().readShort();
                    byte var15 = iOStream.getDataInputStream().readByte();
                    var16 = iOStream.getDataInputStream().readByte();
                    byte var9 = iOStream.getDataInputStream().readByte();
                    cz.b().a(var19, var10, var6, var15, var16, var9);
                    return;
                case 5:
                    var2 = iOStream.getDataInputStream().readByte();
                    int var8 = iOStream.getDataInputStream().readInt();

                    for (var13 = 0; var13 < cz.b().c.length; ++var13) {
                        if (var2 == cz.b().c[var13].w) {
                            cz.b().c[var13].g = var8;
                            cz.b().g = (byte) var13;
                            break;
                        }
                    }

                    main.GameGraphic.h();
                    return;
                case 8:
                    short[] var12 = new short[var2 = iOStream.getDataInputStream().readByte()];
                    String[] var4 = new String[var2];

                    for (int var5 = 0; var5 < var2; ++var5) {
                        var12[var5] = iOStream.getDataInputStream().readShort();
                        var4[var5] = iOStream.getDataInputStream().readUTF();
                    }

                    if (var2 > 0) {
                        main.GameGraphic.v = new ifClass(this, var12, var4);
                        return;
                    }

                    main.GameGraphic.h();
                    return;
                case 9:
                    String var3 = iOStream.getDataInputStream().readUTF();
                    cz.b().b(var3);
                    return;
                case 10:
                    cz.b().l = new ki();
                    cz.b().l.b = iOStream.getDataInputStream().readByte();
                    cz.b().l.a = iOStream.getDataInputStream().readUTF();
                    cz.b();
                    iOStream.getDataInputStream().readByte();
                    cz.b().l.c = iOStream.getDataInputStream().readInt();
                    cz.b().l.d = iOStream.getDataInputStream().readInt();
                    cz.b().l.e = iOStream.getDataInputStream().readInt();
                    cz.b().l.f = iOStream.getDataInputStream().readInt();
                case 3:
                case 4:
                case 6:
                case 7:
                default:
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }
    }
}
