# IntOrValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: IntValidator

public class IntOrValidator extends IntValidator

Validates that an integer value equals one of a set of allowed values.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean test(int value)
  public String errorMessage(int value)
  public String errorMessage(int value, String name)
  private String errorMessage0(int value, String name)
  public static IntOrValidator greater0OrMinus1()

Fields:
private final RelationalOperator relationOne
private final RelationalOperator relationTwo
private final int valueOne
private final int valueTwo
