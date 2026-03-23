---
title: "BreakBlockEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.BreakBlockEvent"
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
public class BreakBlockEvent extends CancellableEcsEvent
```

A cancellable ECS event fired when the corresponding BreakBlock action occurs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private final` | `ItemStack` | `itemInHand` |
| `@Nonnull private` | `Vector3i` | `targetBlock` |
| `@Nonnull private final` | `BlockType` | `blockType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BreakBlockEvent(@Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull BlockType blockType)` |
| `@Nullable public` | `ItemStack` | `getItemInHand()` |
| `@Nonnull public` | `Vector3i` | `getTargetBlock()` |
| `@Nonnull public` | `BlockType` | `getBlockType()` |
| `public` | `void` | `setTargetBlock(@Nonnull Vector3i targetBlock)` |
