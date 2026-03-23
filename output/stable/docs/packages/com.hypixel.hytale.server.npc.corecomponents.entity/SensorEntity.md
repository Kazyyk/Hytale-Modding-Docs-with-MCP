---
title: "SensorEntity"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.SensorEntity"
api_surface: false
extends: "SensorEntityBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "entity"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity`

```java
public class SensorEntity extends SensorEntityBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `boolean` | `getPlayers` |
| `protected final` | `boolean` | `getNPCs` |
| `protected final` | `boolean` | `excludeOwnType` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorEntity(@Nonnull BuilderSensorEntity builder, @Nonnull BuilderSupport builderSupport)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isGetPlayers()` |
| `public` | `boolean` | `isGetNPCs()` |
| `public` | `boolean` | `isExcludingOwnType()` |

## Related Types

- [SensorEntityBase](SensorEntityBase.md)
