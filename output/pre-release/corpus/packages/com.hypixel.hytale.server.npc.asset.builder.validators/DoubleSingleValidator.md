# DoubleSingleValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: DoubleValidator

public class DoubleSingleValidator extends DoubleValidator

Validates a single double value against constraints.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public static DoubleSingleValidator greater0()
  public static DoubleSingleValidator greater(double threshold)
  public static DoubleSingleValidator greaterEqual0()
  public boolean test(double value)
  public String errorMessage(double value)
  public String errorMessage(double value, String name)
  private String errorMessage0(double value, String name)

Fields:
private static final DoubleSingleValidator VALIDATOR_GREATER_0
private static final DoubleSingleValidator VALIDATOR_GREATER_EQUAL_0
private final RelationalOperator relation
private final double value
