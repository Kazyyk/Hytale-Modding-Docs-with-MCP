# DamageEffects

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat

public class DamageEffects implements NetworkSerializable<com.hypixel.hytale.protocol.DamageEffects>

## Fields

- protected ModelParticle[] modelParticles
- protected WorldParticle[] worldParticles
- protected String localSoundEventId
- protected transient int localSoundEventIndex
- protected String worldSoundEventId
- protected transient int worldSoundEventIndex
- protected String playerSoundEventId
- protected transient int playerSoundEventIndex
- protected double viewDistance
- protected Knockback knockback
- protected String cameraEffectId
- protected int cameraEffectIndex
- protected float staminaDrainMultiplier

## Methods

- public DamageEffects( ModelParticle[] modelParticles, WorldParticle[] worldParticles, String localSoundEventId, String worldSoundEventId, double viewDistance, Knockback knockback )
- protected DamageEffects()
- public ModelParticle[] getModelParticles()
- public WorldParticle[] getWorldParticles()
- public String getWorldSoundEventId()
- public int getWorldSoundEventIndex()
- public String getLocalSoundEventId()
- public int getLocalSoundEventIndex()
- public double getViewDistance()
- public Knockback getKnockback()
- public String getCameraEffectId()
- protected void processConfig()
- public void addToDamage(@Nonnull Damage damageEvent)
- public void spawnAtEntity(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref)
- public String toString()
- public com.hypixel.hytale.protocol.DamageEffects toPacket()

Also in this package: DamageCalculator, DamageClass, DirectionalKnockback, ForceKnockback, Knockback, PointKnockback, TargetEntityEffect, Type

Complete API:
  public ModelParticle[] getModelParticles()
  public WorldParticle[] getWorldParticles()
  public String getWorldSoundEventId()
  public int getWorldSoundEventIndex()
  public String getLocalSoundEventId()
  public int getLocalSoundEventIndex()
  public double getViewDistance()
  public Knockback getKnockback()
  public String getCameraEffectId()
  protected void processConfig()
  public void addToDamage(Damage damageEvent)
  public void spawnAtEntity(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref)
  public String toString()
  public com.hypixel.hytale.protocol.DamageEffects toPacket()

Fields:
public static final BuilderCodec<DamageEffects> CODEC
protected ModelParticle[] modelParticles
protected WorldParticle[] worldParticles
protected String localSoundEventId
protected transient int localSoundEventIndex
protected String worldSoundEventId
protected transient int worldSoundEventIndex
protected String playerSoundEventId
protected transient int playerSoundEventIndex
protected double viewDistance
protected Knockback knockback
protected String cameraEffectId
protected int cameraEffectIndex
protected float staminaDrainMultiplier
