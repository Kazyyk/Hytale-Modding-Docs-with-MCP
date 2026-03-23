---
title: "SensorSelf"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.SensorSelf"
api_surface: false
extends: "SensorWithEntityFilters"
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
public class SensorSelf extends SensorWithEntityFilters
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `PositionProvider` | `positionProvider` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorSelf(@Nonnull BuilderSensorSelf builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `InfoProvider` | `getSensorInfo()` |
