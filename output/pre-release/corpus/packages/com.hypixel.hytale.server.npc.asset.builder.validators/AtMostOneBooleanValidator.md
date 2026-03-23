# AtMostOneBooleanValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class AtMostOneBooleanValidator extends Validator

Validates that at most one of the specified boolean attributes is true.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public static boolean test(boolean[] values)
  public static String errorMessage(String[] attributes)
  public String errorMessage()
  public static AtMostOneBooleanValidator withAttributes(String attribute1, String attribute2)
  public static AtMostOneBooleanValidator withAttributes(String[] attributes)

Fields:
private final String[] attributes
