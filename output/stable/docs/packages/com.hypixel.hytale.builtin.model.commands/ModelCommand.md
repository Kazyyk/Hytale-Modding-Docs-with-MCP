---
title: "ModelCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.model.commands"
fqcn: "com.hypixel.hytale.builtin.model.commands.ModelCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "model"
  - "cosmetics"
---

**Package:** `com.hypixel.hytale.builtin.model.commands`

```java
public class ModelCommand extends AbstractPlayerCommand
```

Player command registered under the name `model` for managing player model appearance. Opens a `ChangeModelPage` UI by default, and provides `set` and `reset` subcommands for directly changing or restoring the player's model.

## Subcommands

| Name | Description |
|---|---|
| `set` | Sets the player's model to a specified `ModelAsset` with optional scale and bypass-scale-limits flag. |
| `reset` | Resets the player's model to their authenticated skin via `CosmeticsModule`, with optional scale. Aliased as `clear`. |

## Constructor

```java
public ModelCommand()
```

Registers under `"model"` with description key `"server.commands.model.desc"`. Adds `ModelOtherCommand` variant and `ModelSetCommand`/`ModelResetCommand` subcommands.

## Inner Classes

| Modifier | Name | Extends | Description |
|---|---|---|---|
| `private static` | `ModelOtherCommand` | `CommandBase` | Variant that opens the model change page for a target player. |
| `static` | `ModelSetCommand` | `AbstractPlayerCommand` | Sets a specific model asset with optional scale. Has `ModelSetOtherCommand` variant. |
| `static` | `ModelResetCommand` | `AbstractPlayerCommand` | Resets to skin-based model via `CosmeticsModule.createModel`. Has `ModelResetOtherCommand` variant. |

## Related Types

- `CosmeticsModule` -- provides model creation from player skin
- `ModelComponent` -- the ECS component that holds the entity's model
- `PlayerSkinComponent` -- provides the player's authenticated skin
