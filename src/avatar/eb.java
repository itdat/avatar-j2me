package avatar;

import java.util.Vector;

public final class eb extends kj implements kk {

    private static eb a = new eb();

    public static void a() {
        kx.H = 4;
        jp.e = jp.c;
        el.a(0, kd.b());
        kn.a.c = a;
    }

    public final void a(IOStream iOStream) {
        try {
            byte var2 = iOStream.getDataInputStream().readByte();
            byte var3 = iOStream.getDataInputStream().readByte();
            if (!kx.a(var2, var3)) {
                return;
            }

            System.out.println("tienlen: " + iOStream.a);
            int var5;
            int var13;
            int var14;
            int var15;
            switch (iOStream.a) {
                case 20:
                    var2 = iOStream.getDataInputStream().readByte();
                    Vector var17 = new Vector();

                    for (var15 = 0; var15 < 13; ++var15) {
                        var17.addElement(new ax(iOStream.getDataInputStream().readByte()));
                    }

                    var15 = iOStream.getDataInputStream().readInt();
                    main.GameGraphic.h();
                    kx.r();
                    kd.b().a(var15, var2, var17);
                    ie var11 = ie.a();

                    try {
                        var11.b((byte) 53);
                    } catch (Exception var6) {
                    }

                    var11.k();
                    return;
                case 21:
                    var5 = iOStream.getDataInputStream().readInt();
                    byte[] var16 = new byte[var2 = iOStream.getDataInputStream().readByte()];

                    for (var15 = 0; var15 < var2; ++var15) {
                        var16[var15] = iOStream.getDataInputStream().readByte();
                    }

                    var15 = iOStream.getDataInputStream().readInt();
                    kx.k = true;
                    kd.b().a(var5, var16, var15);
                    kd.b().f();
                    return;
                case 49:
                    var13 = iOStream.getDataInputStream().readInt();
                    var14 = iOStream.getDataInputStream().readInt();
                    boolean var10 = iOStream.getDataInputStream().readBoolean();
                    kd.b().a(var13, var14, var10);
                    return;
                case 50:
                    kd.b().b = false;
                    kd.b();
                    kd.m();
                    if (iOStream.getDataInputStream().available() > 0) {
                        var13 = iOStream.getDataInputStream().readInt();
                        byte[] var18 = new byte[var3 = iOStream.getDataInputStream().readByte()];

                        for (var5 = 0; var5 < var3; ++var5) {
                            var18[var5] = iOStream.getDataInputStream().readByte();
                        }

                        kd.b().a(var13, var18);
                        return;
                    }
                    break;
                case 51:
                    var13 = iOStream.getDataInputStream().readInt();
                    var3 = iOStream.getDataInputStream().readByte();
                    var15 = iOStream.getDataInputStream().readInt();
                    int var9 = iOStream.getDataInputStream().readInt();
                    kd.b();
                    kd.a(var13, var3, var15, var9);
                    return;
                case 53:
                    var14 = iOStream.getDataInputStream().readInt();
                    byte[] var12 = new byte[13];

                    try {
                        for (var15 = 0; var15 < 13; ++var15) {
                            var12[var15] = iOStream.getDataInputStream().readByte();
                        }
                    } catch (Exception var7) {
                        var12 = null;
                    }

                    main.GameGraphic.h();
                    kd.b();
                    kd.m();
                    if (var12 != null) {
                        kd.b().a(var14, var12);
                    }

                    kx.a(var14, StringEntity.K);
                    return;
                case 54:
                    String var4 = iOStream.getDataInputStream().readUTF();
                    kd.b().b(var4);
                default:
                    return;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }
    }
}
