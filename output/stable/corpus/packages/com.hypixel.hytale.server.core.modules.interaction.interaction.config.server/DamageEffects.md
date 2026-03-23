# DamageEffects

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat | Implements: com.hypixel.hytale.server.core.io.NetworkSerializable

public class DamageEffects implements NetworkSerializable<com.hypixel.hytale.protocol.DamageEffects>

Configures visual, audio, and physical effects applied when damage is dealt. Includes model particles, world particles, local/world/player sound events, knockback, camera effects, stamina drain multipliers, and view distance for particle visibility.

## Codec Properties

- ModelParticles | ModelParticle[] | No (inherited) | -- | Particles attached to the target model.
- WorldParticles | WorldParticle[] | No (inherited) | -- | Particles spawned in the world.
- LocalSoundEventId | String | No (inherited) | null | Sound event played locally. Validated against `SoundEvent`.
- WorldSoundEventId | String | No (inherited) | null | Sound event played in 3D world space. Must be mono.
- PlayerSoundEventId | String | No (inherited) | null | Sound event played to the player receiving damage.
- ViewDistance | double | No (inherited) | 75.0 | Radius for particle visibility.
- Knockback | Knockback | No (inherited) | -- | Knockback force configuration.
- CameraEffect | String` (asset ref) | No (inherited) | -- | Camera effect to apply on hit.
- StaminaDrainMultiplier | float | No (inherited) | 1.0 | Multiplier applied to stamina drain caused by this damage.

## Methods


public ModelParticle[] getModelParticles()


public WorldParticle[] getWorldParticles()


@Nullable
public String getWorldSoundEventId()


public int getWorldSoundEventIndex()


@Nullable
public String getLocalSoundEventId()


public int getLocalSoundEventIndex()


public double getViewDistance()


public Knockback getKnockback()


public String getCameraEffectId()


public void addToDamage(@Nonnull Damage damageEvent)

Adds configured effects (impact sound, particles, camera effect, stamina drain) as meta objects on the damage event.


public void spawnAtEntity(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref)

Spawns world particles and plays sound events at the entity's position.


@Nonnull
public com.hypixel.hytale.protocol.DamageEffects toPacket()

Converts to protocol form.


@Nonnull
@Override
public String toString()

## See Also

- Knockback -- knockback force calculation
- DamageEntityInteraction -- uses damage effects during combat

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
