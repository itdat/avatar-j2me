package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ba extends gz {

    private static ht d;
    private static ht e;
    private byte f = 0;
    private int g = 0;
    public int a;
    private int h;
    private static int i = 5;
    private static int j;
    private static int k = awClass.b(1, -1);
    private Vector l = new Vector();

    public final void a() {
        super.a();
    }

    public ba(int var1, int var2) {
        this.f = (byte) var1;
        this.g = var2 * 10;
        if (gy.Y == 1) {
            this.g = var2 * 5;
        }

        this.h = (int) (System.currentTimeMillis() / 1000L);
        switch (var1) {
            case 0:
                this.g = main.GameGraphic.width * main.GameGraphic.height / 1000 + 50;
                break;
            case 1:
                this.g = 30;
                if (d == null) {
                    ImageModel.b(StringEntity.EFFECT_AV);
                    d = ht.a("cobay", 16 * gy.Y, 10 * gy.Y);
                    ImageModel.cleanUp();
                }
            case 2:
            default:
                break;
            case 3:
                this.g = main.GameGraphic.width * main.GameGraphic.height / 1000;
                ImageModel.b(StringEntity.EFFECT_AV);
                ht.a("tuyet", 5 * gy.Y, 5 * gy.Y);
                ImageModel.cleanUp();
                e = d;
        }

        dn var3;
        for (var2 = 0; var2 < this.g; ++var2) {
            (var3 = new dn(0, (do1.a().b - (main.GameGraphic.height << 1) + awClass.e(main.GameGraphic.height << 1)) * 10)).aw = (-main.GameGraphic.width / 2 + awClass.e(ir.e * ir.i + main.GameGraphic.width)) * 10;
            if (var1 != 3 && this.f != 2) {
                var3.e = awClass.e(4);
            } else {
                var3.e = awClass.e(3);
            }

            var3.g = 16 + (awClass.e(3) << 2);
            var3.c = awClass.b(-1, 1);
            var3.f = awClass.e(var3.g);
            var3.i = (byte) awClass.e(20);
            this.l.addElement(var3);
        }

        if (var1 == 2) {
            for (var2 = 0; var2 < this.l.size() - 1; ++var2) {
                var3 = (dn) this.l.elementAt(var2);

                for (var1 = var2 + 1; var1 < this.l.size(); ++var1) {
                    dn var4 = (dn) this.l.elementAt(var1);
                    if (var3.e > var4.e) {
                        this.l.setElementAt(var3, var1);
                        this.l.setElementAt(var4, var2);
                        var3 = var4;
                    }
                }
            }
        }

    }

    public final void a(Graphics var1) {
        main.GameGraphic.c(var1);
        var1.translate(-do1.a().a, -do1.a().b);
        int var3;
        dn var4;
        ba var6;
        Graphics var7;
        switch (this.f) {
            case 0:
                var7 = var1;
                var6 = this;
                var1.setColor(14540253);

                for (var3 = 0; var3 < var6.g; ++var3) {
                    var4 = (dn) var6.l.elementAt(var3);
                    int var10001 = 2 - var4.e;
                    int var5 = do1.a().a * var10001 * 20 / 120;
                    var7.fillRect(var5 + var4.aw / 10, var4.ax / 10, 1, var4.e + 1);
                }

                return;
            case 1:
                var7 = var1;
                var6 = this;
                for (var3 = 0; var3 < var6.g; ++var3) {
                    if ((var4 = (dn) var6.l.elementAt(var3)).aw * gy.Y / 10 > do1.a().a && var4.aw * gy.Y / 10 < do1.a().a + main.GameGraphic.width && var4.ax * gy.Y / 10 > do1.a().b) {
                        d.a(var4.f / (var4.g / 4), var4.aw * gy.Y / 10, var4.ax * gy.Y / 10, 0, 3, var7);
                    }
                }

                return;
            case 2:
                if (super.c == -1) {
                    return;
                } else {
                    al var2 = fxClass.d(super.c);
                    for (var3 = 0; var3 < this.g; ++var3) {
                        ++(var4 = (dn) this.l.elementAt(var3)).h;
                        if (var4.aw * gy.Y / 10 > do1.a().a && var4.aw * gy.Y / 10 < do1.a().a + main.GameGraphic.width && var4.ax * gy.Y / 10 > do1.a().b && var4.ax * gy.Y / 10 < do1.a().b + main.GameGraphic.height2) {
                            if (var2 != null) {
                                if (var4.h >= var2.a.length) {
                                    var4.h = 0;
                                }
                                var2.a(var1, var4.aw / 10, var4.ax / 10, var4.h);
                            }

                            ++var4.i;
                            if (var4.i >= 20) {
                                var4.i = 0;
                            }
                        }
                    }

                    return;
                }
            case 3:
                for (var3 = 0; var3 < this.g; ++var3) {
                    if ((var4 = (dn) this.l.elementAt(var3)).aw * gy.Y / 10 > do1.a().a && var4.aw * gy.Y / 10 < do1.a().a + main.GameGraphic.width && var4.ax * gy.Y / 10 > do1.a().b) {
                        e.a(2 - var4.e, var4.aw * gy.Y / 10, var4.ax * gy.Y / 10, 0, var1);
                    }
                }
            default:
        }
    }

    public final void b() {
        int var1 = 1;
        if (main.GameGraphic.l % 6 == 3) {
            var1 = awClass.e(15);
        }

        if (var1 == 0 && i == 5) {
            i = 5 + awClass.e(20);
            j = 50 + awClass.e(100);
        }

        if (j > 0) {
            --j;
        }

        if (j == 0 && i > 5 && main.GameGraphic.l % 4 == 2) {
            --i;
        }

        dn var10000;
        int var2;
        dn var3;
        ba var5;
        switch (this.f) {
            case 0:
                var5 = this;

                for (var2 = 0; var2 < var5.g; ++var2) {
                    var10000 = var3 = (dn) var5.l.elementAt(var2);
                    var10000.ax += (var3.e + 1) * 15 + (3 - var3.e) * 3;
                    ++var3.b;
                    var3.aw += var3.e + 1 << 2;
                    if (var3.ax / 10 > do1.a().b + main.GameGraphic.height - (4 - var3.e) * 50) {
                        var5.a(var3);
                    }

                    int var10001 = 2 - var3.e;
                    int var4 = do1.a().a * var10001 * 20 / 120;
                    if (var3.aw / 10 + var4 < do1.a().a - 10) {
                        var3.aw += (main.GameGraphic.width + 20) * 10;
                    }

                    if (var3.aw / 10 + var4 > do1.a().a + main.GameGraphic.width + 10) {
                        var3.aw -= (main.GameGraphic.width + 20) * 10;
                    }
                }

                return;
            case 1:
                var5 = this;

                for (var2 = 0; var2 < var5.g; ++var2) {
                    var10000 = var3 = (dn) var5.l.elementAt(var2);
                    var10000.ax += 10;
                    var3.aw += var3.c * 10 + i * k;
                    ++var3.f;
                    if (var3.f >= var3.g) {
                        var3.f = 0;
                    }

                    if (var3.ax / 10 > ir.f * ir.i - (4 - var3.e) * 20) {
                        var5.a(var3);
                    }
                }

                return;
            case 2:
                var5 = this;
                if (System.currentTimeMillis() / 1000L - (long) this.h > (long) this.a) {
                    ++this.a;

                    for (var2 = 0; var2 < 5; ++var2) {
                        var5.l.removeElementAt(0);
                        var5.g = var5.l.size();
                        if (var5.g == 0) {
                            var5.a();
                            return;
                        }
                    }
                }

                for (var2 = 0; var2 < var5.g; ++var2) {
                    var10000 = var3 = (dn) var5.l.elementAt(var2);
                    var10000.ax += (var3.e + 2) * 5;
                    var3.aw += (var3.e + 1 << 1) + i * k;
                    if (var3.ax / 10 > ir.f * ir.i - (4 - var3.e) * 20) {
                        var5.a(var3);
                    }
                }

                return;
            case 3:
                var5 = this;

                for (var2 = 0; var2 < var5.g; ++var2) {
                    var10000 = var3 = (dn) var5.l.elementAt(var2);
                    var10000.ax += (var3.e + 4) * 3;
                    var3.aw += (var3.e + 1 << 1) + i * k;
                    if (var3.ax / 10 > ir.f * ir.i - (4 - var3.e) * 20) {
                        var5.a(var3);
                    }
                }
        }

    }

    private void a(dn var1) {
        if (super.b) {
            this.l.removeElement(var1);
            this.g = this.l.size();
            if (this.l.size() == 0) {
                super.a();
                return;
            }
        } else {
            var1.ax = (do1.a().b - main.GameGraphic.p + awClass.e(main.GameGraphic.height << 1)) * 10;
            var1.aw = (-main.GameGraphic.width / 2 + awClass.e(ir.e * ir.i + main.GameGraphic.width)) * 10;
        }

    }
}
