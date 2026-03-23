---
title: "EntityStatsSetCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.entity.stats"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.entity.stats.EntityStatsSetCommand"
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
public class EntityStatsSetCommand extends AbstractTargetEntityCommand
```

Console command handling EntityStatsSet operations.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `entityStatNameArg` | `this.withRequiredArg("statName", "server.commands.entity.stats.set.statName.desc", ArgTypes.STRING)` |
| `@Nonnull private final` | `RequiredArg<Integer>` | `statValueArg` | `this.withRequiredArg("statValue", "server.commands.entity.stats.set.statValue.desc", ArgTypes.INTEGER)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `EntityStatsSetCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public static` | `void` | `setEntityStat(@Nonnull CommandContext context,
        @Nonnull List<Ref<EntityStore>> entities,
        int newStatValue,
        @Nonnull String entityStatName,
        @Nonnull Store<EntityStore> store)` |
