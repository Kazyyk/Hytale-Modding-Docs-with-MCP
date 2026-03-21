---
title: "TriggerSpawnMarkersInteraction"
kind: "class"
package: "com.hypixel.hytale.server.spawning.interactions"
fqcn: "com.hypixel.hytale.server.spawning.interactions.TriggerSpawnMarkersInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "interactions"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.interactions`

```java
public class TriggerSpawnMarkersInteraction extends SimpleInstantInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<TriggerSpawnMarkersInteraction>` | `CODEC` |
| `private` | `String` | `markerType` |
| `private` | `double` | `range` |
| `private` | `double` | `rangeSquared` |
| `private` | `int` | `count` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)` |
| `protected` | `Ref<EntityStore>` | `filterMarker(Ref<EntityStore> targetRef, Vector3d position, CommandBuffer<EntityStore> commandBuffer)` |
