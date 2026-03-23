---
title: "TeleportWorldCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.teleport"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.teleport.TeleportWorldCommand"
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
public class TeleportWorldCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `RequiredArg<String>` | `worldNameArg` |
| `` | `String` | `worldName` |
| `` | `World` | `targetWorld` |
| `` | `Transform` | `spawnPoint` |
| `` | `TransformComponent` | `transformComponent` |
| `` | `HeadRotation` | `headRotationComponent` |
| `` | `Vector3d` | `previousPos` |
| `` | `Vector3f` | `previousRotation` |
| `` | `TeleportHistory` | `teleportHistoryComponent` |
| `` | `Teleport` | `teleportComponent` |
| `` | `Vector3d` | `spawnPos` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TeleportWorldCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
