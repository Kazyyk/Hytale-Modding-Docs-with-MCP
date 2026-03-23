# HytaleSentryHandler

Type: class | Package: com.hypixel.hytale.logger.sentry | Extends: Handler

public class HytaleSentryHandler extends Handler

Extends `Handler` to provide HytaleSentryHandler functionality.

## Constants

- public static final String MECHANISM_TYPE
- public static final String THREAD_ID

## Fields

- private final IScopes scope
- private boolean printfStyle
- @Nonnull private Level minimumBreadcrumbLevel
- @Nonnull private Level minimumEventLevel
- @Nonnull private Level minimumLevel

## Methods

- public HytaleSentryHandler(@Nonnull IScopes scope)
- @Override public void publish(@Nonnull LogRecord record)
- protected void captureLog(@Nonnull LogRecord loggingEvent)
- @Nonnull private String maybeFormatted(@Nonnull Object[] arguments, @Nonnull String message)
- private void retrieveProperties()
- @Nullable private static SentryLevel formatLevel(@Nonnull Level level)
- @Nonnull private static SentryLogLevel toSentryLogLevel(@Nonnull Level level)
- @Nonnull private Level parseLevelOrDefault(@Nonnull String levelName)
- @Nonnull private Breadcrumb createBreadcrumb(@Nonnull LogRecord record)
- @Nonnull private List<String> toParams(@Nullable Object[] arguments)
- @Nonnull private String formatMessage(@Nonnull String message, @Nullable Object[] parameters)
- @Override public void flush()
- @Override public void close()
- public void setPrintfStyle(boolean printfStyle)
- public void setMinimumBreadcrumbLevel(@Nullable Level minimumBreadcrumbLevel)
- @Nonnull public Level getMinimumBreadcrumbLevel()
- public void setMinimumEventLevel(@Nullable Level minimumEventLevel)
- @Nonnull public Level getMinimumEventLevel()
- public void setMinimumLevel(@Nullable Level minimumLevel)
- @Nonnull public Level getMinimumLevel()
- public boolean isPrintfStyle()
