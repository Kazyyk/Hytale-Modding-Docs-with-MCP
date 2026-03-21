---
title: "WorldAddCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.world.WorldAddCommand"
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
public class WorldAddCommand extends CommandBase
```

Console command handling WorldAdd operations.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `nameArg` | `this.withRequiredArg("name", "server.commands.addworld.arg.name.desc", ArgTypes.STRING)` |
| `@Nonnull private final` | `DefaultArg<String>` | `genArg` | `this.withDefaultArg("gen", "server.commands.addworld.arg.gen.desc", ArgTypes.STRING, "default", "")` |
| `@Nonnull private final` | `DefaultArg<String>` | `storageArg` | `this.withDefaultArg("storage", "server.commands.addworld.arg.gen.desc", ArgTypes.STRING, "default", "")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WorldAddCommand()` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
