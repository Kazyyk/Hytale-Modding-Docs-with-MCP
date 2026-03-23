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
