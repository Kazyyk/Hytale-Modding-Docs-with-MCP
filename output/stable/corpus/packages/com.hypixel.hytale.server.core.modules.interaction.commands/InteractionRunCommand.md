# InteractionRunCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.commands | Extends: AbstractPlayerCommand

public class InteractionRunCommand extends AbstractPlayerCommand

Abstract base for related commands.

## Constructors

- InteractionRunCommand() | Creates a new InteractionRunCommand instance.

Also in this package: InteractionClearCommand, InteractionCommand, InteractionRunSpecificCommand, InteractionSetSnapshotSourceCommand, InteractionSnapshotSourceCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final EnumArgumentType<InteractionType> INTERACTION_TYPE_ARG_TYPE
private final RequiredArg<InteractionType> interactionTypeArg
