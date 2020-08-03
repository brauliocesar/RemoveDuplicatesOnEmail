package br.com.cesar.challenges.removeduplicatedemail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class Email
 */
public class Email implements Serializable {

    private static final long serialVersionUID = -6205667212915699202L;

    private String szTo;
    private String szCc;
    private String szCco;
    private String szBody;

    public String getTo() {
        return szTo;
    }

    public void setTo(String szTo) {
        this.szTo = szTo;
    }

    public String getCc() {
        return szCc;
    }

    public void setCc(String szCc) {
        this.szCc = szCc;
    }

    public String getCco() {
        return szCco;
    }

    public void setCco(String szCco) {
        this.szCco = szCco;
    }

    public String getBody() {
        return szBody;
    }

    public void setBody(String szBody) {
        this.szBody = szBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return szTo.equals(email.szTo) &&
                Objects.equals(szCc, email.szCc) &&
                Objects.equals(szCco, email.szCco) &&
                szBody.equals(email.szBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(szTo, szCc, szCco, szBody);
    }
}
