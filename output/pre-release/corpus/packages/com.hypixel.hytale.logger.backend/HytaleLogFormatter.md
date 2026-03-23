# HytaleLogFormatter

Type: class | Package: com.hypixel.hytale.logger.backend | Extends: Formatter

public class HytaleLogFormatter extends Formatter

## Fields

- private static final DateTimeFormatter DATE_FORMATTER
- private static final Pattern ANSI_CONTROL_CODES
- private BooleanSupplier ansi
- public int maxModuleName
- private int shorterCount

## Methods

- @Override @Nonnull public String format(@Nonnull LogRecord record)
- public static String stripAnsi(@Nonnull String message)
