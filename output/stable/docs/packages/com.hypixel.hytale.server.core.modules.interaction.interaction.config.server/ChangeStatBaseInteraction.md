---
title: "ChangeStatBaseInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.ChangeStatBaseInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "entity-stats"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public abstract class ChangeStatBaseInteraction extends SimpleInstantInteraction
```

Abstract base class for interactions that modify entity stats. Provides codec-driven configuration for stat modifiers, value types (absolute or percent), change behaviour, and the target entity. Concrete subclasses are [ChangeStatInteraction](ChangeStatInteraction.md) and [ChangeStatWithModifierInteraction](ChangeStatWithModifierInteraction.md).

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `StatModifiers` | `Object2FloatMap<String>` | Yes | -- | Modifiers to apply to EntityStats. Map keys must be valid `EntityStatType` asset IDs. |
| `ValueType` | `ValueType` enum | No | `Absolute` | Specifies if the StatModifiers are absolute values or percent. When using `Absolute`, `100` matches the max value. |
| `Behaviour` | `ChangeStatBehaviour` | No | `Add` | Specifies how StatModifiers should be applied to the stats. |
| `Entity` | `InteractionTarget` | Yes | `USER` | The entity to target for this interaction. Inherited from parent. |

## Fields

| Type | Name | Default | Description |
|---|---|---|---|
| `Object2FloatMap<String>` | `entityStatAssets` | -- | Raw stat modifier map keyed by asset string IDs. |
| `Int2FloatMap` | `entityStats` | `null` | Resolved integer-indexed stat map, populated via `EntityStatsModule.resolveEntityStats` after decode. |
| `ValueType` | `valueType` | `ValueType.Absolute` | Whether values are absolute or percentage-based. |
| `ChangeStatBehaviour` | `changeStatBehaviour` | `ChangeStatBehaviour.Add` | How the modifiers are applied (add, set, etc.). |
| `InteractionTarget` | `entityTarget` | `InteractionTarget.USER` | Which entity the stat change targets. |

## Methods

```java
@Nonnull
@Override
public String toString()
```

Returns a diagnostic string including all configured fields.

## Subclasses

- [ChangeStatInteraction](ChangeStatInteraction.md) -- applies stat changes directly
- [ChangeStatWithModifierInteraction](ChangeStatWithModifierInteraction.md) -- applies stat changes with armor-based modifiers

## See Also

- `SimpleInstantInteraction` -- parent class
- `EntityStatsModule` -- resolves stat asset IDs to indices
