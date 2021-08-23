package avatar;

import javax.microedition.lcdui.Graphics;

final class fk extends Button {

    private final CharacterStatsEntity f;

    fk(aeClass var1, String var2, Intent var3, CharacterStatsEntity var4) {
        super((String) null, (Intent) null);
        this.f = var4;
    }

    public final void a(Graphics var1, int var2, int var3) {
        var2 = dp.c / 2 + 7;
        var3 = (dp.d - hj.at - (gy.Z << 1)) / 7;
        int var4 = var3 / 2 - aeClass.k.getHeight() / 2;
        aeClass.a(var1, StringEntity.STAT_NAMES[0] + this.f.g, var2, var4, this.f.f);
        aeClass.a(var1, StringEntity.STAT_NAMES[1], var2, var4 += var3, this.f.a);
        aeClass.a(var1, StringEntity.STAT_NAMES[2], var2, var4 += var3, this.f.b);
        aeClass.a(var1, StringEntity.STAT_NAMES[3], var2, var4 += var3, this.f.e);
        aeClass.a(var1, StringEntity.STAT_NAMES[4], var2, var4 += var3, this.f.c);
        aeClass.a(var1, StringEntity.STAT_NAMES[5], var2, var4 + var3, this.f.d);
    }
}
