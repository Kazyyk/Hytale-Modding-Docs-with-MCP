---
title: "WorldGenReloadCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.worldgen"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.worldgen.WorldGenReloadCommand"
api_surface: false
extends: "AbstractAsyncWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.world.worldgen`

```java
public class WorldGenReloadCommand extends AbstractAsyncWorldCommand
```

Console command handling WorldGenReload operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `AtomicBoolean` | `IS_RUNNING` | `new AtomicBoolean(false)` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_GEN_RELOAD_STARTED` | `Message.translation("server.commands.worldgen.reload.started")` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_GEN_RELOAD_COMPLETE` | `Message.translation("server.commands.worldgen.reload.complete")` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_GEN_RELOAD_DELETING_CHUNKS` | `Message.translation("server.commands.worldgen.reload.deletingChunks")` |
| `@Nonnull public static final` | `Message` | `MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_ABORT` | `Message.translation("server.commands.worldgen.reload.abort")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `FlagArg` | `clearArg` | `this.withFlagArg("clear", "server.commands.worldgen.reload.clear.desc")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WorldGenReloadCommand()` |
| `@Nonnull @Override protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context, @Nonnull World world)` |
| `@Nonnull private static` | `CompletableFuture<Void>` | `clearChunks(@Nonnull CommandContext context, @Nonnull World world)` |
