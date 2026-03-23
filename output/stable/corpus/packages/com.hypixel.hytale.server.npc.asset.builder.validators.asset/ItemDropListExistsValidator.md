# ItemDropListExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ItemDropListExistsValidator extends AssetValidator

## Fields

- private static final ItemDropListExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String value)
- @Override @Nonnull public String errorMessage(String value, String attribute)
- @Override @Nonnull public String getAssetName()
- public static ItemDropListExistsValidator required()
- @Nonnull public static ItemDropListExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String value)
  public String errorMessage(String value, String attribute)
  public String getAssetName()
  public static ItemDropListExistsValidator required()
  public static ItemDropListExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final ItemDropListExistsValidator DEFAULT_INSTANCE
