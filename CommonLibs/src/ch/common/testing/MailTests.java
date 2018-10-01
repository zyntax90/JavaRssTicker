package ch.common.testing;

import javax.mail.MessagingException;

import org.junit.jupiter.api.Test;

import ch.common.utils.Mail;
import ch.common.utils.MailUtil;

public class MailTests {

	@Test
	void testSendMail() throws MessagingException {
		MailUtil mailUtil = new MailUtil("snoopyflopp@gmail.com", "HakunaMatata");
		mailUtil.sendMail("smtp.googlemail.com", new Mail("asdasd", "roshan90@hispeed.ch", "Anime Torrents today", "Alle auflisten"));
	}
}
