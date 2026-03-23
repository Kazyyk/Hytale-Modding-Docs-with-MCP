# WorldAddCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.world | Extends: CommandBase

public class WorldAddCommand extends CommandBase

Console command handling WorldAdd operations.

## Fields

- @Nonnull private final RequiredArg<String> nameArg
- @Nonnull private final DefaultArg<String> genArg
- @Nonnull private final DefaultArg<String> storageArg

## Methods

- public WorldAddCommand()
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: CompactCommand, WorldCommand, WorldListCommand, WorldLoadCommand, WorldPruneCommand, WorldRemoveCommand, WorldRocksDbCommand, WorldSaveCommand, WorldSetDefaultCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private final RequiredArg<String> nameArg
private final DefaultArg<String> genArg
private final DefaultArg<String> storageArg
