---
title: "WorldTpsCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.world.tps"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.world.tps.WorldTpsCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "commands"
  - "world"
  - "tps"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.commands.world.tps`

```java
public class WorldTpsCommand extends AbstractWorldCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `RequiredArg<Integer>` | `tickRateArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, World world, Store<EntityStore> store)` |
