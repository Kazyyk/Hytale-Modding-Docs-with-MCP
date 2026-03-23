# StringArrayNotEmptyValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class StringArrayNotEmptyValidator extends Validator

Validates that a string array attribute is not empty.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean test(String[] list)
  public String errorMessage(String name, String[] list)
  public String errorMessage(String[] list)
  public static StringArrayNotEmptyValidator get()

Fields:
private static final StringArrayNotEmptyValidator INSTANCE
