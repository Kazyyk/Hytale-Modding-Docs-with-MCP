---
title: "InventorySeeCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.player.inventory"
fqcn: "com.hypixel.hytale.server.core.command.commands.player.inventory.InventorySeeCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "command"
---
**Package:** `com.hypixel.hytale.server.core.command.commands.player.inventory`

```java
public class InventorySeeCommand extends AbstractPlayerCommand
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Message` | `MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD` | `Message.translation("server.commands.errors.playerNotInWo...` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `InventorySeeCommand()` |
| `protected` | `void` | `execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )` |
