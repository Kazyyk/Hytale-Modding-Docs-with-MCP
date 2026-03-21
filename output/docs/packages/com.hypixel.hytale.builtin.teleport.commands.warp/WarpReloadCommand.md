---
title: "WarpReloadCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.warp"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.warp.WarpReloadCommand"
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
public class WarpReloadCommand extends CommandBase
```

Console command handling WarpReload operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `HytaleLogger` | `logger` | `HytaleLogger.forEnclosingClass()` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED` | `Message.translation("server.commands.teleport.warp.notLoaded")` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_WARP_FAILED_TO_RELOAD` | `Message.translation("server.commands.teleport.warp.failedToReload")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WarpReloadCommand()` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
