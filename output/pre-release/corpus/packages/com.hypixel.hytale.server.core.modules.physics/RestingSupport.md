# RestingSupport

Type: class | Package: com.hypixel.hytale.server.core.modules.physics | Extends: java.lang.Object

public class RestingSupport

Tracks the block IDs beneath an entity's bounding box to detect when the support surface changes. Used by the physics system to determine if a resting entity needs to recompute its grounded state. Caches the block IDs in a flat array covering the XZ footprint at the entity's Y position.

## Methods


public boolean hasChanged(@Nonnull World world)

Returns `true` if any block within the cached support region has changed since the last call to `rest()`. Iterates the stored block IDs and compares against current world state.


public void rest(@Nonnull World world, @Nonnull Box boundingBox, @Nonnull Vector3d position)

Captures the current block IDs beneath the entity's bounding box at the given position. Stores the support region bounds and block ID array for subsequent `hasChanged()` checks.

Also in this package: ROTATION_MODE, STATE, SimplePhysicsProvider

Complete API:
  public boolean hasChanged(World world)
  public void rest(World world, Box boundingBox, Vector3d position)
  public void clear()

Fields:
protected int supportMinX
protected int supportMaxX
protected int supportMinZ
protected int supportMaxZ
protected int supportMinY
protected int supportMaxY
protected int[] supportBlocks
