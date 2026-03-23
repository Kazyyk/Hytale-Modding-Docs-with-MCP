# ParticleSystemExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ParticleSystemExistsValidator extends AssetValidator

## Fields

- private static final ParticleSystemExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String particleSystem)
- @Override @Nonnull public String errorMessage(String particleSystem, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static ParticleSystemExistsValidator required()
- @Nonnull public static ParticleSystemExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String particleSystem)
  public String errorMessage(String particleSystem, String attributeName)
  public String getAssetName()
  public static ParticleSystemExistsValidator required()
  public static ParticleSystemExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final ParticleSystemExistsValidator DEFAULT_INSTANCE
