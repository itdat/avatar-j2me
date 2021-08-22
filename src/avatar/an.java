package avatar;

import main.GameGraphic;

final class an implements ii {

    private final hf a;

    an(go var1, hf var2) {
        this.a = var2;
    }

    public final void a() {
        for (int var1 = 0; var1 < this.a.e.length; ++var1) {
            String var3 = "";
            dc var2;
            if (this.a.e[var1] < 100) {
                var2 = go.g(this.a.e[var1]);
                if (this.a.e[var1] < 50) {
                    var3 = gb.b((int) this.a.e[var1]).a;
                } else if (gb.c(this.a.e[var1]).c == 1) {
                    var3 = StringEntity.bn + " " + gb.c(this.a.e[var1]).l;
                } else if (gb.c(this.a.e[var1]).c == 2) {
                    var3 = StringEntity.bm + " " + gb.c(this.a.e[var1]).l;
                }
            } else {
                var2 = go.f(this.a.e[var1]);
                var3 = go.b(this.a.e[var1]).f;
            }

            if (var2 == null || var2.e < this.a.f[var1]) {
                GameGraphic.showAlert(StringEntity.NOT_ENOUGH + var3);
                return;
            }
        }

        Farm.getInstance().d(this.a.a);
        dp.b().d();
    }
}
