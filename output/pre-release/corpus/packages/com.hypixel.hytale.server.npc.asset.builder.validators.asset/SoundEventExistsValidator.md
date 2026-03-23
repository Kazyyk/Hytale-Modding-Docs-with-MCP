# SoundEventExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class SoundEventExistsValidator extends AssetValidator

## Fields

- private static final SoundEventExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String soundEvent)
- @Override @Nonnull public String errorMessage(String soundEvent, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static SoundEventExistsValidator required()
- @Nonnull public static SoundEventExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String soundEvent)
  public String errorMessage(String soundEvent, String attributeName)
  public String getAssetName()
  public static SoundEventExistsValidator required()
  public static SoundEventExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final SoundEventExistsValidator DEFAULT_INSTANCE
