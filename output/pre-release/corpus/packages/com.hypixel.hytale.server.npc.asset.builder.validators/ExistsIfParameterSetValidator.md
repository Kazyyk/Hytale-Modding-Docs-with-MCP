# ExistsIfParameterSetValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class ExistsIfParameterSetValidator extends Validator

Validates that an attribute exists only if a specified parameter is set.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static String errorMessage(String parameter, String attribute)
  public static ExistsIfParameterSetValidator withAttributes(String parameter, String attribute)

Fields:
private final String parameter
private final String attribute
