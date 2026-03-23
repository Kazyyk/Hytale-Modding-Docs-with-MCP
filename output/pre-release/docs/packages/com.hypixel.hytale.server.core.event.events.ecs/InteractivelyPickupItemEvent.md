---
title: "InteractivelyPickupItemEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.InteractivelyPickupItemEvent"
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
public class InteractivelyPickupItemEvent extends CancellableEcsEvent
```

A cancellable ECS event fired when the corresponding InteractivelyPickupItem action occurs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private` | `ItemStack` | `itemStack` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `InteractivelyPickupItemEvent(@Nonnull ItemStack itemStack)` |
| `@Nonnull public` | `ItemStack` | `getItemStack()` |
| `public` | `void` | `setItemStack(@Nonnull ItemStack itemStack)` |
