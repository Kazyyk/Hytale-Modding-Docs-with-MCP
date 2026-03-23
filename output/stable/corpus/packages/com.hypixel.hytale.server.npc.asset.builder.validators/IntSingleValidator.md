# IntSingleValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: IntValidator

public class IntSingleValidator extends IntValidator

Validates a single integer value against constraints.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean test(int value)
  public String errorMessage(int value)
  public String errorMessage(int value, String name)
  private String errorMessage0(int value, String name)
  public static IntValidator greaterEqual0()
  public static IntValidator greater0()

Fields:
private static final IntSingleValidator VALIDATOR_GREATER_EQUAL_0
private static final IntSingleValidator VALIDATOR_GREATER_0
private final RelationalOperator relation
private final int value
