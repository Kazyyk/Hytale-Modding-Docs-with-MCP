---
title: "PermCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions.commands"
fqcn: "com.hypixel.hytale.server.core.permissions.commands.PermCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "permissions"
---

**Package:** `com.hypixel.hytale.server.core.permissions.commands`

```java
public class PermCommand extends AbstractCommandCollection
```

Root command collection registered under `perm` for permission management. Aggregates group, user, and test subcommands.

## Constructor

```java
public PermCommand()
```

Registers subcommands: [PermGroupCommand](PermGroupCommand.md), [PermUserCommand](PermUserCommand.md), [PermTestCommand](PermTestCommand.md).
