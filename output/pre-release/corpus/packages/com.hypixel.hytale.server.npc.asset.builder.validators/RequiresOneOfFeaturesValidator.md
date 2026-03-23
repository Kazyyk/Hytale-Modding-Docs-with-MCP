# RequiresOneOfFeaturesValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class RequiresOneOfFeaturesValidator extends Validator

Validates that at least one of the specified NPC features is enabled.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean validate(FeatureEvaluatorHelper evaluatorHelper)
  public String getErrorMessage(String context)
  public static RequiresOneOfFeaturesValidator withFeatures(EnumSet<Feature> requiredFeature)

Fields:
private final EnumSet<Feature> requiredFeature
private final String[] description
