# EntityStatExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class EntityStatExistsValidator extends AssetValidator

## Fields

- private static final EntityStatExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String entityStat)
- @Override @Nonnull public String errorMessage(String entityStat, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static EntityStatExistsValidator required()
- @Nonnull public static EntityStatExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String entityStat)
  public String errorMessage(String entityStat, String attributeName)
  public String getAssetName()
  public static EntityStatExistsValidator required()
  public static EntityStatExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final EntityStatExistsValidator DEFAULT_INSTANCE
