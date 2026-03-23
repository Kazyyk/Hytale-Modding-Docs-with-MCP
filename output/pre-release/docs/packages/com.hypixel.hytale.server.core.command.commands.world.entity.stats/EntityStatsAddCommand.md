---
title: "EntityStatsAddCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.entity.stats"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.entity.stats.EntityStatsAddCommand"
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
public class EntityStatsAddCommand extends AbstractTargetEntityCommand
```

Console command handling EntityStatsAdd operations.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `entityStatNameArg` | `this.withRequiredArg("statName", "server.commands.entity.stats.add.statName.desc", ArgTypes.STRING)` |
| `@Nonnull private final` | `RequiredArg<Integer>` | `statAmountArg` | `this.withRequiredArg("statAmount", "server.commands.entity.stats.add.statAmount.desc", ArgTypes.INTEGER)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `EntityStatsAddCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public static` | `void` | `addEntityStat(@Nonnull CommandContext context,
        @Nonnull List<Ref<EntityStore>> entityRefs,
        int statAmount,
        @Nonnull String entityStatName,
        @Nonnull Store<EntityStore> store)` |
