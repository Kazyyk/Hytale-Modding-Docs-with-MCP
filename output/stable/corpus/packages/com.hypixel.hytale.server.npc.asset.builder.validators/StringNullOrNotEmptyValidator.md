# StringNullOrNotEmptyValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: StringValidator

public class StringNullOrNotEmptyValidator extends StringValidator

Validates that a string attribute is either null or non-empty.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean test(String value)
  public String errorMessage(String value)
  public String errorMessage(String value, String name)
  private String errorMessage0(String value, String name)
  public static StringNullOrNotEmptyValidator get()

Fields:
private static final StringNullOrNotEmptyValidator INSTANCE
