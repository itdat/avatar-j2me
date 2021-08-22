package avatar;



import java.util.Vector;

public final class dc {
   public short a;
   public short b;
   public byte c;
   public int[] d = new int[2];
   public int e;
   public String f = "";

   public static dc a(Vector var0, int var1) {
      int var2 = var0.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         dc var4;
         if ((var4 = (dc)var0.elementAt(var3)).a == var1) {
            return var4;
         }
      }

      return null;
   }
}
