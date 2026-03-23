# ApplicationEffects

Type: class | Package: com.hypixel.hytale.server.core.asset.type.entityeffect.config

public class ApplicationEffects implements NetworkSerializable<com.hypixel.hytale.protocol.ApplicationEffects>

## Fields

- protected Color entityBottomTint
- protected Color entityTopTint
- protected String entityAnimationId
- protected ModelParticle[] particles
- protected ModelParticle[] firstPersonParticles
- protected String screenEffect
- protected float horizontalSpeedMultiplier
- protected float knockbackMultiplier
- protected String soundEventIdLocal
- protected transient int soundEventIndexLocal
- protected String soundEventIdWorld
- protected transient int soundEventIndexWorld
- protected String modelVFXId
- protected MovementEffects movementEffects
- protected AbilityEffects abilityEffects
- private float mouseSensitivityAdjustmentTarget
- private float mouseSensitivityAdjustmentDuration

## Methods

- protected ApplicationEffects()
- public com.hypixel.hytale.protocol.ApplicationEffects toPacket()
- public float getHorizontalSpeedMultiplier()
- public float getKnockbackMultiplier()
- protected void processConfig()
- public String toString()

Also in this package: AbilityEffects, EntityEffect, ModelOverride, OverlapBehavior, RemovalBehavior

Complete API:
  public com.hypixel.hytale.protocol.ApplicationEffects toPacket()
  public float getHorizontalSpeedMultiplier()
  public float getKnockbackMultiplier()
  protected void processConfig()
  public String toString()

Fields:
public static final BuilderCodec<ApplicationEffects> CODEC
protected Color entityBottomTint
protected Color entityTopTint
protected String entityAnimationId
protected ModelParticle[] particles
protected ModelParticle[] firstPersonParticles
protected String screenEffect
protected float horizontalSpeedMultiplier
protected float knockbackMultiplier
protected String soundEventIdLocal
protected transient int soundEventIndexLocal
protected String soundEventIdWorld
protected transient int soundEventIndexWorld
protected String modelVFXId
protected MovementEffects movementEffects
protected AbilityEffects abilityEffects
private float mouseSensitivityAdjustmentTarget
private float mouseSensitivityAdjustmentDuration
