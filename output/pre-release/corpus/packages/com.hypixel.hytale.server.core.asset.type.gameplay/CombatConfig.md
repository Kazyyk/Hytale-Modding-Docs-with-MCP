# CombatConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class CombatConfig

Combat system configuration including attack reach, knockback strength, invulnerability duration, PvP toggles, fall damage settings, healing rate, and combat-related timings.

Also in this package: ArmorVisibilityOption, BrokenPenalties, CameraEffectsConfig, CraftingConfig, DeathConfig, GameplayConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SpawnConfig, WorldConfig, WorldMapConfig

Complete API:
  public Duration getOutOfCombatDelay()
  public int getStaminaBrokenEffectIndex()
  public boolean isDisplayHealthBars()
  public boolean isDisplayCombatText()
  public boolean isNpcIncomingDamageDisabled()
  public boolean isPlayerIncomingDamageDisabled()

Fields:
public static final BuilderCodec<CombatConfig> CODEC
protected Duration outOfCombatDelay
protected String staminaBrokenEffectId
private int staminaBrokenEffectIndex
protected boolean displayHealthBars
protected boolean displayCombatText
protected boolean disableNpcIncomingDamage
protected boolean disablePlayerIncomingDamage
