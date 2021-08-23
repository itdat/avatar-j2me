package avatar;

import java.io.IOException;
import main.GameMidlet;

public final class iy extends kj {

    private static iy a;

    public static iy a() {
        if (a == null) {
            a = new iy();
        }

        return a;
    }

    public final void b() {
        this.e((byte) -11);
        this.n(es.s);
        this.k();
    }

    public final void a(short var1) {
        this.e((byte) -14);
        this.p(var1);
        this.k();
        main.GameGraphic.c(StringEntity.aM);
    }

    public final void c() {
        this.e((byte) -15);
        this.k();
        main.GameGraphic.c(StringEntity.aM);
    }

    public final void d() {
        this.e((byte) -16);
        this.k();
        main.GameGraphic.c(StringEntity.aM);
    }

    public final void e() {
        this.e((byte) -37);
        this.k();
        main.GameGraphic.c(StringEntity.aM);
    }

    public final void f() {
        this.e((byte) -40);
        this.k();
    }

    public final void g() {
        this.e((byte) -41);
        this.k();
    }

    public final void a(int var1) {
        if (GameMidlet.e == 9 || GameMidlet.e == 11) {
            this.e((byte) 57);
            this.o(var1);
            this.k();
        }
    }

    public final void a(int var1, int var2) {
        this.e((byte) -24);

        try {
            super.iOStream.getDataOutputStream().writeShort(var1);
            super.iOStream.getDataOutputStream().writeByte(var2);
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void a(short[] var1, int var2) {
        this.e((byte) -46);

        try {
            super.iOStream.getDataOutputStream().writeShort(var2);
            super.iOStream.getDataOutputStream().writeShort(var1.length);

            for (var2 = 0; var2 < var1.length; ++var2) {
                super.iOStream.getDataOutputStream().writeByte(var1[var2]);
            }

            super.iOStream.getDataOutputStream().writeShort(0);
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void a(kq var1) {
        System.out.println("doBuyItemHouse; " + var1.b);
        this.e((byte) -74);

        try {
            super.iOStream.getDataOutputStream().writeShort(var1.b);
            super.iOStream.getDataOutputStream().writeByte(var1.aw / 24);
            super.iOStream.getDataOutputStream().writeByte(var1.ax / 24);
            super.iOStream.getDataOutputStream().writeByte(var1.f);
        } catch (IOException var2) {
        }

        this.k();
    }

    public final void b(int var1) {
        main.GameGraphic.i();
        this.e((byte) -65);
        this.n(var1);
        this.k();
    }

    public final void b(kq var1) {
        this.e((byte) -66);

        try {
            super.iOStream.getDataOutputStream().writeShort(var1.b);
            super.iOStream.getDataOutputStream().writeByte(var1.aw / 24);
            super.iOStream.getDataOutputStream().writeByte(var1.ax / 24);
            super.iOStream.getDataOutputStream().writeByte(var1.c);
        } catch (Exception var2) {
        }

        this.k();
    }

    public final void c(int var1) {
        this.e((byte) -67);
        this.o(var1);
        this.k();
    }

    public final void d(int var1) {
        this.e((byte) -69);
        this.n(var1);
        this.k();
    }

    public final void e(int var1) {
        this.e((byte) -70);
        this.n(var1);
        this.k();
    }

    public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.e((byte) -71);

        try {
            super.iOStream.getDataOutputStream().writeShort(var1);
            super.iOStream.getDataOutputStream().writeByte(var2);
            super.iOStream.getDataOutputStream().writeByte(var3);
            super.iOStream.getDataOutputStream().writeByte(var4);
            super.iOStream.getDataOutputStream().writeByte(var5);
            super.iOStream.getDataOutputStream().writeByte(var6);
        } catch (IOException var7) {
        }

        this.k();
    }

    public final void a(String var1, int var2, int var3) {
        this.e((byte) -75);

        try {
            super.iOStream.getDataOutputStream().writeByte(var3);
            super.iOStream.getDataOutputStream().writeUTF(var1);
            if (var3 == 1) {
                super.iOStream.getDataOutputStream().writeInt(var2);
            }
        } catch (IOException var4) {
        }

        this.k();
    }

    public final void b(short var1) {
        this.e((byte) -80);
        this.p(var1);
        this.k();
    }

    public final void c(short var1) {
        this.e((byte) -84);
        this.o(var1);
        this.k();
    }

    public final void f(int var1) {
        this.e((byte) -104);
        this.n(var1);
        this.k();
    }
}
