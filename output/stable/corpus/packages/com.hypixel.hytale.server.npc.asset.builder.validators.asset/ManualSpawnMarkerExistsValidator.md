# ManualSpawnMarkerExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ManualSpawnMarkerExistsValidator extends AssetValidator

## Fields

- private static final ManualSpawnMarkerExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String marker)
- @Override @Nonnull public String errorMessage(String marker, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static ManualSpawnMarkerExistsValidator required()
- @Nonnull public static ManualSpawnMarkerExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String marker)
  public String errorMessage(String marker, String attributeName)
  public String getAssetName()
  public static ManualSpawnMarkerExistsValidator required()
  public static ManualSpawnMarkerExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final ManualSpawnMarkerExistsValidator DEFAULT_INSTANCE
