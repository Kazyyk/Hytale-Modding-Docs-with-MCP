# KnockbackPredictionSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player

public class KnockbackPredictionSystems

Container class for ECS systems that handle server-side knockback prediction for players. These systems capture player input during knockback, initialize and clear simulation state, and run the physics simulation that reconciles client and server positions.

## Static Fields

- DEBUG_KNOCKBACK_POSITION | boolean | Enables debug particle visualization of knockback positions. Default `false`.

## Constants

- DEFAULT_BLOCK_DRAG | float | 0.82F | Default drag coefficient on ground.
- AIR_DENSITY | float | 0.001225F | Air density used for terminal velocity calculation.
- COLLISION_PADDING | float | 1.0E-4F | Padding added to collision checks.
- MAX_CYCLE_MOVEMENT | float | 0.25F | Maximum movement per physics sub-cycle.
- TIME_STEP | float | 0.016666668F | Fixed time step for knockback simulation (~60 Hz).
- MAX_JUMP_COMBOS | int | 3 | Maximum number of consecutive jumps tracked.

## Inner Types

- KnockbackPredictionSystems.CaptureKnockbackInput -- captures player input for knockback simulation
- KnockbackPredictionSystems.ClearOnRemove -- removes simulation on entity removal
- KnockbackPredictionSystems.ClearOnTeleport -- clears simulation on teleport
- KnockbackPredictionSystems.CollisionAxis -- collision axis enum (private)
- KnockbackPredictionSystems.InitKnockback -- initializes simulation state
- KnockbackPredictionSystems.SimulateKnockback -- runs knockback physics simulation (deprecated)

## Related Types

- KnockbackSimulation -- component holding the knockback simulation state
- PlayerInput -- player input component consumed by these systems

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackSimulation (and 35 more)

Fields:
public static boolean DEBUG_KNOCKBACK_POSITION
public static final float DEFAULT_BLOCK_DRAG
public static final float AIR_DENSITY
public static final float COLLISION_PADDING
public static final float MAX_CYCLE_MOVEMENT
public static final float TIME_STEP
public static final int MAX_JUMP_COMBOS
