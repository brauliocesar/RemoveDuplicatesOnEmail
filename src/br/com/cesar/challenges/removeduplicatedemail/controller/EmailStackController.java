package br.com.cesar.challenges.removeduplicatedemail.controller;

import br.com.cesar.challenges.removeduplicatedemail.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailStackController {
    private final List<Email> g_mEmailList = new ArrayList<>();

    /**
     * Add A New Email To Stack
     *
     * @param pEmail
     */
    public void addEmail(final Email pEmail)  {
        g_mEmailList.add(pEmail);
    }

    /**
     * Remove Email From Stack
     *
     * @param pEmail
     */
    public void remEmail(final Email pEmail) {
        g_mEmailList.remove(pEmail);
    }

    /**
     * Search and Remove All Duplicated Emails
     */
    public void removeDuplicatedEmails() {
        List<Email> mEmailCopy = List.copyOf(g_mEmailList);
        for (int iIndexEmail = 0; iIndexEmail < mEmailCopy.size(); iIndexEmail++) {
            Email mEmail = mEmailCopy.get(iIndexEmail);
            removeDuplicatedEmails(iIndexEmail + 1, mEmail);
        }
    }

    /**
     * Remove Duplicated Emails By Index
     */
    private void removeDuplicatedEmails(int iIndex, Email mEmailReference) {
        List<Email> mEmailCopy = List.copyOf(g_mEmailList);
        for (int iIndexEmail = iIndex; iIndexEmail < mEmailCopy.size(); iIndexEmail++) {
            Email mEmail = mEmailCopy.get(iIndexEmail);
            if (mEmailReference.equals(mEmail)) {
                g_mEmailList.remove(iIndexEmail);
            }
        }
    }

    /**
     * Clear Email List
     */
    public void clearEmailList() {
        g_mEmailList.clear();
    }

    /**
     * Print All Emails From List
     */
    public void printEmailList() {
        for (int iIndexEmail = 0; iIndexEmail < g_mEmailList.size(); iIndexEmail++) {
            System.out.println(g_mEmailList.get(iIndexEmail).getBody());
        }
    }
}
