# CombatInteractionValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class CombatInteractionValidator extends AssetValidator

## Fields

- private final List<String> disallowedInteractions
- private boolean assetExists
- private boolean attackTag
- private boolean onlyOneAttackType
- private boolean onlyOneAimingReference

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String value)
- @Override @Nonnull public String errorMessage(String value, String attribute)
- @Override @Nonnull public String getAssetName()
- public static boolean testAttackTag(@Nonnull RootInteraction interaction)
- public static boolean testOnlyOneAttackType(@Nonnull RootInteraction interaction)
- @Nonnull public static CombatInteractionValidator required()
- @Nonnull public static CombatInteractionValidator withConfig(EnumSet<AssetValidator.Config> config)

Also in this package: AttitudeGroupExistsValidator, BeaconSpawnExistsValidator, BlockSetExistsValidator, EntityEffectExistsValidator, EntityStatExistsValidator, EnvironmentExistsValidator, FlockAssetExistsValidator, ItemAttitudeGroupExistsValidator, ItemDropListExistsValidator, ItemExistsValidator, ManualSpawnMarkerExistsValidator, ModelExistsValidator, ParticleSystemExistsValidator, RoleExistsValidator, RootInteractionValidator, SoundEventExistsValidator, WeatherExistsValidator

Complete API:
  public String getDomain()
  public boolean test(String value)
  public String errorMessage(String value, String attribute)
  public String getAssetName()
  public static boolean testAttackTag(RootInteraction interaction)
  public static boolean testOnlyOneAttackType(RootInteraction interaction)
  public static CombatInteractionValidator required()
  public static CombatInteractionValidator withConfig(EnumSet<AssetValidator.Config> config)

Fields:
private static final Set<Class<? extends Interaction>> DISALLOWED_INTERACTION_TYPES
private final List<String> disallowedInteractions
private boolean assetExists
private boolean attackTag
private boolean onlyOneAttackType
private boolean onlyOneAimingReference
