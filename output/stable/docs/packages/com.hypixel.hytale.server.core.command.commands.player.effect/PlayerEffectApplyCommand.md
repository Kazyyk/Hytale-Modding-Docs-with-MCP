---
title: "PlayerEffectApplyCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.player.effect"
fqcn: "com.hypixel.hytale.server.core.command.commands.player.effect.PlayerEffectApplyCommand"
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
public class PlayerEffectApplyCommand extends AbstractPlayerCommand
```

Console command handling PlayerEffectApply operations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `float` | `DEFAULT_DURATION` | `100.0F` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<EntityEffect>` | `effectArg` | `this.withRequiredArg("effect", "server.commands.player.effect.apply.effect.desc", ArgTypes.EFFECT_ASSET)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `PlayerEffectApplyCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
