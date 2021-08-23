package avatar;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

final class SendGameCommandListener implements CommandListener {

    private final Command acceptedCommand;
    private final TextField phoneNumber;

    SendGameCommandListener(ea var1, Command acceptedCommand, TextField phoneNumber) {
        this.acceptedCommand = acceptedCommand;
        this.phoneNumber = phoneNumber;
    }

    public final void commandAction(Command command, Displayable displayable) {
        System.out.println("SendGameCommandListener|commandAction");
        if (command == this.acceptedCommand) {
            if (this.phoneNumber.getString().equals("")) {
                return;
            }
            cx.getInstance().sendMessageToServer((byte) 2, this.phoneNumber.getString());
        }
        
        // After send command to server, come back to game screen
        main.GameGraphic.INST.setFullScreenMode(true);
        Display.getDisplay(GameMidlet.gameMidlet).setCurrent(main.GameGraphic.INST);
    }
}
