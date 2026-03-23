# OnePresentValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class OnePresentValidator extends Validator

Validates that exactly one of the specified attributes is present.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static int countPresent(int size, IntPredicate presentPredicate)
  public static boolean test(BuilderObjectHelper<?>[] objects)
  public static boolean test(boolean[] readStatus)
  public static int countPresent(BuilderObjectHelper<?> objectHelper)
  public static int countPresent(BuilderObjectHelper<?> objectHelper1, BuilderObjectHelper<?> objectHelper2)
  public static int countPresent(BuilderObjectHelper<?> objectHelper1, BuilderObjectHelper<?> objectHelper2, BuilderObjectHelper<?> objectHelper3)
  public static boolean test(BuilderObjectHelper<?> objectHelper1, BuilderObjectHelper<?> objectHelper2)
  public static boolean test(BuilderObjectHelper<?> objectHelper1, BuilderObjectHelper<?> objectHelper2, BuilderObjectHelper<?> objectHelper3)
  public static String errorMessage(String[] attributes, BuilderObjectHelper<?>[] objects)
  public static String errorMessage(String[] attributes, boolean[] readStatus)
  public static String errorMessage(String[] attributes, IntPredicate presentPredicate)
  public static OnePresentValidator withAttributes(String attributes)

Fields:
private final String[] attributes
