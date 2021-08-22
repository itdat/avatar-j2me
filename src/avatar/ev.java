package avatar;

import javax.microedition.lcdui.Graphics;

public final class ev {

    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    int a;
    private static int[][] h = new int[][]{{6, 0, 7, 1, 6, 2, 7, 3}, {6, 5, 7, 4, 6, 3, 7, 2}, {7, 4, 6, 1, 7, 3, 6, 5}};
    boolean b;
    private static byte i;
    private static byte j;

    public ev(int var1, int var2, int var3, int var4, boolean var5) {
        this.c = var1;
        this.f = var2;
        this.g = var3;
        this.a = var4;
        this.b = var5;
        j = 50;
        i = 54;
        if (gy.Y == 2) {
            j = 108;
            i = 108;
        }
    }

    public final void a(Graphics var1) {
        if (fxClass.c((short) 874).d != -1) {
            int var10003 = this.e * j;
            var1.drawRegion(fxClass.c((short) 874).a, 0, var10003, i, j, 0, this.c, this.f, 17);
        }
    }

    public final void a() {
        if (!this.b) {
            if (main.GameGraphic.l % 2 == 0) {
                ++this.d;
                if (this.d > h[this.g].length - 1) {
                    this.d = 0;
                }
            }

            this.e = h[this.g][this.d];
        } else {
            this.e = this.a;
        }
    }
}
