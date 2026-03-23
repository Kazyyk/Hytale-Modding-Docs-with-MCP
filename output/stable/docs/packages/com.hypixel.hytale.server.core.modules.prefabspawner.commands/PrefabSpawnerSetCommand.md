---
title: "PrefabSpawnerSetCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.prefabspawner.commands"
fqcn: "com.hypixel.hytale.server.core.modules.prefabspawner.commands.PrefabSpawnerSetCommand"
api_surface: false
extends: "TargetPrefabSpawnerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "command"
  - "prefab"
---

**Package:** `com.hypixel.hytale.server.core.modules.prefabspawner.commands`

```java
public class PrefabSpawnerSetCommand extends TargetPrefabSpawnerCommand
```

Server command extending `TargetPrefabSpawnerCommand`.

## Constructors

| Constructor | Description |
|---|---|
| `PrefabSpawnerSetCommand()` | Creates a new PrefabSpawnerSetCommand instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(@Nonnull CommandContext context, @Nonnull WorldChunk chunk, @Nonnull PrefabSpawnerState prefabSpawner)` | `void` | protected method. |
| `getOrDefault(@Nonnull OptionalArg<Boolean> arg, @Nonnull CommandContext context, boolean defaultValue)` | `boolean` | static protected method. |
