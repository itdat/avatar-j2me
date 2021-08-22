package avatar;

import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
// dh
public final class dh implements CsInterface {
    private Image image; // a
    private String dataStr; // b
    private byte[] dataBytes;    // c
    private int lastByte;   // d
   
    // e
    private static String[] fontStyles = new String[]{"normal", "border", "arial", "black", "number", "smallRed", "smallYellow", "big"};
    private char f;
    private char g;

    public dh(int fontIndex) {
        try {
            DataInputStream fontFile = new DataInputStream(awClass.c(StringEntity.a() + "/font/" + fontStyles[fontIndex]));
            dataStr = fontFile.readUTF();
            dataBytes = new byte[dataStr.length()];
            for(int i = 0; i < dataBytes.length; ++i) {
               dataBytes[i] = fontFile.readByte();
            }
            lastByte = fontFile.readByte();
            ImageModel.b(StringEntity.ar);
            image = ImageModel.getImageFromIndex(String.valueOf(fontIndex));
            ImageModel.cleanUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(Graphics graphics, String var2, int var3, int var4, int var5) {
        int var6 = var2.length();
        if (var5 == 0) {
           var5 = var3;
        } else if (var5 == 1) {
           var5 = var3 - this.a(var2);
        } else {
           var5 = var3 - (this.a(var2) >> 1);
        }

        for(int i = 0; i < var6; ++i) {
            this.f = var2.charAt(i);
            if (this.f == ' ') {
                var5 += dataBytes[0] >> 1;
            } else {
                if ((var3 = dataStr.indexOf(this.f)) == -1) {
                    var3 = 0;
                }
                if (var3 >= 0) {
                    graphics.drawRegion(image, 0, var3 * lastByte, image.getWidth(), lastByte, 0, var5, var4, 20);
                }
                var5 += dataBytes[var3];
            }
        }
    }

    public final int a(String str) {
        int var3 = 0;
        for(int i = 0; i < str.length(); ++i) {
            this.g = str.charAt(i);
            if (this.g == ' ') {
               var3 += dataBytes[0] >> 1;
            } else {
               int var2;
               if ((var2 = dataStr.indexOf(this.g)) == -1) {
                  var2 = 0;
               }
               var3 += dataBytes[var2];
            }
        }
        return var3;
    }

    public final String[] a(String var1, int var2) {
        Vector var5 = this.b(var1, var2);
        var2 = var5.size();
        String[] var3 = new String[var2];
        for(int i = 0; i < var2; ++i) {
           var3[i] = (String)var5.elementAt(i);
        }
        return var3;
    }

    public final Vector b(String var1, int var2) {
        Vector vector = new Vector();
        int var4 = var1.length();
        if (var4 <= 1) {
            Vector var9 = new Vector();
            var9.addElement(var1);
            return var9;
        } else {
            String var5 = "";
            int var6 = 0;
            int var7 = 0;
            while(true) {
                while(this.a(var5) < var2) {
                    var5 = var5 + var1.charAt(var7);
                    ++var7;
                    if (var1.charAt(var7) == '\n') {
                        break;
                    }

                    if (var7 >= var4 - 1) {
                        var7 = var4 - 1;
                        break;
                    }
                }
                if (var7 != var4 - 1 && var1.charAt(var7 + 1) != ' ') {
                    int var8;
                    for(var8 = var7; var1.charAt(var7 + 1) != '\n' && (var1.charAt(var7 + 1) != ' ' || var1.charAt(var7) == ' ') && var7 != var6; --var7) {
                    }
                    if (var7 == var6) {
                        var7 = var8;
                    }
                }
                vector.addElement(var1.substring(var6, var7 + 1));
                if (var7 == var4 - 1) {
                    break;
                }
                for(var6 = var7 + 1; var6 != var4 - 1 && var1.charAt(var6) == ' '; ++var6) {
                }
                if (var6 == var4 - 1) {
                    break;
                }
                var7 = var6;
                var5 = "";
            }
            return vector;
        }
    }

    public final String a(String var1, String var2, String var3) {
        StringBuffer stringBuffer = new StringBuffer();
        int var5 = var1.indexOf(var2);
        int var6 = 0;
        for(int var7 = var2.length(); var5 != -1; var5 = var1.indexOf(var2, var6)) {
            stringBuffer.append(var1.substring(var6, var5)).append(var3);
            var6 = var5 + var7;
        }
        stringBuffer.append(var1.substring(var6, var1.length()));
        return stringBuffer.toString();
    }

    public final String[] a(String var1, String var2) {
        int var3 = 0;
        int var5 = var2.length();
        int var4;
        for(var4 = var1.indexOf(var2, 0); var4 != -1; ++var3) {
           var4 += var5;
           var4 = var1.indexOf(var2, var4);
        }
        String[] var8 = new String[var3 + 1];
        var4 = var1.indexOf(var2);
        int var6 = 0;
        int var7;
        for(var7 = 0; var4 != -1; ++var7) {
           var8[var7] = var1.substring(var6, var4);
           var6 = var4 + var5;
           var4 = var1.indexOf(var2, var6);
        }
        var8[var7] = var1.substring(var6, var1.length());
        return var8;
    }

    // a
    public final int getLastByte() {
        return lastByte;
    }
}
