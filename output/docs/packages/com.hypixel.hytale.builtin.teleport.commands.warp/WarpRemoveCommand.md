---
title: "WarpRemoveCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.warp"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.warp.WarpRemoveCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "teleport"
  - "commands"
  - "warp"
---

**Package:** `com.hypixel.hytale.builtin.teleport.commands.warp`

```java
public class WarpRemoveCommand extends CommandBase
```

Console command handling WarpRemove operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED` | `Message.translation("server.commands.teleport.warp.notLoaded")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `nameArg` | `this.withRequiredArg("name", "server.commands.warp.remove.name.desc", ArgTypes.STRING)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WarpRemoveCommand()` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
