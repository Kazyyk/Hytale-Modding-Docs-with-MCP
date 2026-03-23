---
title: "PlaceBlockEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.PlaceBlockEvent"
api_surface: true
extends: "CancellableEcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "event"
  - "events"
---

**Package:** `com.hypixel.hytale.server.core.event.events.ecs`

```java
public class PlaceBlockEvent extends CancellableEcsEvent
```

A cancellable ECS event fired when the corresponding PlaceBlock action occurs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private final` | `ItemStack` | `itemInHand` |
| `@Nonnull private` | `Vector3i` | `targetBlock` |
| `@Nonnull private` | `RotationTuple` | `rotation` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `PlaceBlockEvent(@Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull RotationTuple rotation)` |
| `@Nullable public` | `ItemStack` | `getItemInHand()` |
| `@Nonnull public` | `Vector3i` | `getTargetBlock()` |
| `public` | `void` | `setTargetBlock(@Nonnull Vector3i targetBlock)` |
| `@Nonnull public` | `RotationTuple` | `getRotation()` |
| `public` | `void` | `setRotation(@Nonnull RotationTuple rotation)` |
