# WorldLoadCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.world | Extends: CommandBase

public class WorldLoadCommand extends CommandBase

Console command handling WorldLoad operations.

## Fields

- @Nonnull private final RequiredArg<String> nameArg

## Methods

- public WorldLoadCommand()
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: CompactCommand, WorldAddCommand, WorldCommand, WorldListCommand, WorldPruneCommand, WorldRemoveCommand, WorldRocksDbCommand, WorldSaveCommand, WorldSetDefaultCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private final RequiredArg<String> nameArg
