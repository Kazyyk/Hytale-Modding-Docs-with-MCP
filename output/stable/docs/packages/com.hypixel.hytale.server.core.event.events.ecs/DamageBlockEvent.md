---
title: "DamageBlockEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.DamageBlockEvent"
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
public class DamageBlockEvent extends CancellableEcsEvent
```

A cancellable ECS event fired when the corresponding DamageBlock action occurs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private final` | `ItemStack` | `itemInHand` |
| `@Nonnull private` | `Vector3i` | `targetBlock` |
| `@Nonnull private final` | `BlockType` | `blockType` |
| `private final` | `float` | `currentDamage` |
| `private` | `float` | `damage` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `DamageBlockEvent(@Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull BlockType blockType, float currentDamage, float damage)` |
| `@Nullable public` | `ItemStack` | `getItemInHand()` |
| `@Nonnull public` | `Vector3i` | `getTargetBlock()` |
| `public` | `void` | `setTargetBlock(@Nonnull Vector3i targetBlock)` |
| `@Nonnull public` | `BlockType` | `getBlockType()` |
| `public` | `float` | `getCurrentDamage()` |
| `public` | `float` | `getDamage()` |
| `public` | `void` | `setDamage(float damage)` |
