# BeaconSpawnExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class BeaconSpawnExistsValidator extends AssetValidator

## Fields

- private static final BeaconSpawnExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String beacon)
- @Override @Nonnull public String errorMessage(String beacon, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static BeaconSpawnExistsValidator required()
- @Nonnull public static BeaconSpawnExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String beacon)
  public String errorMessage(String beacon, String attributeName)
  public String getAssetName()
  public static BeaconSpawnExistsValidator required()
  public static BeaconSpawnExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final BeaconSpawnExistsValidator DEFAULT_INSTANCE
