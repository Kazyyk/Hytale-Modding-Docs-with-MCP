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

Also in this package: ArrayUtil, BiOperation3i, BlockMask, EntityPlacementData, FutureUtils, GridUtils, MaterialSet, NakedOperation3i, Operation3i, PropRuntime, Registry, Retriever, ReusableList, VectorUtil, Viewport, WeightedMap

Complete API:
  public static Logger getLogger()
  public static void logException(String contextDescription, Throwable e)
  public static void logException(String contextDescription, Throwable e, Logger logger)
  public static String nsToMsDecimal(long ns)

Fields:
public static final String HYTALE_GENERATOR_NAME
