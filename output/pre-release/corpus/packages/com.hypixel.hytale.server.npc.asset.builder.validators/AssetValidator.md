# AssetValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class AssetValidator extends Validator

Validates NPC asset configurations.

Known subclasses: AttitudeGroupExistsValidator, BarterShopExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ObjectiveExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, ShopExistsValidator, SoundEventExistsValidator, TagSetExistsValidator, WeatherExistsValidator

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public boolean isNullable()
  public boolean canBeEmpty()
  public boolean isListNullable()
  public boolean canListBeEmpty()
  public boolean isMatcher()
  public abstract String getDomain()
  public abstract boolean test(String var1)
  public abstract String errorMessage(String var1, String var2)
  public abstract String getAssetName()
  public void updateSchema(StringSchema schema)

Fields:
public static final EnumSet<AssetValidator.Config> CanBeEmpty
public static final EnumSet<AssetValidator.Config> ListCanBeEmpty
private final EnumSet<AssetValidator.Config> config
