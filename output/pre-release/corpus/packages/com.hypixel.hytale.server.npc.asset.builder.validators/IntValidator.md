# IntValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class IntValidator extends Validator

Base class for integer-type validators.

Known subclasses: IntOrValidator, IntRangeValidator, IntSingleValidator

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public abstract boolean test(int var1)
  public static boolean compare(int value, RelationalOperator op, int c)
  public abstract String errorMessage(int var1)
  public abstract String errorMessage(int var1, String var2)
