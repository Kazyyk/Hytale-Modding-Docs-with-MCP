# RequiresFeatureIfValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class RequiresFeatureIfValidator extends Validator

Validates that a feature is enabled when a condition attribute is set.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean validate(FeatureEvaluatorHelper evaluatorHelper)
  public String getErrorMessage(String context)
  public static boolean staticValidate(FeatureEvaluatorHelper evaluatorHelper, EnumSet<Feature> requiredFeature, boolean requiredValue, boolean value)
  public static RequiresFeatureIfValidator withAttributes(String attribute, boolean value, EnumSet<Feature> feature)

Fields:
private final String[] description
private final String attribute
private final boolean value
