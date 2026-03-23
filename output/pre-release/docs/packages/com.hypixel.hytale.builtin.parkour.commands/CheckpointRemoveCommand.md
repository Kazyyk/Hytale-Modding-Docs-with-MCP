---
title: "CheckpointRemoveCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.parkour.commands"
fqcn: "com.hypixel.hytale.builtin.parkour.commands.CheckpointRemoveCommand"
api_surface: false
extends: "AbstractWorldCommand"
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
public class CheckpointRemoveCommand extends AbstractWorldCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_CHECKPOINT_REMOVE_FAILED` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_CHECKPOINT_REMOVE_SUCCESS` |
| `private final` | `RequiredArg<Integer>` | `indexArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, World world, Store<EntityStore> store)` |
