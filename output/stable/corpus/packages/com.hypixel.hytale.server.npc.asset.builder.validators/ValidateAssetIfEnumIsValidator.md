# ValidateAssetIfEnumIsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class ValidateAssetIfEnumIsValidator extends Validator

Validates an asset reference when an enum attribute has a specific value.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static ValidateAssetIfEnumIsValidator<E> withAttributes(String p1, AssetValidator validator, String p2, E value)

Fields:
private final String parameter1
private final transient AssetValidator validator
private final String parameter2
private final E enumValue
