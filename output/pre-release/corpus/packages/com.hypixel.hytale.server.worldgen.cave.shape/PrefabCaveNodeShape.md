# PrefabCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class PrefabCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape backed by a prefab structure. The prefab's bounding box defines the shape volume, and its rotation determines the orientation. Provides `getPrefabRotation()` for child nodes to inherit the parent's rotation when computing offsets.

## Instance Methods


public PrefabRotation getPrefabRotation()

Returns the rotation applied to this prefab shape.
