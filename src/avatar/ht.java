package avatar;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ht {

    public int a;
    public int b;
    public int c;
    public Image d;

    public ht(Image var1, int var2, int var3) {
        this.d = var1;
        this.a = var2;
        this.b = var3;
        this.c = var1.getHeight() / var3;
    }

    public static ht a(String var0, int var1, int var2) {
        return new ht(ImageModel.getImageFromIndex(var0), var1, var2);
    }

    public final void a(int var1, int var2, int var3, int var4, int var5, Graphics var6) {
        if (var1 >= 0 && var1 < this.c) {
            var6.drawRegion(this.d, 0, var1 * this.b, this.a, this.b, var4, var2, var3, var5);
        }
    }

    public final void a(int var1, int var2, int var3, int var4, Graphics var5) {
        var5.drawRegion(this.d, 0, var1 * this.b, this.a, this.b, var4, var2, var3, 0);
    }

    public final void b(int var1, int var2, int var3, int var4, Graphics var5) {
        if (var1 >= 0 && var1 < this.c) {
            var5.drawRegion(this.d, var1 * this.a, var2 * this.b, this.a, this.b, 0, var3, var4, 0);
        }
    }

    public final void b(int var1, int var2, int var3, int var4, int var5, Graphics var6) {
        if (var1 >= 0 && var1 < this.c) {
            var6.drawRegion(this.d, var1 * this.a, var2 * this.b, this.a, this.b, 0, var3, var4, var5);
        }
    }
}
