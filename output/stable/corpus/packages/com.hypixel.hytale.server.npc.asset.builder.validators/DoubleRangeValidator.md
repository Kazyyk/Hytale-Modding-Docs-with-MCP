# DoubleRangeValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: DoubleValidator

public class DoubleRangeValidator extends DoubleValidator

Validates that a double value falls within a specified range.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public static DoubleRangeValidator between01()
  public static DoubleRangeValidator between(double lower, double upper)
  public static DoubleRangeValidator fromExclToIncl(double lower, double upper)
  public static DoubleRangeValidator fromExclToExcl(double lower, double upper)
  public boolean test(double value)
  public String errorMessage(double value)
  public String errorMessage(double value, String name)
  private String errorMessage0(double value, String name)

Fields:
private static final DoubleRangeValidator VALIDATOR_BETWEEN_01
private final RelationalOperator relationLower
private final double lower
private final RelationalOperator relationUpper
private final double upper
