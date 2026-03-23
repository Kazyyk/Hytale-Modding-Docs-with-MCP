# Damage.EntitySource

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Implements: Damage.Source

public static class Damage.EntitySource implements Damage.Source

A Damage.Source that identifies another entity as the origin of the damage. Holds a reference to the attacker entity in the `EntityStore`. The death message is derived from the source entity's `DisplayNameComponent`, falling back to a generic "unknown" translation.

## Constructor


public EntitySource(@Nonnull Ref<EntityStore> sourceRef)

Creates an entity source with a reference to the attacking entity.

## Methods


@Nonnull
public Ref<EntityStore> getRef()

Returns the `Ref<EntityStore>` pointing to the source entity.


@Nonnull
@Override
public Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Returns a localized death message using the source entity's display name. If the source has a `DisplayNameComponent` with a non-null display name, it is used as the `damageSource` parameter in the `server.general.killedBy` translation. Otherwise falls back to a generic "unknown" message.

## Fields

- sourceRef | Ref<EntityStore> | protected final | Reference to the attacking entity.

## Related Types

- Damage -- the damage event
- Damage.Source -- parent interface
- Damage.ProjectileSource -- subclass for projectile damage

Known subclasses: ProjectileSource

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 49 more)

Complete API:
  public Ref<EntityStore> getRef()
  public Message getDeathMessage(Damage info, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final Ref<EntityStore> sourceRef
