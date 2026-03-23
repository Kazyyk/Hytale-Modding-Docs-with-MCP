# PrefabPatternGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.prefab

public class PrefabPatternGenerator

Configures how prefabs are distributed across the world during generation. Combines a point generator (grid pattern), height/spawn conditions, block masks, rotation options, and displacement functions to control prefab placement.

## Methods

- public PrefabCategory getCategory()
- public IPointGenerator getGridGenerator()
- public ICoordinateCondition getMapCondition()
- public BlockMaskCondition getPrefabPlacementConfiguration()
- public boolean isFitHeightmap()
- public IBlockFluidCondition getParentCondition()
- public ICoordinateRndCondition getHeightCondition()
- public IHeightThresholdInterpreter getHeightThresholdInterpreter()
- public PrefabRotation[] getRotations()
- public int getDisplacement(int seed, int x, int z)
- public boolean isOnWater()
- public boolean isDeepSearch()
- public boolean isSubmerge()
- public int getMaxSize()
- public int getExclusionRadius()
