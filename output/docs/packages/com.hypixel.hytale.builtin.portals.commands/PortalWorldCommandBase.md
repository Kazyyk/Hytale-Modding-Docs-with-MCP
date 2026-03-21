---
title: "PortalWorldCommandBase"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.commands"
fqcn: "com.hypixel.hytale.builtin.portals.commands.PortalWorldCommandBase"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.commands`

```java
public abstract class PortalWorldCommandBase extends AbstractWorldCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_SERVER_COMMANDS_PORTALS_NOT_IN_PORTAL` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected final` | `void` | `execute(CommandContext context, World world, Store<EntityStore> store)` |
| `protected abstract` | `void` | `execute(CommandContext var1, World var2, PortalWorld var3, Store<EntityStore> var4)` |
