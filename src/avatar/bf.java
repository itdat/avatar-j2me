package avatar;

import java.io.IOException;
import main.GameMidlet;
import main.GameGraphic;

public final class bf extends kj {

    private static bf INST;

    public static bf a() {
        if (INST == null) {
            INST = new bf();
        }
        return INST;
    }

    public final void doJoinPark(int var1, int var2) {
        System.out.println("doJoinPark: " + var1 + "   " + var2);
        if (jy.c == 0) {
            GameGraphic.i();
        }
        this.e((byte) 50);
        try {
            super.b.getDataOutputStream().writeByte(var1);
            super.b.getDataOutputStream().writeByte(var2);
            super.b.getDataOutputStream().writeShort(ir.B);
            super.b.getDataOutputStream().writeShort(ir.C);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void a(int var1, int var2, int var3, int var4) {
        this.e((byte) 54);
        try {
            super.b.getDataOutputStream().writeShort(var1);
            super.b.getDataOutputStream().writeShort(var2);
            super.b.getDataOutputStream().writeByte(var3);
            super.b.getDataOutputStream().writeShort(var4);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void a(String var1) {
        if (GameMidlet.e == 10) {
            this.e((byte) 77);
        } else {
            this.e((byte) 55);
        }
        this.c(var1);
        this.k();
    }

    public final void a(int var1) {
        this.e((byte) -21);
        this.n(var1);
        this.k();
    }

    public final void a(int var1, boolean var2) {
        this.e((byte) -19);
        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeBoolean(var2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void doGiftGiving(int var1, int var2, int var3) {
        System.out.println("doGiftGiving: " + var1 + "    " + GameMidlet.i.w);
        this.e((byte) 58);
        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeShort(var2);
            super.b.getDataOutputStream().writeByte(var3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void b(int var1, int var2) {
        this.e((byte) 59);
        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeShort(var2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void doRequestYourInfo(int var1) {
        System.out.println("doRequestYourInfo: " + var1);
        this.e((byte) -22);
        this.n(var1);
        this.k();
    }

    public final void a(byte var1) {
        this.e((byte) 60);
        this.o(var1);
        this.k();
    }

    public final void a(short var1) {
        this.e((byte) -38);
        this.p(var1);
        this.k();
    }

    public final void a(boolean var1, byte[] var2) {
        this.e((byte) 84);
        try {
            super.b.getDataOutputStream().writeBoolean(true);
            super.b.getDataOutputStream().writeByte(var2.length);
            for (int var4 = 0; var4 < var2.length; ++var4) {
                super.b.getDataOutputStream().writeByte(var2[var4]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void b() {
        this.e((byte) 85);
        this.k();
    }

    public final void c(int var1, int var2) {
        this.e((byte) -68);
        try {
            super.b.getDataOutputStream().writeByte(var1);
            super.b.getDataOutputStream().writeInt(var2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void b(int var1, int var2, int var3) {
        this.e((byte) -77);
        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
            super.b.getDataOutputStream().writeByte(var3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void c(int var1, int var2, int var3) {
        this.e((byte) -78);
        try {
            super.b.getDataOutputStream().writeInt(var1);
            super.b.getDataOutputStream().writeByte(var2);
            super.b.getDataOutputStream().writeShort(var3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void c(int var1) {
        this.e((byte) 89);
        try {
            super.b.getDataOutputStream().writeByte(0);
            super.b.getDataOutputStream().writeInt(var1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void doRequestWedding(int var1, int var2) {
        System.out.println("doRequestWedding");
        this.e((byte) 93);
        try {
            super.b.getDataOutputStream().writeByte(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }
}
