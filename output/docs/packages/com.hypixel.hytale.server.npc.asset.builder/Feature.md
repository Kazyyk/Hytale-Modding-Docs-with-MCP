---
title: "Feature"
kind: "enum"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.Feature"
api_surface: false
extends: ~
implements:
  - "Supplier<String>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public enum Feature implements Supplier<String>
```

Defines the features (target types and capabilities) that NPC builders can require or provide. Used by the feature evaluator system to ensure that actions and motions have access to the target types they need.

## Constants

| Constant | Description |
|---|---|
| `Player` | `"player target"` -- requires a player target. |
| `NPC` | `"NPC target"` -- requires an NPC target. |
| `Drop` | `"dropped item target"` -- requires a dropped item target. |
| `Position` | `"vector position"` -- requires a position vector. |
| `Path` | `"path"` -- requires a navigation path. |

## Static Fields

| Field | Type | Contents |
|---|---|---|
| `AnyPosition` | `EnumSet<Feature>` | `Player, NPC, Drop, Position` |
| `AnyEntity` | `EnumSet<Feature>` | `Player, NPC, Drop` |
| `LiveEntity` | `EnumSet<Feature>` | `Player, NPC` |

## Methods

### get

```java
public String get()
```

Returns the human-readable description.

## Related Types

- [FeatureEvaluatorHelper](FeatureEvaluatorHelper.md) -- evaluates feature requirements
