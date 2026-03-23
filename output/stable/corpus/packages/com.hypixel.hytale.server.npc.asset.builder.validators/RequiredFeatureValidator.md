# RequiredFeatureValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class RequiredFeatureValidator extends Validator

Validates that a required NPC feature is enabled.

Known subclasses: RequiresFeatureIfEnumValidator, RequiresFeatureIfValidator, RequiresOneOfFeaturesValidator

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public abstract boolean validate(FeatureEvaluatorHelper var1)
  public abstract String getErrorMessage(String var1)
