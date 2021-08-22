package avatar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

// jr
public final class IOStream {
    // a
    public byte a;
    
    // b
    private ByteArrayOutputStream byteArrayOutputStream = null;
    
    // c
    private DataOutputStream dataOutputStream = null;
    
    // d
    private ByteArrayInputStream byteArrayInputStream = null;
    
    // e
    private DataInputStream dataInputStream = null;

    public IOStream() {
    }

    public IOStream(byte var1) {
       this.a = var1;
       byteArrayOutputStream = new ByteArrayOutputStream();
       dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    }

    public IOStream(byte var1, byte[] var2) {
       this.a = var1;
       byteArrayInputStream = new ByteArrayInputStream(var2);
       dataInputStream = new DataInputStream(byteArrayInputStream);
    }

    // a
    public final byte[] getByteArray() {
        return byteArrayOutputStream.toByteArray();
    }

    // b
    public final DataInputStream getDataInputStream() {
        return dataInputStream;
    }

   // c
    public final DataOutputStream getDataOutputStream() {
        return dataOutputStream;
    }

   // d
    public final void closeDataStream() {
        try {
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
