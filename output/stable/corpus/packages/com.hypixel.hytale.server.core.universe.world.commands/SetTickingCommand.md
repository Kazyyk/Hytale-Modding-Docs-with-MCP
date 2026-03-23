# SetTickingCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands | Extends: AbstractWorldCommand

public class SetTickingCommand extends AbstractWorldCommand

Server command that toggles world ticking on or off. Registered under the name `setticking`, accepts a required boolean argument to enable or disable ticking for the target world.

## Constructors


public SetTickingCommand()

Registers the command as `setticking` with a required boolean `ticking` argument.

## Inherited Behavior

Overrides `execute(CommandContext, World, Store<EntityStore>)` from `AbstractWorldCommand`. Calls `world.setTicking(boolean)` and sends a translated status message to the command sender.

Also in this package: ResetSubCommand, ResetSubCommand, SetSubCommand, SetSubCommand, WorldSettingsBox2DCommand, WorldSettingsCommand, WorldSettingsSubCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<Boolean> tickingArg
