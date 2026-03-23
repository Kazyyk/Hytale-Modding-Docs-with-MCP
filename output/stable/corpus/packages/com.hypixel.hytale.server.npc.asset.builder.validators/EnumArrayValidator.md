# EnumArrayValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: ArrayValidator

public class EnumArrayValidator extends ArrayValidator

Validates enum array attributes.

Known subclasses: EnumArrayNoDuplicatesValidator

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public abstract boolean test(T[] var1, Class<T> var2)
  public abstract String errorMessage(String var1, T[] var2)
