package avatar;

import main.GameGraphic;

final class z implements Intent {

    private go a;
    private final ai b;

    z(go var1, ai var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void a() {
        boolean var1 = false;
        for (int i = 0; i < go.d.size(); ++i) {
            dc var3 = (dc) go.d.elementAt(i);
            if (var3.a == 121) {
                az var4 = go.b(var3.a);
                go.a(this.a, var4, var3.a, this.b);
                var1 = true;
                break;
            }
        }

        if (!var1) {
            GameGraphic.showAlert(StringEntity.OUT_OF_FLU_MEDICINE);
            go.getInstance().a((int) 8, (int) -1);
        }
    }
}
