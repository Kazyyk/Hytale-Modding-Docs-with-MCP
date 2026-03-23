# ReputationRankCommand

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation.command | Extends: AbstractTargetPlayerCommand

public class ReputationRankCommand extends AbstractTargetPlayerCommand

Abstract base for related commands.

## Constructors

- ReputationRankCommand() | Creates a new ReputationRankCommand instance.

Also in this package: ReputationAddCommand, ReputationCommand, ReputationSetCommand, ReputationValueCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private static final SingleArgumentType<ReputationGroup> REPUTATION_GROUP_ARG_TYPE
private final RequiredArg<ReputationGroup> reputationGroupIdArg
