package builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author nemykin 12.10.2020
 */
public class Email {

    public FromBuilder addSubject(String subject) {
        return new FromBuilder(subject);
    }

    public static class FromBuilder {
        private String subject;

        public FromBuilder(String subject) {
            this.subject = subject;

        }

        public ToBuilder addFrom(String from) {
            return new ToBuilder(subject, from);
        }
    }

    public static class ToBuilder {
        private String subject;
        private String from;

        public ToBuilder(String subject, String from) {
            this.subject = subject;
            this.from = from;

        }

        public CopyBuilder addTo(String to) {
            List<String> listTo = Stream.of(to.split(","))
                    .collect(Collectors.toList());
            return new CopyBuilder(subject, from, listTo);
        }
    }

    public static class CopyBuilder {
        private String subject;
        private String from;
        private List<String> to;

        public CopyBuilder(String subject, String from, List<String> to) {
            this.subject = subject;
            this.from = from;
            this.to = to;
        }

        public CopyBuilder addTo(String to) {
            this.to.addAll(Stream.of(to.split(","))
                    .collect(Collectors.toList()));
            return new CopyBuilder(subject, from, this.to);
        }

        public ContextBuilder addCopy(String copy) {
            List<String> listCopy = Stream.of(copy.split(","))
                    .collect(Collectors.toList());
            return new ContextBuilder(subject, from, to, listCopy);
        }
    }

    public static class ContextBuilder {
        private String subject;
        private String from;
        private List<String> to;
        private List<String> copy;

        public ContextBuilder(String subject, String from, List<String> to, List<String> copy) {
            this.subject = subject;
            this.from = from;
            this.to = to;
            this.copy = copy;
        }

        public EmailBuilder addContext(String body, String signature) {
            return new EmailBuilder(subject, from, to, copy, body, signature);
        }

    }

    public static class EmailBuilder {
        private String subject;
        private String from;
        private List<String> to;
        private List<String> copy;
        private String body;
        private String signature;

        public EmailBuilder(String subject, String from, List<String> to, List<String> copy, String body, String signature) {
            this.subject = subject;
            this.from = from;
            this.to = to;
            this.copy = copy;
            this.body = body;
            this.signature = signature;
        }

        public String build() {
            return String.format("{subject= %s\n from= %s\n to= %s\n copy= %s\n body= %s\n signature= %s}",
                    subject,
                    from,
                    to.stream().collect(Collectors.joining(",")),
                    copy.stream().collect(Collectors.joining(",")),
                    body,
                    signature);
        }
    }

}
