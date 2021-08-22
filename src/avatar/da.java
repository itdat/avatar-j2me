package avatar;

public final class da implements kk {

    public static da a;

    public final void a(IOStream iOStream) {
        try {
            byte var2 = iOStream.getDataInputStream().readByte();
            byte var3 = iOStream.getDataInputStream().readByte();
            if (!kx.a(var2, var3)) {
                return;
            }

            int var8;
            int var9;
            switch (iOStream.a) {
                case 20:
                    var2 = iOStream.getDataInputStream().readByte();
                    ja.a.e = var2;
                    ja.a.b(var2);
                    return;
                case 21:
                    var2 = iOStream.getDataInputStream().readByte();
                    if (var2 == -1) {
                        ja.a.m();
                        ja.a.f = false;
                        return;
                    }

                    if (var2 != -1) {
                        for (var9 = 0; var9 < 6; ++var9) {
                            ja.a.d[var2][var9] = iOStream.getDataInputStream().readByte();
                        }
                        ja.a.c(var2);
                    }
                    break;
                case 37:
                    byte[] var11 = new byte[3];
                    for (var8 = 0; var8 < 3; ++var8) {
                        var11[var8] = iOStream.getDataInputStream().readByte();
                    }
                    ja.a.a(var11);
                    kx.o();
                    return;
                case 49:
                    return;
                case 51:
                    int[] var10 = new int[kx.m.size()];

                    for (var9 = 0; var9 < var10.length; ++var9) {
                        var10[var9] = iOStream.getDataInputStream().readInt();
                    }

                    ja.a.a(var10);
                    return;
                case 60:
                    var2 = iOStream.getDataInputStream().readByte();
                    var3 = iOStream.getDataInputStream().readByte();
                    int var7 = iOStream.getDataInputStream().readInt();
                    ja.a.a(var2, var3, var7);
                    return;
                case 62:
                    var2 = iOStream.getDataInputStream().readByte();
                    ja.a.e = var2;

                    for (var9 = 0; var9 < kx.m.size(); ++var9) {
                        for (var8 = 0; var8 < 6; ++var8) {
                            ja.a.d[var9][var8] = iOStream.getDataInputStream().readByte();
                        }
                    }

                    ja.a.i();
                default:
                    return;
                case 65:
                    var2 = iOStream.getDataInputStream().readByte();
                    var3 = iOStream.getDataInputStream().readByte();
                    byte var4 = iOStream.getDataInputStream().readByte();
                    byte var6 = iOStream.getDataInputStream().readByte();
                    if (var3 != var4 && var6 > 0) {
                        ja.a.d[var2][var4] = var6;
                        ja.a.a(var2, var3, var4);
                        return;
                    }
                    break;
                case 100:
                    var2 = iOStream.getDataInputStream().readByte();
                    ja.a.a(var2);
                    return;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }
}
