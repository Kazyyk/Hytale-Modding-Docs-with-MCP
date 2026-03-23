---
title: "Damage.ProjectileSource"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage.ProjectileSource"
api_surface: true
extends: "Damage.EntitySource"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "projectile"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class Damage.ProjectileSource extends Damage.EntitySource
```

A [Damage.EntitySource](Damage.EntitySource.md) that additionally tracks the projectile entity responsible for the damage. The inherited `sourceRef` references the shooter, while `projectile` references the projectile entity itself.

## Constructor

```java
public ProjectileSource(@Nonnull Ref<EntityStore> shooter, @Nonnull Ref<EntityStore> projectile)
```

Creates a projectile source linking the shooter and the projectile entity.

## Methods

```java
@Nonnull
public Ref<EntityStore> getProjectile()
```

Returns the `Ref<EntityStore>` pointing to the projectile entity.

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `projectile` | `Ref<EntityStore>` | `protected final` | Reference to the projectile entity. |

## Related Types

- [Damage](Damage.md) -- the damage event
- [Damage.EntitySource](Damage.EntitySource.md) -- parent class for entity-originated damage
- [Damage.Source](Damage.Source.md) -- root interface
