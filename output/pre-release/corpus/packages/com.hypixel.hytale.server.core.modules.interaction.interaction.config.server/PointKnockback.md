# PointKnockback

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.Knockback

public class PointKnockback extends Knockback

Knockback computed from a point offset relative to the source. The direction is from the (optionally offset and yaw-rotated) source to the target, normalized and optionally rotated by `RotateY` degrees. X/Z components are scaled by force; Y is set directly from `VelocityY`.

## Codec Properties

Inherits all codec properties from Knockback, plus:

- VelocityY | double` (stored as `float`) | No | 0.0 | Fixed vertical velocity component.
- RotateY | int | No | 0 | Additional Y-axis rotation in degrees applied to the knockback direction.
- OffsetX | int | No | 0 | X offset from source, rotated by yaw.
- OffsetZ | int | No | 0 | Z offset from source, rotated by yaw.

## Methods


@Nonnull
@Override
public Vector3d calculateVector(@Nonnull Vector3d source, float yaw, @Nonnull Vector3d target)

Computes knockback direction from (offset) source to target, applies optional Y rotation, scales X/Z by force, and sets Y to `velocityY`.

## See Also

- Knockback -- base class
- DirectionalKnockback
- ForceKnockback

Also in this package: DamageCalculator, DamageClass, DamageEffects, DirectionalKnockback, ForceKnockback, Knockback, TargetEntityEffect, Type

Complete API:
  public Vector3d calculateVector(Vector3d source, float yaw, Vector3d target)

Fields:
public static final BuilderCodec<PointKnockback> CODEC
protected float velocityY
protected int rotateY
protected int offsetX
protected int offsetZ
