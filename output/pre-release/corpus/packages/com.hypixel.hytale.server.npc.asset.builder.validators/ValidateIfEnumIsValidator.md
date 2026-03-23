# ValidateIfEnumIsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class ValidateIfEnumIsValidator extends Validator

Validates an attribute when an enum attribute has a specific value.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static ValidateIfEnumIsValidator<E> withAttributes(String p1, Validator validator, String p2, E value)

Fields:
private final String parameter1
private final Validator validator
private final String parameter2
private final E enumValue
