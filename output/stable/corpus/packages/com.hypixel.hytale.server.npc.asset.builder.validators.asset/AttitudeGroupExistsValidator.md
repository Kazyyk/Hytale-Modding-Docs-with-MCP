# AttitudeGroupExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class AttitudeGroupExistsValidator extends AssetValidator

## Fields

- private static final AttitudeGroupExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String attitudeGroup)
- @Override @Nonnull public String errorMessage(String attitudeGroup, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static AttitudeGroupExistsValidator required()
- @Nonnull public static AttitudeGroupExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String attitudeGroup)
  public String errorMessage(String attitudeGroup, String attributeName)
  public String getAssetName()
  public static AttitudeGroupExistsValidator required()
  public static AttitudeGroupExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final AttitudeGroupExistsValidator DEFAULT_INSTANCE
