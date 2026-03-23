# IEntityFilter

Type: interface | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: RoleStateChange, IAnnotatedComponent

public interface IEntityFilter extends RoleStateChange, IAnnotatedComponent

## Fields

- IEntityFilter[] EMPTY_ARRAY
- int MINIMAL_COST
- int LOW_COST
- int MID_COST
- int HIGH_COST
- int EXTREME_COST

## Methods

- boolean matchesEntity(@Nonnull Ref<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Role var3, @Nonnull Store<EntityStore> var4)
- int cost()
- static void prioritiseFilters(@Nonnull IEntityFilter[] filters)
