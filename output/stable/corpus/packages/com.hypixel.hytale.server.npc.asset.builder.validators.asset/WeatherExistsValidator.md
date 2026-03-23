# WeatherExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class WeatherExistsValidator extends AssetValidator

## Fields

- private static final WeatherExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String value)
- @Override @Nonnull public String errorMessage(String value, String attribute)
- @Override @Nonnull public String getAssetName()
- public static WeatherExistsValidator required()
- @Nonnull public static WeatherExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String value)
  public String errorMessage(String value, String attribute)
  public String getAssetName()
  public static WeatherExistsValidator required()
  public static WeatherExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final WeatherExistsValidator DEFAULT_INSTANCE
