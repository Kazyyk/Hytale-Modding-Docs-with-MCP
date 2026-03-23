# EnumArrayNoDuplicatesValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class EnumArrayNoDuplicatesValidator extends Validator

Validates that an enum array contains no duplicate values.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public boolean test(T[] array, Class<T> clazz)
  public String errorMessage(String name, T[] array)
  public static EnumArrayNoDuplicatesValidator get()

Fields:
private static final EnumArrayNoDuplicatesValidator INSTANCE
