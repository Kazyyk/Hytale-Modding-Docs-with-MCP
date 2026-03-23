---
title: "PermGroupCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions.commands"
fqcn: "com.hypixel.hytale.server.core.permissions.commands.PermGroupCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "permissions"
  - "group"
---

**Package:** `com.hypixel.hytale.server.core.permissions.commands`

```java
public class PermGroupCommand extends AbstractCommandCollection
```

Command collection under `perm group` for managing permission groups. Provides `list`, `add`, and `remove` subcommands that operate on group names and permission node lists via `PermissionsModule`.

## Subcommands

| Name | Description |
|---|---|
| `list` | Lists all permissions for a group across all permission providers. |
| `add` | Adds permissions to a group. |
| `remove` | Removes permissions from a group. |
