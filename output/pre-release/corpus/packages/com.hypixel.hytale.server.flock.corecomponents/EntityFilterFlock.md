# EntityFilterFlock

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents | Extends: EntityFilterBase

public class EntityFilterFlock extends EntityFilterBase

## Fields

- public static final int COST
- protected static final ComponentType<EntityStore, FlockMembership> FLOCK_MEMBERSHIP_COMPONENT_TYPE
- protected static final ComponentType<EntityStore, Player> PLAYER_COMPONENT_TYPE
- protected static final ComponentType<EntityStore, EntityGroup> ENTITY_GROUP_COMPONENT_TYPE
- protected final FlockMembershipType flockMembership
- protected final FlockPlayerMembership flockPlayerMembership
- protected final int[] size
- protected final boolean checkCanJoin

## Methods

- @Override public boolean matchesEntity(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull Role role, @Nonnull Store<EntityStore> store)
- @Override public int cost()
