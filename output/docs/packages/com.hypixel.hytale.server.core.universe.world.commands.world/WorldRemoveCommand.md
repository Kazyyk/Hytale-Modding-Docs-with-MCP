---
title: "WorldRemoveCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.world.WorldRemoveCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.commands.world`

```java
public class WorldRemoveCommand extends CommandBase
```

Console command handling WorldRemove operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Message` | `MESSAGE_UNIVERSE_REMOVE_WORLD_NOT_FOUND` | `Message.translation("server.universe.removeworld.notFound")` |
| `public static final` | `Message` | `MESSAGE_UNIVERSE_REMOVE_WORLD_ONLY_ONE_WORLD_LOADED` | `Message.translation("server.universe.removeworld.onlyOneWorldLoaded")` |
| `public static final` | `Message` | `MESSAGE_UNIVERSE_REMOVE_WORLD_CHANGE_DEFAULT_WORLD` | `Message.translation("server.universe.removeworld.changeDefaultWorld")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `nameArg` | `this.withRequiredArg("name", "server.commands.removeworld.arg.name.desc", ArgTypes.STRING)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WorldRemoveCommand()` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
