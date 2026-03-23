---
title: "WorldLoadCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.world.WorldLoadCommand"
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
public class WorldLoadCommand extends CommandBase
```

Console command handling WorldLoad operations.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `nameArg` | `this.withRequiredArg("name", "server.commands.loadworld.arg.name.desc", ArgTypes.STRING)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WorldLoadCommand()` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
