# Damage.CameraEffect

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.damage

public record Damage.CameraEffect(int cameraEffectIndex)

A record wrapping a camera effect asset index, attached to a Damage event via the `Damage.CAMERA_EFFECT` meta key. Used to trigger camera shake or other visual feedback when an entity takes damage.

## Record Components

- cameraEffectIndex | int | Index into the camera effect asset map.

## Methods


public int getEffectIndex()

Returns the camera effect asset index. Equivalent to `cameraEffectIndex()`.

## Related Types

- Damage -- the damage event that carries camera effects via meta store

Known subclasses: CameraShakeEffect, MissingCameraEffect

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool, DamageCalculatorSystems (and 49 more)

Complete API:
  public int getEffectIndex()
