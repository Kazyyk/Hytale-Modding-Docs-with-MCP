# HytaleLogManager

Type: class | Package: com.hypixel.hytale.logger.backend | Extends: LogManager

public class HytaleLogManager extends LogManager

## Fields

- public static HytaleLogManager instance
- private final HytaleLoggerBackend backend

## Methods

- @Override public void reset()
- private void reset0()
- @Override @Nonnull public Logger getLogger(@Nonnull String name)
- public static void resetFinally()
- @Override public String getName()
- @Override @Nonnull public Level getLevel()
- @Override public boolean isLoggable(@Nonnull Level level)
- @Override public void log(@Nonnull LogRecord record)
- @Override public void setLevel(@Nonnull Level newLevel)

## Inner Types

- `HytaleLogManager.HytaleJdkLogger`
