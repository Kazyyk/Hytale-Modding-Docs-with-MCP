---
title: "Damage.EntitySource"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage.EntitySource"
api_surface: true
extends: ~
implements:
  - "Damage.Source"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class Damage.EntitySource implements Damage.Source
```

A [Damage.Source](Damage.Source.md) that identifies another entity as the origin of the damage. Holds a reference to the attacker entity in the `EntityStore`. The death message is derived from the source entity's `DisplayNameComponent`, falling back to a generic "unknown" translation.

## Constructor

```java
public EntitySource(@Nonnull Ref<EntityStore> sourceRef)
```

Creates an entity source with a reference to the attacking entity.

## Methods

```java
@Nonnull
public Ref<EntityStore> getRef()
```

Returns the `Ref<EntityStore>` pointing to the source entity.

```java
@Nonnull
@Override
public Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns a localized death message using the source entity's display name. If the source has a `DisplayNameComponent` with a non-null display name, it is used as the `damageSource` parameter in the `server.general.killedBy` translation. Otherwise falls back to a generic "unknown" message.

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `sourceRef` | `Ref<EntityStore>` | `protected final` | Reference to the attacking entity. |

## Related Types

- [Damage](Damage.md) -- the damage event
- [Damage.Source](Damage.Source.md) -- parent interface
- [Damage.ProjectileSource](Damage.ProjectileSource.md) -- subclass for projectile damage
