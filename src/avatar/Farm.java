package avatar;

import java.io.IOException;
import main.GameGraphic;

public final class Farm extends kj {

    private static Farm INST;

    public static Farm getInstance() {
        if (INST == null) {
            INST = new Farm();
        }
        return INST;
    }

    public final void a(short var1) {
        System.out.println("it a(short): " + var1);
        this.e((byte) 54);
        this.p(var1);
        this.k();
        GameGraphic.c(StringEntity.aL);
    }

    public final void b() {
        System.out.println("it b()");
        this.e((byte) 55);
        this.k();
        GameGraphic.c(StringEntity.aL);
    }

    public final void c() {
        System.out.println("it c()");
        this.e((byte) 56);
        this.k();
        GameGraphic.c(StringEntity.aL);
    }

    public final void d() {
        System.out.println("it d()");
        this.e((byte) 60);
        this.k();
    }

    public final void a(int var1) {
        System.out.println("it a(int): " + var1);
        this.e((byte) 61);
        this.n(var1);
        this.k();
    }

    public final void a(short var1, byte var2, int var3) {
        System.out.println("it a(short,byte,int): " + var1 + " " + var2 + " " + var3);
        this.e((byte) 62);

        try {
            super.b.getDataOutputStream().writeShort(var1);
            super.b.getDataOutputStream().writeByte(var2);
            super.b.getDataOutputStream().writeByte(var3);
        } catch (IOException var4) {
        }

        this.k();
        GameGraphic.h();
    }

    public final void b(short var1) {
        System.out.println("it b(short): " + var1);
        this.e((byte) 63);
        this.p(var1);
        this.k();
    }

    public final void a(int var1, int var2, int var3) {
        System.out.println("it  a(int,int,int): " + var1 + " " + var2 + " " + var3);
        this.e((byte) 64);

        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
            super.b.getDataOutputStream().writeByte(var3);
        } catch (IOException var4) {
        }

        this.k();
    }

    public final void doUsingItem(int var1, int plotLandIndex, int itemType) {
        System.out.println("doUsingItem: " + var1 + " " + plotLandIndex + " " + itemType);
        this.e((byte) 65);

        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(plotLandIndex);
            super.b.getDataOutputStream().writeShort(itemType);
        } catch (IOException var4) {
        }

        this.k();
    }

    public final void doHarvest(int var1, int var2) {
        System.out.println("doHarvest: " + var1 + "   " + var2);
        this.e((byte) 66);
        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (IOException var3) {
        }
        this.k();
    }

    public final void b(int var1, int var2) {
        System.out.println("it b(int,int): " + var1 + " " + var2);
        this.e((byte) 70);

        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void b(int var1) {
        System.out.println("it b(int): " + var1);
        this.e((byte) 69);
        this.n(var1);
        this.k();
    }

    public final void c(int var1, int var2) {
        System.out.println("it c(int,int): " + var1 + " " + var2);
        this.e((byte) 74);

        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void a(int var1, byte var2) {
        System.out.println("it a(int,byte): " + var1 + " " + var2);
        this.e((byte) 73);

        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void a(ad var1, int var2) {
        System.out.println("it a(ad,int): " + var2);
        GameGraphic.h();
        this.e((byte) 71);

        try {
            super.b.getDataOutputStream().writeByte(var1.a);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void d(int var1, int var2) {
        System.out.println("it d(int,int): " + var1 + " " + var2);
        this.e((byte) 72);

        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void doOpenATM(int var1, int var2) {
        System.out.println("it e(int,int): " + var1 + " " + var2);
        this.e((byte) 75);
        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (Exception var3) {
        }
        this.k();
    }

    public final void f(int var1, int var2) {
        System.out.println("it f(int,int): " + var1 + " " + var2);
        this.e((byte) 80);
        this.o(var1);
        if (var1 == 1) {
            this.o(var2);
        }
        this.k();
    }

    public final void g(int var1, int var2) {
        System.out.println("it g(int,int): " + var1 + " " + var2);
        this.e((byte) 81);
        this.o(var1);
        if (var1 == 1) {
            this.o(var2);
        }
        this.k();
    }

    public final void c(short var1) {
        System.out.println("it c(short): " + var1);
        this.e((byte) 82);
        this.p(var1);
        this.k();
    }

    public final void c(int var1) {
        System.out.println("it c(int): " + var1);
        this.e((byte) 84);
        this.o(var1);
        this.k();
    }

    public final void d(int var1) {
        System.out.println("it d(int): " + var1);
        this.e((byte) 86);
        this.o(var1);
        this.k();
    }

    public final void h(int var1, int var2) {
        System.out.println("it h(int,int): " + var1 + " " + var2);
        this.e((byte) 90);
        this.o(var1);
        if (var1 == 1) {
            this.o(var2);
        }
        this.k();
    }

    public final void i(int var1, int var2) {
        System.out.println("it i(int,int): " + var1 + " " + var2);
        this.e((byte) 94);
        this.o(var1);
        if (var1 == 1) {
            this.o(var2);
        }
        this.k();
    }

    public final void d(short var1) {
        System.out.println("it d(short): " + var1);
        GameGraphic.i();
        this.e((byte) 91);
        this.p(var1);
        this.k();
    }

    public final void e(int var1) {
        System.out.println("it e(int): " + var1);
        this.e((byte) 93);
        this.o(var1);
        this.k();
    }

    public final void f(int var1) {
        System.out.println("it f(int): " + var1);
        this.e((byte) 96);
        this.o(0);
        this.k();
    }
}
