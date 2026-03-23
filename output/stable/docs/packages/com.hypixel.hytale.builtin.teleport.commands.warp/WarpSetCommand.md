---
title: "WarpSetCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.warp"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.warp.WarpSetCommand"
api_surface: false
extends: "AbstractPlayerCommand"
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
public class WarpSetCommand extends AbstractPlayerCommand
```

Console command handling WarpSet operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED` | `Message.translation("server.commands.teleport.warp.notLoaded")` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_WARP_RESERVED_KEYWORD` | `Message.translation("server.commands.teleport.warp.reservedKeyword")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `nameArg` | `this.withRequiredArg("name", "server.commands.warp.set.name.desc", ArgTypes.STRING)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WarpSetCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
