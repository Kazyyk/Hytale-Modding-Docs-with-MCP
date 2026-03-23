# DoubleSequenceValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: DoubleValidator

public class DoubleSequenceValidator extends DoubleValidator

Validates that a double sequence is monotonically ordered.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public static DoubleSequenceValidator between01()
  public static DoubleSequenceValidator between01WeaklyMonotonic()
  public static DoubleSequenceValidator between01Monotonic()
  public static DoubleSequenceValidator between(double lower, double upper)
  public static DoubleSequenceValidator betweenWeaklyMonotonic(double lower, double upper)
  public static DoubleSequenceValidator betweenMonotonic(double lower, double upper)
  public static DoubleSequenceValidator fromExclToIncl(double lower, double upper)
  public static DoubleSequenceValidator fromExclToInclWeaklyMonotonic(double lower, double upper)
  public static DoubleSequenceValidator fromExclToInclMonotonic(double lower, double upper)
  public static DoubleSequenceValidator monotonic()
  public static DoubleSequenceValidator weaklyMonotonic()
  public boolean test(double[] values)
  public String errorMessage(double[] value)
  public String errorMessage(double[] value, String name)
  private String errorMessage0(double[] value, String name)

Fields:
private static final DoubleSequenceValidator VALIDATOR_BETWEEN_01
private static final DoubleSequenceValidator VALIDATOR_BETWEEN_01_WEAKLY_MONOTONIC
private static final DoubleSequenceValidator VALIDATOR_BETWEEN_01_MONOTONIC
private static final DoubleSequenceValidator VALIDATOR_WEAKLY_MONOTONIC
private static final DoubleSequenceValidator VALIDATOR_MONOTONIC
private final RelationalOperator relationLower
private final double lower
private final RelationalOperator relationUpper
private final double upper
private final RelationalOperator relationSequence
