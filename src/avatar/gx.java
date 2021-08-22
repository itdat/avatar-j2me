package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class gx extends js {

    public int w;
    public String x = "";
    public int y;
    public byte z = 7;
    public byte A;
    public byte B;
    public int C;
    public int D;
    public int E = 0;
    public int F = 0;
    public int G = 4;
    public byte H = 0;
    public static byte I = 0;
    public static byte J = 2;
    public byte K;
    public boolean L;
    public boolean M;
    public short N;
    public fh O;
    public Vector P;

    public gx() {
        this.K = J;
        this.L = false;
        this.M = false;
        this.N = 0;
        this.P = new Vector();
    }

    public void a(Graphics var1) {
        if (this.O != null && main.GameGraphic.r != cd.b()) {
            this.O.a(var1);
        }
    }

    public final void a(int var1, int var2) {
        super.aw = this.C = var1;
        super.ax = this.D = var2;
    }

    public void b() {
        if (this.O != null) {
            this.O.a(super.aw, super.ax - super.aA - 12);
            if (this.O.a()) {
                this.O = null;
                this.a();
            }
        }
    }

    private void a() {
        if (this.O == null && this.P.size() > 0) {
            this.O = (fh) this.P.elementAt(0);
            this.P.removeElementAt(0);
        }

    }

    public boolean b(int var1, int var2) {
        if (this.H != -1 && this.H != 14) {
            if (this.H != 10 && this.H != 2 && this.H != 4) {
                this.H = 0;
            }

            if (this.H != 0 && this.H != 1) {
                this.E = 0;
                this.F = 0;
                return true;
            } else {
                this.H = 1;
                int var3 = super.aw;
                int var4 = super.ax;
                if (super.az == 2) {
                    var3 = this.C;
                    var4 = this.D;
                }

                if (ir.b(var3 + var1, var4 + var2)) {
                    if (var1 != 0) {
                        if (var1 > 0) {
                            this.E = this.G;
                        } else {
                            this.E = -this.G;
                        }
                    }

                    if (var2 != 0) {
                        if (var2 > 0) {
                            this.F = this.G;
                        } else {
                            this.F = -this.G;
                        }
                    }

                    return false;
                } else {
                    this.E = 0;
                    this.F = 0;
                    return true;
                }
            }
        } else {
            this.E = 0;
            this.F = 0;
            return true;
        }
    }

    public final boolean c(int var1, int var2) {
        if (this.H != 0 && this.H != 1) {
            return false;
        } else if (ir.c(super.aw + var1, super.ax + var2) == 90) {
            return false;
        } else {
            int var3 = super.aw;
            if (super.az == 0) {
                var3 += var1 < 0 ? -7 : 7;
            }

            int var4;
            int var5;
            if (var1 != 0) {
                var4 = ir.c(var3 + var1, super.ax - 24);
                var5 = ir.c(var3, super.ax - 24);
                if (var4 == 80 && var5 == 80) {
                    this.F = -this.G;
                    this.C = var3;
                    aeClass.getInstance().n();
                    return true;
                }

                var1 = ir.c(var3 + var1, super.ax + 24);
                var2 = ir.c(var3, super.ax + 24);
                if (var1 == 80 && var2 == 80) {
                    this.F = this.G;
                    this.C = var3;
                    aeClass.getInstance().n();
                    return true;
                }
            } else if (var2 != 0) {
                var4 = ir.c(var3 - 24, super.ax + var2);
                var5 = ir.c(var3 - 24, super.ax);
                if (var4 == 80 && var5 == 80) {
                    this.E = -this.G;
                    this.D = super.ax;
                    aeClass.getInstance().n();
                    return true;
                }

                var1 = ir.c(var3 + 24, super.ax + var2);
                var2 = ir.c(var3 + 24, super.ax);
                if (var1 == 80 && var2 == 80) {
                    this.E = this.G;
                    this.D = super.ax;
                    aeClass.getInstance().n();
                    return true;
                }
            }

            return false;
        }
    }

    public void a(Graphics var1, int var2, int var3, boolean var4) {
    }

    public final void a(int var1, String var2, byte var3) {
        this.P.addElement(new fh(var1, var2, var3));
        this.a();
    }
}
