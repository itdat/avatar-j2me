package avatar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.SocketConnection;

public final class kt implements hq {
   private static kt INST = new kt();  // m
   private DataOutputStream n;
   public DataInputStream a;
   public CmInterface b;
   private SocketConnection o;
   public boolean c;
   public boolean d;
   private final au p = new au(this);
   private Thread q;
   public Thread e;
   public int f;
   public int g;
   boolean h;
   public byte[] i = null;
   private byte r;
   private byte s;
   long j;
   public String k = "";
   public static boolean l;

   // a
   public static kt getInstance() {
      return INST;
   }

   public final boolean b() {
      return this.c;
   }

   public final void a(CmInterface var1) {
      this.b = var1;
   }

   // a
   public final void setUri(String uri) {
      if (!this.c && !this.d) {
         this.h = false;
         this.o = null;
         this.q = new Thread(new dy(this, uri));
         this.q.start();
      }
   }

   public final void a(IOStream iOStream) {
      this.p.a(iOStream);
   }

    private synchronized void b(IOStream iOStream) {
        byte[] bytes = iOStream.getByteArray();

        try {
            byte var5;
            if (this.h) {
                var5 = this.aaaa(iOStream.a);
                this.n.writeByte(var5);
            } else {
                this.n.writeByte(iOStream.a);
            }

            if (bytes != null) {
                int var6 = bytes.length;
                if (this.h) {
                    byte var3 = this.aaaa((byte)(var6 >> 8));
                    this.n.writeByte(var3);
                    var5 = this.aaaa((byte)var6);
                    this.n.writeByte(var5);
                } else {
                    this.n.writeShort(var6);
                }

                if (this.h) {
                    for(int i = 0; i < bytes.length; ++i) {
                        bytes[i] = this.aaaa(bytes[i]);
                    }
                }
                this.n.write(bytes);
                this.f += 5 + bytes.length;
            } else {
                this.n.writeShort(0);
                this.f += 5;
            }

            this.n.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // a
    private byte aaaa(byte var1) {
        byte[] var10000 = this.i;
        byte var10003 = this.s;
        this.s = (byte)(var10003 + 1);
        var1 = (byte)(var10000[var10003] & 255 ^ var1 & 255);
        if (this.s >= this.i.length) {
           this.s = (byte)(this.s % this.i.length);
        }
        return var1;
    }

    public final void c() {
        this.d();
    }

    private void d() {
        this.i = null;
        this.r = 0;
        this.s = 0;

        try {
            this.c = false;
            this.d = false;
            if (this.o != null) {
                this.o.close();
                this.o = null;
            }
            if (this.n != null) {
                this.n.close();
                this.n = null;
            }
            if (this.a != null) {
                this.a.close();
                this.a = null;
            }
            this.e = null;
            System.gc();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static SocketConnection a(kt var0) {
        return var0.o;
    }

    static au b(kt var0) {
        return var0.p;
    }

    static void a(kt var0, SocketConnection var1) {
        var0.o = var1;
    }

    static void a(kt var0, DataOutputStream var1) {
        var0.n = var1;
    }

    static void a(kt var0, IOStream iOStream) {
        var0.b(iOStream);
    }

    static void c(kt var0) {
        var0.d();
    }

    static byte a(kt var0, byte var1) {
        byte[] var10000 = var0.i;
        byte var10003 = var0.r;
        var0.r = (byte)(var10003 + 1);
        var1 = (byte)(var10000[var10003] & 255 ^ var1 & 255);
        if (var0.r >= var0.i.length) {
            var0.r = (byte)(var0.r % var0.i.length);
        }
        return var1;
    }
}
