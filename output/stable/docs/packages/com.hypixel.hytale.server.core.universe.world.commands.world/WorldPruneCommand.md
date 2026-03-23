---
title: "WorldPruneCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.world.WorldPruneCommand"
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
public class WorldPruneCommand extends AbstractAsyncCommand
```

Console command handling WorldPrune operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_PRUNE_NONE_TO_PRUNE` | `Message.translation("server.commands.world.prune.noneToPrune")` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_PRUNE_PRUNE_ERROR` | `Message.translation("server.commands.world.prune.pruneError")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WorldPruneCommand()` |
| `@Nonnull @Override protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
