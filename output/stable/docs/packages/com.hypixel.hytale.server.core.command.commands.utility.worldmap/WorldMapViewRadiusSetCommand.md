---
title: "WorldMapViewRadiusSetCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.worldmap"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.worldmap.WorldMapViewRadiusSetCommand"
api_surface: false
extends: "AbstractTargetPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
  - "utility"
  - "worldmap"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.utility.worldmap`

```java
public class WorldMapViewRadiusSetCommand extends AbstractTargetPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `RequiredArg<Integer>` | `radiusArg` |
| `@Nonnull private final` | `FlagArg` | `bypassArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WorldMapViewRadiusSetCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context,
        @Nullable Ref<EntityStore> sourceRef,
        @Nonnull Ref<EntityStore> ref,
        @Nonnull PlayerRef playerRef,
        @Nonnull World world,
        @Nonnull Store<EntityStore> store)` |
