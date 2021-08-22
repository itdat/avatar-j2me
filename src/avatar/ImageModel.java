package avatar;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

// c
public final class ImageModel {
    static ImageModel INST;  // a
    private String[] imageNameList;  // b
    private int[] imageOffsetList; // c
    private int[] imageLengthList; // d
    private byte[] imageData;    // e
    private int size;   // f
    private int g;
    private String name;   // h
    private byte[] decodeBytes = new byte[]{78, 103, 117, 121, 101, 110, 86, 97, 110, 77, 105, 110, 104};   // i
    private int numberDecodeBytes;  //j
    private DataInputStream dataInputStream;   // k

    public ImageModel() {
        numberDecodeBytes = decodeBytes.length;
    }

    // a
    public static void cleanUp() {
        INST.closeInputStream();
        INST = null;
        System.gc();
    }

    public ImageModel(String name) {
        numberDecodeBytes = decodeBytes.length;
        int offset = 0;
        int length = 0;
        this.name = name;
        this.g = 0;
        dataInputStream = new DataInputStream(getClass().getResourceAsStream(this.name));

        try {
            size = dataInputStream.readUnsignedByte();
            ++this.g;
            imageNameList = new String[size];
            imageOffsetList = new int[size];
            imageLengthList = new int[size];

            for(int i = 0; i < size; ++i) {
                byte nByte = dataInputStream.readByte();
                byte[] data = new byte[nByte];
                dataInputStream.read(data);
                decode(data);
                imageNameList[i] = new String(data);
                imageOffsetList[i] = offset;
                imageLengthList[i] = dataInputStream.readUnsignedShort();
                offset += imageLengthList[i];
                length += imageLengthList[i];
                this.g += nByte + 3;
            }

            imageData = new byte[length];
            dataInputStream.readFully(imageData);
            decode(imageData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        closeInputStream();
    }

    // a String
    public static Image getImageFromIndex(String index) {
        return INST.getImage(index + ".png");
    }

    public static void b(String var0) {
        INST = new ImageModel(StringEntity.a() + var0);
    }

    // a
    private void decode(byte[] data) {
        for(int i = 0; i < data.length; ++i) {
            data[i] ^= decodeBytes[i % numberDecodeBytes];
        }
    }

    // b
    private void closeInputStream() {
        try {
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    // d
    private Image getImage(String name) {
        for(int i = 0; i < size; ++i) {
            if (imageNameList[i].compareTo(name) == 0) {
                return Image.createImage(imageData, imageOffsetList[i], imageLengthList[i]);
            }
        }
        return null;
    }

    // c
    public final byte[] getImageBytes(String name) {
        for(int i = 0; i < size; ++i) {
            if (imageNameList[i].compareTo(name) == 0) {
                byte[] copiedImageData = new byte[imageLengthList[i]];
                System.arraycopy(imageData, imageOffsetList[i], copiedImageData, 0, imageLengthList[i]);
                return copiedImageData;
            }
        }
        return null;
    }
}
