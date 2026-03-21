---
title: "CheckpointAddCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.parkour.commands"
fqcn: "com.hypixel.hytale.builtin.parkour.commands.CheckpointAddCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "parkour"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.parkour.commands`

```java
public class CheckpointAddCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_CHECKPOINT_ADD_FAILED` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_CHECKPOINT_ADD_SUCCESS` |
| `private final` | `RequiredArg<Integer>` | `indexArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)` |
