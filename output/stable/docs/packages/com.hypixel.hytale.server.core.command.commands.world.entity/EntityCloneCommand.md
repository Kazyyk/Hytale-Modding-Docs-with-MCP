---
title: "EntityCloneCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.entity"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.entity.EntityCloneCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "command"
---
**Package:** `com.hypixel.hytale.server.core.command.commands.world.entity`

```java
public class EntityCloneCommand extends AbstractWorldCommand
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `EntityCloneCommand()` |
| `protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public static` | `void` | `cloneEntity(@Nonnull CommandSender sender, @Nonnull Ref<EntityStore> entityReference, @Nonnull Store<EntityStore> store)` |
