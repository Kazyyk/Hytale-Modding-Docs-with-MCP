# RequiresFeatureIfEnumValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class RequiresFeatureIfEnumValidator extends Validator

Validates that a feature is enabled when an enum attribute has a specific value.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean validate(FeatureEvaluatorHelper evaluatorHelper)
  public String getErrorMessage(String context)
  public static boolean staticValidate(FeatureEvaluatorHelper evaluatorHelper, EnumSet<Feature> requiredFeature, E requiredValue, E value)
  public static RequiresFeatureIfEnumValidator withAttributes(String attribute, E value, EnumSet<Feature> feature)

Fields:
private final String[] description
private final String attribute
private final E value
