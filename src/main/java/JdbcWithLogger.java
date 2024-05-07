import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class JdbcWithLogger {
    private static final Logger Log = LoggerFactory.getLogger(JdbcWithLogger.class);
    public static void main(String[] args) throws IOException {
        Log.debug("From debug");
        Log.info("From info");
        Log.warn("From Warn");
        Log.error("From Error");
    }
}
