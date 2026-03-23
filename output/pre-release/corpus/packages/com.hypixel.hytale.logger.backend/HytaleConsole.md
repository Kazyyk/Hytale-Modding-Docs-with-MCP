# HytaleConsole

Type: class | Package: com.hypixel.hytale.logger.backend | Extends: Thread

public class HytaleConsole extends Thread

## Fields

- public static final String TYPE_DUMB
- public static final HytaleConsole INSTANCE
- private final BlockingQueue<LogRecord> logRecords
- private final HytaleLogFormatter formatter
- private OutputStreamWriter soutwriter
- private OutputStreamWriter serrwriter
- private String terminalType

## Methods

- public void publish(@Nonnull LogRecord logRecord)
- @Override public void run()
- public void shutdown()
- private void publish0(@Nonnull LogRecord record)
- public void setTerminal(String type)
- private boolean shouldPrintAnsi()
- public HytaleLogFormatter getFormatter()
