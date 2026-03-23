# DoubleValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class DoubleValidator extends Validator

Base class for double-type validators.

Known subclasses: DoubleOrValidator, DoubleRangeValidator, DoubleSingleValidator

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public abstract boolean test(double var1)
  public static boolean compare(double value, RelationalOperator predicate, double c)
  public abstract String errorMessage(double var1)
  public abstract String errorMessage(double var1, String var3)
