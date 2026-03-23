---
title: "EntityRemoveCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.world.entity"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.entity.EntityRemoveCommand"
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
public class EntityRemoveCommand extends AbstractWorldCommand
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `EntityRemoveCommand()` |
| `protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public static` | `void` | `removeEntity( @Nullable Ref<EntityStore> playerRef, @Nonnull Ref<EntityStore> entityReference, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
