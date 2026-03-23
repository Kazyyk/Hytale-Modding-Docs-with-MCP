# StringsOneSetValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class StringsOneSetValidator extends Validator

Validates that exactly one of the specified string attributes is set.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static boolean test(String string1, String string2)
  public static String errorMessage(String string1, String string2, String context)
  public static String errorMessage(String string1, String attribute1, String string2, String attribute2, String context)
  public static String formatErrorMessage(String string1, String attribute1, String string2, String attribute2, String context)
  public static StringsOneSetValidator withAttributes(String attribute1, String attribute2)
  public static StringsOneSetValidator withAttributes(String[] attributes)

Fields:
private final String[] attributes
