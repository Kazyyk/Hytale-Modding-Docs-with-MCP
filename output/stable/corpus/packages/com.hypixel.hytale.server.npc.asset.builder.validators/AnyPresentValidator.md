# AnyPresentValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class AnyPresentValidator extends Validator

Validates that at least one of the specified attributes is present.

Also in this package: AnyBooleanValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public static boolean test(BuilderObjectHelper<?>[] objects)
  public static String errorMessage(String[] attributes)
  public String errorMessage()
  public static AnyPresentValidator withAttributes(String attribute1, String attribute2)
  public static AnyPresentValidator withAttributes(String[] attributes)

Fields:
private final String[] attributes
