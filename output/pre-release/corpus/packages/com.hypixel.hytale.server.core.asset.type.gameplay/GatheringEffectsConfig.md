# GatheringEffectsConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class GatheringEffectsConfig

Configuration for visual and audio effects during gathering. Currently a marker class loaded via codec.

Also in this package: ArmorVisibilityOption, BrokenPenalties, CameraEffectsConfig, CombatConfig, CraftingConfig, DeathConfig, GameplayConfig, GatheringConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SpawnConfig, WorldConfig, WorldMapConfig

Complete API:
  public String getParticleSystemId()
  public String getSoundEventId()
  public int getSoundEventIndex()
  protected void processConfig()

Fields:
public static final BuilderCodec<GatheringEffectsConfig> CODEC
protected String particleSystemId
protected String soundEventId
protected transient int soundEventIndex
