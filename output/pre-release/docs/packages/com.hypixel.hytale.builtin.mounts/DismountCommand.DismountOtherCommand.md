---
title: "DismountCommand.DismountOtherCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.commands"
fqcn: "com.hypixel.hytale.builtin.mounts.commands.DismountCommand.DismountOtherCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts.commands`

```java
private static class DismountOtherCommand extends CommandBase
```

Usage variant of [DismountCommand](DismountCommand.md) that dismounts a specific player by name. Takes a required `player` argument of type `ArgTypes.PLAYER_REF`.

## Constructor

```java
DismountOtherCommand()
```

Creates the variant with description key `"server.commands.dismount.other.desc"`.

## Behavior

```java
@Override
protected void executeSync(@Nonnull CommandContext context)
```

Resolves the target player reference, validates it is in a world, then executes on the world thread:
1. Reads the target's `Player` component.
2. Removes the [MountedComponent](MountedComponent.md) from the target entity.
3. Sends a `"server.commands.dismount.dismountOther"` message with the target username.

If the player reference is invalid or the player is not in a world, sends an error message.

## Related Types

- [DismountCommand](DismountCommand.md) -- enclosing command
