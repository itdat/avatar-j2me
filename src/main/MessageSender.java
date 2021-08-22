package main;

import avatar.StringEntity;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
// b
final class MessageSender implements Runnable {
    private final String uri;
    private final String payload;

    MessageSender(String uri, String payload) {
       this.uri = uri;
       this.payload = payload;
    }

    public final void run() {
        try {
            MessageConnection messageConnection = (MessageConnection) Connector.open(uri);
            TextMessage textMessage = (TextMessage) messageConnection.newMessage("text");
            textMessage.setAddress(uri);
            textMessage.setPayloadText(payload);
            messageConnection.send(textMessage);
            GameGraphic.showAlert(StringEntity.SENT_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            GameGraphic.showAlert(StringEntity.CANT_SEND_MESSAGE);
        }
    }
}
