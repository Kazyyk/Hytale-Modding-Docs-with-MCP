---
title: "TeleportHomeCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.teleport"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.teleport.TeleportHomeCommand"
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
public class TeleportHomeCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_TELEPORT_TELEPORTED_SELF_HOME` |
| `` | `TransformComponent` | `transformComponent` |
| `` | `HeadRotation` | `headRotationComponent` |
| `` | `Vector3d` | `previousPos` |
| `` | `Vector3f` | `previousHeadRotation` |
| `` | `TeleportHistory` | `teleportHistoryComponent` |
| `` | `Teleport` | `teleportComponent` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TeleportHomeCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
