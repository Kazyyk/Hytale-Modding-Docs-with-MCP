# RootInteractionValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class RootInteractionValidator extends AssetValidator

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String value)
- @Override @Nonnull public String errorMessage(String value, String attribute)
- @Override @Nonnull public String getAssetName()
- @Nonnull public static RootInteractionValidator required()
- @Nonnull public static RootInteractionValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String value)
  public String errorMessage(String value, String attribute)
  public String getAssetName()
  public static RootInteractionValidator required()
  public static RootInteractionValidator withConfig(EnumSet<AssetValidator.Config> config)
