---
title: "WorldGenBenchmarkCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.worldgen"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.worldgen.WorldGenBenchmarkCommand"
api_surface: false
extends: "CommandBase"
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
public class WorldGenBenchmarkCommand extends CommandBase
```

Console command handling WorldGenBenchmark operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `AtomicBoolean` | `IS_RUNNING` | `new AtomicBoolean(false)` |
| `public static final` | `Message` | `MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_SAVING` | `Message.translation("server.commands.worldgenbenchmark.saving")` |
| `public static final` | `Message` | `MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_SAVE_FAILED` | `Message.translation("server.commands.worldgenbenchmark.saveFailed")` |
| `public static final` | `Message` | `MESSAGE_COMMANDS_WORLD_GEN_BENCHMARK_ABORT` | `Message.translation("server.commands.worldgenbenchmark.abort")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `OptionalArg<World>` | `worldArg` | `this.withOptionalArg("world", "server.commands.worldthread.arg.desc", ArgTypes.WORLD)` |
| `@Nonnull private final` | `OptionalArg<Integer>` | `seedArg` | `this.withOptionalArg("seed", "server.commands.worldgenbenchmark.seed.desc", ArgTypes.INTEGER)` |
| `@Nonnull private final` | `RequiredArg<Vector2i>` | `pos1Arg` | `this.withRequiredArg("pos1", "server.commands.worldgenbenchmark.pos1.desc", ArgTypes.VECTOR2I)` |
| `@Nonnull private final` | `RequiredArg<Vector2i>` | `pos2Arg` | `this.withRequiredArg("pos2", "server.commands.worldgenbenchmark.pos2.desc", ArgTypes.VECTOR2I)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WorldGenBenchmarkCommand()` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
