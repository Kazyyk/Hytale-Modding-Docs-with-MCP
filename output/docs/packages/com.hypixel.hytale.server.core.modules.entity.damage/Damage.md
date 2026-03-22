---
title: "Damage"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage"
api_surface: true
extends: "CancellableEcsEvent"
implements:
  - "IMetaStore<Damage>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "event"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class Damage extends CancellableEcsEvent implements IMetaStore<Damage>
```

Represents a damage event dispatched through the ECS event system. `Damage` carries the amount, cause, and source of damage dealt to an entity, and supports cancellation. It implements `IMetaStore` to allow attaching arbitrary metadata (hit location, particles, sound effects, camera effects, knockback, etc.) via `MetaKey` entries on its `META_REGISTRY`.

## Meta Keys

| Key | Type | Description |
|---|---|---|
| `HIT_LOCATION` | `Vector4d` | World-space coordinates of the hit point. |
| `HIT_ANGLE` | `Float` | Angle of the hit for directional indicators. |
| `IMPACT_PARTICLES` | [Damage.Particles](Damage.Particles.md) | Particle configuration spawned on impact. |
| `IMPACT_SOUND_EFFECT` | [Damage.SoundEffect](Damage.SoundEffect.md) | Sound effect played on impact for all nearby players. |
| `PLAYER_IMPACT_SOUND_EFFECT` | [Damage.SoundEffect](Damage.SoundEffect.md) | Sound effect played only for the damaged player. |
| `CAMERA_EFFECT` | [Damage.CameraEffect](Damage.CameraEffect.md) | Camera shake or effect triggered on hit. |
| `DEATH_ICON` | `String` | Icon identifier displayed in the kill feed on death. |
| `BLOCKED` | `Boolean` | Whether the damage was blocked (defaults to `false`). |
| `STAMINA_DRAIN_MULTIPLIER` | `Float` | Multiplier applied to stamina drain when blocking. |
| `CAN_BE_PREDICTED` | `Boolean` | Whether the client can predict this damage (defaults to `false`). |
| `KNOCKBACK_COMPONENT` | `KnockbackComponent` | Knockback data attached to this damage event. |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `META_REGISTRY` | `MetaRegistry<Damage>` | Registry for all damage metadata keys. |
| `NULL_SOURCE` | [Damage.Source](Damage.Source.md) | A no-op source used for environment or sourceless damage. |

## Constructors

```java
public Damage(@Nonnull Damage.Source source, @Nonnull DamageCause damageCause, float amount)
```

Creates a damage event from a source, a `DamageCause` asset, and an amount. The damage cause is resolved to an index via `DamageCause.getAssetMap()`.

```java
public Damage(@Nonnull Damage.Source source, int damageCauseIndex, float amount)
```

Creates a damage event from a source, a raw damage cause index, and an amount.

## Methods

```java
public int getDamageCauseIndex()
```

Returns the integer index of the damage cause in the asset map.

```java
public void setDamageCauseIndex(int damageCauseIndex)
```

Overrides the damage cause index.

```java
@Deprecated
@Nullable
public DamageCause getCause()
```

Returns the `DamageCause` asset for this damage event, or `null` if the index is invalid. Deprecated in favor of index-based lookups.

```java
@Nonnull
public Damage.Source getSource()
```

Returns the [Damage.Source](Damage.Source.md) that caused this damage.

```java
public void setSource(@Nonnull Damage.Source source)
```

Replaces the damage source.

```java
public float getAmount()
```

Returns the current damage amount. This value may be modified by filter systems before application.

```java
public void setAmount(float amount)
```

Sets the damage amount. Used by damage reduction systems to modify the final value.

```java
public float getInitialAmount()
```

Returns the original damage amount as set at construction time, before any modifications.

```java
@Nonnull
public Message getDeathMessage(@Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Delegates to the source's `getDeathMessage()` to produce a localized death message for the kill feed.

```java
@Nonnull
@Override
public IMetaStoreImpl<Damage> getMetaStore()
```

Returns the `DynamicMetaStore` backing this damage event's metadata.

## Inner Types

- [Damage.Source](Damage.Source.md) -- interface for damage source identification and death messages
- [Damage.EntitySource](Damage.EntitySource.md) -- damage from another entity
- [Damage.ProjectileSource](Damage.ProjectileSource.md) -- damage from a projectile with a shooter
- [Damage.CommandSource](Damage.CommandSource.md) -- damage from a command
- [Damage.EnvironmentSource](Damage.EnvironmentSource.md) -- damage from an environment type
- [Damage.Particles](Damage.Particles.md) -- impact particle configuration
- [Damage.SoundEffect](Damage.SoundEffect.md) -- impact sound effect wrapper
- [Damage.CameraEffect](Damage.CameraEffect.md) -- camera effect record

## Related Types

- [DamageCause](DamageCause.md) -- asset defining the type of damage
- [DamageEventSystem](DamageEventSystem.md) -- base class for systems that handle damage events
- [DamageSystems](DamageSystems.md) -- collection of systems that process damage
- [DeathComponent](DeathComponent.md) -- component added when damage kills an entity
- [DamageModule](DamageModule.md) -- module that registers all damage systems
