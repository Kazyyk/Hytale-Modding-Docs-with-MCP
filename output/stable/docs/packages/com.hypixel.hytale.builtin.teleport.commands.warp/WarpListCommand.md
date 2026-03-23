---
title: "WarpListCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.warp"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.warp.WarpListCommand"
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
public class WarpListCommand extends CommandBase
```

Console command handling WarpList operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `int` | `WARPS_PER_LIST_PAGE` | `8` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED` | `Message.translation("server.commands.teleport.warp.notLoaded")` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD` | `Message.translation("server.commands.errors.playerNotInWorld")` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_WARP_NO_WARPS` | `Message.translation("server.commands.teleport.warp.noWarps")` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_WARP_PAGE_NUM_TOO_HIGH` | `Message.translation("server.commands.teleport.warp.pageNumTooHigh")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `OptionalArg<Integer>` | `pageArg` | `this.withOptionalArg("page", "server.commands.warp.list.page.desc", ArgTypes.INTEGER)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WarpListCommand()` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
