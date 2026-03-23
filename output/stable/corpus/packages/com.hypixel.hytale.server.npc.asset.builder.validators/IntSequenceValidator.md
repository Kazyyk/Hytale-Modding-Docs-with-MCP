# IntSequenceValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: IntValidator

public class IntSequenceValidator extends IntValidator

Validates that an integer sequence is monotonically ordered.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static IntSequenceValidator between01()
  public static IntSequenceValidator between01WeaklyMonotonic()
  public static IntSequenceValidator between01Monotonic()
  public static IntSequenceValidator between(int lower, int upper)
  public static IntSequenceValidator betweenWeaklyMonotonic(int lower, int upper)
  public static IntSequenceValidator betweenMonotonic(int lower, int upper)
  public static IntSequenceValidator fromExclToIncl(int lower, int upper)
  public static IntSequenceValidator fromExclToInclWeaklyMonotonic(int lower, int upper)
  public static IntSequenceValidator fromExclToInclMonotonic(int lower, int upper)
  public boolean test(int[] values)
  public String errorMessage(int[] value)
  public String errorMessage(int[] value, String name)
  private String errorMessage0(int[] value, String name)

Fields:
private static final IntSequenceValidator VALIDATOR_BETWEEN_01
private static final IntSequenceValidator VALIDATOR_BETWEEN_01_WEAKLY_MONOTONIC
private static final IntSequenceValidator VALIDATOR_BETWEEN_01_MONOTONIC
private final RelationalOperator relationLower
private final int lower
private final RelationalOperator relationUpper
private final int upper
private final RelationalOperator relationSequence
