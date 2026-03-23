# EntityStatsSetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity.stats | Extends: AbstractTargetEntityCommand

public class EntityStatsSetCommand extends AbstractTargetEntityCommand

Console command handling EntityStatsSet operations.

## Fields

- @Nonnull private final RequiredArg<String> entityStatNameArg
- @Nonnull private final RequiredArg<Integer> statValueArg

## Methods

- public EntityStatsSetCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public static void setEntityStat(@Nonnull CommandContext context,
        @Nonnull List<Ref<EntityStore>> entities,
        int newStatValue,
        @Nonnull String entityStatName,
        @Nonnull Store<EntityStore> store)` |

Also in this package: EntityStatsAddCommand, EntityStatsDumpCommand, EntityStatsGetCommand, EntityStatsResetCommand, EntityStatsSetToMaxCommand, EntityStatsSubCommand

Complete API:
  protected void execute(CommandContext context, ObjectList<Ref<EntityStore>> entities, World world, Store<EntityStore> store)
  public static void setEntityStat(CommandContext context, List<Ref<EntityStore>> entities, int newStatValue, String entityStatName, Store<EntityStore> store)

Fields:
private final RequiredArg<String> entityStatNameArg
private final RequiredArg<Integer> statValueArg
