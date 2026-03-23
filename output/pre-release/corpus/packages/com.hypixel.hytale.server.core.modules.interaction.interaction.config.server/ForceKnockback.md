# ForceKnockback

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.Knockback

public class ForceKnockback extends Knockback

Knockback along a fixed normalized direction, rotated by the attacker's yaw and scaled by force. The direction is normalized on decode.

## Codec Properties

Inherits all codec properties from Knockback, plus:

- Direction | Vector3d | Yes (inherited) | Vector3d.UP | The knockback direction vector. Normalized on decode.

## Methods


@Nonnull
@Override
public Vector3d calculateVector(Vector3d source, float yaw, Vector3d target)

Clones the direction, rotates it by yaw, and scales by force.


@Nonnull
@Override
public String toString()

## See Also

- Knockback -- base class
- DirectionalKnockback
- PointKnockback

Also in this package: DamageCalculator, DamageClass, DamageEffects, DirectionalKnockback, Knockback, PointKnockback, TargetEntityEffect, Type

Complete API:
  public Vector3d calculateVector(Vector3d source, float yaw, Vector3d target)
  public String toString()

Fields:
public static final BuilderCodec<ForceKnockback> CODEC
private Vector3d direction
