# BrokenPenalties

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class BrokenPenalties

Configures penalty multipliers applied when tools, armor, or weapons are broken. Each penalty is a nullable `Double` with a fallback default value.

Also in this package: ArmorVisibilityOption, CameraEffectsConfig, CombatConfig, CraftingConfig, DeathConfig, GameplayConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SpawnConfig, WorldConfig, WorldMapConfig

Complete API:
  public double getTool(double defaultValue)
  public double getArmor(double defaultValue)
  public double getWeapon(double defaultValue)

Fields:
public static final BrokenPenalties DEFAULT
public static final BuilderCodec<BrokenPenalties> CODEC
private Double tool
private Double armor
private Double weapon
