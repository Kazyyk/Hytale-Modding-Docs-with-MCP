---
title: "RemoveWorldEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.events"
fqcn: "com.hypixel.hytale.server.core.universe.world.events.RemoveWorldEvent"
api_surface: false
extends: "WorldEvent"
implements: ["ICancellable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "events"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.events`

```java
public class RemoveWorldEvent extends WorldEvent implements ICancellable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `cancelled` |
| `private final` | `RemoveWorldEvent.RemovalReason` | `removalReason` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `RemoveWorldEvent.RemovalReason` | `getRemovalReason()` |
| `@Override public` | `boolean` | `isCancelled()` |
| `@Override public` | `void` | `setCancelled(boolean cancelled)` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `RemoveWorldEvent.RemovalReason`
