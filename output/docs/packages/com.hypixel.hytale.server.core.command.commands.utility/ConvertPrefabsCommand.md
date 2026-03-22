---
title: "ConvertPrefabsCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.ConvertPrefabsCommand"
api_surface: false
extends: "AbstractAsyncCommand"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "command"
---
**Package:** `com.hypixel.hytale.server.core.command.commands.utility`

```java
public class ConvertPrefabsCommand extends AbstractAsyncCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `UNABLE_TO_LOAD_MODEL` |
| `private static final` | `String` | `FAILED_TO_FIND_BLOCK` |
| `private static final` | `int` | `BATCH_SIZE` |
| `private static final` | `long` | `DELAY_BETWEEN_BATCHES_MS` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ConvertPrefabsCommand()` |
| `protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `private` | `void` | `sendCompletionMessages(@Nonnull CommandContext context, @Nonnull Path assetPath, @Nonnull List<String> failed, @Nonnull List<String> skipped)` |
| `private` | `CompletableFuture<Void>` | `convertPath( @Nonnull Path assetPath, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, @Nonnull List<String> failed, @Nonnull List<String> skipped )` |
| `private` | `CompletableFuture<Void>` | `processPrefabsInBatches( @Nonnull List<Path> prefabPaths, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, @Nullable CompletableFuture<World> conversionWorldFuture, @Nonnull List<String> failed, @Nonnull List<String> skipped )` |
| `private` | `CompletableFuture<Void>` | `processPrefab( @Nonnull Path path, boolean blocks, boolean filler, boolean relative, boolean entities, boolean destructive, @Nullable CompletableFuture<World> conversionWorldFuture, @Nonnull List<String> failed, @Nonnull List<String> skipped )` |
