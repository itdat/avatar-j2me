package avatar;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

final class fs implements CommandListener {

    private final Command a;
    private final TextField b;

    fs(ea var1, Command var2, TextField var3) {
        this.a = var2;
        this.b = var3;
    }

    public final void commandAction(Command var1, Displayable var2) {
        if (var1 == this.a) {
            if (this.b.getString().equals("")) {
                return;
            }

            cx.getInstance().a((byte) 2, this.b.getString());
        }

        main.GameGraphic.INST.setFullScreenMode(true);
        Display.getDisplay(GameMidlet.gameMidlet).setCurrent(main.GameGraphic.INST);
    }
}
