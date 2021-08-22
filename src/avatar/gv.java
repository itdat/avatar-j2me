package avatar;

final class gv implements Runnable {

    private kt a;

    gv(kt var1) {
        this.a = var1;
    }

    public final void run() {
        while (true) {
            try {
                if (this.a.b()) {
                    gv var1 = this;
                    byte var2 = this.a.a.readByte();
                    if (this.a.h) {
                        var2 = kt.a(this.a, var2);
                    }

                    int var3;
                    if (this.a.h) {
                        byte var4 = this.a.a.readByte();
                        byte var5 = this.a.a.readByte();
                        var3 = (kt.a(this.a, var4) & 255) << 8 | kt.a(this.a, var5) & 255;
                    } else {
                        var3 = this.a.a.readUnsignedShort();
                    }

                    byte[] var11 = new byte[var3];
                    int var12 = 0;
                    int var6 = 0;

                    int var7;
                    while (var12 != -1 && var6 < var3) {
                        if ((var12 = var1.a.a.read(var11, var6, var3 - var6)) > 0) {
                            var6 += var12;
                            kt var10000 = var1.a;
                            var10000.g += var6 + 5;
                            var7 = kt.getInstance().g + kt.getInstance().f;
                            var1.a.k = var7 / 1024 + "." + var7 % 1024 / 102 + "Kb";
                        }
                    }

                    if (var1.a.h) {
                        for (var7 = 0; var7 < var11.length; ++var7) {
                            var11[var7] = kt.a(var1.a, var11[var7]);
                        }
                    }

                    IOStream var10;
                    if ((var10 = new IOStream(var2, var11)) != null) {
                        try {
                            if (var10.a == -27) {
                                this.a(var10);
                                continue;
                            }

                            this.a.b.a(var10);
                        } catch (Exception var8) {
                            var8.printStackTrace();
                        }
                        continue;
                    }
                }
            } catch (Exception var9) {
            }

            if (this.a.c) {
                if (this.a.b != null) {
                    if (System.currentTimeMillis() - this.a.j > 500L) {
                        this.a.b.onDisconnected();
                    } else {
                        this.a.b.onConnectionFail();
                    }
                }

                if (kt.a(this.a) != null) {
                    kt.c(this.a);
                }
            }
            return;
        }
    }

    private void a(IOStream iOStream) {
        try {
            byte var2 = iOStream.getDataInputStream().readByte();
            this.a.i = new byte[var2];
            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                this.a.i[var3] = iOStream.getDataInputStream().readByte();
            }
            for (var3 = 0; var3 < this.a.i.length - 1; ++var3) {
                byte[] var10000 = this.a.i;
                var10000[var3 + 1] ^= this.a.i[var3];
            }
            this.a.h = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
