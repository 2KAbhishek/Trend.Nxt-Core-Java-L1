public class Email extends Document {
    String sender, receipent, title;

    public Email(String text, String sender, String receipent, String title) {
        super(text);
        this.sender = sender;
        this.receipent = receipent;
        this.title = title;
    }

    public String getSender() {
        return sender;
    }

    public String getReceipent() {
        return receipent;
    }

    public String getTitle() {
        return title;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceipent(String receipent) {
        this.receipent = receipent;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Email: \nReceipent:" + receipent + ", Sender: " + sender + ", Subject: " + title + ","
                + super.toString();
    }

}
