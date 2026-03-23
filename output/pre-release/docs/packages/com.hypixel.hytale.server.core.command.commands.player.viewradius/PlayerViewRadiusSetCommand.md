---
title: "PlayerViewRadiusSetCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.player.viewradius"
fqcn: "com.hypixel.hytale.server.core.command.commands.player.viewradius.PlayerViewRadiusSetCommand"
api_surface: false
extends: "AbstractTargetPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
  - "player"
  - "viewradius"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.player.viewradius`

```java
public class PlayerViewRadiusSetCommand extends AbstractTargetPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `RequiredArg<String>` | `radiusArg` |
| `private final` | `FlagArg` | `blocksArg` |
| `private final` | `FlagArg` | `bypassArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)` |
