# BlockSetExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class BlockSetExistsValidator extends AssetValidator

## Fields

- private static final BlockSetExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String blockSet)
- @Override @Nonnull public String errorMessage(String blockSet, String attribute)
- @Override @Nonnull public String getAssetName()
- public static BlockSetExistsValidator required()
- @Nonnull public static BlockSetExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String blockSet)
  public String errorMessage(String blockSet, String attribute)
  public String getAssetName()
  public static BlockSetExistsValidator required()
  public static BlockSetExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final BlockSetExistsValidator DEFAULT_INSTANCE
