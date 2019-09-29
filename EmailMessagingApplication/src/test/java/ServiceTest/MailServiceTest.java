import javax.annotation.Resource;

import Services.MailService;
import junit.framework.Assert;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class MailServiceTest {

    private static final Log log = LogFactory.getLog(MailServiceTest.class);

    @Resource
    private MailService mailService;

    /**
     * Probamos el envío
     */
    @Test
    public void cantSendMails() {
        try {
            mailService.send("adolfogonzaleztallon@gmail.com", "Test de envío de email.", "Prueba del envío de correo electrónico.");
            Assert.fail("No debería realizar el envío puesto que el host no está correctamente configurado en el entorno de test.");
        }
        catch(Exception e){
            log.trace("Excepción controlada, normal en el entorno de test",e);
        }
    }

}