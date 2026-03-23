---
title: "ChangeGameModeEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.ChangeGameModeEvent"
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
public class ChangeGameModeEvent extends CancellableEcsEvent
```

A cancellable ECS event fired when the corresponding ChangeGameMode action occurs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private` | `GameMode` | `gameMode` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ChangeGameModeEvent(@Nonnull GameMode gameMode)` |
| `@Nonnull public` | `GameMode` | `getGameMode()` |
| `public` | `void` | `setGameMode(@Nonnull GameMode gameMode)` |
