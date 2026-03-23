# ReputationValueCommand

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation.command | Extends: AbstractTargetPlayerCommand

public class ReputationValueCommand extends AbstractTargetPlayerCommand

Abstract base for related commands.

## Constructors

- ReputationValueCommand() | Creates a new ReputationValueCommand instance.

Also in this package: ReputationAddCommand, ReputationCommand, ReputationRankCommand, ReputationSetCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private static final SingleArgumentType<ReputationGroup> REPUTATION_GROUP_ARG_TYPE
private final RequiredArg<ReputationGroup> reputationGroupIdArg
