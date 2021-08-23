package avatar;

import main.GameGraphic;

final class ab implements Intent {
    
    private go a;
    private final ai b;

    ab(go var1, ai var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void a() {
        boolean var1 = false;
        ad var2 = gb.c(this.b.k);
        for (int i = 0; i < go.d.size(); ++i) {
            dc var4 = (dc) go.d.elementAt(i);
            az var5 = go.b(var4.a);
            if (var5.d == var2.c && var5.e == 5 && var4.e > 0) {
                var1 = true;
                this.b.i = false;
                go.getInstance();
                go.a(var5.a, this.b.w);
                this.a.d(10, -1);
            }
        }
        if (!var1) {
            GameGraphic.showAlert(StringEntity.OUT_OF_FEED);
            this.a.a((int) 8, (int) -1);
        }
    }
}
