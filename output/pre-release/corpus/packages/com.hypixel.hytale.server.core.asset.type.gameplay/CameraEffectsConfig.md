# CameraEffectsConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class CameraEffectsConfig

Maps `DamageCause` values to `CameraEffect` indices. Built from a codec map that converts damage cause string keys to their corresponding integer indices.

Also in this package: ArmorVisibilityOption, BrokenPenalties, CombatConfig, CraftingConfig, DeathConfig, GameplayConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SpawnConfig, WorldConfig, WorldMapConfig

Complete API:
  public int getCameraEffectIndex(int damageCauseIndex)

Fields:
public static final BuilderCodec<CameraEffectsConfig> CODEC
protected Map<String,String> damageEffectIds
protected transient Int2IntMap damageEffectIndices
