---
title: "SpawnSetCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.teleport"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.teleport.SpawnSetCommand"
api_surface: false
extends: "AbstractWorldCommand"
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
public class SpawnSetCommand extends AbstractWorldCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `DecimalFormat` | `DECIMAL` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_ERROR_PROVIDE_POSITION` |
| `private final` | `OptionalArg<RelativeDoublePosition>` | `positionArg` |
| `private final` | `DefaultArg<Vector3f>` | `rotationArg` |
| `` | `Vector3d` | `position` |
| `` | `RelativeDoublePosition` | `relativePosition` |
| `` | `Ref<EntityStore>` | `playerRef` |
| `` | `TransformComponent` | `transformComponent` |
| `` | `Vector3f` | `rotation` |
| `` | `Ref<EntityStore>` | `playerRefx` |
| `` | `HeadRotation` | `headRotationComponent` |
| `` | `Transform` | `spawnTransform` |
| `` | `WorldConfig` | `worldConfig` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SpawnSetCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `` | `throw new` | `GeneralCommandException(MESSAGE_COMMANDS_ERROR_PROVIDE_POSITION)` |
