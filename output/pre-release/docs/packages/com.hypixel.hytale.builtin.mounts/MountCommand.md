---
title: "MountCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.commands"
fqcn: "com.hypixel.hytale.builtin.mounts.commands.MountCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts.commands`

```java
public class MountCommand extends AbstractCommandCollection
```

Top-level `/mount` command collection. Registered by [MountPlugin.setup()](MountPlugin.md). Groups the mount-related subcommands under the `mount` namespace with the translation key `"server.commands.mount"`.

## Constructor

```java
public MountCommand()
```

Creates the collection with name `"mount"` and registers two subcommands:
- [DismountCommand](DismountCommand.md) (`/mount dismount`)
- [MountCheckCommand](MountCheckCommand.md) (`/mount check`)

## Related Types

- [DismountCommand](DismountCommand.md) -- dismount subcommand
- [MountCheckCommand](MountCheckCommand.md) -- mount status check subcommand
- [MountPlugin](MountPlugin.md) -- registers this command
