---
title: "TeleportTopCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.teleport"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.teleport.TeleportTopCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "teleport"
  - "commands"
  - "teleport"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.teleport.commands.teleport`

```java
public class TeleportTopCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_TOP_CHUNK_NOT_LOADED_AT_POS` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_TELEPORTED_TO_TOP` |
| `private static final` | `String` | `TELEPORT_HISTORY_KEY` |
| `` | `TransformComponent` | `transformComponent` |
| `` | `Vector3d` | `position` |
| `` | `WorldChunk` | `worldChunk` |
| `` | `HeadRotation` | `headRotationComponent` |
| `` | `Vector3f` | `headRotation` |
| `` | `int` | `height` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TeleportTopCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
