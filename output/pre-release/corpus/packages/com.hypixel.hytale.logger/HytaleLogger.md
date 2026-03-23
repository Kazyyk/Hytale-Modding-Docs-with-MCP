# HytaleLogger

Type: class | Package: com.hypixel.hytale.logger | Extends: AbstractLogger<HytaleLogger.Api>

public class HytaleLogger extends AbstractLogger<HytaleLogger.Api>

Extends `AbstractLogger` to provide HytaleLogger functionality.

## Fields

- private static final Map<String, HytaleLogger> CACHE
- private static final HytaleLogger LOGGER
- @Nonnull private final HytaleLoggerBackend backend

## Methods

- private HytaleLogger(@Nonnull HytaleLoggerBackend backend)
- public static void init()
- public static void replaceStd()
- public static HytaleLogger getLogger()
- @Nonnull public static HytaleLogger forEnclosingClass()
- @Nonnull public static HytaleLogger forEnclosingClassFull()
- @Nonnull public static HytaleLogger get(String loggerName)
- public HytaleLogger.Api at(@Nonnull Level level)
- public String getName()
- @Nonnull public Level getLevel()
- public void setLevel(@Nonnull Level level)
- @Nonnull public HytaleLogger getSubLogger(String name)
- public void setSentryClient(@Nonnull IScopes scope)
- public void setPropagatesSentryToParent(boolean propagate)
- @Nonnull private static String classToLoggerName(@Nonnull String className)

Also in this package: Api, Context, NoOp

Complete API:
  public static void init()
  public static void replaceStd()
  public static HytaleLogger getLogger()
  public static HytaleLogger forEnclosingClass()
  public static HytaleLogger forEnclosingClassFull()
  public static HytaleLogger get(String loggerName)
  public HytaleLogger.Api at(Level level)
  public String getName()
  public Level getLevel()
  public void setLevel(Level level)
  public HytaleLogger getSubLogger(String name)
  public void setSentryClient(IScopes scope)
  public void setPropagatesSentryToParent(boolean propagate)
  private static String classToLoggerName(String className)

Fields:
private static final Map<String,HytaleLogger> CACHE
private static final HytaleLogger LOGGER
static final HytaleLogger.NoOp NO_OP
private final HytaleLoggerBackend backend
