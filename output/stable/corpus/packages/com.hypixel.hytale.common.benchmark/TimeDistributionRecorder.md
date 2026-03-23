# TimeDistributionRecorder

Type: class | Package: com.hypixel.hytale.common.benchmark | Extends: TimeRecorder

public class TimeDistributionRecorder extends TimeRecorder

Concrete implementation extending `TimeRecorder`.

## Fields

- minLogRange | int | int field.
- maxLogRange | int | int field.
- logSteps | int | int field.
- valueBins | long[] | long[] field.

## Constructors

- TimeDistributionRecorder(double maxSecs, double minSecs, int logSteps) | Creates a new TimeDistributionRecorder instance.
- TimeDistributionRecorder(double maxSecs, double minSecs) | Creates a new TimeDistributionRecorder instance.
- TimeDistributionRecorder() | Creates a new TimeDistributionRecorder instance.

## Methods

- reset() | void | public method.
- recordNanos(long nanos) | double | public method.
- timeToIndex(double secs) | int | public method.
- indexToTime(int index) | double | public method.
- size() | int | public method.
- get(int index) | long | public method.
- toString() | String | public method.
- formatHeader(@Nonnull Formatter formatter, @Nonnull String columnFormatHeader) | void | public method.
- formatValues(@Nonnull Formatter formatter, @Nonnull String columnFormatValue) | void | public method.
- formatValues(@Nonnull Formatter formatter, long normalValue) | void | public method.
- formatValues(@Nonnull Formatter formatter, long normalValue, @Nonnull String columnFormatValue) | void | public method.
