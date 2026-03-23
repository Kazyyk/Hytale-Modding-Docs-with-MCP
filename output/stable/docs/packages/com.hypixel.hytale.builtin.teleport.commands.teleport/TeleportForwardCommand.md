---
title: "TeleportForwardCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.teleport"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.teleport.TeleportForwardCommand"
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
public class TeleportForwardCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `OptionalArg<Integer>` | `countArg` |
| `` | `int` | `counter` |
| `` | `TeleportHistory` | `history` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TeleportForwardCommand()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
