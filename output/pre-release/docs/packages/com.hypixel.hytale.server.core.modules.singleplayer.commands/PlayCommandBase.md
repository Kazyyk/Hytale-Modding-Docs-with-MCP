---
title: "PlayCommandBase"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.singleplayer.commands"
fqcn: "com.hypixel.hytale.server.core.modules.singleplayer.commands.PlayCommandBase"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "command"
  - "singleplayer"
---

**Package:** `com.hypixel.hytale.server.core.modules.singleplayer.commands`

```java
public abstract class PlayCommandBase extends CommandBase
```

Abstract base for related commands.

## Fields

| Field | Type | Description |
|---|---|---|
| `singleplayerModule` | `SingleplayerModule` | final SingleplayerModule field. |
| `commandAccess` | `Access` | final Access field. |

## Constructors

| Constructor | Description |
|---|---|
| `PlayCommandBase(@Nonnull String name, @Nonnull String description, @Nonnull SingleplayerModule singleplayerModule, @Nonnull Access commandAccess)` | Creates a new PlayCommandBase instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `executeSync(@Nonnull CommandContext context)` | `void` | protected method. |
