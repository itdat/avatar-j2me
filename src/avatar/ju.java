package avatar;


import avatar.awClass;
import avatar.hn;



public final class ju {
   int a;
   int b;
   int[] c;
   int[] d;
   byte[] e;
   byte[] f;
   byte[] g;

   public ju(hn var1, int var2, int var3) {
      this.a = var2;
      this.b = var3;
      this.c = new int[3];
      this.d = new int[3];
      this.e = new byte[3];
      this.f = new byte[3];
      this.g = new byte[3];

      for(int var4 = 0; var4 < 3; ++var4) {
         this.e[var4] = (byte)awClass.e(8);
         this.d[var4] = -var4 * 20;
         this.f[var4] = (byte)(awClass.e(2) == 0 ? 1 : -1);
         this.g[var4] = 6;
      }

   }
}
