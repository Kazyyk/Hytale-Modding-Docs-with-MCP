# ArrayValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class ArrayValidator extends Validator

Base class for array-type validators.

Known subclasses: ArrayNotEmptyValidator

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public abstract boolean test(BuilderObjectArrayHelper<?,?> var1)
  public abstract String errorMessage(String var1, BuilderObjectArrayHelper<?,?> var2)
  public abstract String errorMessage(BuilderObjectArrayHelper<?,?> var1)
