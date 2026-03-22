---
title: "MemoriesSetCountCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.commands"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.commands.MemoriesSetCountCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "memories"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.commands`

```java
public class MemoriesSetCountCommand extends AbstractWorldCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_MEMORIES_SETCOUNT_INVALID` |
| `private final` | `RequiredArg<Integer>` | `countArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, World world, Store<EntityStore> store)` |
