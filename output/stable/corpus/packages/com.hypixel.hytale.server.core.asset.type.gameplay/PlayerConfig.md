# PlayerConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class PlayerConfig

Player-specific configuration including health, stamina, sprint, jump, fall damage, encumbrance, and interaction reach settings.

Also in this package: ArmorVisibilityOption, BrokenPenalties, CameraEffectsConfig, CombatConfig, CraftingConfig, DeathConfig, GameplayConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, RespawnConfig, SleepConfig, SpawnConfig, WorldConfig, WorldMapConfig

Complete API:
  public int getHitboxCollisionConfigIndex()
  public int getRepulsionConfigIndex()
  public int getMovementConfigIndex()
  public String getMovementConfigId()
  public int getMaxDeployableEntities()
  public PlayerConfig.ArmorVisibilityOption getArmorVisibilityOption()

Fields:
public static final BuilderCodec<PlayerConfig> CODEC
protected String hitboxCollisionConfigId
protected String repulsionConfigId
protected String movementConfigId
protected int hitboxCollisionConfigIndex
protected int repulsionConfigIndex
protected int movementConfigIndex
protected int maxDeployableEntities
protected PlayerConfig.ArmorVisibilityOption armorVisibilityOption
