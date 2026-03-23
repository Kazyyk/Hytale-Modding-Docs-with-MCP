# EntityEffectExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class EntityEffectExistsValidator extends AssetValidator

## Fields

- private static final EntityEffectExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String effect)
- @Override @Nonnull public String errorMessage(String effect, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static EntityEffectExistsValidator required()
- @Nonnull public static EntityEffectExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String effect)
  public String errorMessage(String effect, String attributeName)
  public String getAssetName()
  public static EntityEffectExistsValidator required()
  public static EntityEffectExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final EntityEffectExistsValidator DEFAULT_INSTANCE
