# WarpGoCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.warp | Extends: AbstractPlayerCommand

public class WarpGoCommand extends AbstractPlayerCommand

Console command handling WarpGo operations.

## Fields

- @Nonnull private final RequiredArg<String> warpNameArg

## Methods

- public WarpGoCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)

Also in this package: WarpCommand, WarpGoVariantCommand, WarpListCommand, WarpReloadCommand, WarpRemoveCommand, WarpSetCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<String> warpNameArg
