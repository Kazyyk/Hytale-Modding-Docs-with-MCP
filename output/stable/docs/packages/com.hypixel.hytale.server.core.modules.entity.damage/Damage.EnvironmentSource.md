---
title: "Damage.EnvironmentSource"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage.EnvironmentSource"
api_surface: true
extends: ~
implements:
  - "Damage.Source"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "environment"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class Damage.EnvironmentSource implements Damage.Source
```

A [Damage.Source](Damage.Source.md) for damage caused by the environment rather than an entity or command. Carries a string type identifier describing the environmental hazard (e.g., lava, fire, thorns).

## Constructor

```java
public EnvironmentSource(@Nonnull String type)
```

Creates an environment source with the given type identifier.

## Methods

```java
@Nonnull
public String getType()
```

Returns the environment type identifier string.

```java
@Nonnull
@Override
public Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns a localized death message using the `server.general.killedBy` translation key, parameterized with the environment type string.

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `type` | `String` | `private final` | The environment hazard type identifier. |

## Related Types

- [Damage](Damage.md) -- the damage event
- [Damage.Source](Damage.Source.md) -- parent interface
