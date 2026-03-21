---
title: "BlockBulkReplaceCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.block.bulk"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.block.bulk.BlockBulkReplaceCommand"
api_surface: false
extends: "AbstractPlayerCommand"
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
public class BlockBulkReplaceCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `findArg` |
| `@Nonnull private final` | `RequiredArg<String>` | `replaceArg` |
| `@Nonnull private final` | `RequiredArg<Integer>` | `radiusArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BlockBulkReplaceCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
| `@Nonnull protected static` | `IntList` | `getBlockIdList(int blockId)` |
| `@Nonnull private static` | `IntList` | `createNESWRotationLists(@Nonnull BlockType block, @Nonnull IntList blockIdList)` |
