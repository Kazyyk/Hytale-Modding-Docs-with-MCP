# AnyBooleanValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class AnyBooleanValidator extends Validator

Validates that at least one of the specified boolean attributes is true.

Also in this package: AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public static boolean test(boolean[] values)
  public static String errorMessage(String[] attributes)
  public String errorMessage()
  public static AnyBooleanValidator withAttributes(String attribute1, String attribute2)
  public static AnyBooleanValidator withAttributes(String[] attributes)

Fields:
private final String[] attributes
