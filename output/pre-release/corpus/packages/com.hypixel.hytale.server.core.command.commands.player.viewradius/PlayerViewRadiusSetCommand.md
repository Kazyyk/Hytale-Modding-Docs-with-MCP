# PlayerViewRadiusSetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.viewradius | Extends: AbstractTargetPlayerCommand

public class PlayerViewRadiusSetCommand extends AbstractTargetPlayerCommand

## Fields

- private final RequiredArg<String> radiusArg
- private final FlagArg blocksArg
- private final FlagArg bypassArg

## Methods

- @Override protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Also in this package: PlayerViewRadiusGetCommand, PlayerViewRadiusSubCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<String> radiusArg
private final FlagArg blocksArg
private final FlagArg bypassArg
