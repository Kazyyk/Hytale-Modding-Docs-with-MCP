---
title: "WorldMapDiscoverCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.worldmap"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.worldmap.WorldMapDiscoverCommand"
api_surface: false
extends: "AbstractPlayerCommand"
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
public class WorldMapDiscoverCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_WORLD_MAP_ALL_ZONES_DISCOVERED` |
| `@Nonnull private final` | `OptionalArg<String>` | `zoneArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WorldMapDiscoverCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
