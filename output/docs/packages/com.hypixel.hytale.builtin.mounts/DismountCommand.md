---
title: "DismountCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.commands"
fqcn: "com.hypixel.hytale.builtin.mounts.commands.DismountCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts.commands`

```java
public class DismountCommand extends AbstractPlayerCommand
```

The `/mount dismount` subcommand. Dismounts the executing player from any block-based mount by removing their [MountedComponent](MountedComponent.md). Also provides a variant to dismount another player by name.

## Constructor

```java
public DismountCommand()
```

Creates the command with name `"dismount"` and description key `"server.commands.dismount.desc"`. Adds a [DismountOtherCommand](DismountCommand.DismountOtherCommand.md) usage variant.

## Behavior

```java
@Override
protected void execute(
    @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world
)
```

Removes the `MountedComponent` from the executing player's entity and sends the `"server.commands.dismount.dismountAttempted"` message.

## Inner Classes

- [DismountOtherCommand](DismountCommand.DismountOtherCommand.md) -- variant targeting another player

## Related Types

- [MountCommand](MountCommand.md) -- parent command collection
- [MountedComponent](MountedComponent.md) -- the component being removed
