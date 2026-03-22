---
title: "WorldSaveCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.world.WorldSaveCommand"
api_surface: false
extends: "AbstractAsyncCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.commands.world`

```java
public class WorldSaveCommand extends AbstractAsyncCommand
```

Console command handling WorldSave operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_SAVE_NO_WORLD_SPECIFIED` | `Message.translation("server.commands.world.save.noWorldSpecified")` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_SAVE_SAVING_ALL` | `Message.translation("server.commands.world.save.savingAll")` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_SAVE_SAVING_ALL_DONE` | `Message.translation("server.commands.world.save.savingAllDone")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `OptionalArg<World>` | `worldArg` | `this.withOptionalArg("world", "server.commands.worldthread.arg.desc", ArgTypes.WORLD)` |
| `@Nonnull private final` | `FlagArg` | `saveAllFlag` | `this.withFlagArg("all", "server.commands.world.save.all.desc")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WorldSaveCommand()` |
| `@Nonnull @Override protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `@Nonnull private` | `CompletableFuture<Void>` | `saveAllWorlds(@Nonnull CommandContext context)` |
| `@Nonnull private static` | `CompletableFuture<Void>` | `saveWorld(@Nonnull World world)` |
