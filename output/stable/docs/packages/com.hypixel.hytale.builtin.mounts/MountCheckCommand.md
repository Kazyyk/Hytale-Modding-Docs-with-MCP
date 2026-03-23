---
title: "MountCheckCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.commands"
fqcn: "com.hypixel.hytale.builtin.mounts.commands.MountCheckCommand"
api_surface: false
extends: "AbstractTargetPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts.commands`

```java
public class MountCheckCommand extends AbstractTargetPlayerCommand
```

The `/mount check` subcommand. Reports the mount status of the target player.

## Constructor

```java
public MountCheckCommand()
```

Creates the command with name `"check"` and description key `"server.commands.check.desc"`.

## Behavior

```java
@Override
protected void execute(
    @Nonnull CommandContext context,
    @Nullable Ref<EntityStore> sourceRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull PlayerRef playerRef,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Reads the target player's [MountedComponent](MountedComponent.md) and sends one of four messages:

| Condition | Message Key |
|---|---|
| No `MountedComponent` | `server.commands.check.noComponent` |
| Mounted to entity | `server.commands.check.mountedToEntity` |
| Mounted to block | `server.commands.check.mountedToBlock` |
| Neither entity nor block | `server.commands.check.unknownStatus` |

## Related Types

- [MountCommand](MountCommand.md) -- parent command collection
- [MountedComponent](MountedComponent.md) -- the component being inspected
