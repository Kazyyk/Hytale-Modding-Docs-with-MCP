# Condition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition

public abstract class Condition

## Fields

- protected boolean inverse

## Methods

- protected Condition()
- public Condition(boolean inverse)
- public boolean eval(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public abstract boolean eval0(@Nonnull ComponentAccessor<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Instant var3)
- public static boolean allConditionsMet( @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull EntityStatType.Regenerating regenerating )
- public static boolean allConditionsMet( @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )
- public String toString()
