---
title: "EntityStatsSetToMaxCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.entity.stats"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.entity.stats.EntityStatsSetToMaxCommand"
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
public class EntityStatsSetToMaxCommand extends AbstractTargetEntityCommand
```

Console command handling EntityStatsSetToMax operations.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `EntityStatsSetToMaxCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public static` | `void` | `setEntityStatMax(@Nonnull CommandContext context, @Nonnull List<Ref<EntityStore>> entities, @Nonnull String entityStatName, @Nonnull Store<EntityStore> store)` |
