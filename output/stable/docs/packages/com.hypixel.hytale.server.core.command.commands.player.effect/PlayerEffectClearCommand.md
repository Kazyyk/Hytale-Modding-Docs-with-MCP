---
title: "PlayerEffectClearCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.player.effect"
fqcn: "com.hypixel.hytale.server.core.command.commands.player.effect.PlayerEffectClearCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.player.effect`

```java
public class PlayerEffectClearCommand extends AbstractPlayerCommand
```

Console command handling PlayerEffectClear operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `Message` | `MESSAGE_EFFECTS_CLEARED_SELF` | `Message.translation("server.commands.player.effect.clear.success.self")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `PlayerEffectClearCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
