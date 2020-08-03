package br.com.cesar.challenges.removeduplicatedemail;

import br.com.cesar.challenges.removeduplicatedemail.controller.EmailStackController;
import br.com.cesar.challenges.removeduplicatedemail.model.Email;

/**
 * Remove duplicates on email thread:
 *      When different email clients are used on a same thread, the discussion get messy
 *      because old messages are included again and get duplicated. Given a email thread
 *      (represented by a singly unsorted linked list of messages), write a function that
 *      remove duplicated messages from it.
 */
public class Main {

    public static void main(String[] args) {

        // Create Email Stack Controller List Of Emails
        EmailStackController controller = new EmailStackController();

        // Create Email One
        final Email mEmail = new Email();
        mEmail.setTo("bnetogil");
        mEmail.setBody("Ola Mundo");

        // Create Email Two
        final Email mEmailDuplicate = new Email();
        mEmailDuplicate.setTo("bnetogil");
        mEmailDuplicate.setBody("Ola Mundo");

        // Add Two Email To Controller
        controller.addEmail(mEmail);
        controller.addEmail(mEmailDuplicate);

        controller.printEmailList();

        controller.removeDuplicatedEmails();

        controller.printEmailList();

        System.out.println("equals: " + mEmail.equals(mEmailDuplicate));
        System.out.println("hascode: " + (mEmail.hashCode() == mEmailDuplicate.hashCode()));
    }
}
