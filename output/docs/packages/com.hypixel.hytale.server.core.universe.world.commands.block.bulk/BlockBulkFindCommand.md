---
title: "BlockBulkFindCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.block.bulk"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.block.bulk.BlockBulkFindCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "commands"
  - "block"
  - "bulk"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.commands.block.bulk`

```java
public class BlockBulkFindCommand extends AbstractWorldCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_BLOCK_FIND_TIME_OUT` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_BLOCK_FIND_DONE` |
| `@Nonnull private final` | `RequiredArg<IntCoord>` | `chunkXArg` |
| `@Nonnull private final` | `RequiredArg<IntCoord>` | `chunkZArg` |
| `@Nonnull private final` | `RequiredArg<String>` | `blockTypeArg` |
| `@Nonnull private final` | `RequiredArg<Integer>` | `countArg` |
| `@Nonnull private final` | `RequiredArg<Integer>` | `timeoutArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BlockBulkFindCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
