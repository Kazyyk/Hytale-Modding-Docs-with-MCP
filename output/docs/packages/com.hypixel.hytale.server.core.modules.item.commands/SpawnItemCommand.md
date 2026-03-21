---
title: "SpawnItemCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.item.commands"
fqcn: "com.hypixel.hytale.server.core.modules.item.commands.SpawnItemCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "item"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.item.commands`

```java
public class SpawnItemCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD` |
| `private final` | `RequiredArg<Item>` | `itemArg` |
| `private final` | `DefaultArg<Integer>` | `quantityArg` |
| `private final` | `OptionalArg<Integer>` | `countArg` |
| `private final` | `DefaultArg<Float>` | `forceArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)` |
