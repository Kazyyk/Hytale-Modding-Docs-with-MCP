---
title: "PermUserCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions.commands"
fqcn: "com.hypixel.hytale.server.core.permissions.commands.PermUserCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "permissions"
  - "user"
---

**Package:** `com.hypixel.hytale.server.core.permissions.commands`

```java
public class PermUserCommand extends AbstractCommandCollection
```

Command collection under `perm user` for managing per-user permissions. Users are identified by UUID. Provides `list`, `add`, `remove` for direct permissions and a nested `group` subcommand for group membership management (`group list`, `group add`, `group remove`).

## Subcommands

| Name | Description |
|---|---|
| `list` | Lists all permissions for a user across all providers. |
| `add` | Adds permissions to a user by UUID. |
| `remove` | Removes permissions from a user by UUID. |
| `group` | Nested collection: `list`/`add`/`remove` user group membership. |
