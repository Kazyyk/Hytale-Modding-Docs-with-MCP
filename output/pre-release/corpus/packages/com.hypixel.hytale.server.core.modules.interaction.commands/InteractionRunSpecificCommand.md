# InteractionRunSpecificCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.commands | Extends: AbstractPlayerCommand

public class InteractionRunSpecificCommand extends AbstractPlayerCommand

Abstract base for related commands.

## Constructors

- InteractionRunSpecificCommand() | Creates a new InteractionRunSpecificCommand instance.

Also in this package: InteractionClearCommand, InteractionCommand, InteractionRunCommand, InteractionSetSnapshotSourceCommand, InteractionSnapshotSourceCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final EnumArgumentType<InteractionType> INTERACTION_TYPE_ARG_TYPE
private final RequiredArg<InteractionType> interactionTypeArg
private final RequiredArg<RootInteraction> rootInteractionArg
