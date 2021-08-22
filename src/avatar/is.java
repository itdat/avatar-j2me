package avatar;

public class is extends ai {

    public int t = 0;
    public byte u;

    public is(int var1, int var2, int var3, byte var4) {
        super(0, 0, var3, var4);
    }

    public void b() {
        super.b();
    }

    public final void f() {
        super.f();
        if (!super.f && super.w == this.t && super.c > 150) {
            super.c = 150;
        }

    }

    public void a() {
    }

    public dn i() {
        return (dn) go.j[this.u].elementAt(awClass.e(go.j[this.u].size()));
    }

    public final void c() {
        if (!super.f && this.t == super.w) {
            this.g();
        } else {
            dr var1 = new dr();
            if (super.f && go.j[this.u].size() > 0) {
                dn var5;
                if ((var5 = this.i()) != null) {
                    var1.a = var5.aw;
                    var1.b = var5.ax;
                    super.G = 2;
                    super.n = var1;
                } else {
                    this.g();
                }
            } else {
                int var2 = ir.m.size();

                for (int var3 = 0; var3 < var2; ++var3) {
                    gx var4;
                    if ((var4 = (gx) ir.m.elementAt(var3)) instanceof is && var4.w == this.t) {
                        var1 = new dr(var4.aw, var4.ax);
                        break;
                    }
                }

                if (this.u != 1 && !ir.b(super.aw, super.ax)) {
                    this.g();
                } else {
                    this.a(var1);
                }
            }
        }
    }

    public void a(dr var1) {
    }

    public final void h() {
        int var1 = go.j[this.u].size();
        if (super.i && super.f && var1 > 0) {
            for (int var2 = 0; var2 < var1; ++var2) {
                dn var3 = (dn) go.j[this.u].elementAt(var2);
                if (awClass.f(var3.aw - super.aw) <= 2 && awClass.f(var3.ax - super.ax) <= 2) {
                    go.j[this.u].removeElement(var3);
                    ir.n.removeElement(var3);
                    super.i = false;
                    super.f = false;
                    super.G = 1;
                    go.getInstance();
                    go.a(var3.j, super.w);
                    break;
                }
            }
        }

        super.h();
        super.e = 100 - (this.t != super.w ? this.u * awClass.e(70) : 0);
    }

    public final void d() {
        if (go.j[this.u].size() == 0) {
            super.f = false;
        } else if (super.i && !super.f) {
            super.f = true;
        }
    }
}
