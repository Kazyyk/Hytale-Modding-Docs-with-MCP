# Damage.EnvironmentSource

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Implements: Damage.Source

public static class Damage.EnvironmentSource implements Damage.Source

A Damage.Source for damage caused by the environment rather than an entity or command. Carries a string type identifier describing the environmental hazard (e.g., lava, fire, thorns).

## Constructor


public EnvironmentSource(@Nonnull String type)

Creates an environment source with the given type identifier.

## Methods


@Nonnull
public String getType()

Returns the environment type identifier string.


@Nonnull
@Override
public Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Returns a localized death message using the `server.general.killedBy` translation key, parameterized with the environment type string.

## Fields

- type | String | private final | The environment hazard type identifier.

## Related Types

- Damage -- the damage event
- Damage.Source -- parent interface

Known implementors: Biome

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public String getType()
  public Message getDeathMessage(Damage info, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private final String type
