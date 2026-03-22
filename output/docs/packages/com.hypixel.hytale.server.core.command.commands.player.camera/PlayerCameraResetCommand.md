---
title: "PlayerCameraResetCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.player.camera"
fqcn: "com.hypixel.hytale.server.core.command.commands.player.camera.PlayerCameraResetCommand"
api_surface: false
extends: "AbstractTargetPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
  - "player"
  - "camera"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.player.camera`

```java
public class PlayerCameraResetCommand extends AbstractTargetPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_CAMERA_RESET_SUCCESS` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `PlayerCameraResetCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context,
        @Nullable Ref<EntityStore> sourceRef,
        @Nonnull Ref<EntityStore> ref,
        @Nonnull PlayerRef playerRef,
        @Nonnull World world,
        @Nonnull Store<EntityStore> store)` |
