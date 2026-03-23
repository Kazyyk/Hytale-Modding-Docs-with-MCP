---
title: "BrushConfigClearCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.commands.BrushConfigClearCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "scriptedbrushes"
  - "commands"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.commands`

```java
public class BrushConfigClearCommand extends AbstractPlayerCommand
```

Console command handling BrushConfigClear operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_BRUSH_CONFIG_CLEARED` | `Message.translation("server.commands.brushConfig.cleared")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BrushConfigClearCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
