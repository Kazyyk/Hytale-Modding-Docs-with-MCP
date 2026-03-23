# EntityStatsAddCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity.stats | Extends: AbstractTargetEntityCommand

public class EntityStatsAddCommand extends AbstractTargetEntityCommand

Console command handling EntityStatsAdd operations.

## Fields

- @Nonnull private final RequiredArg<String> entityStatNameArg
- @Nonnull private final RequiredArg<Integer> statAmountArg

## Methods

- public EntityStatsAddCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public static void addEntityStat(@Nonnull CommandContext context,
        @Nonnull List<Ref<EntityStore>> entityRefs,
        int statAmount,
        @Nonnull String entityStatName,
        @Nonnull Store<EntityStore> store)` |

Also in this package: EntityStatsDumpCommand, EntityStatsGetCommand, EntityStatsResetCommand, EntityStatsSetCommand, EntityStatsSetToMaxCommand, EntityStatsSubCommand

Complete API:
  protected void execute(CommandContext context, ObjectList<Ref<EntityStore>> entities, World world, Store<EntityStore> store)
  public static void addEntityStat(CommandContext context, List<Ref<EntityStore>> entityRefs, int statAmount, String entityStatName, Store<EntityStore> store)

Fields:
private final RequiredArg<String> entityStatNameArg
private final RequiredArg<Integer> statAmountArg
