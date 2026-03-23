# BrushConfigClearCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.commands | Extends: AbstractPlayerCommand

public class BrushConfigClearCommand extends AbstractPlayerCommand

Console command handling BrushConfigClear operations.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_BRUSH_CONFIG_CLEARED

## Methods

- public BrushConfigClearCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)

Also in this package: BrushConfigCommand, BrushConfigDebugStepCommand, BrushConfigExitCommand, BrushConfigListCommand, BrushConfigLoadCommand, LoadByNameCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_BRUSH_CONFIG_CANNOT_USE_COMMAND_DURING_EXEC
private static final Message MESSAGE_COMMANDS_BRUSH_CONFIG_CLEARED
