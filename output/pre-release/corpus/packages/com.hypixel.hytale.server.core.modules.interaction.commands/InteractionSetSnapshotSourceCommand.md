# InteractionSetSnapshotSourceCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.commands | Extends: CommandBase

public class InteractionSetSnapshotSourceCommand extends CommandBase

Server command extending `CommandBase`.

## Constructors

- InteractionSetSnapshotSourceCommand() | Creates a new InteractionSetSnapshotSourceCommand instance.

## Methods

- executeSync(@Nonnull CommandContext context) | void | protected method.

Also in this package: InteractionClearCommand, InteractionCommand, InteractionRunCommand, InteractionRunSpecificCommand, InteractionSnapshotSourceCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final EnumArgumentType<SelectInteraction.SnapshotSource> SNAPSHOT_SOURCE_ARG_TYPE
private final RequiredArg<SelectInteraction.SnapshotSource> snapshotSourceArg
