---
title: "StashCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.StashCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "command"
---
**Package:** `com.hypixel.hytale.server.core.command.commands.utility`

```java
public class StashCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `int` | `DISTANCE_MAX` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `StashCommand()` |
| `protected` | `void` | `execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )` |
| `private` | `ItemContainerState` | `getItemContainerState( @Nonnull Ref<EntityStore> ref, @Nonnull World world, @Nonnull CommandContext context, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
