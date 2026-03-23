---
title: "OpSelfCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions.commands.op"
fqcn: "com.hypixel.hytale.server.core.permissions.commands.op.OpSelfCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "permissions"
  - "commands"
  - "op"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.permissions.commands.op`

```java
public class OpSelfCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_OP_ADDED` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_OP_REMOVED` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_NON_VANILLA_PERMISSIONS` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_SINGLEPLAYER_OWNER_REQ` |
| `private static final` | `Message` | `MESSAGE_COMMANDS_CURRENTLY_OP` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `boolean` | `canGeneratePermission()` |
| `@Override protected` | `void` | `execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)` |
