# IntRangeValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: IntValidator

public class IntRangeValidator extends IntValidator

Validates that an integer value falls within a specified range.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean test(int value)
  public String errorMessage(int value)
  public String errorMessage(int value, String name)
  private String errorMessage0(int value, String name)
  public static IntRangeValidator fromInclToExcl(int lower, int upper)
  public static IntRangeValidator fromExclToIncl(int lower, int upper)
  public static IntRangeValidator between(int lower, int upper)

Fields:
private final RelationalOperator relationLower
private final int lower
private final RelationalOperator relationUpper
private final int upper
