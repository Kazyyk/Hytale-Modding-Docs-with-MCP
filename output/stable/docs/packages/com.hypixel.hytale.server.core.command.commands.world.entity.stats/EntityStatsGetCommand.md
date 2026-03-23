---
title: "EntityStatsGetCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.entity.stats"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.entity.stats.EntityStatsGetCommand"
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
public class EntityStatsGetCommand extends AbstractTargetEntityCommand
```

Console command handling EntityStatsGet operations.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `entityStatNameArg` | `this.withRequiredArg("statName", "server.commands.entity.stats.get.statName.desc", ArgTypes.STRING)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `EntityStatsGetCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public static` | `void` | `getEntityStat(@Nonnull CommandContext context, @Nonnull List<Ref<EntityStore>> entities, @Nonnull String entityStat, @Nonnull Store<EntityStore> store)` |
