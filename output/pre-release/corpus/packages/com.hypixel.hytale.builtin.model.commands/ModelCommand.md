# ModelCommand

Type: class | Package: com.hypixel.hytale.builtin.model.commands | Extends: AbstractPlayerCommand

public class ModelCommand extends AbstractPlayerCommand

Player command registered under the name `model` for managing player model appearance. Opens a `ChangeModelPage` UI by default, and provides `set` and `reset` subcommands for directly changing or restoring the player's model.

## Subcommands

- set: Sets the player's model to a specified `ModelAsset` with optional scale and bypass-scale-limits flag.
- reset: Resets the player's model to their authenticated skin via `CosmeticsModule`, with optional scale. Aliased as `clear`.

## Constructor


public ModelCommand()

Registers under `"model"` with description key `"server.commands.model.desc"`. Adds `ModelOtherCommand` variant and `ModelSetCommand`/`ModelResetCommand` subcommands.

## Inner Classes

- ModelOtherCommand: Variant that opens the model change page for a target player.
- ModelSetCommand: Sets a specific model asset with optional scale. Has `ModelSetOtherCommand` variant.
- ModelResetCommand: Resets to skin-based model via `CosmeticsModule.createModel`. Has `ModelResetOtherCommand` variant.

## Related Types

- `CosmeticsModule` -- provides model creation from player skin
- `ModelComponent` -- the ECS component that holds the entity's model
- `PlayerSkinComponent` -- provides the player's authenticated skin

Also in this package: ModelOtherCommand, ModelResetCommand, ModelResetOtherCommand, ModelSetCommand, ModelSetOtherCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
