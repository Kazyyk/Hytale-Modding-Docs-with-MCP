# NoDuplicatesValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class NoDuplicatesValidator extends Validator

Validates that a collection contains no duplicate entries.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean test()
  public String errorMessage()
  public static NoDuplicatesValidator<T> withAttributes(Iterable<T> iterable, String variableName)

Fields:
private final Iterable<T> iterable
private final String variableName
