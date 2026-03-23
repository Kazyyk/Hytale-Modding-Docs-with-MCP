---
title: "BlockRowCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.block"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.block.BlockRowCommand"
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
**Package:** `com.hypixel.hytale.server.core.universe.world.commands.block`

```java
public class BlockRowCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `int` | `MAX_MATCHES` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BlockRowCommand()` |
| `protected` | `void` | `execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )` |
| `private` | `void` | `spawnBlocksRow(@Nonnull World world, @Nonnull Vector3d origin, @Nonnull Vector3i direction, @Nonnull List<BlockType> blockTypes)` |
| `private static` | `Vector3i` | `getDominantCardinal(@Nonnull Vector3d direction)` |
| `private static` | `Axis` | `getAxis(@Nonnull Vector3i direction)` |
| `private` | `List<BlockType>` | `findBlockTypes(String wildcardQuery)` |
