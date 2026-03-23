# DoubleOrValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: DoubleValidator

public class DoubleOrValidator extends DoubleValidator

Validates that a double value equals one of a set of allowed values.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public boolean test(double value)
  public String errorMessage(double value)
  public String errorMessage(double value, String name)
  private String errorMessage0(double value, String name)
  public static DoubleOrValidator greaterEqual0OrMinus1()

Fields:
private static final DoubleOrValidator GREATER_EQUAL_0_OR_MINUS_1
private final RelationalOperator relationOne
private final RelationalOperator relationTwo
private final double valueOne
private final double valueTwo
