---
title: "BlockBulkFindHereCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.block.bulk"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.block.bulk.BlockBulkFindHereCommand"
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
public class BlockBulkFindHereCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `FlagArg` | `printNameArg` |
| `@Nonnull private final` | `RequiredArg<String>` | `blockTypeArg` |
| `@Nonnull private final` | `DefaultArg<Integer>` | `radiusArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BlockBulkFindHereCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
