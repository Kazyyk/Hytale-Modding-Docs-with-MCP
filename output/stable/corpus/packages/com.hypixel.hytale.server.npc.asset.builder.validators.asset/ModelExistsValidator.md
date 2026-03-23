# ModelExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ModelExistsValidator extends AssetValidator

## Fields

- private static final ModelExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String model)
- @Override @Nonnull public String errorMessage(String model, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static ModelExistsValidator required()
- @Nonnull public static ModelExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String model)
  public String errorMessage(String model, String attributeName)
  public String getAssetName()
  public static ModelExistsValidator required()
  public static ModelExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final ModelExistsValidator DEFAULT_INSTANCE
