---
title: "WorldSetDefaultCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.world.WorldSetDefaultCommand"
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
public class WorldSetDefaultCommand extends CommandBase
```

Console command handling WorldSetDefault operations.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `nameArg` | `this.withRequiredArg("name", "server.commands.world.setdefault.arg.name.desc", ArgTypes.STRING)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WorldSetDefaultCommand()` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
