---
title: "AddWorldEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.events"
fqcn: "com.hypixel.hytale.server.core.universe.world.events.AddWorldEvent"
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
public class AddWorldEvent extends WorldEvent implements ICancellable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `cancelled` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Override public` | `boolean` | `isCancelled()` |
| `@Override public` | `void` | `setCancelled(boolean cancelled)` |
