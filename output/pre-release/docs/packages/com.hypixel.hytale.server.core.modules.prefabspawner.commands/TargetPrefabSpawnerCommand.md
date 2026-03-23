---
title: "TargetPrefabSpawnerCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.prefabspawner.commands"
fqcn: "com.hypixel.hytale.server.core.modules.prefabspawner.commands.TargetPrefabSpawnerCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "command"
  - "prefab"
---

**Package:** `com.hypixel.hytale.server.core.modules.prefabspawner.commands`

```java
public abstract class TargetPrefabSpawnerCommand extends AbstractWorldCommand
```

Abstract base for related commands.

## Constructors

| Constructor | Description |
|---|---|
| `TargetPrefabSpawnerCommand(@Nonnull String name, @Nonnull String description)` | Creates a new TargetPrefabSpawnerCommand instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)` | `void` | protected method. |
| `execute(@Nonnull CommandContext var1, @Nonnull WorldChunk var2, @Nonnull PrefabSpawnerState var3)` | `void` | protected method. |
