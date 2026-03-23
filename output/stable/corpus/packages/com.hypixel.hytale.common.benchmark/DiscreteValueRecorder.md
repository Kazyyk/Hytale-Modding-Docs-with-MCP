# DiscreteValueRecorder

Type: class | Package: com.hypixel.hytale.common.benchmark

public class DiscreteValueRecorder

Class in the benchmark subsystem.

## Fields

- DEFAULT_COLUMN_SEPARATOR | String | Static final String field.
- DEFAULT_COLUMN_FORMAT_HEADER | String | Static final String field.
- DEFAULT_COLUMN_FORMAT_VALUE | String | Static final String field.
- DEFAULT_COLUMNS | String[] | Static final String[] field.
- minValue | long | long field.
- maxValue | long | long field.
- sumValues | long | long field.
- count | long | long field.

## Constructors

- DiscreteValueRecorder() | Creates a new DiscreteValueRecorder instance.

## Methods

- reset() | void | public method.
- getMinValue(long def) | long | public method.
- getMinValue() | long | public method.
- getMaxValue(long def) | long | public method.
- getMaxValue() | long | public method.
- getCount() | long | public method.
- getAverage(long def) | long | public method.
- getAverage() | long | public method.
- record(long value) | void | public method.
- toString() | String | public method.
- formatHeader(@Nonnull Formatter formatter) | void | public method.
- formatHeader(@Nonnull Formatter formatter, @Nonnull String columnFormatHeader) | void | public method.
- formatValues(@Nonnull Formatter formatter) | void | public method.
- formatValues(@Nonnull Formatter formatter, @Nonnull String columnFormatValue) | void | public method.
