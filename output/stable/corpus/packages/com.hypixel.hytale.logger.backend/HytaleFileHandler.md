# HytaleFileHandler

Type: class | Package: com.hypixel.hytale.logger.backend | Extends: Thread

public class HytaleFileHandler extends Thread

## Fields

- public static final DateTimeFormatter LOG_FILE_DATE_FORMAT
- public static final HytaleFileHandler INSTANCE
- private final BlockingQueue<LogRecord> logRecords
- private FileHandler fileHandler

## Methods

- @Override public void run()
- @Nullable public FileHandler getFileHandler()
- public void enable()
- public void log(@Nonnull LogRecord logRecord)
- public void shutdown()
