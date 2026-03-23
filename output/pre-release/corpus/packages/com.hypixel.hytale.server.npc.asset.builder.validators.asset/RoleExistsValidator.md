# RoleExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class RoleExistsValidator extends AssetValidator

## Fields

- private static final RoleExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String role)
- @Override @Nonnull public String errorMessage(String role, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static RoleExistsValidator required()
- @Nonnull public static RoleExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, CombatInteractionValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String role)
  public String errorMessage(String role, String attributeName)
  public String getAssetName()
  public static RoleExistsValidator required()
  public static RoleExistsValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final RoleExistsValidator DEFAULT_INSTANCE
