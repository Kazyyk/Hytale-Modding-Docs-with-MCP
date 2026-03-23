# WorldSetDefaultCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.world | Extends: CommandBase

public class WorldSetDefaultCommand extends CommandBase

Console command handling WorldSetDefault operations.

## Fields

- @Nonnull private final RequiredArg<String> nameArg

## Methods

- public WorldSetDefaultCommand()
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: CompactCommand, WorldAddCommand, WorldCommand, WorldListCommand, WorldLoadCommand, WorldPruneCommand, WorldRemoveCommand, WorldRocksDbCommand, WorldSaveCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private final RequiredArg<String> nameArg
