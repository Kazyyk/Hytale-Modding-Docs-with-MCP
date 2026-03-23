# OneOrNonePresentValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class OneOrNonePresentValidator extends Validator

Validates that at most one of the specified attributes is present.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static boolean test(BuilderObjectHelper<?>[] objects)
  public static boolean test(boolean[] readStatus)
  public static boolean test(BuilderObjectHelper<?> objectHelper1, BuilderObjectHelper<?> objectHelper2)
  public static boolean test(BuilderObjectHelper<?> objectHelper1, BuilderObjectHelper<?> objectHelper2, BuilderObjectHelper<?> objectHelper3)
  public static String errorMessage(String[] attributes, BuilderObjectHelper<?>[] objectHelpers)
  public static String errorMessage(String[] attributes, boolean[] readStatus)
  public static String errorMessage(String[] attributes, IntPredicate presentPredicate)
  public static OneOrNonePresentValidator withAttributes(String attributes)

Fields:
private final String[] attributes
