# TagSetExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class TagSetExistsValidator extends Validator

Validates that a referenced tag set exists in the NPC configuration.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public String getDomain()
  public boolean test(String value)
  public String errorMessage(String value, String attribute)
  public String getAssetName()
  public static TagSetExistsValidator required()
  public static TagSetExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final TagSetExistsValidator DEFAULT_INSTANCE
