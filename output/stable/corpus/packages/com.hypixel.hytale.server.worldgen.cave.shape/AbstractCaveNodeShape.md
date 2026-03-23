# AbstractCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Implements: CaveNodeShape

public abstract class AbstractCaveNodeShape implements CaveNodeShape

Base implementation of CaveNodeShape providing the standard `populateChunk` algorithm. Iterates over all blocks within the shape bounds intersected with the chunk, tests `shouldReplace` for each position, applies the cave type's block mask, sets filling blocks and fluids, places covers (floor/ceiling decorations), and invalidates orphaned cover blocks.
