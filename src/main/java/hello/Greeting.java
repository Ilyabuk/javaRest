package hello;

import java.time.LocalDateTime;

public class Greeting {
    private final long id;
    private final String content;
    private final LocalDateTime localDateTime;

    public Greeting(long id, String content, LocalDateTime localDateTime) {
        this.id = id;
        this.content = content;
        this.localDateTime = localDateTime;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
