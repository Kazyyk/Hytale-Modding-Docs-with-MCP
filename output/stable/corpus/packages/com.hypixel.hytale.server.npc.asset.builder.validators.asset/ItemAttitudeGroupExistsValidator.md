# ItemAttitudeGroupExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ItemAttitudeGroupExistsValidator extends AssetValidator

## Fields

- private static final ItemAttitudeGroupExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String attitudeGroup)
- @Override @Nonnull public String errorMessage(String attitudeGroup, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static ItemAttitudeGroupExistsValidator required()
- @Nonnull public static ItemAttitudeGroupExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String attitudeGroup)
  public String errorMessage(String attitudeGroup, String attributeName)
  public String getAssetName()
  public static ItemAttitudeGroupExistsValidator required()
  public static ItemAttitudeGroupExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final ItemAttitudeGroupExistsValidator DEFAULT_INSTANCE
