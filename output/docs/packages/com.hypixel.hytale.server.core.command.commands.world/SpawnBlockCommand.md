---
title: "SpawnBlockCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.SpawnBlockCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
  - "world"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.world`

```java
public class SpawnBlockCommand extends AbstractWorldCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `RequiredArg<String>` | `blockArg` |
| `private final` | `RequiredArg<RelativeDoublePosition>` | `positionArg` |
| `private final` | `DefaultArg<Vector3f>` | `rotationArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, World world, Store<EntityStore> store)` |
