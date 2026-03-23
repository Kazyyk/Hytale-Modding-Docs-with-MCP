---
title: "SensorAnimation"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.SensorAnimation"
api_surface: false
extends: "SensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "audiovisual"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.audiovisual`

```java
public class SensorAnimation extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `NPCAnimationSlot` | `slot` |
| `protected final` | `String` | `animationId` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorAnimation(@Nonnull BuilderSensorAnimation builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `InfoProvider` | `getSensorInfo()` |
