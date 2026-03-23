---
title: "SimpleBlockCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.block"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.block.SimpleBlockCommand"
api_surface: false
extends: "AbstractWorldCommand"
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
public abstract class SimpleBlockCommand extends AbstractWorldCommand
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `SimpleBlockCommand(@Nonnull String name, @Nonnull String description)` |
| `protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `protected abstract` | `void` | `executeWithBlock(@Nonnull CommandContext var1, @Nonnull WorldChunk var2, int var3, int var4, int var5)` |
