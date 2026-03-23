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
