---
title: "OpRemoveCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions.commands.op"
fqcn: "com.hypixel.hytale.server.core.permissions.commands.op.OpRemoveCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "permissions"
  - "commands"
  - "op"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.permissions.commands.op`

```java
public class OpRemoveCommand extends CommandBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_OP_REMOVED_TARGET` |
| `private final` | `RequiredArg<UUID>` | `playerArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `executeSync(CommandContext context)` |
