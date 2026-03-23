---
title: "PermTestCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions.commands"
fqcn: "com.hypixel.hytale.server.core.permissions.commands.PermTestCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "permissions"
  - "test"
---

**Package:** `com.hypixel.hytale.server.core.permissions.commands`

```java
public class PermTestCommand extends CommandBase
```

Command registered under `perm test` that checks whether the command sender has one or more permission nodes. Outputs the result for each node.

## Constructor

```java
public PermTestCommand()
```

Registered under `"test"` with description key `"server.commands.testperm.desc"`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
