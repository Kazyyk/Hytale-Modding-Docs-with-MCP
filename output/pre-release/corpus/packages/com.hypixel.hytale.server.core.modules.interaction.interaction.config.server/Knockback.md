# Knockback

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat

public abstract class Knockback

Abstract base class for knockback force calculations. Configured via a polymorphic codec (`CodecMapCodec` with `"Type"` discriminator). Provides shared fields for force magnitude, duration, velocity type, and velocity configuration. Concrete implementations define how the force vector is computed from source, target, and attacker yaw.

## Codec Properties (BASE_CODEC)

- Force | double` (stored as `float`) | No | -- | The knockback force magnitude.
- Duration | float | No | -- | Duration for which knockback is continuously applied. If 0, force is applied once. Must be >= 0.
- VelocityType | ChangeVelocityType | No | Add | How the velocity change is applied (Add, Set, etc.).
- VelocityConfig | VelocityConfig | No (inherited) | -- | Additional velocity configuration.

## Methods


public float getForce()


public float getDuration()


public ChangeVelocityType getVelocityType()


public VelocityConfig getVelocityConfig()


public abstract Vector3d calculateVector(Vector3d var1, float var2, Vector3d var3)

Calculates the knockback velocity vector given the source position, attacker yaw, and target position.


@Nonnull
@Override
public String toString()

## Subclasses

- DirectionalKnockback -- knockback with directional offsets relative to attacker facing
- ForceKnockback -- knockback along a fixed normalized direction
- PointKnockback -- knockback away from a point (source-to-target direction)

## See Also

- DamageEffects -- configures knockback as part of damage effects
- `KnockbackComponent` -- entity component that receives knockback instructions

Known subclasses: DirectionalKnockback, ForceKnockback, PointKnockback

Also in this package: DamageCalculator, DamageClass, DamageEffects, DirectionalKnockback, ForceKnockback, PointKnockback, TargetEntityEffect, Type

Complete API:
  public float getForce()
  public float getDuration()
  public ChangeVelocityType getVelocityType()
  public VelocityConfig getVelocityConfig()
  public abstract Vector3d calculateVector(Vector3d var1, float var2, Vector3d var3)
  public String toString()

Fields:
public static final CodecMapCodec<Knockback> CODEC
public static final BuilderCodec<Knockback> BASE_CODEC
protected float force
protected float duration
protected ChangeVelocityType velocityType
private VelocityConfig velocityConfig
