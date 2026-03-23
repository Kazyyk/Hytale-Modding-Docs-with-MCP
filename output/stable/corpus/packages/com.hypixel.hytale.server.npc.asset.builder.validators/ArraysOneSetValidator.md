# ArraysOneSetValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class ArraysOneSetValidator extends Validator

Validates that exactly one of multiple array attributes is set.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public static boolean validate(String[] value1, String[] value2)
  private static boolean arrayContainsNonEmptyString(String[] array)
  public static String formatErrorMessage(String attr1, String attr2, String context)
  public static ArraysOneSetValidator withAttributes(String attribute1, String attribute2)
  public static ArraysOneSetValidator withAttributes(String[] attributes)

Fields:
private final String[] attributes
