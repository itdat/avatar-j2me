package avatar;

final class s implements Intent {

    private go a;
    private final ai b;

    s(go var1, ai var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void a() {
        boolean var1 = false;
        for (int var2 = 0; var2 < go.d.size(); ++var2) {
            dc var3 = (dc) go.d.elementAt(var2);
            az var4 = go.b(var3.a);
            if (var3.a == 120) {
                go.a(this.a, var4, var3.a, this.b);
                var1 = true;
                break;
            }
        }

        if (!var1) {
            main.GameGraphic.showAlert(StringEntity.dV);
            go.getInstance().a((int) 8, (int) -1);
        }
    }
}
