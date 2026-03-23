# WarpGoVariantCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.warp | Extends: AbstractPlayerCommand

public class WarpGoVariantCommand extends AbstractPlayerCommand

Console command handling WarpGoVariant operations.

## Fields

- @Nonnull private final RequiredArg<String> warpNameArg

## Methods

- public WarpGoVariantCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)

Also in this package: WarpCommand, WarpGoCommand, WarpListCommand, WarpReloadCommand, WarpRemoveCommand, WarpSetCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<String> warpNameArg
