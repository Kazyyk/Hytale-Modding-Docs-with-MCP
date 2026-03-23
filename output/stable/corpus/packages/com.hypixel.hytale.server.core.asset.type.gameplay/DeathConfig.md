# DeathConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class DeathConfig

Death system configuration controlling item drop behavior, experience retention, and death message visibility.

Also in this package: ArmorVisibilityOption, BrokenPenalties, CameraEffectsConfig, CombatConfig, CraftingConfig, GameplayConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SleepConfig, SpawnConfig, WorldConfig, WorldMapConfig

Complete API:
  public RespawnController getRespawnController()
  public DeathConfig.ItemsLossMode getItemsLossMode()
  public double getItemsAmountLossPercentage()
  public double getItemsDurabilityLossPercentage()

Fields:
public static final EnumCodec<DeathConfig.ItemsLossMode> LOSS_MODE_CODEC
public static final BuilderCodec<DeathConfig> CODEC
protected RespawnController respawnController
protected DeathConfig.ItemsLossMode itemsLossMode
protected double itemsAmountLossPercentage
protected double itemsDurabilityLossPercentage
