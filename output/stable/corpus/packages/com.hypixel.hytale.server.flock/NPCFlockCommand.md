# NPCFlockCommand

Type: class | Package: com.hypixel.hytale.server.flock.commands | Extends: AbstractCommandCollection

public class NPCFlockCommand extends AbstractCommandCollection

The `/flock` command collection for managing flocks from in-game. Provides four subcommands for players to interact with the flock system.

## Constants

- ENTITY_IN_VIEW_DISTANCE | 8.0 | Maximum distance for view cone entity detection.
- ENTITY_IN_VIEW_ANGLE | 30.0F | Half-angle of the view cone in degrees.
- ENTITY_IN_VIEW_HEIGHT | 2 | Maximum Y difference for view cone matching.

## Static Utility Methods


public static int forNpcEntitiesInViewCone(@Nonnull Ref<EntityStore> playerReference, @Nonnull Store<EntityStore> store, @Nonnull BiPredicate<Ref<EntityStore>, NPCEntity> predicate)

Iterates NPCs within the player's view cone (8 block distance, 30-degree half-angle, 2-block height tolerance) using the NPC spatial index. Returns the count of entities for which the predicate returned `true`.


public static boolean anyEntityInViewCone(@Nonnull Ref<EntityStore> playerReference, @Nonnull Store<EntityStore> store, @Nonnull Predicate<Ref<EntityStore>> predicate)

Returns `true` if any entity in the view cone matches the predicate. Uses distance-ordered results for nearest-first matching.

## Subcommands

### GrabCommand

Adds nearby NPCs (in view cone) to the player's flock. If the player is not in a flock, creates one first.

### JoinCommand

Player joins the flock of the nearest NPC in their view cone that is already in a flock.

### LeaveCommand

Removes all nearby NPCs (in view cone) from their flocks.

### PlayerLeaveCommand

The player leaves their current flock.

## Related Types

- FlockMembershipSystems -- `join()` used by grab and join commands
- FlockPlugin -- `createFlock()` and `getFlockReference()` used by commands

Also in this package: GrabCommand, JoinCommand, LeaveCommand, PlayerLeaveCommand

Complete API:
  public static int forNpcEntitiesInViewCone(Ref<EntityStore> playerReference, Store<EntityStore> store, BiPredicate<Ref<EntityStore>,NPCEntity> predicate)
  public static boolean anyEntityInViewCone(Ref<EntityStore> playerReference, Store<EntityStore> store, Predicate<Ref<EntityStore>> predicate)

Fields:
private static final double ENTITY_IN_VIEW_DISTANCE
private static final float ENTITY_IN_VIEW_ANGLE
private static final int ENTITY_IN_VIEW_HEIGHT
