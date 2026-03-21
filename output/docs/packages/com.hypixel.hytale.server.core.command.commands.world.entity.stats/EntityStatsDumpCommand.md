---
title: "EntityStatsDumpCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.entity.stats"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.entity.stats.EntityStatsDumpCommand"
api_surface: false
extends: "AbstractTargetEntityCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.world.entity.stats`

```java
public class EntityStatsDumpCommand extends AbstractTargetEntityCommand
```

Console command handling EntityStatsDump operations.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `EntityStatsDumpCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public static` | `void` | `dumpEntityStatsData(@Nonnull CommandContext context, @Nonnull List<Ref<EntityStore>> entities, @Nonnull Store<EntityStore> store)` |
