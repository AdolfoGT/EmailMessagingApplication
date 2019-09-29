package Services;

import java.io.File;

public interface MailService {

    public void send(String to, String subject, String text);

    public void send(String to, String subject, String text, File... attachments);


}
