# TimeRecorder

Type: class | Package: com.hypixel.hytale.common.benchmark | Extends: ContinuousValueRecorder

public class TimeRecorder extends ContinuousValueRecorder

Concrete implementation extending `ContinuousValueRecorder`.

## Fields

- DEFAULT_COLUMN_SEPARATOR | String | Static final String field.
- DEFAULT_COLUMN_FORMAT_HEADER | String | Static final String field.
- DEFAULT_COLUMN_FORMAT_VALUE | String | Static final String field.
- DEFAULT_COLUMNS | String[] | Static final String[] field.
- NANOS_TO_SECONDS | double | Static final double field.

## Methods

- start() | long | public method.
- end(long start) | double | public method.
- recordNanos(long nanos) | double | public method.
- toString() | String | public method.
- formatTime(double secs) | String | static public method.
- format(double val, String suffix) | String | static protected method.
- formatHeader(@Nonnull Formatter formatter) | void | public method.
- formatHeader(@Nonnull Formatter formatter, @Nonnull String columnFormatHeader) | void | public method.
- formatValues(@Nonnull Formatter formatter) | void | public method.
- formatValues(@Nonnull Formatter formatter, @Nonnull String columnFormatValue) | void | public method.
