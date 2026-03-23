# EntityStatsResetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity.stats | Extends: AbstractTargetEntityCommand

public class EntityStatsResetCommand extends AbstractTargetEntityCommand

Console command handling EntityStatsReset operations.

## Fields

- @Nonnull private final RequiredArg<String> entityStatNameArg

## Methods

- public EntityStatsResetCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public static void resetEntityStat(@Nonnull CommandContext context, @Nonnull List<Ref<EntityStore>> entities, @Nonnull String entityStat, @Nonnull Store<EntityStore> store)
