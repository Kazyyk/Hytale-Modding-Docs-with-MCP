# ServerStatsMemoryCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug.server | Extends: CommandBase

public class ServerStatsMemoryCommand extends CommandBase

Server command extending `CommandBase`.

## Constructors

- ServerStatsMemoryCommand() | Creates a new ServerStatsMemoryCommand instance.

## Methods

- executeSync(@Nonnull CommandContext context) | void | protected method.
- formatMemoryUsage(@Nonnull MemoryUsage memoryUsage) | Message | static private method.

Also in this package: ServerCommand, ServerDumpCommand, ServerGCCommand, ServerStatsCommand, ServerStatsCpuCommand, ServerStatsGcCommand

Complete API:
  protected void executeSync(CommandContext context)
  private static Message formatMemoryUsage(MemoryUsage memoryUsage)

Fields:
private static final Message MESSAGE_COMMANDS_SERVER_STATS_FULL_INFO_UNAVAILABLE
