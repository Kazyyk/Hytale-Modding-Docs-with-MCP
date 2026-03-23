# LoggerUtil

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class LoggerUtil

Logging utilities for the HytaleGenerator system including exception formatting and nanosecond-to-millisecond conversion.

## Constants

- String HYTALE_GENERATOR_NAME

## Key Methods

- public static Logger getLogger()
- public static void logException(@Nonnull String contextDescription, @Nonnull Throwable e)
- public static void logException(@Nonnull String contextDescription, @Nonnull Throwable e, @Nonnull Logger logger)
- public static String nsToMsDecimal(long ns)
