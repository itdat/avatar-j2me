package avatar;

import java.io.IOException;
import java.util.Vector;

public final class ie extends kj {

    private static ie a;

    public static ie a() {
        if (a == null) {
            a = new ie();
        }

        return a;
    }

    public final void b() {
        this.e((byte) 6);
        this.k();
    }

    public final void a(byte var1) {
        this.e((byte) 7);
        this.o(var1);
        this.k();
    }

    public final void a(int var1) {
        try {
            this.b((byte) 56);
            super.b.getDataOutputStream().writeByte(var1);
        } catch (Exception var2) {
        }

        this.k();
    }

    public final void a(byte var1, byte var2, String var3) {
        this.e((byte) 8);

        try {
            super.b.getDataOutputStream().writeByte(var1);
            super.b.getDataOutputStream().writeByte(var2);
            super.b.getDataOutputStream().writeUTF(var3);
        } catch (IOException var4) {
        }

        this.k();
    }

    public final void c() {
        this.e((byte) 28);
        this.k();
    }

    public final void d() {
        this.e((byte) -18);
        this.k();
    }

    public final void a(byte[] var1) {
        try {
            this.b((byte) 21);
            super.b.getDataOutputStream().writeByte(var1.length);

            for (int var2 = 0; var2 < var1.length; ++var2) {
                super.b.getDataOutputStream().write(var1[var2]);
            }
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void e() {
        try {
            this.b((byte) 49);
        } catch (Exception var1) {
        }

        this.k();
    }

    public final void b(byte var1) {
        try {
            super.e(var1);
            super.b.getDataOutputStream().writeByte(kx.p);
            super.b.getDataOutputStream().writeByte(kx.q);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void c(byte var1) {
        try {
            this.b((byte) 21);
            super.b.getDataOutputStream().writeByte(var1);
        } catch (Exception var2) {
        }

        this.k();
    }

    public final void f() {
        try {
            this.b((byte) 63);
        } catch (Exception var1) {
        }

        this.k();
    }

    public final void a(int[] var1, byte var2) {
        try {
            this.b((byte) 64);

            for (int var3 = 0; var3 < var1.length; ++var3) {
                super.b.getDataOutputStream().writeByte(var1[var3]);
            }

            super.b.getDataOutputStream().writeByte(var2);
        } catch (Exception var4) {
        }

        this.k();
    }

    public final void a(ax[] var1) {
        try {
            this.b((byte) 65);
            byte var2 = -1;

            for (int var3 = 0; var3 < 10; ++var3) {
                if (var1[var3].a != 0) {
                    if (var1[var3].a != var2 && var2 != -1) {
                        super.b.getDataOutputStream().writeByte(-1);
                    }

                    var2 = var1[var3].a;
                    super.b.getDataOutputStream().writeByte(var1[var3].b);
                } else if (var2 != -1) {
                    super.b.getDataOutputStream().writeByte(-1);
                    var2 = -1;
                }
            }
        } catch (Exception var4) {
        }

        this.k();
    }

    public final void a(int[] var1) {
        try {
            this.b((byte) 67);

            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2] != -1) {
                    super.b.getDataOutputStream().writeByte(var1[var2]);
                }
            }
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void a(int[] var1, int var2) {
        try {
            this.b((byte) 68);
            super.b.getDataOutputStream().writeByte(var2);

            for (var2 = 0; var2 < 5 && var1[var2] != -1; ++var2) {
                super.b.getDataOutputStream().writeByte(var1[var2]);
            }
        } catch (Exception var3) {
        }

        this.k();
    }

    public final void a(String var1) {
        try {
            this.b((byte) 9);
            super.b.getDataOutputStream().writeUTF(var1);
        } catch (IOException var2) {
        }

        this.k();
    }

    public final void g() {
        this.b((byte) 15);
        this.k();
    }

    public final void a(boolean var1) {
        try {
            this.b((byte) 16);
            super.b.getDataOutputStream().writeBoolean(var1);
        } catch (IOException var2) {
        }

        this.k();
    }

    public final void b(int var1) {
        try {
            this.b((byte) 19);
            super.b.getDataOutputStream().writeInt(var1);
        } catch (IOException var2) {
        }

        this.k();
    }

    public final void b(String var1) {
        try {
            this.b((byte) 18);
            super.b.getDataOutputStream().writeUTF(var1);
        } catch (IOException var2) {
        }

        this.k();
    }

    public final void c(int var1) {
        try {
            this.b((byte) 11);
            super.b.getDataOutputStream().writeInt(var1);
        } catch (IOException var2) {
        }

        this.k();
    }

    public final void h() {
        this.b((byte) 20);
        this.k();
    }

    public final void a(dn[][] var1) {
        try {
            this.b((byte) 64);

            for (int var2 = 0; var2 < 8; ++var2) {
                for (int var3 = 0; var3 < 8; ++var3) {
                    if (var1[var2][var3].l) {
                        var1[var2][var3].l = false;
                        super.b.getDataOutputStream().writeByte((var2 << 3) + var3);
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        this.k();
    }

    public final void a(int var1, int var2) {
        try {
            this.b((byte) 21);
            super.b.getDataOutputStream().writeByte(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (IOException var3) {
            var3.printStackTrace();
        }

        this.k();
    }

    public final void i() {
        this.b((byte) 24);
        this.k();
    }

    public final void a(Vector var1) {
        try {
            this.b((byte) 21);
            if (var1.size() > 0) {
                for (int var2 = 0; var2 < var1.size(); ++var2) {
                    kl var3 = (kl) var1.elementAt(var2);
                    super.b.getDataOutputStream().writeByte(var3.b);
                    var3.b = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void a(byte var1, byte var2) {
        try {
            this.b((byte) 65);
            super.b.getDataOutputStream().writeByte(var1);
            super.b.getDataOutputStream().writeByte(var2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void j() {
        try {
            this.b((byte) 49);
        } catch (Exception var1) {
        }
        this.k();
    }
}
